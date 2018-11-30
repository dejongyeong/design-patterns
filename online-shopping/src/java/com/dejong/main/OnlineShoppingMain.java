package com.dejong.main;

import com.dejong.cart.ShoppingCart;
import com.dejong.delivery.*;
import com.dejong.display.ProductList;
import com.dejong.member.Member;
import com.dejong.member.MembershipSimpleFactory;
import com.dejong.member.MembershipType;
import com.dejong.products.Shoes;

import java.io.IOException;
import java.util.*;

public class OnlineShoppingMain {

    private static ProductList list = ProductList.INSTANCE;
    private static ShoppingCart cart = new ShoppingCart();
    private static IDelivery delivery;
    private static MembershipType type;
    private static Member member;

    public static void main(String args[]) throws IOException {
        setMemberDetails();
        display();
        promptProductItems();
        promptDeliveryType();
        promptDeliveryOption();
        setShoppingCartDetails();
        payment();
    }

    private static void setMemberDetails() {
        member = new Member("John Bloggs", "johnbloggs@gmail.com", "Ashe Street, Tralee");
        member.setCart(cart);
        type = promptMembershipType();
    }

    private static MembershipType promptMembershipType() {
        int answer = 0;
        System.out.println(String.format("1. %s\n2. %s\n3. %s\n4. %s\n",
                MembershipType.NONE,
                MembershipType.BLUE,
                MembershipType.SILVER,
                MembershipType.GOLD));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Membership Type (1/2/3/4): ");
        try {
            answer = Integer.parseInt(String.valueOf(input.nextInt()));
        } catch(Exception ex) {
            System.out.print("Invalid Membership Type!!\n");
            promptMembershipType();
        }

        if(answer < 1 || answer > 4) {
            System.out.print("Membership must not be null!!\n");
            promptMembershipType();
        }

        if(answer == 1) {
            return MembershipType.NONE;
        } else if(answer == 2) {
            return MembershipType.BLUE;
        } else if(answer == 3) {
            return MembershipType.SILVER;
        } else {
            return MembershipType.GOLD;
        }
    }

    private static void display() throws IOException {
        GenerateProduct product = new GenerateProduct();
        System.out.println("\n\nList of Items:");
        product.displayProduct();
    }

    private static void promptProductItems() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        String id = input.nextLine();

        if(addOrder(id)) {
            System.out.println("Added into Shopping Cart");
            System.out.print("Do you want to add more order (y/n): ");
            String answer = input.nextLine();
            if(answer.equalsIgnoreCase("y")) {
                promptProductItems();
            }
        } else {
            System.out.print("Product Not Found!! ");
            promptProductItems();
        }
    }

    private static boolean addOrder(String id) {
        boolean isOrdered = false;
        Map<String, Shoes> listing = list.getProducts();
        if(listing.containsKey(id)) {
            cart.placeOrder(id, listing.get(id));
            isOrdered = true;
        }
        return isOrdered;
    }

    private static void promptDeliveryType() {
        System.out.println(String.format("\n1. %s\n2. %s\n",
                DeliveryType.STANDARD,
                DeliveryType.PRIME));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Delivery Type (1/2): ");
        try {
            int answer = Integer.parseInt(String.valueOf(input.nextInt()));

            if(answer != 1 && answer != 2) {
                System.out.print("Delivery Type must not be null!!\n");
                promptDeliveryType();
            }

            setDeliveryType(answer);

        } catch(Exception ex) {
            System.out.print("Invalid Delivery Type!! ");
            promptDeliveryType();
        }
    }

    private static void promptDeliveryOption() {
        System.out.println(String.format("\n1. %s\n2. %s\n3. %s\n",
                DeliveryOption.INSURANCES,
                DeliveryOption.GIFT_CARD,
                DeliveryOption.WRAPPING_SERVICES));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Delivery Option (1/2/3): ");
        try {
            int answer = Integer.parseInt(String.valueOf(input.nextInt()));

            if(answer<1 || answer>3) {
                System.out.print("Delivery Option must not be null!!\n");
                promptDeliveryOption();
            }

            setDeliveryOption(answer);

            if(addMoreDeliveryOption()) {
                promptDeliveryOption();
            } else {
                System.out.println(String.format("\n\nDelivery Description: %s\nDelivery Price: €%.2f\n",
                        delivery.description(),
                        delivery.price()));
            }

        } catch(Exception ex) {
            System.out.print("Invalid Delivery Option!!\n");
            promptDeliveryOption();
        }
    }

    private static boolean addMoreDeliveryOption() {
        boolean addMore = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Add more delivery option? (y/n): ");
        String option = input.nextLine();
        if(option.equalsIgnoreCase("y")) {
            addMore = true;
        }
        return addMore;
    }

    private static void setDeliveryOption(int option) {
        if(option == 1) {
            delivery = new Insurances(delivery);
        } else if(option == 2){
            delivery = new GiftCard(delivery);
        } else {
            delivery = new WrappingServices(delivery);
        }
    }

    private static void setDeliveryType(int answer) {
        if(answer == 1) {
            delivery = new StandardDelivery();
        } else {
            delivery = new PrimeDelivery();
        }
    }

    private static void setShoppingCartDetails() {
        MembershipSimpleFactory factory = new MembershipSimpleFactory();
        cart.setMembershipFactory(factory);
        cart.setDelivery(delivery);
    }

    private static void payment() {
        System.out.println(String.format("Member: %s\n", member.getName()));
        Map<String,Shoes> items = cart.getOrder();
        System.out.println("Items Ordered: ");
        for(Map.Entry<String, Shoes> entry : items.entrySet()) {
            System.out.println(entry.getValue().toString());
        }

        cart.checkout(type);
    }


}

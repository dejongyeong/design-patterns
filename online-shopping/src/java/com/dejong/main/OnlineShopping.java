package com.dejong.main;

import java.util.Scanner;

public class OnlineShopping {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        double price = 100.00;

        System.out.print("Select Festival for Item Discount Percentage:" +
                "\n1. New Year (30%)\n2. Halloween (10%)" +
                "\n3. Christmas (20%)\n4. None (0%)");

        int festival = input.nextInt();

        if(festival == 1) { // 30% discount
            price = price - (price * 30 / 100);
        } else if(festival == 2) { // 10% discount
            price = price - (price * 30 / 100);
        } else if(festival == 3) { // 20% discount
            price = price - (price * 20 / 100);
        } else if(festival == 4) {
            price = price - (price * 0 / 100);
        }

        System.out.println("Discounted Price: " + price);
    }
}

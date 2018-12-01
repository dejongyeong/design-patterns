package com.dejong.main;

import com.dejong.display.ProductList;
import com.dejong.products.ShoeCreator;
import com.dejong.products.ShoeFactory;
import com.dejong.products.ShoeType;
import com.dejong.products.Shoes;
import com.dejong.suppliers.Suppliers;

import java.io.*;

public class GenerateProduct {

    private ProductList shoeList = ProductList.INSTANCE;
    private ShoeFactory factory = new ShoeCreator();

    private void saveProduct() throws IOException {
        generateAdidas();
        generateNike();
        generateTimberland();

        save();
    }

    public final void displayProduct() throws IOException {
        saveProduct();
        display();
    }

    private void generateAdidas() {
        Suppliers adidas = new Suppliers("Adidas", factory);

        // Running Shoes
        Shoes shoe = adidas.createShoe(ShoeType.RUNNING_SHOES);
        shoe.setID("S001");
        shoe.setSupplier(adidas.getName());
        shoe.setBrand("Ultraboost Shoes");
        shoe.setDescription("Engineered Fit and Endless Energy");
        shoe.setPrice(199.95);
        shoeList.addProduct(shoe.getID(), shoe);

        // Flip Flops
        shoe = adidas.createShoe(ShoeType.FLIP_FLOPS);
        shoe.setID("S002");
        shoe.setSupplier(adidas.getName());
        shoe.setBrand("Adilette CloudFoam Plus Mono Slides");
        shoe.setDescription("Slip into pillowy-soft comfort with these men's slides. They're made with a cloudfoam plus footbed so your feet feel energised after your swim.");
        shoe.setPrice(34.95);
        shoeList.addProduct(shoe.getID(), shoe);
    }

    private void generateNike() {
        Suppliers nike = new Suppliers("Nike", factory);

        // Flip Flops
        Shoes shoe = nike.createShoe(ShoeType.FLIP_FLOPS);
        shoe.setID("S003");
        shoe.setSupplier(nike.getName());
        shoe.setBrand("Nike Benassi");
        shoe.setDescription("The Nike Benassi Slide features a lined upper with a bold logo for plush comfort and an athletic look. A foam midsole and outsole provide lightweight impact protection.");
        shoe.setPrice(26);
        shoeList.addProduct(shoe.getID(), shoe);

        // Flip Flops
        shoe = nike.createShoe(ShoeType.RUNNING_SHOES);
        shoe.setID("S004");
        shoe.setSupplier(nike.getName());
        shoe.setBrand("Nike Epic React Flyknit");
        shoe.setDescription("The Nike Epic React Flyknit Men's Running Shoe provides crazy comfort that lasts as long as you can run. Its Nike React foam cushioning is responsive yet lightweight, durable yet soft. This attraction of opposites creates a sensation that not only enhances the feeling of moving forwards, but makes running feel fun, too.");
        shoe.setPrice(150);
        shoeList.addProduct(shoe.getID(), shoe);
    }

    private void generateTimberland() {
        Suppliers timberland = new Suppliers("Timberland", factory);

        // High Heels
        Shoes shoe = timberland.createShoe(ShoeType.HIGH_HEELS);
        shoe.setID("S005");
        shoe.setSupplier(timberland.getName());
        shoe.setBrand("Allington 6' Boots");
        shoe.setDescription("These 6 Inch boot inspired womenʼs boots add height to the original design and feature a slimmer silhouette for an elegant look. An OrthoLite® footbed along with the rubber sole cushion and support to counteract the city streets.");
        shoe.setPrice(150);
        shoeList.addProduct(shoe.getID(), shoe);

        shoe = timberland.createShoe(ShoeType.HIGH_HEELS);
        shoe.setID("S006");
        shoe.setSupplier(timberland.getName());
        shoe.setBrand("Eleonor Street Ankle Boot");
        shoe.setDescription("The elegant silhouette formed by this ankle boot adds the perfect finishing touch to any stylish outfit.");
        shoe.setPrice(160);
        shoeList.addProduct(shoe.getID(), shoe);
    }

    private void save() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("products.dat"));
        oos.writeObject(shoeList);
        oos.close();
    }

    private void display() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("products.dat"));
            ProductList list = (ProductList) ois.readObject();
            ois.close();
            list.displayProductList();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

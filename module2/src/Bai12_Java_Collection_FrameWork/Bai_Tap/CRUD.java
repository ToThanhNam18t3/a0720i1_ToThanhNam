package Bai12_Java_Collection_FrameWork.Bai_Tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CRUD {

    // Menu
    public static void menuOfBook(List<Product> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU!");
        System.out.println("1. ADD BOOK");
        System.out.println("2. DISPLAY BOOK");
        System.out.println("3. UPDATE BOOK");
        System.out.println("4. DELETE BOOK");
        System.out.println("5. SORT BY PRICE");
        System.out.println("6. SORT BY NAME OF BOOK");

        System.out.print("Input your choose : ");
        int choose = sc.nextInt();
        switch (choose) {
            case 1 :
                addProduct(list);
                break;
            case 2:
                display(list);
                break;
            case 3:
                updateProductById(list);
                break;
            case 4:
                deleteProductByID(list);
                break;
            case 5:
                sortByPrice(list);
                break;
        }
    }

    //Add Product
    public static void addProduct(List<Product> list){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Input the number of book you want to add : ");
        int numOfBook = Integer.parseInt(sc.nextLine());
        while (count < numOfBook){
            System.out.print("Input name of book : ");
            String name = sc.nextLine();
            System.out.print("Input price of book : ");
            int price = Integer.parseInt(sc.nextLine());
            System.out.print("Input ID of book : ");
            int id = sc.nextInt();
            sc.skip("\n");
            Product product = new Product(id,name,price);
            list.add(product);
            count++;
        }
        menuOfBook(list);
    }

    //Display Product
    public static void display(List<Product> list){
        Scanner sc = new Scanner(System.in);
        for(Product p:list){
            System.out.println(p.toString());
        }
        menuOfBook(list);
    }

    //Delete Product by ID
    public static void deleteProductByID(List<Product> list) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        System.out.print("Input ID : ");
        double idCheck = sc.nextDouble();
        for (Product product:list){
            if(idCheck == product.getId()){
                check = true;
                list.remove(product);
                break;
            }
        }
        if(!check) {
            System.out.println("NOT FOUND !");
        }
        menuOfBook(list);
    }

    //Update
    public static void updateProductById(List<Product> list) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        System.out.print("Input ID: ");
        int idCheck = sc.nextInt();
        for (Product product:list) {
            if (idCheck == product.getId()){
                check = true;
                System.out.println("1. ID");
                System.out.println("2. BookName");
                System.out.println("3. Price");
                System.out.print("Which you want to change ? ");
                int numCheck = sc.nextInt();
                switch (numCheck){
                    case 1:
                        System.out.print("Input new ID : ");
                        int newID = sc.nextInt();
                        product.setId(newID);
                        System.out.println("After changed ID!");
                        System.out.println(product.toString());
                        break;
                    case 2:
                        System.out.print("Input new BookName : ");
                        String newBookName = sc.next();
                        product.setNameOfProduct(newBookName);
                        System.out.println("After changed Name!");
                        System.out.println(product.toString());
                        break;
                    case 3:
                        System.out.print("Input new Price : ");
                        int price = sc.nextInt();
                        product.setPrice(price);
                        System.out.println("After changed Price!");
                        System.out.println(product.toString());
                        break;
                }
            } if(!check){
                System.out.println("NOT FOUND!");
            }
        } menuOfBook(list);
    }

    // Sort
    public static void sortByPrice(List<Product> list){
        System.out.println("Before Sort");
        for(Product p:list){
            System.out.println(p.toString());
        }
        System.out.println("After Sort");
        Collections.sort(list);
        for(Product p:list){
            System.out.println(p.toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = 5;
        double a2 = (float)a1;

        ArrayList<Product> listOfBook = new ArrayList<>();
        menuOfBook(listOfBook);
    }
}

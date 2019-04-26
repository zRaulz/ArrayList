package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    private static GroceryList groceryList=new GroceryList();

    public static void main(String[] args) {
        boolean quit=false;
        int choice=0;
        printInstructions();
        while(!quit)
        {
            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case6:
                quit = true;
                break;
            }
            }

        }public static void printInstructions() {

         System.out.println("\nPress");
        System.out.println("\t 0- To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - to add an item to the list");
        System.out.println("\t 3 - to modify an item in the list");
        System.out.println("\t 4 - to remove an item from the list");
        System.out.println("\t 5 - to search for an item in the list");
        System.out.println("\t 6 - to quit the app");

    }
public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
}
public static void modifyItem(){
        System.out.print("enter item number: ");
        int itemNo=scanner.nextInt();
        scanner.nextLine();
        System.out.print("enter repl item: ");
        String newItem=scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1,newItem);

}
public static void removeItem(){
        System.out.print("enter item number");
    int itemNo=scanner.nextInt();
    scanner.nextLine();
    groceryList.removeGroceryItem(itemNo);
}
public static void searchForItem(){

        System.out.print("item to search for ");
        String searchItem=scanner.nextLine();
        if(groceryList.findItem(searchItem)!=null)
        {
            System.out.print("FOUND"+ searchItem);

        }
        else System.out.print(searchItem+ " NONE");
}
    }



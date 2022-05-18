//Program to take input from user and create a contact list.
//Uses ArrayList data structure built from the contacts class and is sortable.  
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

public class Main {

    public static void menu() {//Creates menu
        System.out.println("\nThis is a contact list!");
        System.out.println("Pick an option.");
        System.out.println("1. Add contact.");
        System.out.println("2. Sort list. ");
        System.out.println("3. Print list.");
        System.out.println("4. Exit");

    }

    public static void main(String[] args) {
        ArrayList<Contacts> contactList = new ArrayList<Contacts>();//Create ArrayList to store contacts
        boolean loop = true;//Loop until user wishes to quit
        Scanner scnr = new Scanner(System.in);

        while (loop) {
            menu();
            int option = scnr.nextInt();

            switch (option) {
                case 1: {
                  try{
                    System.out.print("Enter Contact Name: ");
                    scnr.nextLine();
                    String contactName = scnr.nextLine();

                    if(contactName.length() > 25){
                      throw new Exception();
                    }

                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scnr.nextLine();

                    if(phoneNumber.length() < 25){
                      for(char i : phoneNumber.toCharArray()){
                        if(!Character.isDigit(i)){
                          throw new Exception();
                        }
                      }
                    }

                    Contacts contact = new Contacts(contactName, phoneNumber);
                    contactList.add(contact);

                    break;
                  }catch (Exception exception){
                    System.out.println("Invalid input. Valid input is text less than 25 characters. Please use letters for name and numbers for phone number.");
                  }
                }

                case 2: {

                    Collections.sort(contactList, new Comparator<Contacts>() {    @Override
                    public int compare(Contacts o1, Contacts o2) {
                        return o1.getContactName().compareTo(o2.getContactName());
                    }
                    });
                    break;


                }

                case 3: {
                    for(Contacts contact : contactList){
                        System.out.println(contact);
                    }
                    break;
                }

                case 4: {
                    System.out.println("Exiting Program.");
                    loop = false;
                }

            }
        }scnr.close();
    }
}

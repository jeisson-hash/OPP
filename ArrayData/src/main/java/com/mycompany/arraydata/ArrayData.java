/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraydata;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ArrayData {

public static void mainMenu(){ 
        System.out.println("::: MAIN MENU :::\n"
                + "[1]. Create/register users \n"
                + "[2]. List users \n"
                + "[3]. Search user \n"
                + "[4]. Update user \n"
                + "[5]. Delete user \n"
                + "[6]. Exit \n"
                + ".::: Press an option: ");
    }
    
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
   
        ArrayList<String> identNumbers = new ArrayList<>();
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        String firstname, lastname, email, key, ident_number;
        int age, opt;
        boolean menu_status = true;
        
        int i=1;
        while(menu_status){
            mainMenu();
            opt=data.nextInt();
            data.nextLine();
            
            switch (opt){
                case 1:
                    System.out.println("--- REGISTER NEW USER ---");
                    System.out.println("\nUser Nro.: " + (firstNames.size()+1));   
            
                    while (true){
                        System.out.println("Digit your identification number: ");
                        System.out.println("-Only numbers accepted-");
                        ident_number = data.nextLine();
                        //Aqui use matches para que verifique el patron de numeros
                        if (ident_number.matches("[0-9]+")){
                            break;
                        }
                        else{
                            System.out.println("Error only numbers accepted!!");
                        }
                    }
                    System.out.println("First name: ");   
                    firstname=data.nextLine();
                    System.out.println("Last name: ");   
                    lastname=data.nextLine();
                    System.out.println("Email: ");   
                    email=data.nextLine();
                    System.out.println("Age: ");   
                    age=data.nextInt();
                    data.nextLine();

                    identNumbers.add(ident_number);
                    firstNames.add(firstname);
                    lastNames.add(lastname);
                    emails.add(email);
                    ages.add(age);
                    System.out.println("\n!! User has been registered successfully !!");
                    System.out.println("\nPress any key to back to main menu.");
                    key=data.nextLine();
                    break;
                case 2:
                    
                    System.out.println("Total users: " + firstNames.size());
                    if (firstNames.size() == 0){
                        System.out.println("No users !!!");
                    }else{
                        for(int  j = 0; j < firstNames.size(); j+=1){
                            System.out.println("User " + (j+1) + ": " 
                                    + identNumbers.get(j) + " | " 
                                    + firstNames.get(j) + " | " 
                                    + lastNames.get(j) + " | " 
                                    + emails.get(j) + " | " 
                                    + ages.get(j));
                        }
                    }
                    System.out.println("\nPress any key to back to main menu.");
                    key=data.nextLine();
                    break;
                    
                    
                case 3:
                    System.out.println("--- SEARCH USER ---");
                    System.out.println("Enter the identification number");
                    String searchId = data.nextLine();
                    Boolean find =false;
                    
                    for (int j = 0; j < identNumbers.size();j++){
                        if (identNumbers.get(j).equals(searchId)){
                            System.out.println("User results: ");
                            System.out.println(
                             "| Id number: " + identNumbers.get(j)
                             + " | First name: " + firstNames.get(j)
                             + " | Last name: " + lastNames.get(j)
                             + " | Email : " + emails.get(j)
                             + " | Age: " + ages.get(j));
                             
                            find = true;
                            break;
 
                        }
                    }
                    if (!find){
                        System.out.println("!!User not found!!");
                        
                    }
                     
                    System.out.println("\nPress any key to back to main menu.");
                    key=data.nextLine();
                    break;
                    
                    
                case 4:
                    System.out.println("--- UPDATE USER ---");
                    System.out.println("Enter identification number: ");
                    String updateId = data.nextLine();
                    Boolean update = false;
                    
                    for (int j = 0; j < identNumbers.size();j++){
                        if (identNumbers.get(j).equals(updateId)){
                             System.out.println("Information: ");
                            System.out.println(
                                    identNumbers.get(j)+" | " +
                                    firstNames.get(j)+" | " +
                                    lastNames.get(j)+" | " +
                                    emails.get(j)+" | " +
                                    ages.get(j));
                            System.out.println("New first anme");
                            firstNames.set(j, data.nextLine());
                            System.out.println("New last name");
                            lastNames.set(j, data.nextLine());
                            System.out.println("New email");
                            emails.set(j, data.nextLine());
                            System.out.println("New age");
                            ages.set(j, data.nextInt());
                            
                            System.out.println("changes saved succesfully!!");
                            update = true;
                            break;    
                        }   
                    }
                    if (!update){
                        System.out.println("User not register--");
                    }

                    System.out.println("\nPress any key to back to main menu.");
                    key=data.nextLine();
                    break;
                    
                    
                    
                  
                case 5:
                    System.out.println("--- DELETE USER ----");
                    System.out.println ("Enter idetification number");
                    String deleteId =data.nextLine();
                    boolean delete =false;
                    
                    for (int j = 0; j < identNumbers.size();j++){
                        if (identNumbers.get(j).equals(deleteId)){
                            System.out.println("The user is: " +
                                    identNumbers.get(j)+" | " +
                                    firstNames.get(j)+" | " +
                                    lastNames.get(j)+" | " +
                                    emails.get(j)+" | " +
                                    ages.get(j));
                            
                            System.out.println("Are you sure you want to delete the user (Y/N)");
                            String confirm =data.nextLine();
                            
                            if (confirm.equalsIgnoreCase("Y")){
                            // con remove se elimina el usuario en j de todas las listas :v
                            identNumbers.remove(j);
                            firstNames.remove(j);
                            lastNames.remove(j);
                            emails.remove(j);
                            ages.remove(j);
                            
                            System.out.println("The user is been removed from the data base");
                            delete = true;
                            }
                            
                            else{
                                System.out.println("::: Delete canceled :::");
                                delete=true;
                            }
                            
                            break;   
                        }
                    }
                        if (!delete){
                        System.out.println("User doesnt exist!!");
                            
                        }
                  
                    System.out.println("\nPress any key to back to main menu.");
                    key=data.nextLine();
                    break;
                    
                    
                    
                case 6:
                    System.out.println("Are you sure you want exit?? (Y/N)");
                    String confirm =data.nextLine();
                    if (confirm.equalsIgnoreCase("Y")){
                    System.out.println("Bye, bye");
                    menu_status = false;
                    }     
                    break;
                    
                    
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
                    
            }
        }
    }
}


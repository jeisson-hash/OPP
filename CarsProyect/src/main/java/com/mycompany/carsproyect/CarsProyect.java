/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carsproyect;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import com.mycompany.carsproyect.Cities;

/**
 *
 * @author ASUS
 */
public class CarsProyect {

public static void mainMenu(){ 
        System.out.println("::: MAIN MENU :::\n"
                + "[1]. Users \n"
                + "[2]. Cities \n"
                + "[3]. Brands \n"
                + "[4]. Vehicles \n"
                + "[5]. Exit \n"
                + ".::: Press an option: ");
    }
    
 public static void usersMainMenu(){ 
        System.out.println("::: USER MENU :::\n"
                + "[1]. Register users \n"
                + "[2]. List users \n"
                + "[3]. Search user \n"
                + "[4]. Update user \n"
                + "[5]. Delete user \n"
                + "[6]. Back to main menu \n");
    }
 public static void citiesMainMenu(){ 
        System.out.println("::: CITIES MENU :::\n"
                + "[1]. Register city \n"
                + "[2]. List cities \n"
                + "[3]. Search city \n"
                + "[4]. Update city \n"
                + "[5]. Delete city \n"
                + "[6]. Back to main menu \n");
    }
 public static void brandsMainMenu(){ 
        System.out.println("::: BRANCH MENU :::\n"
                + "[1]. Register brand \n"
                + "[2]. List brand \n"
                + "[3]. Search brand \n"
                + "[4]. Update brand \n"
                + "[5]. Delete brand \n"
                + "[6]. Back to main menu \n");
    }
 public static void vehiclesMainMenu(){ 
        System.out.println("::: VEHICLES MENU :::\n"
                + "[1]. Register vehicle \n"
                + "[2]. List vehicle \n"
                + "[3]. Search vehicle \n"
                + "[4]. Update vehicle \n"
                + "[5]. Delete vehicle \n"
                + "[6]. Baack to main menu \n");
    }
 
public static void main(String[] args) {
    Scanner data=new Scanner(System.in);
    
    int opt;
    boolean 
        menu_status = true,
        users_menu_status = true,
        cities_menu_status = true;
    int id=0;
    
    ArrayList<Cities> cities =new ArrayList<>();
    while(menu_status){
        mainMenu();
        opt=data.nextInt();
        data.nextLine();
            
        switch (opt){
            case 1:
            while (users_menu_status){
                usersMainMenu();
                opt=data.nextInt();
                data.nextLine();
                    switch (opt) {
                        case 1:
                            System.out.println(":::CREATE NEW USER:::");
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            
                            break;
                        case 5:
                            
                            break;
                        case 6:
                            users_menu_status  = false;
                            break; 
                        default: 
                            System.out.println("Invalid option. Try again!!");
                            break;
                        }
                    }    
                    break;
            case 2:
                
            cities_menu_status = true;    
            while (cities_menu_status){
                citiesMainMenu();
                opt=data.nextInt();
                data.nextLine();
                String name, code, abbrev, country;
                boolean status;
                double latitude, longitude;
                LocalDateTime created_at, updated_at;
                    
                    
                switch (opt) {
                    case 1:                         
                        System.out.println(":::CREATE A NEW CITY:::");
                        
                        while(true){
                            System.out.print("Enter city ID: ");
                            //Aqui use el has.NextInt que lo que hace es preguntar al usuario si el numero es int (ENTERO)y validarlo
                            if(data.hasNextInt()){
                                id= data.nextInt();
                                data.nextLine();
                                break;
                            } else{
                                System.out.println("only numbers accepted");
                                data.nextLine();
                            }
                        }    

                        System.out.println("Enter city name: ");
                        name= data.nextLine();
                            
                        System.out.println("Enter city code: ");
                        code= data.nextLine();
                            
                        System.out.println("Enter city abbreviature: ");
                        abbrev= data.nextLine();
                            
                        System.out.println("Enter city country: ");
                        country= data.nextLine();
                        
                        while(true){
                        System.out.println("Enter city latitude (-90º to 90º): ");
                        if (data.hasNextDouble()){
                         latitude= data.nextDouble();
                         if(latitude >= -90 && latitude <= 90){
                             data.nextLine();
                             break;
                         }else{
                             System.out.println("Error latitude must be between -90º to 90º.");
                         }
                         }else{
                            System.out.println("Enter a valid number");
                            data.nextLine();
                         }
                        }
                        while(true){   
                        System.out.println("Enter city longitude (-180º to 180º): ");
                        if (data.hasNextDouble()){
                         longitude= data.nextDouble();
                         if(longitude >= -180 && longitude <= 180){
                             data.nextLine();
                             break;
                         }else{
                             System.out.println("Error longitude must be between -180º to 180º.");
                         }
                         }else{
                            System.out.println("Enter a valid number");
                            data.nextLine();
                         }
                        }
                            
                        //Validar el ID
                        boolean idExist =false;
                            for (Cities city: cities){
                                if (city.getId()==id){
                                    idExist = true;
                                    break;
                                }
                            }
                            if(idExist){
                                System.out.println("ERROR. Id already exist!!");
                                break;
                            }
                        //VALIDAR EL CODE
                        boolean codeExist = false;
                            for(Cities city: cities){
                                if(city.getCode().equalsIgnoreCase(code)){
                                    codeExist = true;
                                    break;
                                }
                            }
                            if (codeExist){
                                System.out.println("ERROr. Code already exist!!");
                               break;
                            }
                            
                            status=true;
                            created_at = LocalDateTime.now();
                            updated_at = LocalDateTime.now();
                            
                            //Creacion del obejto 
                            
                            Cities city =new Cities(
                                    id,
                                    name,
                                    code,
                                    abbrev,
                                    country,
                                    status,
                                    latitude,
                                    longitude,
                                    created_at,
                                    updated_at);
                            
                            cities.add(city);
                            System.out.println(":::City created successfully:::");
                             
                            break;
                        case 2:
                            System.out.println("::::::");
                            
                            if (cities.isEmpty()){
                                
                                System.out.println("No cities registered");
                            }else{
                                System.out.println(":::LIST OF CITIES:::");
                                for(Cities list : cities){
                                    list.listCity ();
                                    System.out.println("----------------------");
                                }      
                            }
                            break;
                            
                        case 3:
                            System.out.println("::::::");
                            int searchId;
                            while(true){
                            System.out.print("Enter city ID: ");
                            //Aqui use el has.NextInt que lo que hace es preguntar al usuario si el numero es int (ENTERO)y validarlo
                            if(data.hasNextInt()){
                                searchId= data.nextInt();
                                data.nextLine();
                                break;
                            } else{
                                System.out.println("only numbers accepted");
                                data.nextLine();
                            }
                        }    
  
                            boolean found = false;
                            for(Cities search : cities){
                                if (search.getId() == searchId){
                                    System.out.println("City found!!!!");
                                    search.listCity();
                                    
                                    found = true;
                                    break;    
                                }
                            }
                            if(!found){
                                System.out.println("City not found");
                            }
                            break;
                        
                        
                        case 4:
                            System.out.println(":::UPDATE CITY:::");
                            int updateId;
                            while(true){
                            System.out.print("Enter city ID: ");
                            //Aqui use el has.NextInt que lo que hace es preguntar al usuario si el numero es int (ENTERO)y validarlo
                            if(data.hasNextInt()){
                                updateId= data.nextInt();
                                data.nextLine();
                                break;
                            } else{
                                System.out.println("only numbers accepted");
                                data.nextLine();
                            }
                        }    
                            
                            boolean updated = false;
                            for(Cities u: cities){
                                if (u.getId() == updateId){
                                    System.out.println("New city name: ");
                                    u.setName(data.nextLine());
                                    
                                    System.out.println("New city code: ");
                                    String newCode = data.nextLine();
                                    
                                    boolean code2Exist = false;
                                    for (Cities c: cities){
                                        if (c.getCode().equalsIgnoreCase(newCode)&& c.getId() !=u.getId()){
                                            code2Exist = true;
                                            break;
                                        }
                                    }
                                    if(code2Exist){
                                        System.out.println("Error, code already exist");
                                        break;
                                    }
                                    u.setCode(newCode);
                                    
                                    System.out.println("New city abbreviation: ");
                                    u.setAbbrev(data.nextLine());
                                    System.out.println("New country: ");
                                    u.setCountry(data.nextLine());
                                    
                                   double newLatitude;
                                    while (true){
                                    System.out.println("Enter new city latitude (-90º to 90º): ");
                                    if (data.hasNextDouble()){
                                     newLatitude= data.nextDouble();
                                        if(newLatitude >= -90 && newLatitude <= 90){
                                            data.nextLine();
                                            break;
                                    }else{
                                        System.out.println("Error latitude must be between -90º to 90º.");
                                    }
                                    }else{
                                    System.out.println("Enter a valid number");
                                    data.nextLine();
                                    }
                                    }
                                    u.setLatitude(newLatitude);
                                    
                                    double newLongitude;
                                    while(true){   
                                        System.out.println("Enter city longitude (-180º to 180º): ");
                                        if (data.hasNextDouble()){
                                            newLongitude= data.nextDouble();
                                             if(newLongitude >= -180 && newLongitude <= 180){
                                            data.nextLine();
                                            break;
                                        }else{
                                            System.out.println("Error longitude must be between -180º to 180º.");
                                        }
                                        }else{
                                         System.out.println("Enter a valid number");
                                         data.nextLine();
                                        }
                                       }
                                    u.setLongitude(newLongitude);
                                    
                                    u.setUpdatedAt(LocalDateTime.now());
                                    updated = true;
                                    
                                    System.out.println("City updated succesfully!!!");
                                    
                                    break; 
                                }
                            }
                            if (!updated){
                                System.out.println("City not REGISTERED.!!!");
                                
                            }
                            break;
                            
                        case 5:
                            System.out.println(":::DELETE CITY:::");
                            int deleteId;
                            while(true){
                            System.out.print("Enter city ID to delete: ");
                            //Aqui use el has.NextInt que lo que hace es preguntar al usuario si el numero es int (ENTERO)y validarlo
                            if(data.hasNextInt()){
                                deleteId= data.nextInt();
                                data.nextLine();
                                break;
                            } else{
                                System.out.println("only numbers accepted");
                                data.nextLine();
                            }
                        }    
                            boolean deleted = false;

                            for(int j = 0; j < cities.size(); j++){
                                if(cities.get(j).getId() == deleteId){
                                    cities.remove(j);
                                    deleted = true;
                                    System.out.println("City deleted succesfully!!");
                                    
                                    break;
                                }
                             }
                            if (!deleted){
                                System.out.println("City not REGISTERED!!");
                                
                            }
                            break;

                        case 6:
                            cities_menu_status  = false;
                            break; 
                        default: 
                            System.out.println("Invalid option. Try again!!");
                            break;
                        }
                    }
                break;
                    
                    
                case 3: 
                    
                    break;
                    
                    
                case 4:
                   
                    break;

                case 5:
                   
                    System.out.println("Bye, bye");
                    menu_status = false;   
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
                       
            }  
        }
    }
}
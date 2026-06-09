/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carsproyect;

import java.time.LocalDateTime;

/**
 *
 * @author ASUS
 */
public class Cities {
     private int id;
    private String name;
    private String code;
    private String abbrev;
    private String country;
    private boolean status;
    private double latitude;
    private double longitude;
    
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    
    public Cities(){
    }
    // construcor con parametros
    public Cities (int id, String name, String code, String abbrev, String country, boolean status, double latitude, double longitude, LocalDateTime created_at, LocalDateTime updated_at){
        this.id =id;
        this.name = name;
        this.code = code;
        this.abbrev = abbrev;
        this.country = country;
        this.status = status;
        this.latitude = latitude;
        this.longitude = longitude;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
    
    //Getters and setters name
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //Getters and setters 
    public String getCode(){
        return code;
    }
    public void setCode(String code){
        this.code = code;
    }
    //getters and setters abbrev
    public String getAbbrev(){
        return abbrev;
    }
    public void setAbbrev(String abbrev){
        this.abbrev = abbrev;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public boolean isStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public double getLatitude(){
        return latitude;
    }
    public void setLatitude(double latitude){
        this.latitude = latitude;
    }
    public double getLongitude(){
        return longitude;
    }
    public void setLongitude(double longitude){
        this.longitude = longitude;
    }
    public  LocalDateTime getCreatedAt(){
        return created_at;
    }
    public void setCreatedAt(LocalDateTime created_at){
        this.created_at = created_at;
    }    
    public  LocalDateTime getUpdatedAt(){
        return updated_at;
    }
    public void setUpdatedAt(LocalDateTime updated_at){
        this.updated_at = updated_at;
    }  
    
    public void listCity(){

    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Code: " + code);
    System.out.println("Abbreviation: " + abbrev);
    System.out.println("Country: " + country);
    System.out.println("Status: " + (status ? "Active" : "Inactive"));
    System.out.println("Latitude: " + latitude);
    System.out.println("Longitude: " + longitude);
    System.out.println("Created At: " + created_at);
    System.out.println("Updated At: " + updated_at);
    
    }
}

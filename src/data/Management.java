/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entities.*;
import java.util.ArrayList;

/**
 *
 * @author luisr
 */
public class Management {
    public static ArrayList<Customer> listCustomers = new ArrayList<>();
    public static ArrayList<Employee> listEmployees = new ArrayList<>();
    public static ArrayList<Sale> listSales = new ArrayList<>();
    
    public static void addCustomer(Customer unCustomer){
        listCustomers.add(unCustomer);
    }
    
    public static void addEmployee(Employee unEmployee){
        listEmployees.add(unEmployee);
    }
    
    public static void addSale(Sale unSale){
        listSales.add(unSale);
    }
    
    public static boolean existsCustomer(String name, String surname){
        boolean exists = false;
        for (int i = 0; i < listCustomers.size(); i++) {
            if (listCustomers.get(i).getName().equals(name) &&
                    listCustomers.get(i).getSurname().equals(surname)) {
                exists = true;
                break;
            }
        }
        return exists;
    }
    
    public static boolean existsEmployee(int code){
        boolean exists = false;
        for (int i = 0; i < listEmployees.size(); i++) {
            if (listEmployees.get(i).getCode()==code) {
                exists = true;
                break;
            }
        }
        return exists;
    }
    
    public static Customer getCustomer(String name, String surname){
        Customer unCustomer = null;
        for (int i = 0; i < listCustomers.size(); i++) {
            if (listCustomers.get(i).getName().equals(name) &&
                    listCustomers.get(i).getSurname().equals(surname)) {
                unCustomer = listCustomers.get(i);
            }
        }
        return unCustomer;
    }
    
    public static Employee getEmployee(int code){
        Employee unEmployee = null;
        for (int i = 0; i < listEmployees.size(); i++) {
            if (listEmployees.get(i).getCode()==code) {
                unEmployee = listEmployees.get(i);
            }
        }
        return unEmployee;
    }
    
    public static Sale getSale(Date dateOfSale, String product, float amount){
        Sale unSale = null;
        for (int i = 0; i < listSales.size(); i++) {
            if (listSales.get(i).getDateOfSale().equals(dateOfSale) &&
                    listSales.get(i).getProduct().equals(product) &&
                    listSales.get(i).getAmount()==amount) {
                unSale = listSales.get(i);
            }
        }
        return unSale;
    }
}

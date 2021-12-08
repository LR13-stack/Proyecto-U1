/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author luisr
 */
public class Sale {
    private Date dateOfSale;
    private Employee unEmployee;
    private Customer unCustomer;
    private String product;
    private float amount;

    public Sale(Date dateOfSale, Employee unEmployee, Customer unCustomer, String product, float amount) {
        this.dateOfSale = dateOfSale;
        this.unEmployee = unEmployee;
        this.unCustomer = unCustomer;
        this.product = product;
        this.amount = amount;
    }
    
    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public Employee getUnEmployee() {
        return unEmployee;
    }

    public void setUnEmployee(Employee unEmployee) {
        this.unEmployee = unEmployee;
    }

    public Customer getUnCustomer() {
        return unCustomer;
    }

    public void setUnCustomer(Customer unCustomer) {
        this.unCustomer = unCustomer;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}

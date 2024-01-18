package org.example;

public interface CustomerDAO {
    public void addCustomer(Customer cust);
    public void updateCustomer(Customer c);
    public Customer getCustomer(int cid);
    public  void deleteCustomer(Customer cus);
}

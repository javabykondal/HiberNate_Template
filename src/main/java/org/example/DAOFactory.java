package org.example;

public class DAOFactory {
    static CustomerDAO customerDAO;

    static {
        customerDAO=new CustomerImpl();

    }
    public static CustomerDAO getCustomerDAO()
    {
        return customerDAO;
    }
}
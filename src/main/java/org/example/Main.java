package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        CustomerDAO custer=DAOFactory.getCustomerDAO();
        Customer c=new Customer("Kondalu","Kondalu98@gmail.com",9889999);
        custer.addCustomer(c);
//
//        custer.addCustomer(c);
//        Customer cust=new Customer(1,"hello","hello@gmail.com",12344);
//        custer.updateCustomer(cust);
          //custer.getCustomer(1);

    }
}
package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerImpl implements CustomerDAO{
    @Override
    public void addCustomer(Customer cust) {
        SessionFactory SessionFactory = HibernateUtil.getHibernateUtil();
        HibernateTemplate.Save(cust);
    }

    @Override
    public void updateCustomer(Customer c) {
        Transaction tx=null;
        try {

            SessionFactory ss = HibernateUtil.getHibernateUtil();
            Session session = ss.openSession();
            tx= session.beginTransaction();
            session.update(c);
            tx.commit();
            session.close();
        }

        catch (Exception ex)
        {
            tx.rollback();
            ex.printStackTrace();

        }

    }

    @Override
    public Customer getCustomer(int cid) {
        Transaction tx=null;
        try {

            SessionFactory ss = HibernateUtil.getHibernateUtil();
            Session session = ss.openSession();
            tx= session.beginTransaction();
            Customer cust=session.load(Customer.class,cid);
            System.out.println(cust);
            tx.commit();
            session.close();
        }

        catch (Exception ex)
        {
            tx.rollback();
            ex.printStackTrace();

        }
        return null;
    }

    @Override
    public void deleteCustomer(Customer cus) {
        Transaction tx=null;
        try {

            SessionFactory ss = HibernateUtil.getHibernateUtil();
            Session session = ss.openSession();
            tx= session.beginTransaction();
            session.delete(cus);
            tx.commit();
            session.close();
        }

        catch (Exception ex)
        {
            tx.rollback();
            ex.printStackTrace();

        }

    }
}

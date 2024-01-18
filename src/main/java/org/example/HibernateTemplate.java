package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateTemplate {
    public static void Save(Object obj)
    {
        Transaction tx=null;
        try {

            SessionFactory ss = HibernateUtil.getHibernateUtil();
            Session session = ss.openSession();
            tx= session.beginTransaction();
            session.save(obj);
            System.out.println(obj);
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

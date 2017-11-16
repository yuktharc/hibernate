package org.learn.common;

import org.hibernate.Session;
import org.learn.persistence.HibernateUtil;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("Starting..");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
    
        Stock stock = new Stock();

        stock.setStockCode("4715");
        stock.setStockName("GENM");

        session.save(stock);
        
        session.getTransaction().commit();
    }
}
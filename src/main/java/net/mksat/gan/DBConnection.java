package net.mksat.gan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.Update;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ByelozyorovZ on 18.09.2016.
 */
public class DBConnection {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();


        Book book = new Book();

        book.setAuthorId(1);
        book.setBookId(17);
        book.setPublishId(2);
        book.setTitle("dfdcds");
        book.setYear(1957);


        session.beginTransaction();
        session.save(book);
        //session.getTransaction().commit();
        session.close();
        sessionFactory.close();

        //session.beginTransaction();

        //session.saveOrUpdate(book);
        //session.createQuery("from Book where bookId=1").list();
        session.load(Book.class, 100);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }

}

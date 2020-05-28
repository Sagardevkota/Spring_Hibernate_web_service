package org.example.sagar.DAO;

import org.example.sagar.entity.ProductEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class ProductsDAO {

    SessionFactory factory=new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(ProductEntity.class)
            .buildSessionFactory();

    public List<ProductEntity> getProducts() {
        Session session=factory.getCurrentSession();
        session.beginTransaction();
        List<ProductEntity> list=session.createQuery("from products").getResultList();
        return list;
    }

    public void addProudct(ProductEntity product) {
        Session session=factory.getCurrentSession();
        session.beginTransaction();
        session.save(product);
        session.getTransaction().commit();


    }

    public void deleteProduct(int productId) {
        Session session=factory.getCurrentSession();
        session.beginTransaction();
        ProductEntity product=session.get(ProductEntity.class,productId);
        session.delete(product);
        session.getTransaction().commit();

    }
}

package org.example.sagar.services;

import org.example.sagar.DAO.ProductsDAO;
import org.example.sagar.entity.ProductEntity;
import org.example.sagar.products.Products;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class ProductsServices {

    ProductsDAO dao=new ProductsDAO();

    public List<ProductEntity> getProducts() {
        List<ProductEntity> list=dao.getProducts();
        return list;

    }

    public void addProducts(ProductEntity product) {
      dao.addProudct(product);
    }

    public void deleteProduct(int productId) {
        dao.deleteProduct(productId);

    }
}

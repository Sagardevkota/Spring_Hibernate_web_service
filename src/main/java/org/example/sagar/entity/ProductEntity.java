package org.example.sagar.entity;

import javax.persistence.*;


@Entity(name = "products")
@Table(name = "products")

public class ProductEntity {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int productId;

    @Column(name = "product_name")
    String productName;

    public ProductEntity() {
    }

    public ProductEntity(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}

package com.javatips.product;

import javax.persistence.*;

/**
 * Created by melnikov on 02.04.2015.
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductDetails")
public class Product implements java.io.Serializable {

    private long productId;
    private String productName;
    private long ingredientCode;

    public void setProductId(long productId) {
        this.productId = productId;
    }

    @Id
    @GeneratedValue
    @Column(name="PRODUCT_ID")
    public long getProductId() {
        return productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Column(name="PRODUCT_NAME", nullable=false)
    public String getProductName() {
        return productName;
    }

    @ManyToMany
    @JoinTable(name= "IngredientDetails")
    public void setIngredientCode(long ingredientCode){
        this.ingredientCode = ingredientCode;
    }
    @Column(name="INGREDIENT_CODE")
    public long getIngredientCode() {
        return ingredientCode;
    }

}
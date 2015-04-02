package com.javatips.product;

/**
 * Created by melnikov on 02.04.2015.
 */

import javax.persistence.*;

@Entity
@Table(name="IngredientDetails")
public class Ingredient implements java.io.Serializable{

    private long ingredientId;
    private String ingredientName;
    private long ingredientCode;

    public void setIngredientId(long ingredientId) {
        this.ingredientId =  ingredientId;
    }

    @Id
    @GeneratedValue
    @Column(name="INGREDIENT_ID")
    public long getIngredientId() {
        return ingredientId;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    @Column(name="INGREDIENT_NAME", nullable=false)
    public String getIngredientName() {
        return ingredientName;
    }

    @ManyToMany(mappedBy = "ProductDetails")
    public void setIngredientCode(long ingredientCode) {
        this.ingredientCode = ingredientCode;
    }

    @Column(name="INGREDIENT_CODE")
    public long getIngredientCode() {
        return ingredientCode;
    }

}

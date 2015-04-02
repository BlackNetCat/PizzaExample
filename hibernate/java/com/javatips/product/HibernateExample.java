package com.javatips.product;

import java.util.List;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javatips.util.HibernateUtil;

public class HibernateExample {

    public static void main(String[] args) {
        HibernateExample example = new HibernateExample();
        HibernateExample example2 = new HibernateExample();

        Long productId2 = example.saveProduct("Espresso",2l);
        Long productId3 = example.saveProduct("Latte",2l);

        Long ingredientId2 = example2.saveIngredient("Milk",2l);
        example.listProduct();
        example2.listIngredient();
        example.updateProduct(productId3, "Capuchino",2l);
        example.deleteProduct(productId2);
        example.listProduct();

    }

    public Long saveIngredient(String ingredientName, Long ingredientCode) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        Long ingredientId = null;
        try {
            transaction = session.beginTransaction();
            Ingredient ingredient = new Ingredient();
            ingredient.setIngredientName(ingredientName);
            ingredient.setIngredientCode(ingredientCode);
            ingredientId = (Long) session.save(ingredient);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return ingredientId;
    }

    public void listIngredient() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            @SuppressWarnings("unchecked")
            List<Ingredient> Ingredients = session.createQuery("from Ingredient").list();
            for (Iterator<Ingredient> iterator = Ingredients.iterator(); iterator.hasNext();) {
                Ingredient ingredient = (Ingredient) iterator.next();
                System.out.println(ingredient.getIngredientName());
                System.out.println(ingredient.getIngredientCode());
            }
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void updateIngredient(Long ingredientId, String ingredientName, Long ingredientCode) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Ingredient ingredient = (Ingredient) session.get(Product.class, ingredientId);
            ingredient.setIngredientName(ingredientName);
            ingredient.setIngredientCode(ingredientCode);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void deleteIngredient(Long ingredientId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Ingredient ingredient = (Ingredient) session.get(Ingredient.class, ingredientId);
            session.delete(ingredient);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public Long saveProduct(String productName, Long ingredientCode) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        Long productId = null;
        try {
            transaction = session.beginTransaction();
            Product product = new Product();
            product.setProductName(productName);
            product.setIngredientCode(ingredientCode);
            productId = (Long) session.save(product);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return productId;
    }

    public void listProduct() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            @SuppressWarnings("unchecked")
            List<Product> Products = session.createQuery("from Product").list();
            for (Iterator<Product> iterator = Products.iterator(); iterator.hasNext();) {
                Product product = (Product) iterator.next();
                System.out.println(product.getProductName());
                System.out.println(product.getIngredientCode());
            }
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void updateProduct(Long productId, String productName, Long ingredientCode) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Product product = (Product) session.get(Product.class, productId);
            product.setProductName(productName);
            product.setIngredientCode(ingredientCode);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void deleteProduct(Long productId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Product product = (Product) session.get(Product.class, productId);
            session.delete(product);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
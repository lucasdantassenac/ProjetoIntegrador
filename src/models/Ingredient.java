/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDateTime;

/**
 *
 * @author Lucas Dantas
 */
public class Ingredient extends EntityId{
    private int ingredientId;
    private String ingredientName;
    private float ingredientMinQuantity;
    private String ingredientUnitOfMeasure;
    private float ingredientUnitCost;
    private String ingredientStatus;
    private float ingredientStock;
    private String ingredientStockStatus;

    public Ingredient() {
    }

    public Ingredient(int ingredientId, String ingredientName, float ingredientMinQuantity, String ingredientUnitOfMeasure, float ingredientUnitCost, String ingredientStatus, float ingredientStock, String ingredientStockStatus, int id, LocalDateTime creation, LocalDateTime update, String status) {
        super(id, creation, update, status);
        this.ingredientId = ingredientId;
        this.ingredientName = ingredientName;
        this.ingredientMinQuantity = ingredientMinQuantity;
        this.ingredientUnitOfMeasure = ingredientUnitOfMeasure;
        this.ingredientUnitCost = ingredientUnitCost;
        this.ingredientStatus = ingredientStatus;
        this.ingredientStock = ingredientStock;
        this.ingredientStockStatus = ingredientStockStatus;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public float getIngredientMinQuantity() {
        return ingredientMinQuantity;
    }

    public void setIngredientMinQuantity(float ingredientMinQuantity) {
        this.ingredientMinQuantity = ingredientMinQuantity;
    }

    public String getIngredientUnitOfMeasure() {
        return ingredientUnitOfMeasure;
    }

    public void setIngredientUnitOfMeasure(String ingredientUnitOfMeasure) {
        this.ingredientUnitOfMeasure = ingredientUnitOfMeasure;
    }

    public float getIngredientUnitCost() {
        return ingredientUnitCost;
    }

    public void setIngredientUnitCost(float ingredientUnitCost) {
        this.ingredientUnitCost = ingredientUnitCost;
    }

    public String getIngredientStatus() {
        return ingredientStatus;
    }

    public void setIngredientStatus(String ingredientStatus) {
        this.ingredientStatus = ingredientStatus;
    }

    public float getIngredientStock() {
        return ingredientStock;
    }

    public void setIngredientStock(float ingredientStock) {
        this.ingredientStock = ingredientStock;
    }

    public String getIngredientStockStatus() {
        return ingredientStockStatus;
    }

    public void setIngredientStockStatus(String ingredientStockStatus) {
        this.ingredientStockStatus = ingredientStockStatus;
    }
    
   
    
}

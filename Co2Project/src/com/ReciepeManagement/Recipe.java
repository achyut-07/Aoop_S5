package com.ReciepeManagement;

import java.util.*;

public class Recipe {
	private String name;
    private Set<String> ingredients;
    
    public Recipe(String name) {
        this.name = name;
        this.ingredients = new HashSet<>();
    }
    
    public boolean addIngredient(String ingredient) {
    	 return ingredients.add(ingredient);
    }
    
    public boolean removeIngredient(String ingredient) {
    	return ingredients.remove(ingredient);
    }
    public String getName() {
        return name;
    }
    
    public Set<String> getIngredients() {
        return ingredients;
    }
    
    public void displayIngredients() {
        System.out.println("Ingredients for recipe '" + name + "': " + ingredients);
    }

}

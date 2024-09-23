package com.ReciepeManagement;
import java.util.*;

public class RecipeBook {
	private Map<String, Recipe> recipes;
	
	public RecipeBook() {
        recipes = new HashMap<>();
    }
	
	public boolean addRecipe(String recipeName, List<String> ingredients) {
        if (recipes.containsKey(recipeName)) {
            return false;
        }
        Recipe recipe = new Recipe(recipeName);
        for (String ingredient : ingredients) {
            recipe.addIngredient(ingredient);
        }
        recipes.put(recipeName, recipe);
        return true;
    }
	
	public boolean addIngredientToRecipe(String recipeName, String ingredient) {
        Recipe recipe = recipes.get(recipeName);
        if (recipe != null) {
            return recipe.addIngredient(ingredient);
        }
        return false;
    }
	
	public boolean removeIngredientFromRecipe(String recipeName, String ingredient) {
        Recipe recipe = recipes.get(recipeName);
        if (recipe != null) {
            return recipe.removeIngredient(ingredient);
        }
        return false;
    }
	
	
	public void displayIngredients(String recipeName) {
        Recipe recipe = recipes.get(recipeName);
        if (recipe != null) {
            recipe.displayIngredients();
        } else {
            System.out.println("Recipe '" + recipeName + "' not found.");
        }
    }
	
	
	public void findRecipesByIngredient(String ingredient) {
        boolean found = false;
        for (Recipe recipe : recipes.values()) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println("Recipe containing '" + ingredient + "': " + recipe.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No recipes found with ingredient '" + ingredient + "'.");
        }
    }


}

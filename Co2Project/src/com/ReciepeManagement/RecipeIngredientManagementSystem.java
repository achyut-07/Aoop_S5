package com.ReciepeManagement;
import java.util.*;

public class RecipeIngredientManagementSystem {
	private RecipeBook recipeBook;
	public RecipeIngredientManagementSystem() {
        recipeBook = new RecipeBook();
    }
	public static void main(String[] args) {
        RecipeIngredientManagementSystem system = new RecipeIngredientManagementSystem();

        
        system.addRecipe("Pasta", Arrays.asList("Tomato", "Garlic", "Pasta", "Olive Oil"));
        system.addRecipe("Veg-Biryani", Arrays.asList("BasamatiRice", "Onion", "Panner", "Oil","Cumin","hing"));

        system.addIngredient("Pasta", "Cheese");

        system.addIngredient("Pasta", "Tomato");

        system.displayIngredients("Pasta");

        system.removeIngredient("Veg-Biryani", "hing");

        system.findRecipesByIngredient("Tomato");

        system.displayIngredients("Veg-Biryani");
    }

    public void addRecipe(String recipeName, List<String> ingredients) {
        if (recipeBook.addRecipe(recipeName, ingredients)) {
            System.out.println("Recipe '" + recipeName + "' added.");
        } else {
            System.out.println("Recipe '" + recipeName + "' already exists.");
        }
    }

    public void addIngredient(String recipeName, String ingredient) {
        if (recipeBook.addIngredientToRecipe(recipeName, ingredient)) {
            System.out.println("Ingredient '" + ingredient + "' added to recipe '" + recipeName + "'.");
        } else {
            System.out.println("Recipe '" + recipeName + "' not found or ingredient already exists.");
        }
    }

    public void removeIngredient(String recipeName, String ingredient) {
        if (recipeBook.removeIngredientFromRecipe(recipeName, ingredient)) {
            System.out.println("Ingredient '" + ingredient + "' removed from recipe '" + recipeName + "'.");
        } else {
            System.out.println("Recipe '" + recipeName + "' or ingredient not found.");
        }
    }

    public void displayIngredients(String recipeName) {
        recipeBook.displayIngredients(recipeName);
    }

    public void findRecipesByIngredient(String ingredient) {
        recipeBook.findRecipesByIngredient(ingredient);
    }
}



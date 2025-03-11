package Main;


import java.util.ArrayList;

public class Cooking {

    public String cook(ArrayList<Ingredient> ingredientsInput){

        // CAKE
        ArrayList<Ingredient> cakeIngredient = new ArrayList<>();
        cakeIngredient.add(new Ingredient("FLOUR"));
        cakeIngredient.add(new Ingredient("EGG"));
        cakeIngredient.add(new Ingredient("MILK"));
        cakeIngredient.add(new Ingredient("SUGAR"));
        cakeIngredient.add(new Ingredient("BUTTER"));

        // OMELET
        ArrayList<Ingredient> omeletIngredient = new ArrayList<>();
        omeletIngredient.add(new Ingredient("EGG"));
        omeletIngredient.add(new Ingredient("MILK"));
        omeletIngredient.add(new Ingredient("RICE"));

        // STEAK
        ArrayList<Ingredient> steakIngredients = new ArrayList<>();
        steakIngredients.add(new Ingredient("MEAT"));
        steakIngredients.add(new Ingredient("BUTTER"));
        steakIngredients.add(new Ingredient("LETTUCE"));


        // FIREDRICE
        ArrayList<Ingredient> friedRiceIngredients = new ArrayList<>();
        friedRiceIngredients.add(new Ingredient("RICE"));
        friedRiceIngredients.add(new Ingredient("EGG"));
        friedRiceIngredients.add(new Ingredient("MEAT"));
        friedRiceIngredients.add(new Ingredient("LETTUCE"));


        // SANDWICH
        ArrayList<Ingredient> sandwichIngredients = new ArrayList<>();
        sandwichIngredients.add(new Ingredient("BREAD"));
        sandwichIngredients.add(new Ingredient("LETTUCE"));
        sandwichIngredients.add(new Ingredient("MEAT"));


        ArrayList<Ingredient> RamenIngredient = new ArrayList<>();
        RamenIngredient.add(new Ingredient("NOODLE"));
        RamenIngredient.add(new Ingredient("EGG"));
        RamenIngredient.add(new Ingredient("MEAT"));
        RamenIngredient.add(new Ingredient("LETTUCE"));
        RamenIngredient.add(new Ingredient("BUTTER"));

        ArrayList<Ingredient> PizzaIngredient = new ArrayList<>();
        PizzaIngredient.add(new Ingredient("FLOUR"));
        PizzaIngredient.add(new Ingredient("EGG"));
        PizzaIngredient.add(new Ingredient("MILK"));
        PizzaIngredient.add(new Ingredient("MEAT"));



        if(checkRecipe(ingredientsInput,omeletIngredient)){
            return "Omelet";
        } 
        else if(checkRecipe(ingredientsInput,steakIngredients)){
            return "Steak";
        } 
        else if(checkRecipe(ingredientsInput,sandwichIngredients)){
            return "Sandwich";
        }
        else if(checkRecipe(ingredientsInput,friedRiceIngredients)){
            return "FriedRice";
        }
        else if(checkRecipe(ingredientsInput,RamenIngredient)){
            return "Ramen";
        }
        else if(checkRecipe(ingredientsInput,PizzaIngredient)){
            return "Pizza";
        }
        else if(checkRecipe(ingredientsInput,cakeIngredient)){
            return "Cake";
        } 
        else{
            return "FAILED";
        }
    }

    public boolean checkRecipe(ArrayList<Ingredient> ingredientsInput, ArrayList<Ingredient> ingredientsRecipe){
        Boolean isComplete = true;
        ArrayList<String> RecipeList = new ArrayList<>();
        for(Ingredient ingredient:ingredientsRecipe){
            RecipeList.add(ingredient.getIngredient());
        }if (ingredientsInput.size() > 1) {
            for (Ingredient ingreInput:ingredientsInput){
                for(Ingredient ingreRecipe:ingredientsRecipe){
                    if(ingreInput.getIngredient().equals(ingreRecipe.getIngredient()) ){
                    }else{
                        if(!RecipeList.contains(ingreInput.getIngredient())){
                            isComplete = false;
                        }
                    }
                }
                
            }  
        }else{
            isComplete = false;
        }

        return isComplete;
    }
}

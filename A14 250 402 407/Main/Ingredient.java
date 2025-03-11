package Main;
import java.util.ArrayList;

public class Ingredient {
    String ingredient;
  
    //ingredient
    Ingredient(String ingre){
        this.ingredient = ingre;
    }

    // input ที่ใส่มา
    Ingredient(ArrayList<String> food){
        for(String a : food){
        // this.ingredient.add(a);
        }
    }

    public String getIngredient() {
        return ingredient;
    }
}

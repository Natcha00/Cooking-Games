package Main;
import java.util.ArrayList;
public class MM {
   public static ArrayList<Ingredient> inputIngredient = new ArrayList<>();
   
   public MM(ArrayList<String> food) {
        //ส่งชื่อวัตถุดิบ 
        inputIngredient.clear();
        System.out.println("one ArrayList is: "
        + food);
        for (String f : food) {
          Ingredient Ingredient = new Ingredient(f);
          inputIngredient.add(Ingredient);
          System.out.println(f);
        }

        //inputIngredient = (ArrayList) food.clone();
        System.out.println("Second ArrayList is: "
        + inputIngredient);
  
        //ส่งวัตถุดิบไปทำอาหาร
        Cooking cooking = new Cooking();
        String result = cooking.cook(inputIngredient);
        System.out.println(result +"result");

        // display ตามผลลัพธ์ที่ได้จากการทำอาหาร
        new Foodframe(result);
   }
}
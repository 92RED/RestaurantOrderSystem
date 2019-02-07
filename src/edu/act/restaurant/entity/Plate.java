package edu.act.restaurant.entity;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author chaikal
 */
class Plate {
    
    private String name;
    
    private Map<Ingredient, Integer> ingredientMap;
    
    public Plate(){
        ingredientMap = new HashMap<>();
    }
    
    public void storeIngredient(Ingredient i, int amount ){
        ingredientMap.put(i, amount);
    }
    
    public void displayIngredients(){
        System.out.println("Ingredients of Plate : "+name);
        for(Ingredient i : ingredientMap.keySet() ) {
            Integer amount = ingredientMap.get(i);
            System.out.println(i.getName() + " , "+amount + " gr");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}

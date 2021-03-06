package us.mattgreen;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class MealsArray {
   //private Meals[] meals = new Meals[100];
   private ArrayList<String> meals = new ArrayList<String>(100);
    //Element[] array = {new Element(1), new Element(2), new Element(3)};
  //ArrayList<Meals> meals = Arrays.asList(meals);
    //List<Element> list = new ArrayList<>(Arrays.asList(array));
    //List<Meals> something = new ArrayList<>(Arrays.asList(meals));
    //List<Meals> list = Arrays.asList(meals);
   List<String> list  = new ArrayList<String>(Arrays.asList());
    //public ArrayList <Meals> meals = new ArrayList<Meals>(Arrays.asList(array));
    private int i = 0;
    private int calories;

    public void addElementWithStrings(String arg1, String arg2, String arg3) {
        MealType mealType;
        if (i < meals.length) {

            switch (arg1) {
                case "Breakfast":
                    mealType = MealType.BREAKFAST;
                    break;
                case "Lunch":
                    mealType = MealType.LUNCH;
                    break;
                case "Dinner":
                    mealType = MealType.DINNER;
                    break;
                case "Dessert":
                    mealType = MealType.DESSERT;
                    break;
                default:
                    mealType = MealType.DINNER;
                    System.out.println("Invalid Meal Type " + arg1 + ", defaulted to Dinner.");
            }

            if (arg3.matches("-?\\d+(\\.\\d+)?")) {
                calories = Integer.parseInt(arg3);
            } else {
                calories = 100;
                System.out.println("Invalid Calories " + arg3 + ", defaulted to 100.");
            }
            meals[i++] = new Meals(mealType, arg2, calories);
        }
        else {
            System.out.println("Items exceeded system size.  File has " + i + ", while the system can only handle " + meals.length + ".");
        }
    }

    public Meals[] getMeals() {
        return meals;
    }

    public void printAllMeals() {
        for (Meals item: meals) {
            if (item != null) {
                System.out.println(item);
            }

        }
    }

    public void printMealsByType(MealType mealType) {
        for (Meals item: meals) {
            if (item != null && item.getMealType() == mealType) {
                System.out.println(item);
            }

        }
    }

    public void printByNameSearch(String s) {
        for (Meals item: meals) {
            if (item != null && item.getItem().indexOf(s) >= 0) {
                System.out.println(item);
            }

        }
    }
}

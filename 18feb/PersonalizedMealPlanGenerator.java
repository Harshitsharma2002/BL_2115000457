interface MealPlan {
    void displayMealDetails();
}

class VegetarianMeal implements MealPlan {
    String mealName;
    String[] ingredients;

    public VegetarianMeal(String mealName, String[] ingredients) {
        this.mealName = mealName;
        this.ingredients = ingredients;
    }

    
    public void displayMealDetails() {
        System.out.println("Meal: " + mealName);
        System.out.print("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + " ");
        }
        System.out.println("\nDiet Type: Vegetarian");
    }
}

class VeganMeal implements MealPlan {
    String mealName;
    String[] ingredients;

    public VeganMeal(String mealName, String[] ingredients) {
        this.mealName = mealName;
        this.ingredients = ingredients;
    }

    public void displayMealDetails() {
        System.out.println("Meal: " + mealName);
        System.out.print("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + " ");
        }
        System.out.println("\nDiet Type: Vegan");
    }
}

class KetoMeal implements MealPlan {
    String mealName;
    String[] ingredients;

    public KetoMeal(String mealName, String[] ingredients) {
        this.mealName = mealName;
        this.ingredients = ingredients;
    }

    public void displayMealDetails() {
        System.out.println("Meal: " + mealName);
        System.out.print("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + " ");
        }
        System.out.println("\nDiet Type: Keto");
    }
}

class HighProteinMeal implements MealPlan {
    String mealName;
    String[] ingredients;

    public HighProteinMeal(String mealName, String[] ingredients) {
        this.mealName = mealName;
        this.ingredients = ingredients;
    }

    
    public void displayMealDetails() {
        System.out.println("Meal: " + mealName);
        System.out.print("Ingredients: ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + " ");
        }
        System.out.println("\nDiet Type: High-Protein");
    }
}

class Meal<T extends MealPlan> {
    T meal;

    public Meal(T meal) {
        this.meal = meal;
    }

    public void generateMealPlan() {
        if (meal != null) {
            System.out.println("\nPersonalized Meal Plan Generated:");
            meal.displayMealDetails();
        } else {
            System.out.println("Invalid meal plan.");
        }
    }
}

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        String[] vegetarianIngredients = {"Tofu", "Spinach", "Lentils"};
        String[] veganIngredients = {"Tofu", "Lettuce", "Vegan Cheese"};
        String[] ketoIngredients = {"Chicken", "Avocado", "Eggs"};
        String[] highProteinIngredients = {"Chicken", "Tofu", "Greek Yogurt"};

        Meal<VegetarianMeal> vegetarianMeal = new Meal<>(new VegetarianMeal("Vegetarian Stir Fry", vegetarianIngredients));
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal("Vegan Salad", veganIngredients));
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal("Keto Chicken Salad", ketoIngredients));
        Meal<HighProteinMeal> highProteinMeal = new Meal<>(new HighProteinMeal("High-Protein Chicken Bowl", highProteinIngredients));

        vegetarianMeal.generateMealPlan();
        veganMeal.generateMealPlan();
        ketoMeal.generateMealPlan();
        highProteinMeal.generateMealPlan();
    }
}

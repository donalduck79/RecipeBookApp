// Recipe.java
public class Recipe {
    private String name;
    private String description;
    private String[] ingredients;
    private String[] instructions;

    public Recipe(String name, String description, String[] ingredients, String[] instructions) {
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public String[] getInstructions() {
        return instructions;
    }
}

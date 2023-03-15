package seedu.duke.recipe;

import seedu.duke.exceptions.RecipeListEmptyError;
import java.util.ArrayList;

public class RecipeList {
    protected ArrayList<Recipe> recipeList;

    protected int currRecipeNumber;

    public RecipeList() {
        recipeList = new ArrayList<>();
        currRecipeNumber = 0;
    }

    public RecipeList(ArrayList<Recipe> inputRecipeList) {
        recipeList = inputRecipeList;
        currRecipeNumber = inputRecipeList.size();
    }

    public ArrayList<Recipe> getRecipeList() {
        return recipeList;
    }

    public int getCurrRecipeNumber() {
        assert(currRecipeNumber == recipeList.size());
        return currRecipeNumber;
    }

    public Recipe getRecipeFromList(int index) {
        return recipeList.get(index - 1);
    }

    public Recipe getNewestRecipe() {
        return recipeList.get(currRecipeNumber-1);
    }

    public void addNewRecipe(Recipe recipe) {
        recipeList.add(recipe);
        currRecipeNumber++;
    }

    public void removeRecipe(int index) throws RecipeListEmptyError {
        if (recipeList.isEmpty()) {
            throw new RecipeListEmptyError();
        }
        recipeList.remove(index-1);
        currRecipeNumber--;
    }
    public void clearRecipeList() {
        recipeList.clear();
        currRecipeNumber = 0;
    }
}
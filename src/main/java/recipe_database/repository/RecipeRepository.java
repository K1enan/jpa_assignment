package recipe_database.repository;

import org.springframework.data.repository.CrudRepository;
import recipe_database.entity.Recipe;

import java.util.List;

public interface RecipeRepository extends CrudRepository<Recipe, Integer> {

    List<Recipe> findAllByRecipeNameContains(String recipeName);

    List<Recipe> findByRecipeNameContains(String ingredientName);

    List<Recipe> findAllByRecipeCategoriesCategory(String category);


}

package recipe_database.repository;

import org.springframework.data.repository.CrudRepository;
import recipe_database.entity.Ingredient;

import java.util.List;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {

    List<Ingredient> findAllByIngredientNameEquals(String ingredientName);

    List<Ingredient> findAllByIngredientNameContaining(String ingredientName);
}

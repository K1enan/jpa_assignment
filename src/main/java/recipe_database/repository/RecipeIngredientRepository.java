package recipe_database.repository;

import org.springframework.data.repository.CrudRepository;
import recipe_database.entity.RecipeIngredient;

public interface RecipeIngredientRepository extends CrudRepository<RecipeIngredient, String> {

}

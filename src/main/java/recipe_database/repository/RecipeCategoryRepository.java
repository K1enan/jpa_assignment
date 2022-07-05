package recipe_database.repository;

import org.springframework.data.repository.CrudRepository;
import recipe_database.entity.RecipeCategory;

public interface RecipeCategoryRepository extends CrudRepository<RecipeCategory, Integer> {

}

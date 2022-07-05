package recipe_database.repository;

import org.springframework.data.repository.CrudRepository;
import recipe_database.entity.RecipeInstruction;

public interface RecipeInstructionRepository extends CrudRepository<RecipeInstruction, Integer> {

}

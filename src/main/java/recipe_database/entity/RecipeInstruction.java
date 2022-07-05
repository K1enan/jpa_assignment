package recipe_database.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class RecipeInstruction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String recipeInstructions;

    public RecipeInstruction() {
    }

    public RecipeInstruction(String recipeInstructions) {
        this.recipeInstructions = recipeInstructions;
    }

    public RecipeInstruction(int id, String recipeInstructions) {
        this.id = id;
        this.recipeInstructions = recipeInstructions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipeInstructions() {
        return recipeInstructions;
    }

    public void setRecipeInstructions(String recipeInstructions) {
        this.recipeInstructions = recipeInstructions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeInstruction that = (RecipeInstruction) o;
        return id == that.id && Objects.equals(recipeInstructions, that.recipeInstructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, recipeInstructions);
    }

    @Override
    public String toString() {
        return "RecipeInstruction{" +
                "id=" + id +
                ", recipeInstructions='" + recipeInstructions + '\'' +
                '}';
    }
}


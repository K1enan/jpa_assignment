package recipe_database.entity;

public enum Measurement {

    // TSP, G, HG, KG, ML, CL, DL, L.
    Tablespoon, Gram, Hectogram, Kilogram, Milliliter, Centiliter, Deciliter, Liter;

    private String unit; // Storing a state.

    Measurement() {
    }

    Measurement(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
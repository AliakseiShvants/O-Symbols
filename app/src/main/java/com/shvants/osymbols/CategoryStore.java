package com.shvants.osymbols;

public class CategoryStore {
    private static Category[] categories = new Category[7];
    static {
        Category landforms = new Category(0, "Landforms");
        landforms.setSymbols(SymbolStore.getLandformSymbols());
        categories[0] = landforms;
    }

    public static Category[] getCategories() {
        return categories;
    }
}

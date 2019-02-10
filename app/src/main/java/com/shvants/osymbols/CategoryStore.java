package com.shvants.osymbols;

import java.util.ArrayList;
import java.util.List;

public class CategoryStore {
    private static List<Category> categories = new ArrayList<>();
    static {
        Category landforms = new Category(0, "Landforms");
        List<Symbol> landformsSymbols = new ArrayList<>();

        for (final Symbol symbol: SymbolStore.getSymbols()){
            switch (symbol.getNumber()/100){
                case 1:
                    landformsSymbols.add(symbol);
                    break;
            }
        }

        landforms.setSymbols(landformsSymbols);

        categories.add(landforms);

    }


    public static List<Category> getCategories() {
        return categories;
    }
}

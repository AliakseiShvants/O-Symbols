package com.shvants.osymbols;

import java.util.List;

public class Category {
    private int categoryId;
    private String title;
    private Symbol[] symbols;

    public Category(int categoryId, String title) {
        this.categoryId = categoryId;
        this.title = title;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getTitle() {
        return title;
    }

    public Symbol[] getSymbols() {
        return symbols;
    }

    public void setSymbols(Symbol[] symbols) {
        this.symbols = symbols;
    }
}

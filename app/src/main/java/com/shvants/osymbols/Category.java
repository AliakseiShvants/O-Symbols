package com.shvants.osymbols;

import java.util.List;

public class Category {
    private int categoryId;
    private String title;
    private List<Symbol> symbols;

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

    public List<Symbol> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Symbol> symbols) {
        this.symbols = symbols;
    }
}

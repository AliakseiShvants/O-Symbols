package com.shvants.osymbols;

public class Specification {
    private int specificationId;
    private String title;
    private Category[] categories;

    public Specification(int specificationId, String title) {
        this.specificationId = specificationId;
        this.title = title;
    }

    public Category[] getCategories() {
        return categories;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

    public int getSpecificationId() {
        return specificationId;
    }

    public String getTitle() {
        return title;
    }
}

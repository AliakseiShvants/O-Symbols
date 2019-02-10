package com.shvants.osymbols;

import java.util.ArrayList;
import java.util.List;

public class Specification {
    private int specificationId;
    private String title;
    private List<Category> categories;

    public Specification(int specificationId, String title, List<Category> categories) {
        this.specificationId = specificationId;
        this.title = title;
        this.categories = categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public int getSpecificationId() {
        return specificationId;
    }

    public String getTitle() {
        return title;
    }

    public List<Category> getCategories() {
        return new ArrayList<>(categories);
    }
}

package com.shvants.osymbols;

import java.util.HashMap;
import java.util.Map;

public class SpecificationStore {
    private static Map<Integer, Specification> specifications = new HashMap<>();
    static {
        Specification isom2017 = new Specification(R.id.isom2017, "ISOM2017");
        isom2017.setCategories(CategoryStore.getCategories());
        specifications.put(R.id.isom2017, isom2017);
    }

    public static Map<Integer, Specification> getSpecifications() {
        return specifications;
    }
}

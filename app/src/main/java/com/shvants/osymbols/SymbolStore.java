package com.shvants.osymbols;

public class SymbolStore {

    private static Symbol[] landformSymbols = new Symbol[10];
    static {
        landformSymbols[0] = new Symbol(101,
                            "Contour",
                        "A line joining points of equal height. The standard vertical interval " +
                                "between contours is 5 metres. Acontour interval of 2.5 metres may be used " +
                                "for flat terrains.",
                                R.drawable.isom101);
        landformSymbols[1] = new Symbol(102,
                "Index contour",
                "A line joining points of equal height. The standard vertical interval " +
                        "between contours is 5 metres. Acontour interval of 2.5 metres may be used " +
                        "for flat terrains.",
                R.drawable.isom101);
        landformSymbols[2] = new Symbol(103,
                "Form line",
                "A line joining points of equal height. The standard vertical interval " +
                        "between contours is 5 metres. Acontour interval of 2.5 metres may be used " +
                        "for flat terrains.",
                R.drawable.isom101);
        landformSymbols[3] = new Symbol(104,
                "Earth bank",
                "A line joining points of equal height. The standard vertical interval " +
                        "between contours is 5 metres. Acontour interval of 2.5 metres may be used " +
                        "for flat terrains.",
                R.drawable.isom101);
        landformSymbols[4] = new Symbol(105,
                "Earth wall",
                "A line joining points of equal height. The standard vertical interval " +
                        "between contours is 5 metres. A contour interval of 2.5 metres may be used " +
                        "for flat terrains.",
                R.drawable.isom101);
        landformSymbols[5] = new Symbol(106,
                "Ruined earth wall",
                "A line joining points of equal height. The standard vertical interval " +
                        "between contours is 5 metres. A contour interval of 2.5 metres may be used " +
                        "for flat terrains.",
                R.drawable.isom101);
        landformSymbols[6] = new Symbol(107,
                "Erosion gully",
                "A line joining points of equal height. The standard vertical interval " +
                        "between contours is 5 metres. Acontour interval of 2.5 metres may be used " +
                        "for flat terrains.",
                R.drawable.isom101);
        landformSymbols[7] = new Symbol(108,
                "Small erosion gully",
                "A line joining points of equal height. The standard vertical interval " +
                        "between contours is 5 metres. A contour interval of 2.5 metres may be used " +
                        "for flat terrains.",
                R.drawable.isom101);
        landformSymbols[8] = new Symbol(109,
                "Small knoll",
                "A line joining points of equal height. The standard vertical interval " +
                        "between contours is 5 metres. A contour interval of 2.5 metres may be used " +
                        "for flat terrains.",
                R.drawable.isom101);
        landformSymbols[9] = new Symbol(110,
                "Small elongated knoll",
                "A line joining points of equal height. The standard vertical interval " +
                        "between contours is 5 metres. A contour interval of 2.5 metres may be used " +
                        "for flat terrains.",
                R.drawable.isom101);
    }

    public static Symbol[] getLandformSymbols() {
        return landformSymbols;
    }
}

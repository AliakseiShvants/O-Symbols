package com.shvants.osymbols;

public class SymbolStore {

    private static Symbol[] symbols = new Symbol[1];
    static {
        symbols[0] = new Symbol(101,
                            "Contour",
                        "A line joining points of equal height. The standard vertical interval " +
                                "between contours is 5 metres. Acontour interval of 2.5 metres may be used " +
                                "for flat terrains.",
                                R.drawable.isom101);
    }

    public static Symbol[] getSymbols() {
        return symbols;
    }
}

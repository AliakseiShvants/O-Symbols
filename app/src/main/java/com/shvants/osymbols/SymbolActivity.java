package com.shvants.osymbols;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SymbolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symbol);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView listView = findViewById(R.id.items_list);

        Intent intent = getIntent();
        final int specificationId = intent.getIntExtra("specificationId", 0);
        final int categoryId = intent.getIntExtra("categoryId", 0);

        List<Symbol> symbols = SpecificationStore.getSpecifications()
                                                 .get(specificationId)
                                                 .getCategories()
                                                 .get(categoryId)
                                                 .getSymbols();
        ArrayAdapter<Symbol> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                symbols

        );
        listView.setAdapter(adapter);
    }
}

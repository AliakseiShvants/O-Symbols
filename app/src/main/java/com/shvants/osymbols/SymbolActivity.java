package com.shvants.osymbols;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class SymbolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symbol);

        ListView listView = findViewById(R.id.items_list);
        Intent intent = getIntent();
        final int specificationId = intent.getIntExtra("specificationId", 0);
        final int categoryId = intent.getIntExtra("categoryId", 0);

        Category category = SpecificationStore.getSpecifications()
                                              .get(specificationId)
                                              .getCategories()
                                              [categoryId];
        Symbol[] symbols = category.getSymbols();
        ArrayAdapter<Symbol> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                symbols
        );
        listView.setAdapter(adapter);



        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(category.getTitle());
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}

package com.shvants.osymbols;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView listView = findViewById(R.id.sections_list);

        Intent intent = getIntent();
        final int specificationId = intent.getIntExtra("specificationId", 0);

        AdapterView.OnItemClickListener clickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Specification specification =
//                        SpecificationStore.getSpecifications().get(specificationId);
//                Category category = CategoryStore.getCategories().get((int) id);

                Intent intent = new Intent(CategoryActivity.this, SymbolActivity.class);

                intent.putExtra("specificationId", specificationId);
                intent.putExtra("categoryId", position);
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(clickListener);
    }
}

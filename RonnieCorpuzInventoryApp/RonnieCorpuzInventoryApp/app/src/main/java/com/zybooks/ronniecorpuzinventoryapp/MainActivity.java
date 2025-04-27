package com.zybooks.ronniecorpuzinventoryapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewInventory;
    private SearchView searchView;
    private FloatingActionButton fabAddItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        recyclerViewInventory = findViewById(R.id.recyclerViewInventory);
        searchView = findViewById(R.id.searchView);
        fabAddItem = findViewById(R.id.fabAddItem);

        // Set up listeners - functionality will be added in Project 3
        fabAddItem.setOnClickListener(view -> {
            // This will launch the Add Item activity in Project 3
        });

        // Search functionality - to be implemented in Project 3
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }
}
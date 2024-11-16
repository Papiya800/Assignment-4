// MainActivity.java
package com.example.educationalapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    private static final android.R.attr R = ;
    ExpandableListView expandableListView = findViewById(R.id.expandableListView);
    List<String> listGroup;
    HashMap<String, List<String>> listItem;
    CustomAdapter


    CustomAdapter adapter;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(android.R.attr.layout);

        listGroup = new ArrayList<>();
        listItem = new HashMap<>();
        adapter = new CustomAdapter(this, listGroup, listItem);
        expandableListView.setAdapter(adapter);

        initListData();

        Button locationButton = findViewById(R.id);
        locationButton.setOnClickListener(view ->
                Toast.makeText(MainActivity.this, "Location Button Clicked", Toast.LENGTH_SHORT).show()
        );
    }

    private void initListData() {
        listGroup.add("Europe");
        listGroup.add("Asia");
        listGroup.add("North America");

        List<String> europe = new ArrayList<>();
        europe.add("Germany");
        europe.add("France");
        europe.add("Italy");

        List<String> asia = new ArrayList<>();
        asia.add("China");
        asia.add("India");
        asia.add("Bangladesh");

        List<String> northAmerica = new ArrayList<>();
        northAmerica.add("USA");
        northAmerica.add("Canada");
        northAmerica.add("Mexico");

        listItem.put(listGroup.get(0), europe);
        listItem.put(listGroup.get(1), asia);
        listItem.put(listGroup.get(2), northAmerica);

        adapter.notifyDataSetChanged();
    }
}
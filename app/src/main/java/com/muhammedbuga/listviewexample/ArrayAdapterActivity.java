package com.muhammedbuga.listviewexample;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ArrayAdapterActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] items = {"Kedi", "Köpek", "Kuş"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);

        setListAdapter(adapter);

        getListView().setOnItemClickListener((parent, view, position, id) -> {
            String selectedItem = (String) getListView().getItemAtPosition(position);
            Toast.makeText(ArrayAdapterActivity.this, "Tıklanan öğe: " + selectedItem, Toast.LENGTH_SHORT).show();
        });

    }
}

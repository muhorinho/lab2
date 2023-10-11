package com.muhammedbuga.listviewexample;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Context;
import android.view.View;
import android.widget.ListView;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class CustomAdapterActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Hayvan verilerini oluşturun
        Animal[] animals = {
                new Animal("Köpek", R.drawable.dog),
                new Animal("Kedi", R.drawable.cat),
                new Animal("Kuş", R.drawable.bird)
        };

        AnimalAdapter adapter = new AnimalAdapter(this, R.layout.listview_row, animals);
        setListAdapter(adapter);

        // ListView'da öğeye tıklanınca ne olacağını belirtin
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Animal selectedAnimal = animals[position];
                Toast.makeText(CustomAdapterActivity.this, "Tıklanan hayvan: " + selectedAnimal.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

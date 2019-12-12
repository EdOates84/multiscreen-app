package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;             //for the gridview and next for listview, don't forget to import them.
import android.widget.ListView;
import java.util.ArrayList;
import android.widget.ArrayAdapter;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> numberlist = new ArrayList<>();
        numberlist.add("one");
        numberlist.add("two");
        numberlist.add("three");
        numberlist.add("four");
        numberlist.add("five");
        numberlist.add("six");
        numberlist.add("six");
        numberlist.add("six");
        numberlist.add("six");
        numberlist.add("six");
        numberlist.add("six");
        numberlist.add("six");
        numberlist.add("six");
        numberlist.add("six");
        numberlist.add("six");


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numberlist);
        GridView listView = findViewById(R.id.list1);
        listView.setAdapter(itemsAdapter);



//        LinearLayout numberView = (LinearLayout)findViewById(R.id.numberView);
//        TextView wordView = new TextView(this);
//        wordView.setText(numberlist.get(0));
//        numberView.addView(wordView);

    }
}

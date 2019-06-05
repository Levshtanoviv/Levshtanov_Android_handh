package ru.levs.lesson1_1.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MainActivity<auto> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPrint = (Button) findViewById(R.id.button2);

        final EditText text = (EditText) findViewById(R.id.editText);
        final TextView messageText = (TextView) findViewById(R.id.textView1);
        final TextView arrText = (TextView) findViewById(R.id.textView2);
        final Map<Integer, Student> hashMap = new HashMap<Integer, Student>();


        text.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)){
                    Toast.makeText(MainActivity.this, text.getText(), Toast.LENGTH_SHORT).show();

                    String str = text.getText().toString();
                    Student s = new Student(str);
                //    System.out.print(s);
                    text.setText("");
                    hashMap.put(s.getId(), s);

                    return true;
                }
                return false;
            }
        });



        buttonPrint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Set keys = hashMap.keySet();
                arrText.setText("");
                for(Iterator i = keys.iterator(); (i).hasNext();){
                    Integer key = (Integer) i.next();
                    Student value = hashMap.get(key);
                    arrText.append(value + "\n");
                }
            }
        });
    }
}

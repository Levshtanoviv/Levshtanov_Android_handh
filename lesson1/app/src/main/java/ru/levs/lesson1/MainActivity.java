package ru.levs.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSave = (Button)findViewById(R.id.button);
        Button buttonPrint = (Button) findViewById(R.id.button2);
        final ArrayList<String> names = new ArrayList<String>();
        //final SortedSet<String> names = new TreeSet<>();
        final EditText text = (EditText) findViewById(R.id.editText);
        final TextView messageText = (TextView) findViewById(R.id.textView1);
        final TextView arrText = (TextView) findViewById(R.id.textView2);
        final Collator collator = Collator.getInstance(new Locale("ru")); //для буквы ё чоб не лезла вниз

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                messageText.setVisibility(View.VISIBLE); // Делаю выдимым уведомление
                names.add(text.getText().toString());    // Заполнение массива
                messageText.setText("Участник добавлен");
                text.setText("");
                messageText.postDelayed(new Runnable() {  // скрываю увед через 3 секунды
                    @Override
                    public void run() {
                        messageText.setVisibility(View.INVISIBLE);
                    }
                }, 3000);
            }
        });

        buttonPrint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrText.setText("");
                Collections.addAll(names);// убрать для treeset
                Collections.sort(names, collator);// убрать для treeset
                for(int i = 0; i < names.size(); i++) {
                    arrText.append(names.get(i) + "\n");
                }
                //arrText.setText(names.toString() + "\n"); тут отображается так [Аня, Ваня],
                // т.е. сортиует и удаляет повторения, но отображается неверно
            }
        });
    }
}

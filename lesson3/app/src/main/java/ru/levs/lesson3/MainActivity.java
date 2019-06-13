package ru.levs.lesson3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.WindowDecorActionBar;

import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

/*import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;*/


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar); //Здесь проблема, просит создать private void setSupportActionBar(Toolbar toolbar) который в 69 строке
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView textNamePerson = findViewById(R.id.textNamePerson);
        TextView textSurnamePerson = findViewById(R.id.textSurnamePerson);
        TextView textMailPerson = findViewById(R.id.textMailPerson);
        TextView textLoginPerson = findViewById(R.id.textLoginPerson);
        TextView textRegionPerson = findViewById(R.id.textRegionPerson);

        final TextView textExit = findViewById(R.id.textExit);

        textNamePerson.setText("Анастасия");
        textSurnamePerson.setText("Антонина");
        textMailPerson.setText("anykee.box@gmail.ru");
        textLoginPerson.setText("HIE023UOI88");
        textRegionPerson.setText("Санкт-Петербург");

        textExit.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    Toast.makeText(MainActivity.this, textExit.getText(), Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {   //Не отображается меню
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}



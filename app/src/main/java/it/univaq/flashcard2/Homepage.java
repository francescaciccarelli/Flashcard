package it.univaq.flashcard2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Homepage extends AppCompatActivity {
    Button start;
    Button gastroenterico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (isFirstTime()) {
            setContentView(R.layout.first_login);
            start = findViewById(R.id.button_start);

            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    setFirstTime(false);
                    startActivity(new Intent(Homepage.this, Homepage.class));
                    finish();
                }
            });

        } else {
            setContentView(R.layout.homepage);

            gastroenterico = findViewById(R.id.button_section1);

            gastroenterico.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(Homepage.this, Legenda_gastroenterico.class));
                }
            });
        }
    }

    private boolean isFirstTime() {
        // Ottieni l'accesso alle preferenze condivise
        SharedPreferences sharedPref = getSharedPreferences("my_preferences", Context.MODE_PRIVATE);
        // Controlla se c'è uno stato "first_time" memorizzato
        return sharedPref.getBoolean("first_time", true);
    }

    private void setFirstTime(boolean value) {
        // Ottieni l'accesso alle preferenze condivise
        SharedPreferences sharedPref = getSharedPreferences("my_preferences", Context.MODE_PRIVATE);
        // Salva lo stato "first_time"
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean("first_time", value);
        editor.apply();
    }
}


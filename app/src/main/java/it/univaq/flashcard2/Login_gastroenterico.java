package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class Login_gastroenterico extends AppCompatActivity {
    Button backbutton;
    Button patologie;
    Button sintomi;
    Button complicanze;
    Button contenuti;
    NavigationView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_gastroenterico);

        backbutton = findViewById(R.id.back_button_gastroenterico);
        patologie = findViewById(R.id.patologie_button);
        sintomi = findViewById(R.id.sintomi_button);
        complicanze = findViewById(R.id.cirrosi_button);
        contenuti = findViewById(R.id.contenuti_button);
        menu = findViewById(R.id.menu_login);

        menu.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // Gestisci qui gli eventi di selezione del menu
                int itemId = item.getItemId();
                if (itemId == R.id.nav_patologie) {
                    Intent patologieIntent = new Intent(Login_gastroenterico.this, Patologie.class);
                    startActivity(patologieIntent);
                } else if (itemId == R.id.nav_sintomi) {
                    Intent sintomiIntent = new Intent(Login_gastroenterico.this, Sintomi.class);
                    startActivity(sintomiIntent);
                } else if (itemId == R.id.nav_complicanze) {
                    Intent complicanzeIntent = new Intent(Login_gastroenterico.this, Cirrosi.class);
                    startActivity(complicanzeIntent);
                } else if (itemId == R.id.nav_contenuti_aggiuntivi) {
                    Intent contenutiIntent = new Intent(Login_gastroenterico.this, ContenutiAggiuntivi.class);
                    startActivity(contenutiIntent);
                }
                return true;
            }
        });

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login_gastroenterico.this, Homepage.class));
            }
        });

        patologie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login_gastroenterico.this, Patologie.class));
            }
        });

        sintomi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login_gastroenterico.this, Sintomi.class));
            }
        });

        complicanze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login_gastroenterico.this, Cirrosi.class));
            }
        });

        contenuti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login_gastroenterico.this, ContenutiAggiuntivi.class));
            }
        });
    }
}
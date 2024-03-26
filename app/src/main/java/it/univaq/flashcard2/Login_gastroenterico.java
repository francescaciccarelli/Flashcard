package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login_gastroenterico extends AppCompatActivity {
    Button patologie;
    Button sintomi;
    Button complicanze;
    Button contenuti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_gastroenterico);

        patologie = findViewById(R.id.patologie_button);
        sintomi = findViewById(R.id.sintomi_button);
        complicanze = findViewById(R.id.cirrosi_button);
        contenuti = findViewById(R.id.contenuti_button);

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
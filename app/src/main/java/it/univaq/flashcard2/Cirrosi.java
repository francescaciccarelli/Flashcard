package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Cirrosi extends AppCompatActivity {
    Button backbutton;
    Button ascite;
    Button encefalopatia;
    Button peritonite;
    Button rotturaVarici;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cirrosi);

        backbutton = findViewById(R.id.back_button_gastroenterico_cirrosi);
        ascite = findViewById(R.id.ascite_button);
        encefalopatia = findViewById(R.id.encefalopatia_button);
        peritonite = findViewById(R.id.peritonite_button);
        rotturaVarici = findViewById(R.id.rottura_varici_button);

        backbutton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              startActivity(new Intent(Cirrosi.this, Login_gastroenterico.class));
          }
        });

        ascite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cirrosi.this, CirrosiAscite.class));
            }
        });

        peritonite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cirrosi.this, CirrosiPeritonite.class));
            }
        });

        rotturaVarici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cirrosi.this, CirrosiRotturaVarici.class));
            }
        });

    }
}

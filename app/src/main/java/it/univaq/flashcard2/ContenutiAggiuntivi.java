package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ContenutiAggiuntivi extends AppCompatActivity {
    Button backbutton;
    Button approccio;
    Button somministrazione;
    Button terapiaAnalgesica;
    Button terapiaAntibiotica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contenuti);

        backbutton = findViewById(R.id.back_button_gastroenterico_contenuti);
        approccio = findViewById(R.id.paziente_button);
        somministrazione = findViewById(R.id.somministrazione_button);
        terapiaAnalgesica = findViewById(R.id.terapia_analgesica_button);
        terapiaAntibiotica = findViewById(R.id.terapia_antibiotica_button);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ContenutiAggiuntivi.this, Login_gastroenterico.class));
            }
        });
        approccio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ContenutiAggiuntivi.this, ContenutoApproccioPaziente.class));
            }
        });

        somministrazione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ContenutiAggiuntivi.this, ContenutoSomministrazione.class));
            }
        });

        terapiaAnalgesica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ContenutiAggiuntivi.this, ContenutoTerapiaAnalgesica.class));
            }
        });

        terapiaAntibiotica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ContenutiAggiuntivi.this, ContenutoTerapiaAntibiotica.class));
            }
        });
    }

}

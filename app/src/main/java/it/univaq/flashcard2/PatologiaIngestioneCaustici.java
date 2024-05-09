package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PatologiaIngestioneCaustici extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button trattamento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patologia_ingestione_caustici);

        backbutton = findViewById(R.id.back_button_ingestione_caustici);
        clinica = findViewById(R.id.clinica_ingestione_caustici);
        diagnosi = findViewById(R.id.diagnosi_ingestione_caustici);
        trattamento = findViewById(R.id.trattamento_ingestione_caustici);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaIngestioneCaustici.this, Patologie.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaIngestioneCaustici.this, PatologiaIngestioneCausticiClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaIngestioneCaustici.this, PatologiaIngestioneCausticiDiagnosi.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaIngestioneCaustici.this, PatologiaIngestioneCausticiTrattamento.class));
            }
        });

    }
}

package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PatologiaIngestioneCorpi extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button casi;
    Button trattamento;
    Button note;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patologia_ingestione_corpi);

        backbutton = findViewById(R.id.back_button_ingestione_corpi);
        clinica = findViewById(R.id.clinica_ingestione_corpi);
        diagnosi = findViewById(R.id.diagnosi_ingestione_corpi);
        casi = findViewById(R.id.casi_particolari_ingestione_corpi);
        trattamento = findViewById(R.id.trattamento_ingestione_corpi);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaIngestioneCorpi.this, Patologie.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaIngestioneCorpi.this, PatologiaIngestioneCorpiClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaIngestioneCorpi.this, PatologiaIngestioneCorpiDiagnosi.class));
            }
        });

        casi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaIngestioneCorpi.this, PatologiaIngestioneCorpiCasiParticolari.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaIngestioneCorpi.this, PatologiaIngestioneCorpiTrattamento.class));
            }
        });

        note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaIngestioneCorpi.this, PatologiaIngestioneCorpiNote.class));
            }
        });
    }
}

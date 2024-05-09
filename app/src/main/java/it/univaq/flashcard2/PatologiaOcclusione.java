package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PatologiaOcclusione extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosi_diff;
    Button trattamento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patologia_occlusione);

        backbutton = findViewById(R.id.back_button_occlusione);
        clinica = findViewById(R.id.clinica_occlusione);
        diagnosi = findViewById(R.id.diagnosi_occlusione);
        diagnosi_diff = findViewById(R.id.diagnosi_differenziale_occlusione);
        trattamento = findViewById(R.id.trattamento_occlusione);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaOcclusione.this, Patologie.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaOcclusione.this, PatologiaOcclusioneClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaOcclusione.this, PatologiaOcclusioneDiagnosi.class));
            }
        });

        diagnosi_diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaOcclusione.this, PatologiaOcclusioneDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaOcclusione.this, PatologiaOcclusioneTrattamento.class));
            }
        });
    }
}

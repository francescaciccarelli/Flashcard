package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PatologiaDiverticolite extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosi_diff;
    Button trattamento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patologia_diverticolite);

        backbutton = findViewById(R.id.back_button_diverticolite);
        clinica = findViewById(R.id.clinica_diverticolite);
        diagnosi = findViewById(R.id.diagnosi_diverticolite);
        diagnosi_diff = findViewById(R.id.diagnosi_differenziale_diverticolite);
        trattamento = findViewById(R.id.trattamento_diverticolite);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaDiverticolite.this, Patologie.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaDiverticolite.this, PatologiaDiverticoliteClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaDiverticolite.this, PatologiaDiverticoliteDiagnosi.class));
            }
        });

        diagnosi_diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaDiverticolite.this, PatologiaDiverticoliteDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaDiverticolite.this, PatologiaDiverticoliteTrattamento.class));
            }
        });
    }
}

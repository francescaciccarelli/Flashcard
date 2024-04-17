package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PatologiaAppendicite extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosi_diff;
    Button trattamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patologia_appendicite);

        backbutton = findViewById(R.id.back_button_appendicite);
        clinica = findViewById(R.id.clinica_appendicite);
        diagnosi = findViewById(R.id.diagnosi_appendicite);
        diagnosi_diff = findViewById(R.id.diagnosi_differenziale_appendicite);
        trattamento = findViewById(R.id.trattamento_appendicite);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaAppendicite.this, Patologie.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaAppendicite.this, PatologiaAppendiciteClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaAppendicite.this, PatologiaAppendiciteDiagnosi.class));
            }
        });

        diagnosi_diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaAppendicite.this, PatologiaAppendiciteDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaAppendicite.this, PatologiaAppendiciteTrattamento.class));
            }
        });
    }
}

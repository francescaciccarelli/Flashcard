package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PatologiaColangite extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosi_diff;
    Button trattamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patologia_colangite);

        backbutton = findViewById(R.id.back_button_colangite);
        clinica = findViewById(R.id.clinica_colangite);
        diagnosi = findViewById(R.id.diagnosi_colangite);
        diagnosi_diff = findViewById(R.id.diagnosi_differenziale_colangite);
        trattamento = findViewById(R.id.trattamento_colangite);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaColangite.this, Patologie.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaColangite.this, PatologiaColangiteClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaColangite.this, PatologiaColangiteDiagnosi.class));
            }
        });

        diagnosi_diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaColangite.this, PatologiaColangiteDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaColangite.this, PatologiaColangiteTrattamento.class));
            }
        });
    }
}

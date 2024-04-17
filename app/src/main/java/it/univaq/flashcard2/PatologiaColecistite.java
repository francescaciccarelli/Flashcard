package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PatologiaColecistite extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosi_diff;
    Button trattamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patologia_colecistite);

        backbutton = findViewById(R.id.back_button_colecistite);
        clinica = findViewById(R.id.clinica_colecistite);
        diagnosi = findViewById(R.id.diagnosi_colecistite);
        diagnosi_diff = findViewById(R.id.diagnosi_differenziale_colecistite);
        trattamento = findViewById(R.id.trattamento_colecistite);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaColecistite.this, Patologie.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaColecistite.this, PatologiaColecistiteClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaColecistite.this, PatologiaColecistiteDiagnosi.class));
            }
        });

        diagnosi_diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaColecistite.this, PatologiaColecistiteDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaColecistite.this, PatologiaColecistiteTrattamento.class));
            }
        });
    }
}

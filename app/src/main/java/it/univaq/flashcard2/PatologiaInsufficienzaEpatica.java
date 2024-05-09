package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PatologiaInsufficienzaEpatica extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosi_diff;
    Button cause;
    Button trattamento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patologia_insufficienza_epatica);

        backbutton = findViewById(R.id.back_button_insufficienza_epatica);
        clinica = findViewById(R.id.clinica_insufficienza_epatica);
        diagnosi = findViewById(R.id.diagnosi_insufficienza_epatica);
        diagnosi_diff = findViewById(R.id.diagnosi_differenziale_insufficienza_epatica);
        cause = findViewById(R.id.cause_scatenanti_insufficienza_epatica);
        trattamento = findViewById(R.id.trattamento_insufficienza_epatica);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaInsufficienzaEpatica.this, Patologie.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaInsufficienzaEpatica.this, PatologiaInsufficienzaEpaticaClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaInsufficienzaEpatica.this, PatologiaInsufficienzaEpaticaDiagnosi.class));
            }
        });

        diagnosi_diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaInsufficienzaEpatica.this, PatologiaInsufficienzaEpaticaDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaInsufficienzaEpatica.this, PatologiaInsufficienzaEpaticaTrattamento.class));
            }
        });

        cause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaInsufficienzaEpatica.this, PatologiaInsufficienzaEpaticaCause.class));
            }
        });
    }
}

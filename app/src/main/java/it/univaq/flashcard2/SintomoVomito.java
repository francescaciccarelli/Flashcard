package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SintomoVomito extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosiDiff;
    Button trattamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sintomo_vomito);

        backbutton = findViewById(R.id.back_button_vomito);
        clinica = findViewById(R.id.clinica_vomito);
        diagnosi = findViewById(R.id.diagnosi_vomito);
        diagnosiDiff = findViewById(R.id.diagnosi_differenziale_vomito);
        trattamento = findViewById(R.id.trattamento_vomito);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoVomito.this, Sintomi.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoVomito.this, SintomoVomitoClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoVomito.this, SintomoVomitoDiagnosi.class));
            }
        });

        diagnosiDiff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoVomito.this, SintomoVomitoDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoVomito.this, SintomoVomitoTrattamento.class));
            }
        });
    }
}

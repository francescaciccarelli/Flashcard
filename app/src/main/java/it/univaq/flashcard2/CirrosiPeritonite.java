package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CirrosiPeritonite extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosi_diff;
    Button trattamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cirrosi_peritonite);

        backbutton = findViewById(R.id.back_button_peritonite);
        clinica = findViewById(R.id.clinica_peritonite);
        diagnosi = findViewById(R.id.diagnosi_peritonite);
        diagnosi_diff = findViewById(R.id.diagnosi_differenziale_peritonite);
        trattamento = findViewById(R.id.trattamento_peritonite);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiPeritonite.this, Cirrosi.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiPeritonite.this, CirrosiPeritoniteClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiPeritonite.this, CirrosiPeritoniteDiagnosi.class));
            }
        });

        diagnosi_diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiPeritonite.this, CirrosiPeritoniteDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiPeritonite.this, CirrosiPeritoniteTrattamento.class));
            }
        });
    }
}

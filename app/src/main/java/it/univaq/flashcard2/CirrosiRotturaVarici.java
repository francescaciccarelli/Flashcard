package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CirrosiRotturaVarici extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosi_diff;
    Button trattamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cirrosi_rottura_varici);

        backbutton = findViewById(R.id.back_button_rottura_varici);
        clinica = findViewById(R.id.clinica_rottura_varici);
        diagnosi = findViewById(R.id.diagnosi_rottura_varici);
        diagnosi_diff = findViewById(R.id.diagnosi_differenziale_rottura_varici);
        trattamento = findViewById(R.id.trattamento_rottura_varici);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiRotturaVarici.this, Cirrosi.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiRotturaVarici.this, CirrosiRotturaVariciClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiRotturaVarici.this, CirrosiRotturaVariciDiagnosi.class));
            }
        });

        diagnosi_diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiRotturaVarici.this, CirrosiRotturaVariciDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiRotturaVarici.this, CirrosiRotturaVariciTrattamento.class));
            }
        });
    }
}

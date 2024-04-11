package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CirrosiAscite extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button grading;
    Button trattamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cirrosi_ascite);

        backbutton = findViewById(R.id.back_button_ascite);
        clinica = findViewById(R.id.clinica_ascite);
        diagnosi = findViewById(R.id.diagnosi_ascite);
        grading = findViewById(R.id.grading_ascite);
        trattamento = findViewById(R.id.trattamento_ascite);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiAscite.this, Cirrosi.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiAscite.this, CirrosiAsciteClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiAscite.this, CirrosiAsciteDiagnosi.class));
            }
        });

        grading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiAscite.this, CirrosiAsciteGrading.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiAscite.this, CirrosiAsciteTrattamento.class));
            }
        });
    }
}

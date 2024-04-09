package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SintomoDisfagia extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosiDiff;
    Button trattamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sintomo_disfagia);

        backbutton = findViewById(R.id.back_button_disfagia);
        clinica = findViewById(R.id.clinica_disfagia);
        diagnosi = findViewById(R.id.diagnosi_disfagia);
        diagnosiDiff = findViewById(R.id.diagnosi_differenziale_disfagia);
        trattamento = findViewById(R.id.trattamento_disfagia);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoDisfagia.this, Sintomi.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoDisfagia.this, SintomoDisfagiaClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoDisfagia.this, SintomoDisfagiaDiagnosi.class));
            }
        });

        diagnosiDiff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoDisfagia.this, SintomoDisfagiaDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoDisfagia.this, SintomoDisfagiaTrattamento.class));
            }
        });
    }
}

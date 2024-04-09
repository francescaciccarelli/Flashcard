package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SintomoDiarrea extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosiDiff;
    Button trattamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sintomo_diarrea);

        backbutton = findViewById(R.id.back_button_diarrea);
        clinica = findViewById(R.id.clinica_diarrea);
        diagnosi = findViewById(R.id.diagnosi_diarrea);
        diagnosiDiff = findViewById(R.id.diagnosi_differenziale_diarrea);
        trattamento = findViewById(R.id.trattamento_diarrea);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoDiarrea.this, Sintomi.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoDiarrea.this, SintomoDiarreaClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoDiarrea.this, SintomoDiarreaDiagnosi.class));
            }
        });

        diagnosiDiff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoDiarrea.this, SintomoDiarreaDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoDiarrea.this, SintomoDiarreaTrattamento.class));
            }
        });
    }
}

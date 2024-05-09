package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PatologiaPerforazione extends AppCompatActivity {
    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosi_diff;
    Button trattamento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patologia_perforazione);

        backbutton = findViewById(R.id.back_button_perforazione);
        clinica = findViewById(R.id.clinica_perforazione);
        diagnosi = findViewById(R.id.diagnosi_perforazione);
        diagnosi_diff = findViewById(R.id.diagnosi_differenziale_perforazione);
        trattamento = findViewById(R.id.trattamento_perforazione);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaPerforazione.this, Patologie.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaPerforazione.this, PatologiaPerforazioneClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaPerforazione.this, PatologiaPerforazioneDiagnosi.class));
            }
        });

        diagnosi_diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaPerforazione.this, PatologiaPerforazioneDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaPerforazione.this, PatologiaPerforazioneTrattamento.class));
            }
        });
    }
}

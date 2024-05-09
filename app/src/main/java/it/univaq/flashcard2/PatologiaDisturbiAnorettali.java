package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PatologiaDisturbiAnorettali extends AppCompatActivity {
    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button cause;
    Button trattamento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patologia_disturbi_anorettali);

        backbutton = findViewById(R.id.back_button_disturbi_anorettali);
        clinica = findViewById(R.id.clinica_disturbi_anorettali);
        diagnosi = findViewById(R.id.diagnosi_disturbi_anorettali);
        cause = findViewById(R.id.cause_disturbi_anorettali);
        trattamento = findViewById(R.id.trattamento_disturbi_anorettali);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaDisturbiAnorettali.this, Patologie.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaDisturbiAnorettali.this, PatologiaDisturbiAnorettaliClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaDisturbiAnorettali.this, PatologiaDisturbiAnorettaliDiagnosi.class));
            }
        });

        cause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaDisturbiAnorettali.this, PatologiaDisturbiAnorettaliPrincipaliCause.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaDisturbiAnorettali.this, PatologiaDisturbiAnorettaliTrattamento.class));
            }
        });
    }

}

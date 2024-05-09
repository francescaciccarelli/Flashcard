package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PatologiaEmorragieDigestive extends AppCompatActivity {
    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosi_diff;
    Button trattamento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patologia_emorragie_digestive);

        backbutton = findViewById(R.id.back_button_emorragie_digestive);
        clinica = findViewById(R.id.clinica_emorragie_digestive);
        diagnosi = findViewById(R.id.diagnosi_emorragie_digestive);
        diagnosi_diff = findViewById(R.id.diagnosi_differenziale_emorragie_digestive);
        trattamento = findViewById(R.id.trattamento_emorragie_digestive);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaEmorragieDigestive.this, Patologie.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaEmorragieDigestive.this, PatologiaEmorragieDigestiveClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaEmorragieDigestive.this, PatologiaEmorragieDigestiveDiagnosi.class));
            }
        });

        diagnosi_diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaEmorragieDigestive.this, PatologiaEmorragieDigestiveDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaEmorragieDigestive.this, PatologiaEmorragieDigestiveTrattamento.class));
            }
        });
    }
}

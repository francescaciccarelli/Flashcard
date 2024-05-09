package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PatologiaErnie extends AppCompatActivity {
    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosi_diff;
    Button trattamento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patologia_ernie_addominali);

        backbutton = findViewById(R.id.back_button_ernie);
        clinica = findViewById(R.id.clinica_ernie);
        diagnosi = findViewById(R.id.diagnosi_ernie);
        diagnosi_diff = findViewById(R.id.diagnosi_differenziale_ernie);
        trattamento = findViewById(R.id.trattamento_ernie);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaErnie.this, Patologie.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaErnie.this, PatologiaErnieClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaErnie.this, PatologiaErnieDiagnosiClinica.class));
            }
        });

        diagnosi_diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaErnie.this, PatologiaErnieDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaErnie.this, PatologiaErnieTrattamento.class));
            }
        });
    }
}

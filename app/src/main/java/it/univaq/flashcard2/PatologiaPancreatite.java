package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PatologiaPancreatite extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosi_diff;
    Button trattamento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patologia_pancreatite);

        backbutton = findViewById(R.id.back_button_pancreatite);
        clinica = findViewById(R.id.clinica_pancreatite);
        diagnosi = findViewById(R.id.diagnosi_pancreatite);
        diagnosi_diff = findViewById(R.id.diagnosi_differenziale_pancreatite);
        trattamento = findViewById(R.id.trattamento_pancreatite);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaPancreatite.this, Patologie.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaPancreatite.this, PatologiaPancreatiteClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaPancreatite.this, PatologiaPancreatiteDiagnosi.class));
            }
        });

        diagnosi_diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaPancreatite.this, PatologiaPancreatiteDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaPancreatite.this, PatologiaPancreatiteTrattamento.class));
            }
        });
    }
}

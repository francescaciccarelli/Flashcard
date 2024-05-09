package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PatologiaUlcera extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosi_diff;
    Button trattamento;
    Button note;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patologia_ulcera);

        backbutton = findViewById(R.id.back_button_ulcera);
        clinica = findViewById(R.id.clinica_ulcera);
        diagnosi = findViewById(R.id.diagnosi_ulcera);
        diagnosi_diff = findViewById(R.id.diagnosi_differenziale_ulcera);
        trattamento = findViewById(R.id.trattamento_ulcera);
        note = findViewById(R.id.note_ulcera);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaUlcera.this, Patologie.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaUlcera.this, PatologiaUlceraClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaUlcera.this, PatologiaUlceraDiagnosi.class));
            }
        });

        diagnosi_diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaUlcera.this, PatologiaUlceraDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaUlcera.this, PatologiaUlceraTrattamento.class));
            }
        });

        note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaUlcera.this, PatologiaUlceraNote.class));
            }
        });
    }
}

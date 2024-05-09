package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PatologiaColelitiasi extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosi_diff;
    Button trattamento;
    Button note;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patologia_colelitiasi);

        backbutton = findViewById(R.id.back_button_colelitiasi);
        clinica = findViewById(R.id.clinica_colelitiasi);
        diagnosi = findViewById(R.id.diagnosi_colelitiasi);
        diagnosi_diff = findViewById(R.id.diagnosi_differenziale_colelitiasi);
        trattamento = findViewById(R.id.trattamento_colelitiasi);
        note = findViewById(R.id.note_colelitiasi);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaColelitiasi.this, Patologie.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaColelitiasi.this, PatologiaColelitiasiClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaColelitiasi.this, PatologiaColelitiasiDiagnosi.class));
            }
        });

        diagnosi_diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaColelitiasi.this, PatologiaColelitiasiDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaColelitiasi.this, PatologiaColelitiasiTrattamento.class));
            }
        });

        note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaColelitiasi.this, PatologiaColelitiasiNote.class));
            }
        });
    }
}

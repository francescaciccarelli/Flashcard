package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SintomoStipsi extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosiDiff;
    Button trattamento;
    Button note;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sintomo_stipsi);

        backbutton = findViewById(R.id.back_button_stipsi);
        clinica = findViewById(R.id.clinica_stipsi);
        diagnosi = findViewById(R.id.diagnosi_stipsi);
        diagnosiDiff = findViewById(R.id.diagnosi_differenziale_stipsi);
        trattamento = findViewById(R.id.trattamento_stipsi);
        note = findViewById(R.id.note_stipsi);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoStipsi.this, Sintomi.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoStipsi.this, SintomoStipsiClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoStipsi.this, SintomoStipsiDiagnosi.class));
            }
        });

        diagnosiDiff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoStipsi.this, SintomoStipsiDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoStipsi.this, SintomoStipsiTrattamento.class));
            }
        });

        note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoStipsi.this, SintomoStipsiNote.class));
            }
        });
    }
}


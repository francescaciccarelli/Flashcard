package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Sintomi extends AppCompatActivity {

    Button diarrea;
    Button disfagia;
    Button dolore;
    Button stipsi;
    Button vomito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sintomi);

        diarrea = findViewById(R.id.diarrea_button);
        disfagia = findViewById(R.id.disfagia_button);
        dolore = findViewById(R.id.dolore_button);
        stipsi = findViewById(R.id.stipsi_button);
        vomito = findViewById(R.id.vomito_button);

        diarrea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sintomi.this, SintomoDiarrea.class));
            }
        });

        disfagia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sintomi.this, SintomoDisfagia.class));
            }
        });

        dolore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sintomi.this, SintomoDoloreAddominale.class));
            }
        });

        stipsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sintomi.this, SintomoStipsi.class));
            }
        });

        vomito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sintomi.this, SintomoVomito.class));
            }
        });

    }

}

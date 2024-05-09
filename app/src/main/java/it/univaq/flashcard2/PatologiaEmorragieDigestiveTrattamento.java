package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PatologiaEmorragieDigestiveTrattamento extends AppCompatActivity {
    Button backbutton;
    Button digestive_superiori;
    Button digestive_inferiori;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patologia_emorragie_digestive_trattamento);

        backbutton = findViewById(R.id.back_button_emorragie_trattamento);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaEmorragieDigestiveTrattamento.this, PatologiaEmorragieDigestive.class));
            }
        });

        digestive_superiori = findViewById(R.id.trattamento_emorragie_digestive_superiori);

        digestive_superiori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaEmorragieDigestiveTrattamento.this, PatologiaEmorragieDigestiveSuperiori.class));
            }
        });

        digestive_inferiori = findViewById(R.id.trattamento_emorragie_digestive_inferiori);

        digestive_inferiori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaEmorragieDigestiveTrattamento.this, PatologiaEmorragieDigestiveInferiori.class));
            }
        });
    }
}

package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class ContenutoApproccioPaziente extends AppCompatActivity {
    Button valutazione1;
    Button valutazione2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contenuto_approcciopaziente);

        valutazione1 = findViewById(R.id.button_valutazione1);
        valutazione2 = findViewById(R.id.button_valutazione2);

        valutazione1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ContenutoApproccioPaziente.this, ContenutoPaziente1.class));
            }
        });

        valutazione2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ContenutoApproccioPaziente.this, ContenutoPaziente2.class));
            }
        });
    }
}


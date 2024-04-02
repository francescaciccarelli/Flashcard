package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ContenutoPaziente2 extends AppCompatActivity {
    Button backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contenuto_paziente2);

        backbutton = findViewById(R.id.back_button_paziente2);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ContenutoPaziente2.this, ContenutoApproccioPaziente.class));
            }
        });
    }
}

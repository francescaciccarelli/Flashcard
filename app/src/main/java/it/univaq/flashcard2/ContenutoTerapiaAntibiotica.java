package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ContenutoTerapiaAntibiotica extends AppCompatActivity {

    Button backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contenuto_terapia_antibiotica);

        backbutton = findViewById(R.id.back_button_antibiotica);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ContenutoTerapiaAntibiotica.this, ContenutiAggiuntivi.class));
            }
        });
    }
}

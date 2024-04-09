package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ContenutoTerapiaAnalgesica extends AppCompatActivity {

    Button backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contenuto_terapia_analgesica);

        backbutton = findViewById(R.id.back_button_analgesica);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ContenutoTerapiaAnalgesica.this, ContenutiAggiuntivi.class));
            }
        });
    }
}

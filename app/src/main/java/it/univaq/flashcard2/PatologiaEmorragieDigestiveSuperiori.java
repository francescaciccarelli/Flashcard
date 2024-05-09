package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PatologiaEmorragieDigestiveSuperiori extends AppCompatActivity {
    Button backbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patologia_emorragie_digestive_superiori);

        backbutton = findViewById(R.id.back_button_emorragie_superiori);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaEmorragieDigestiveSuperiori.this, PatologiaEmorragieDigestiveTrattamento.class));
            }
        });
    }
}

package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PatologiaColangiteDiagnosi extends AppCompatActivity {

    Button backbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patologia_colangite_diagnosi);

        backbutton = findViewById(R.id.back_button_colangite_diagnosi);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatologiaColangiteDiagnosi.this, PatologiaColangite.class));
            }
        });
    }
}

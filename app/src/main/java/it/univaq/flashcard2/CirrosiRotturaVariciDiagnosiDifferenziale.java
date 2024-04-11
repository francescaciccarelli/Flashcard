package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CirrosiRotturaVariciDiagnosiDifferenziale extends AppCompatActivity {

    Button backbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cirrosi_rottura_varici_diagnosi_diff);

        backbutton = findViewById(R.id.back_button_rottura_varici_diagnosi_diff);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiRotturaVariciDiagnosiDifferenziale.this, CirrosiRotturaVarici.class));
            }
        });
    }
}

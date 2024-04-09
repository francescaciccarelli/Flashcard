package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SintomoStipsiDiagnosi extends AppCompatActivity {

    Button backbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sintomo_stipsi_diagnosi);

        backbutton = findViewById(R.id.back_button_stipsi_diagnosi);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoStipsiDiagnosi.this, SintomoStipsi.class));
            }
        });
    }
}

package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SintomoDoloreAddominaleDiagnosi extends AppCompatActivity {

    Button backbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sintomo_dolore_acuto_diagnosi);

        backbutton = findViewById(R.id.back_button_dolore_addominale_diagnosi);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoDoloreAddominaleDiagnosi.this, SintomoDoloreAddominale.class));
            }
        });
    }
}

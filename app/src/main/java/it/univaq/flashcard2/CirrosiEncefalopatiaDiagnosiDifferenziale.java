package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CirrosiEncefalopatiaDiagnosiDifferenziale extends AppCompatActivity {
    Button backbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cirrosi_encefalopatia_diagnosi_diff);

        backbutton = findViewById(R.id.back_button_encefalopatia_diagnosi_diff);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiEncefalopatiaDiagnosiDifferenziale.this, CirrosiEncefalopatia.class));
            }
        });
    }
}

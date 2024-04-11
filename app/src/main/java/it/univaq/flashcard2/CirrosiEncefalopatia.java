package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CirrosiEncefalopatia extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosi_diff;
    Button trattamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cirrosi_encefalopatia);

        backbutton = findViewById(R.id.back_button_encefalopatia);
        clinica = findViewById(R.id.clinica_encefalopatia);
        diagnosi = findViewById(R.id.diagnosi_encefalopatia);
        diagnosi_diff = findViewById(R.id.diagnosi_differenziale_encefalopatia);
        trattamento = findViewById(R.id.trattamento_encefalopatia);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiEncefalopatia.this, Cirrosi.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiEncefalopatia.this, CirrosiEncefalopatiaClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiEncefalopatia.this, CirrosiEncefalopatiaDiagnosi.class));
            }
        });

        diagnosi_diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiEncefalopatia.this, CirrosiEncefalopatiaDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CirrosiEncefalopatia.this, CirrosiEncefalopatiaTrattamento.class));
            }
        });
    }
}

package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SintomoDoloreAddominale extends AppCompatActivity {

    Button backbutton;
    Button clinica;
    Button diagnosi;
    Button diagnosiDiff;
    Button trattamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sintomo_dolore_acuto);

        backbutton = findViewById(R.id.back_button_dolore_addominale);
        clinica = findViewById(R.id.clinica_dolore_addominale);
        diagnosi = findViewById(R.id.diagnosi_dolore_addominale);
        diagnosiDiff = findViewById(R.id.diagnosi_differenziale_dolore_addominale);
        trattamento = findViewById(R.id.trattamento_dolore_addominale);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoDoloreAddominale.this, Sintomi.class));
            }
        });
        clinica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoDoloreAddominale.this, SintomoDoloreAddominaleClinica.class));
            }
        });

        diagnosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoDoloreAddominale.this, SintomoDoloreAddominaleDiagnosi.class));
            }
        });

        diagnosiDiff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoDoloreAddominale.this, SintomoDoloreAddominaleDiagnosiDifferenziale.class));
            }
        });

        trattamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoDoloreAddominale.this, SintomoDoloreAddominaleTrattamento.class));
            }
        });
    }
}

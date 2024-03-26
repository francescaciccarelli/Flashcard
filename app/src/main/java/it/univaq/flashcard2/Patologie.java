package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Patologie extends AppCompatActivity {
Button appendicite;
Button colangite;
Button colecistite;
Button colelitiasi;
Button diverticolite;
Button disturbi;
Button emorragie;
Button ernie;
Button ingestioneCaustici;
Button ingestioneCorpi;
Button insufficienzaEpatica;
Button ischemia;
Button occlusione;
Button pancreatite;
Button perforazione;
Button rmici;
Button rottura;
Button sindrome;
Button ulcera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patologie);

        appendicite = findViewById(R.id.appendicite_button);
        colangite = findViewById(R.id.colangite_button);
        colecistite = findViewById(R.id.colecistite_button);
        colelitiasi = findViewById(R.id.colelitiasi_button);
        diverticolite = findViewById(R.id.diverticolite_button);
        disturbi = findViewById(R.id.disturbi_anorettali_button);
        emorragie = findViewById(R.id.emorragie_button);
        ernie = findViewById(R.id.ernie_button);
        ingestioneCaustici = findViewById(R.id.ingestione_caustici_button);
        ingestioneCorpi = findViewById(R.id.ingestione_corpi_button);
        insufficienzaEpatica = findViewById(R.id.insufficienza_epatica_button);
        ischemia = findViewById(R.id.ischemia_button);
        occlusione = findViewById(R.id.occlusione_button);
        pancreatite = findViewById(R.id.pancreatite_button);
        perforazione = findViewById(R.id.perforazione_button);
        rmici = findViewById(R.id.rmici_button);
        rottura = findViewById(R.id.rottura_button);
        sindrome = findViewById(R.id.sindrome_button);
        ulcera = findViewById(R.id.ulcera_button);

        appendicite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Patologie.this, PatologiaAppendicite.class));
            }
        });

        colangite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Patologie.this, PatologiaColangite.class));
            }
        });

        colecistite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Patologie.this, PatologiaColecistite.class));
            }
        });

        diverticolite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Patologie.this, PatologiaDiverticolite.class));
            }
        });

        disturbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Patologie.this, PatologiaDisturbiAnorettali.class));
            }
        });

        emorragie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Patologie.this, PatologiaEmorragieDigestive.class));
            }
        });

        ernie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Patologie.this, PatologiaErnie.class));
            }
        });

        ingestioneCaustici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Patologie.this, PatologiaIngestioneCaustici.class));
            }
        });

        ingestioneCorpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Patologie.this, PatologiaIngestioneCorpi.class));
            }
        });

        insufficienzaEpatica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Patologie.this, PatologiaInsufficienzaEpatica.class));
            }
        });

        ischemia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Patologie.this, PatologiaIschemia.class));
            }
        });

        occlusione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Patologie.this, PatologiaOcclusione.class));
            }
        });

        pancreatite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Patologie.this, PatologiaPancreatite.class));
            }
        });

        perforazione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Patologie.this, PatologiaPerforazione.class));
            }
        });

        rmici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Patologie.this, PatologiaRMICI.class));
            }
        });

        rottura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Patologie.this, PatologiaRottura.class));
            }
        });

        sindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Patologie.this, PatologiaSindrome.class));
            }
        });

        ulcera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Patologie.this, PatologiaUlcera.class));
            }
        });

    }

}

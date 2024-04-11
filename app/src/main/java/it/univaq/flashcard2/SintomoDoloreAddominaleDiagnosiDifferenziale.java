package it.univaq.flashcard2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SintomoDoloreAddominaleDiagnosiDifferenziale extends AppCompatActivity {
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sintomo_dolore_acuto_diagnosi_diff);

        backButton = findViewById(R.id.back_button_dolore_addominale_diagnosi_diff);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SintomoDoloreAddominaleDiagnosiDifferenziale.this, SintomoDoloreAddominale.class));
            }
        });
    }
}


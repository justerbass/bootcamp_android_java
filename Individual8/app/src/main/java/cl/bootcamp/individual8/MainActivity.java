package cl.bootcamp.individual8;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button exit_btn;
    private Button go_to_2_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        exit_btn = findViewById(R.id.button2);
        go_to_2_btn = findViewById(R.id.button);

        exit_btn.setOnClickListener(v -> finish());

        go_to_2_btn.setOnClickListener(v -> {
            Intent intent = new Intent(this, pantalla2.class);
            startActivity(intent);
        });


    }
}
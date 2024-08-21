package cl.bootcamp.individual9;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ImagenCompleta extends AppCompatActivity {

    private Button back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_imagen_completa);

        back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        int imagen = getIntent().getIntExtra("imagen", -1);
        ImageView imageView = findViewById(R.id.full_image_view);
        imageView.setImageResource(imagen);


    }
}
package cl.bootcamp.individual8;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pantalla2 extends AppCompatActivity {

    private Button go_to_1;
    private Button  go_to_timber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pantalla2);

        go_to_1 = findViewById(R.id.button3);
        go_to_timber = findViewById(R.id.button4);

        go_to_1.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        go_to_timber.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                    "https://kotlindoc.blogspot.com/2019/10/android-log-con-timber.html"));
            startActivity(intent);
        });
    }


}
package cl.bootcamp.individual10;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton goWeb;
    private EditText url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        goWeb = findViewById(R.id.floatingActionButton);
        url = findViewById(R.id.textInputEditText);

        goWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uriUrl = Uri.parse(url.getText().toString());

                Intent intent = new Intent(view.getContext(), WebviewLayout.class);
                intent.putExtra("url", uriUrl.toString());


                view.getContext().startActivity(intent);
            }
        });

    }
}
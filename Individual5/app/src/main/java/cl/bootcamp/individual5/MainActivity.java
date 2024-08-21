package cl.bootcamp.individual5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView count_text;
    private Button btn_count;
    private Button btn_toast;
    private Button btn_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            count_text = (TextView) findViewById(R.id.text_count);
            btn_count = (Button) findViewById(R.id.btn_count);
            btn_reset = (Button) findViewById(R.id.btn_reset);
            btn_toast = (Button) findViewById(R.id.btn_toast);

            count_text.setText(String.valueOf(count));

            btn_count.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    count += 1;
                    count_text.setText(String.valueOf(count));
                }
            });

            btn_reset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    count = 0;
                    count_text.setText(String.valueOf(count));
                }
            });

            btn_toast.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CharSequence text = "Mensaje de alerta";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(getApplicationContext(), text, duration);
                    toast.show();

                }
            });

        };
    }

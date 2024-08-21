package cl.bootcamp.individual1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText input_user;
    private TextView show_user;
    private Button btn_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        input_user = (EditText) findViewById(R.id.input_name);
        show_user = (TextView) findViewById(R.id.show_name);
        btn_name = (Button) findViewById(R.id.btn_loggin);

            btn_name.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            show_user.setText("Bienvenido " + input_user.getText().toString() + " a HardcodeApp");
            }
        });

    }
}
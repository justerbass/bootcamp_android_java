package cl.bootcamp.individual6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText input_name;
    private EditText intput_lastname;
    private EditText input_email;
    private EditText input_password;
    private FloatingActionButton loggin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        input_name = (EditText) findViewById(R.id.input_name_text);
        intput_lastname = (EditText) findViewById(R.id.input_lastname_text);
        input_email = (EditText) findViewById(R.id.input_email_text);
        input_password = (EditText) findViewById(R.id.input_password_text);
        loggin = (FloatingActionButton) findViewById(R.id.btn_loggin);



        loggin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_name.getText().toString().isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.error_name), Toast.LENGTH_SHORT);
                    toast.show();
                } else if (intput_lastname.getText().toString().isEmpty()) {
                    Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.error_lastname), Toast.LENGTH_SHORT);
                    toast.show();
                } else if (input_email.getText().toString().isEmpty()) {
                    Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.error_email), Toast.LENGTH_SHORT);
                    toast.show();
                } else if (input_password.getText().toString().isEmpty()) {
                    Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.error_password), Toast.LENGTH_SHORT);
                    toast.show();
                }else {Toast toast = Toast.makeText(getApplicationContext(),
                        "Nombre: " + input_name.getText().toString()
                        + " Apellido: " + intput_lastname.getText().toString()
                        + " Email: " + input_email.getText().toString()
                        + " Contraseña: " + input_password.getText().toString(),
                        Toast.LENGTH_LONG);
                    toast.show();

                }
            }
        });








        };


    }

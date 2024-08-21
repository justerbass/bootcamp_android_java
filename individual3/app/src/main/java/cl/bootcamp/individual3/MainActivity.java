package cl.bootcamp.individual3;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText first_number;
    private double first_number_int;
    private EditText second_number;
    private double second_number_int;
    private EditText result;
    private double operation;
    private ImageButton plus;
    private ImageButton minus;
    private ImageButton multi;
    private ImageButton divide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            first_number = (EditText) findViewById(R.id.input_first_number);
            second_number = (EditText) findViewById(R.id.input_second_number);
            result = (EditText) findViewById(R.id.input_result);
            plus = (ImageButton) findViewById(R.id.button_plus);
            minus = (ImageButton) findViewById(R.id.button_minus);
            multi = (ImageButton) findViewById(R.id.button_multiply);
            divide = (ImageButton) findViewById(R.id.button_divide);


            plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    first_number_int = Double.parseDouble(first_number.getText().toString());
                    second_number_int = Double.parseDouble(second_number.getText().toString());
                    operation = first_number_int + second_number_int;
                    result.setText(String.valueOf(operation));
                }


            });

            minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    first_number_int = Double.parseDouble(first_number.getText().toString());
                    second_number_int = Double.parseDouble(second_number.getText().toString());
                    operation = first_number_int - second_number_int;
                    result.setText(String.valueOf(operation));
                }
            });

            multi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    first_number_int = Double.parseDouble(first_number.getText().toString());
                    second_number_int = Double.parseDouble(second_number.getText().toString());
                    operation = first_number_int * second_number_int;
                    result.setText(String.valueOf(operation));
                }
            });

            divide.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    first_number_int = Double.parseDouble(first_number.getText().toString());
                    second_number_int = Double.parseDouble(second_number.getText().toString());
                    operation = first_number_int / second_number_int;
                    result.setText(String.valueOf(operation));
                }
            });


    }
}

package cl.bootcamp.individual4;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

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
    private ImageButton exit;
    private TextView first_number_text;

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
        exit = (ImageButton) findViewById(R.id.button_exit);
        first_number_text = (TextView) findViewById(R.id.text_first_number);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (first_number.getText().toString().isEmpty()){
                    result.setText("falta " + first_number_text);
                } else if (second_number.getText().toString().isEmpty()) {
                    result.setText("falta segundo numero");
                }else {
                first_number_int = Double.parseDouble(first_number.getText().toString());
                second_number_int = Double.parseDouble(second_number.getText().toString());
                operation = first_number_int + second_number_int;
                result.setText(String.valueOf(operation));}
            }


        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (first_number.getText().toString().isEmpty()){
                    result.setText("falta " + first_number_text);
                } else if (second_number.getText().toString().isEmpty()) {
                    result.setText("falta segundo numero");
                }else {
                first_number_int = Double.parseDouble(first_number.getText().toString());
                second_number_int = Double.parseDouble(second_number.getText().toString());
                operation = first_number_int - second_number_int;
                result.setText(String.valueOf(operation));}
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (first_number.getText().toString().isEmpty()){
                    result.setText("falta " + first_number_text);
                } else if (second_number.getText().toString().isEmpty()) {
                    result.setText("falta segundo numero");
                }else {
                first_number_int = Double.parseDouble(first_number.getText().toString());
                second_number_int = Double.parseDouble(second_number.getText().toString());
                operation = first_number_int * second_number_int;
                result.setText(String.valueOf(operation));}
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (first_number.getText().toString().isEmpty()){
                    result.setText("falta " + first_number_text);
                } else if (second_number.getText().toString().isEmpty()) {
                    result.setText("falta segundo numero");
                }else {
                first_number_int = Double.parseDouble(first_number.getText().toString());
                second_number_int = Double.parseDouble(second_number.getText().toString());
                operation = first_number_int / second_number_int;
                result.setText(String.valueOf(operation));}
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
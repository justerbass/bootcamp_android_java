package cl.bootcamp.spintfinal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import cl.bootcamp.spintfinal.databinding.ActivityContatMeBinding;

public class ContatMe extends AppCompatActivity {

    ActivityContatMeBinding binding;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_contat_me);

        binding = ActivityContatMeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        golinkedin();

        gowhatsapp();

        goemail();

    }

    public void golinkedin(){
        binding.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uriUrl = Uri.parse(getString(R.string.linkedi));
                intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);
            }
        });

    }

    public void gowhatsapp(){
        binding.imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uriUrl = Uri.parse(getString(R.string.whatsapp));
                intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);
            }
        });

    }

    public void goemail(){
        binding.imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email_input = binding.textInputEditText.getText().toString();

                if (email_input.isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.email_empty), Toast.LENGTH_SHORT);
                    toast.show();
                }else if (!Patterns.EMAIL_ADDRESS.matcher(email_input).matches()){
                    Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.email_empty), Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    Intent email = new Intent(Intent.ACTION_SEND);

                    email.setType("plain/text");
                    email.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.subject));
                    email.putExtra(Intent.EXTRA_TEXT, binding.textInputEditText.getText());
                    email.putExtra(Intent.EXTRA_EMAIL, new String[]{getString(R.string.email_send)});
                    startActivity(email);
                };
            }
        });

    }
}
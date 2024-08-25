package cl.bootcamp.individual14;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.bootcamp.individual14.databinding.FragmentPreguntaBinding;


public class Pregunta extends Fragment {

    FragmentPreguntaBinding binding;


    public Pregunta() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentPreguntaBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() != null) {
            String name = getArguments().getString("name_player");
            String welcome = getString(R.string.hello_player) + " " + name;
            binding.welcomePlayer.setText(welcome);
        };

        binding.floatingActionButtonAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.opcion2.isChecked()){
                    Bundle bundle = new Bundle();
                    String name = getArguments().getString("name_player");
                    bundle.putString("name_player", name);
                    Navigation.findNavController(view).navigate(R.id.action_pregunta_to_respuestaPositiva, bundle);

                }else{
                    Bundle bundle = new Bundle();
                    String name = getArguments().getString("name_player");
                    bundle.putString("name_player", name);
                    Navigation.findNavController(view).navigate(R.id.action_pregunta_to_respuestaNegativa, bundle);
                }

            }
        });


    }
}
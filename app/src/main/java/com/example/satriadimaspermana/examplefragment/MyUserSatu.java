package com.example.satriadimaspermana.examplefragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Satria Dimas Permana on 7/13/2016.
 */
public class MyUserSatu extends Fragment {

    private String nulis;
    private EditText ambil;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.user_satu,container,false);

        ambil = (EditText) view.findViewById(R.id.masukNulis);

        Button kirim = (Button) view.findViewById(R.id.send);
        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,
                        MyUserDua.newIntance(ambil.getText().toString())).commit();
//                Bundle bundle = new Bundle();
//                bundle.putString("KEY", nulis);
//                MyUserSatu bebas = new MyUserSatu();
//                bebas.setArguments(bundle);
            }
        });
        return view;


    }


}

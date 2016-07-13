package com.example.satriadimaspermana.examplefragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Satria Dimas Permana on 7/13/2016.
 */
public class MyUserDua extends Fragment {

    private String a;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * validasi jika data yang dikirim kosong
         */
        if (!TextUtils.isEmpty(getArguments().getString("KEY"))) {
            a = getArguments().getString("KEY");
            ///Log.d("DATA", data);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.user_dua,container,false);
        TextView muncul = (TextView) view.findViewById(R.id.hasil);
        muncul.setText(a);

        return view;
    }

    public static MyUserDua newIntance(String s) {
        MyUserDua frag = new MyUserDua();
        Bundle b = new Bundle();
        b.putString("KEY", s);
        frag.setArguments(b);
        return frag;
    }

}

package com.rldevelopers.parqueos.parqueonline.Parqueo.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rldevelopers.parqueos.parqueonline.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegistrarIngresoFragment extends Fragment implements View.OnClickListener {




    public RegistrarIngresoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.parqueo_fragment_registraringreso, container, false);
      //  prefsLogin = getContext().getSharedPreferences("PrefsLogin", Context.MODE_PRIVATE);
        BindUi(view);
        return view;
    }

    public void BindUi(View view) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
           /* case R.id.imgCerrarSesion:

                break;*/
        }
    }

}

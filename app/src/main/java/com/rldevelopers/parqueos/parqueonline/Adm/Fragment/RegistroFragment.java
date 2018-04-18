package com.rldevelopers.parqueos.parqueonline.Adm.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.rldevelopers.parqueos.parqueonline.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegistroFragment extends Fragment implements View.OnClickListener {
   EditText et_Nombre;
   EditText et_cantidadT;
   Button   bt_registrar;

    public RegistroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.adm_fragment_registro, container, false);
        //  prefsLogin = getContext().getSharedPreferences("PrefsLogin", Context.MODE_PRIVATE);
        BindUi(view);
        return view;
    }

    public void BindUi(View view) {
        et_Nombre    = (EditText)view.findViewById(R.id.et_adm_registro_nombre);
        et_cantidadT = (EditText)view.findViewById(R.id.et_adm_registro_cantidadT);
        bt_registrar = (Button)view.findViewById(R.id.bt_adm_registro_registrar);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
           /* case R.id.imgCerrarSesion:

                break;*/
        }
    }

}

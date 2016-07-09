package com.example.maria.guiatecde.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.maria.guiatecde.MainActivity;
import com.example.maria.guiatecde.R;

/**
 * Created by Maria on 07/07/2016.
 */
public class EncuestaFrag extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Encuesta");
        View rootView = inflater.inflate(R.layout.fragment_encuesta, container, false);

        return rootView;
    }
}

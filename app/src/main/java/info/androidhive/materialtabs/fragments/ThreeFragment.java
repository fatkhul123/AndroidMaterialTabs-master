package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import info.androidhive.materialtabs.R;


public class ThreeFragment extends Fragment {
TextView kb, bl, pr , lm, bol ;
    public ThreeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);
        kb = view.findViewById(R.id.Kubus2);
        bl = view.findViewById(R.id.balok2);
        lm = view.findViewById(R.id.prisma);
        pr = view.findViewById(R.id.limas);
        bol = view.findViewById(R.id.bola2);

return view ;
    }

}


package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.bangunDatar.Persegi;
import info.androidhive.materialtabs.bangunDatar.jajar_genjang;
import info.androidhive.materialtabs.bangunDatar.lingkaran;
import info.androidhive.materialtabs.bangunDatar.persegi_panjang;
import info.androidhive.materialtabs.bangunDatar.segitiga;


public class TwoFragment extends Fragment{
   TextView ps,pp,st,jg,lk;

    public TwoFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View View = inflater.inflate(R.layout.fragment_two, container, false);
        ps =  View.findViewById(R.id.ps);
        pp =  View.findViewById(R.id.pp);
        st =  View.findViewById(R.id.st);
        jg =  View.findViewById(R.id.jg);
        lk =  View.findViewById(R.id.lk);

        ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent in= new Intent(getActivity(), Persegi.class) ;
                startActivity(in);
            }
        });
        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent in= new Intent(getActivity(), persegi_panjang.class) ;
                startActivity(in);
            }
        });
       st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent in= new Intent(getActivity(), segitiga.class) ;
                startActivity(in);
            }
        });
       jg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent in= new Intent(getActivity(), jajar_genjang.class) ;
                startActivity(in);
            }
        });
        lk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent in= new Intent(getActivity(), lingkaran.class) ;
                startActivity(in);
            }
        });
        return View;


    }

}

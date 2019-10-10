package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.activity.Adapter;

//
public class ThreeFragment extends Fragment  {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataList;
    private ArrayList<Integer> List;
    private String[] Judul = {"KUBUS", "BALOK","PRISMA","LIMAS","BOLA"};
    private int[] Gambar = {R.drawable.cube, R.drawable.box,R.drawable.prism,R.drawable.pyramid,R.drawable.oval};


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
        View View = inflater.inflate( R.layout.fragment_three, container, false );
        dataList = new ArrayList<>();
        List = new ArrayList<>();
        recyclerView = View.findViewById(R.id.recycler_view);
            DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter = new Adapter(getContext(),dataList, List);
        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);


        return View;
    }




    private void DaftarItem() {
        for (int w = 0; w < Judul.length; w++) {
            List.add( Gambar[w] );
            dataList.add( Judul[w] );
        }
    }

}


package info.androidhive.materialtabs.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.bangun.Balok;
import info.androidhive.materialtabs.bangun.Bola;
import info.androidhive.materialtabs.bangun.Kubus;
import info.androidhive.materialtabs.bangun.Limas;
import info.androidhive.materialtabs.bangun.Prisma;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>  {

    ArrayList<String> dataList;
    ArrayList<Integer> List;
    Context context;
    String [] dialog;


    public Adapter(Context context, ArrayList<String> datalist, ArrayList<Integer> list) {
        this.context = context;
        this.dataList = datalist;
        this.List = list;
        this.dialog = dialog;
    }




    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView Bangun;
        private ImageView imageView;
        private CardView cardView;
        private Context context;



        ViewHolder(View itemView) {
            super( itemView );
            context = itemView.getContext();
            Bangun = itemView.findViewById(R.id.bangun);
            imageView = itemView.findViewById(R.id.imageView);
            cardView = itemView.findViewById( R.id.cardview);
             cardView.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    switch (getAdapterPosition()){
                        case 0 :
                            intent = new Intent(context, Kubus.class);
                            break;
                        case 1 :
                            intent = new Intent(context, Balok.class);
                            break;
                        case 2 :
                            intent = new Intent(context, Prisma.class);
                            break;
                        case 3 :
                            intent = new Intent(context, Limas.class);
                            break;
                        case 4 :
                            intent = new Intent(context, Bola.class);
                            break;
                    }
                    context.startActivity(intent);
                }

            } );

        }



    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View V;
        V = LayoutInflater.from( parent.getContext() ).inflate( R.layout.list_item, parent, false );

         ViewHolder VH = new ViewHolder( V );
        return VH;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        //Memasukan Nilai/Value Pada View-View Yang Telah Dibuat

        final String datalist = dataList.get( position );//Mengambil data sesuai dengan posisi yang telah ditentukan
        holder.Bangun.setText( datalist );
        holder.imageView.setImageResource( List.get( position));

// Mengambil gambar sesuai posisi yang telah ditentukan
    }

    @Override
    public int getItemCount() {
        return dataList.size();

    }

    private class OnItemClickCallback {

    }




}

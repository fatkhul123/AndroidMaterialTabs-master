package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

import static android.content.Context.VIBRATOR_SERVICE;


public class OneFragment extends Fragment {
    EditText number1, number2;
    Button tambah, kurang, kali, bagi, clear;
    TextView hasil;
    private boolean lastNumeric;
    private boolean stateError;
    private boolean lastDot;


    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_one, container, false);


        number1 = (EditText) view.findViewById(R.id.number1);
        number2 = (EditText) view.findViewById(R.id.number2);
        tambah = view.findViewById(R.id.tambah);
        kurang = view.findViewById(R.id.kurang);
        kali = view.findViewById(R.id.kali);
        bagi = view.findViewById(R.id.bagi);
        hasil = (TextView) view.findViewById(R.id.hasil);
        clear = view.findViewById(R.id.Clear);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String angka1 = (number1.getText().toString().trim());
                String angka2 = (number2.getText().toString().trim());
                if (angka1.equalsIgnoreCase("")&& angka2.equalsIgnoreCase("")){
                    number1.setError("Mohon masukkan Angka");
                    number2.setError("Mohon masukkan Angka");
                }
                else if (angka1.equalsIgnoreCase("")){
                    number1.setError("Mohon masukkan Angka");
                }
                else if (angka2.equalsIgnoreCase("")){
                    number2.setError("Mohon masukkan Angka");
                } else {

                    double ang1 = Double.parseDouble(number1.getText().toString().trim());
                    double ang2 = Double.parseDouble(number2.getText().toString().trim());
                    double result = ang1 + ang2;
                    hasil.setText(Double.toString(result));
                    Toast toast = Toast.makeText(getContext(), "Tambah Ketemu", Toast.LENGTH_SHORT);
                    toast.show();


                }

            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = (number1.getText().toString().trim());
                String angka2 = (number2.getText().toString().trim());
                if (angka1.equalsIgnoreCase("")&& angka2.equalsIgnoreCase("")){
                    number1.setError("Mohon masukkan Angka");
                    number2.setError("Mohon masukkan Angka");
                }
                else if (angka1.equalsIgnoreCase("")){
                    number1.setError("Mohon masukkan Angka");
                }
                else if (angka2.equalsIgnoreCase("")){
                    number2.setError("Mohon masukkan Angka");
                } else {

                    double ang1 = Double.parseDouble(number1.getText().toString().trim());
                    double ang2 = Double.parseDouble(number2.getText().toString().trim());
                    double result = ang1 - ang2;
                    hasil.setText(Double.toString(result));
                    Toast toast = Toast.makeText(getContext(), "Kurang Ketemu", Toast.LENGTH_SHORT);
                    toast.show();

                }}
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = (number1.getText().toString().trim());
                String angka2 = (number2.getText().toString().trim());
                if (angka1.equalsIgnoreCase("")&& angka2.equalsIgnoreCase("")){
                    number1.setError("Mohon masukkan Angka");
                    number2.setError("Mohon masukkan Angka");
                }
                else if (angka1.equalsIgnoreCase("")){
                    number1.setError("Mohon masukkan Angka");
                }
                else if (angka2.equalsIgnoreCase("")){
                    number2.setError("Mohon masukkan Angka");
                } else {

                    double ang1 = Double.parseDouble(number1.getText().toString().trim());
                    double ang2 = Double.parseDouble(number2.getText().toString().trim());
                    double result = ang1 * ang2;
                    hasil.setText(Double.toString(result));
                    Toast toast = Toast.makeText(getContext(), "Kali Ketemu", Toast.LENGTH_SHORT);
                    toast.show();

                }
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String angka1 = (number1.getText().toString().trim());
                String angka2 = (number2.getText().toString().trim());
                if (angka1.equalsIgnoreCase("")&& angka2.equalsIgnoreCase("")){
                    number1.setError("Mohon masukkan Angka");
                    number2.setError("Mohon masukkan Angka");
                }
                else if (angka1.equalsIgnoreCase("")){
                    number1.setError("Mohon masukkan Angka");
                }
                else if (angka2.equalsIgnoreCase("")){
                   number2.setError("Mohon masukkan Angka");
                } else if (angka1.equalsIgnoreCase("0") && angka2.equalsIgnoreCase("0")) {
                    hasil.setText("Tidak boleh 0");
                }else if (angka1.equalsIgnoreCase("0") ) {
                    hasil.setText("Tidak boleh 0");
                }else if (angka2.equalsIgnoreCase("0") ) {
                    hasil.setText("Tidak boleh 0");
                }
                else {

                        double ang1 = Double.parseDouble(number1.getText().toString().trim());
                        double ang2 = Double.parseDouble(number2.getText().toString().trim());
                        double result = ang1 / ang2;
                        hasil.setText(Double.toString(result));
                    Toast toast = Toast.makeText(getContext(), "Bagi Ketemu", Toast.LENGTH_SHORT);
                    toast.show();

                }

            }

        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1.setText("");
                number2.setText("");
                hasil.setText("");
                lastNumeric = false;
                stateError = false;
                lastDot = false;
                Toast toast = Toast.makeText(getContext(), "CLEAR", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        return view;


    }


}

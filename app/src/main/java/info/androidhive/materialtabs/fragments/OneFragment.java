package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;


public class OneFragment extends Fragment{
    EditText number1, number2;
    Button tambah, kurang, kali, bagi;
    TextView hasil;
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
        final View view =inflater.inflate(R.layout.fragment_one, container, false);
        number1 = (EditText) view.findViewById(R.id.number1);
        number2 = (EditText) view.findViewById(R.id.number2);
        tambah = view.findViewById(R.id.tambah);
        kurang = view.findViewById(R.id.kurang);
        kali = view.findViewById(R.id.kali);
        bagi = view.findViewById(R.id.bagi);
        hasil = (TextView) view.findViewById(R.id.hasil);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((number1.getText().length() > 0) && (number2.getText().length() > 0)) {

                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    double result = num1 + num2;
                    hasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(view.getContext(), "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((number1.getText().length() > 0) && (number2.getText().length() > 0)) {

                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    double result = num1 - num2;
                    hasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(view.getContext(), "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((number1.getText().length() > 0) && (number2.getText().length() > 0)) {

                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    double result = num1 * num2;
                    hasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(view.getContext(), "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                if (num2 == 0  ) {

                    Toast.makeText(view.getContext(), "Ga boleh 0 bro", Toast.LENGTH_LONG).show();

                } else if ((number1.getText().length() > 0) && (number2.getText().length() > 0)) {


                    double result = num1 / num2;
                    hasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(view.getContext(), "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();;
                }
            }
        });
        return view;

    }


}

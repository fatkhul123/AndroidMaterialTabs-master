package info.androidhive.materialtabs.bangunDatar;

import android.annotation.SuppressLint;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class Persegi extends AppCompatActivity {
    TextView nilai;
    EditText num1;
    Button luas, kell;
    Toolbar toolbar2;


    public Persegi() {
        // Required empty public constructor
    }


    @SuppressLint("WrongViewCast")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apersegi);
        num1 = (EditText) findViewById(R.id.num1);
        nilai = (TextView) findViewById(R.id.nilai);
        luas = (Button) findViewById(R.id.luas);
        kell = (Button) findViewById(R.id.kell);
        toolbar2 = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        num1.addTextChangedListener(loginTextWatcher);
        final Vibrator get = (Vibrator) getSystemService(VIBRATOR_SERVICE);


        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String angka1 = (num1.getText().toString().trim());

                if (angka1.isEmpty()) {
                    num1.setError("Mohon masukkan Angka");

                    nilai.setText("");
                } else {
                    double sisi = Double.parseDouble(num1.getText().toString());
                    double result = sisi * sisi;
                    Integer ang1 = Integer.parseInt(angka1);
                    nilai.setText("Rumus luas = " + ang1 + " X " +  ang1 + " =  " + result);
                    get.vibrate(100);
                    Toast toast = Toast.makeText(getApplicationContext(), "Luas Ketemu ", Toast.LENGTH_SHORT);
                    toast.show();

                }

            }
        });

        kell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = (num1.getText().toString().trim());


                if (angka1.isEmpty()) {

                    num1.setError("Mohon masukkan Angka ");
                    nilai.setText("");
                } else {
                    double sisi = Double.parseDouble(num1.getText().toString());
                    double result = 4 * sisi;
                    Integer ang1 = Integer.parseInt(angka1);
                    nilai.setText("Rumus keliling = " + " 4 X " + ang1 + " = " + result);
                    get.vibrate(100);
                    Toast toast = Toast.makeText(getApplicationContext(), "Keliling Ketemu ", Toast.LENGTH_SHORT);
                    toast.show();

                }
            }
        });
    }

    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String NUM1 = num1.getText().toString().trim();


            if (!NUM1.isEmpty()) {
                luas.getBackground().setColorFilter(luas.getContext().getResources().getColor(R.color.red), PorterDuff.Mode.MULTIPLY);
                kell.getBackground().setColorFilter(kell.getContext().getResources().getColor(R.color.red), PorterDuff.Mode.MULTIPLY);
            } else {
                luas.getBackground().setColorFilter(luas.getContext().getResources().getColor(R.color.black_overlay), PorterDuff.Mode.MULTIPLY);
                kell.getBackground().setColorFilter(kell.getContext().getResources().getColor(R.color.black_overlay), PorterDuff.Mode.MULTIPLY);

            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

}




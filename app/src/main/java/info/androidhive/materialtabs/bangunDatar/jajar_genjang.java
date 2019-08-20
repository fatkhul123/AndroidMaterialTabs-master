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

public class jajar_genjang extends AppCompatActivity {
    TextView nilai;
    EditText num1, num2;
    Button luas, kell;
    Toolbar toolbar2;

    public jajar_genjang() {
        // Required empty public constructor
    }

    @SuppressLint("WrongViewCast")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajgenjang);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        nilai = (TextView) findViewById(R.id.nilai);
        luas = (Button) findViewById(R.id.luas);
        kell = (Button) findViewById(R.id.kell);
        toolbar2 = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        num1.addTextChangedListener(loginTextWatcher);
        num2.addTextChangedListener(loginTextWatcher);
        final Vibrator get = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String angka1 = (num1.getText().toString().trim());
                String angka2 = (num2.getText().toString().trim());

                if (angka1.isEmpty() && angka2.isEmpty()) {
                    num1.setError("Mohon masukkan Angka ");
                    num2.setError("Mohon masukkan Angka ");
                    nilai.setText("");

                } else if (angka1.isEmpty()) {
                    num1.setError("Mohon masukkan Angka ");
                    nilai.setText("");
                } else if (angka2.isEmpty()) {
                    num2.setError("Mohon masukkan Angka ");
                    nilai.setText("");
                } else {
                    double a = Double.parseDouble(num1.getText().toString());
                    double t = Double.parseDouble(num2.getText().toString());
                    double result = a * t;
                    Integer A = Integer.parseInt(angka1);
                    Integer T = Integer.parseInt(angka2);
                    nilai.setText("Rumus luas = " + A + " X " + T + " = " + result);

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
                String angka2 = (num2.getText().toString().trim());

                if (angka1.isEmpty() && angka2.isEmpty()) {
                    num1.setError("Mohon masukkan Angka ");
                    num2.setError("Mohon masukkan Angka ");
                    nilai.setText("");

                } else if (angka1.isEmpty()) {
                    num1.setError("Mohon masukkan Angka ");
                    nilai.setText("");
                } else if (angka2.isEmpty()) {
                    num2.setError("Mohon masukkan Angka ");
                    nilai.setText("");
                } else {
                    double a = Double.parseDouble(num1.getText().toString());
                    double b = Double.parseDouble(num2.getText().toString());
                    double result = 2 * (a + b);
                    Integer A = Integer.parseInt(angka1);
                    Integer B = Integer.parseInt(angka2);
                    nilai.setText("Rumus keliling = " + "2 X " + "( " + A + " + " + B+ " ) " + " = " + result);
                    get.vibrate(100);
                    Toast toast = Toast.makeText(getApplicationContext(), "Keliling Ketemu ", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        ;


    }

    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String NUM1 = num1.getText().toString().trim();
            String NUM2 = num2.getText().toString().trim();


            if (!NUM1.isEmpty() && !NUM2.isEmpty()) {
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

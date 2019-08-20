package info.androidhive.materialtabs.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private Button  log;
    private EditText email,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        log = (Button) findViewById(R.id.log);
        log.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.log:
                String username = email.getText().toString();
                String password = pass.getText().toString();
                if (username.equalsIgnoreCase("Fatkhul")
                        && password.equalsIgnoreCase("123")) {
                    Toast.makeText(getApplicationContext(), "sukses login", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, IconTextTabsActivity.class));
                    break;
                } else if (username.isEmpty() && password.isEmpty()){
                    Toast.makeText(getApplicationContext(), "isi dulu yang atas", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "hah gagal", Toast.LENGTH_SHORT).show();
                }
        }
    }
}

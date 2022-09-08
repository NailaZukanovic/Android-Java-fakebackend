package com.example.hci_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    DataHelper helper;
    EditText etIndex;
    EditText etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helper = new DataHelper();

        etIndex = findViewById(R.id.index);
        etPassword = findViewById(R.id.password);
        btnLogin = findViewById(R.id.login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String index = etIndex.getText().toString();
                String password = etPassword.getText().toString();

                // ukoliko je login uspesan prelazi se na dashboard
                if(helper.isValidStudent(index, password)){
                    Intent intent = new Intent(MainActivity.this, Dashboard.class);
                    Bundle bundle = new Bundle();

                    bundle.putString("index", index);
                    bundle.putString("password", password);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }

            }
        });

    }
}
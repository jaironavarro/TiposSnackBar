package com.example.tipossnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSnack1,btnSnack2,btnSnack3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSnack1 = findViewById(R.id.SnackBar1);
        btnSnack2 = findViewById(R.id.SnackBar2);
        btnSnack3 = findViewById(R.id.SnackBar3);

        btnSnack1.setOnClickListener(this);
        btnSnack2.setOnClickListener(this);
        btnSnack3.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.SnackBar1){
            Snackbar.make(v,"Mesaje tiempo corto", Snackbar.LENGTH_SHORT).show();
        }else{
            Snackbar.make(v, "Mostrando mensaje tiempo largo", Snackbar.LENGTH_LONG).show();
        }
    Snackbar.make(v,"Mesaje tiempo indefinido",Snackbar.LENGTH_INDEFINITE).show();
    }

}

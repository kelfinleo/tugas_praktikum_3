package com.example.tugas_praktikum_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void input(View view) {
            EditText inputNamaTimA = findViewById(R.id.tim_A);
            EditText inputNamaTimB = findViewById(R.id.tim_B);

            String namaTimA = inputNamaTimA.getText().toString();
            Log.d(TAG, namaTimA);

            String namaTimB = inputNamaTimB.getText().toString();
            Log.d(TAG, namaTimB);
            Intent intent = new Intent(this, tampilan_2.class);
            intent.putExtra("Tim A", namaTimA);
            intent.putExtra("Tim B", namaTimB);
            startActivity(intent);
        }
    }

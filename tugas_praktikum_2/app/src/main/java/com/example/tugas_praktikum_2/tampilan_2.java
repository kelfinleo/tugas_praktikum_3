package com.example.tugas_praktikum_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class tampilan_2 extends AppCompatActivity {
        int skorA = 0;
        int skorB = 0;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_tampilan_2);
            TextView namaTimA = findViewById(R.id.tv_tim_A);
            TextView namaTimB = findViewById(R.id.tv_tim_B);
            String namaA = getIntent().getStringExtra("Tim A");
            String namaB = getIntent().getStringExtra("Tim B");
            namaTimA.setText("Team" + " " + namaA);
            namaTimB.setText("Team" + " " + namaB);
        }
        public void Tambah(View view) {
            if (view.getId() == R.id.satu_point_A) {
                skorA = skorA + 1;
            } else if (view.getId() == R.id.dua_point_A) {
                skorA = skorA + 2;
            } else if (view.getId() == R.id.tiga_point_A) {
                skorA = skorA + 3;
            } else if (view.getId() == R.id.satu_point_B) {
                skorB = skorB + 1;
            } else if (view.getId() == R.id.dua_point_B) {
                skorB = skorB + 2;
            } else if (view.getId() == R.id.tiga_point_B) {
                skorB = skorB + 3;
            }
            TextView skorTimA = findViewById(R.id.skor_tim_A);
            TextView skorTimB = findViewById(R.id.skor_tim_B);
            skorTimA.setText(String.valueOf(skorA));
            skorTimB.setText(String.valueOf(skorB));
        }
    public void reset(View view){
        if(view.getId()==R.id.reset_A){
            skorA =0;
        }
        else if (view.getId()==R.id.reset_B){
            skorB =0;
        }
        TextView skorTimA = findViewById(R.id.skor_tim_A);
        TextView skorTimB = findViewById(R.id.skor_tim_B);
        skorTimA.setText(String.valueOf(skorA));
        skorTimB.setText(String.valueOf(skorB));
    }

}

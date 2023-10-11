package com.akbarrahmatm.a2112500851_aplikasigabungan_af;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScrollViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);

        Button btnLollipop = (Button) findViewById(R.id.btnLollipop);
        Button btnMarshmallow = (Button) findViewById(R.id.btnMarshmallow);
        Button btnNougat = (Button) findViewById(R.id.btnNougat);
        Button btnOreo = (Button) findViewById(R.id.btnOreo);
        Button btnPie = (Button) findViewById(R.id.btnPie);
        Button btnQ = (Button) findViewById(R.id.btnQ);
        Button btnRedVelvetCake = (Button) findViewById(R.id.btnRedVelvetCake);
        Button btnSnowcone = (Button) findViewById(R.id.btnSnowcone);
        Button btnTiramisu = (Button) findViewById(R.id.btnTiramisu);


        btnLollipop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this, LollipopActivity.class));
            }
        });

        btnMarshmallow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this, MarshmallowActivity.class));
            }
        });

        btnNougat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this, NougatActivity.class));
            }
        });

        btnOreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this, OreoActivity.class));
            }
        });

        btnPie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this, PieActivity.class));
            }
        });

        btnQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this, QActivity.class));
            }
        });

        btnRedVelvetCake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this, RedVelvetCakeActivity.class));
            }
        });

        btnSnowcone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this, SnowConeActivity.class));
            }
        });

        btnTiramisu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this, TiramisuActivity.class));
            }
        });
    }
}
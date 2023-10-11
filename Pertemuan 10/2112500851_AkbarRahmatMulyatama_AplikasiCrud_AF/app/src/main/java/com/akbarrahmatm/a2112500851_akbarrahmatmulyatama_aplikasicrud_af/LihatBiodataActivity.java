package com.akbarrahmatm.a2112500851_akbarrahmatmulyatama_aplikasicrud_af;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LihatBiodataActivity extends AppCompatActivity {

    protected Cursor cursor;
    DbConfig dbHelper;
    Button btn;
    TextView txt1,txt2,txt3,txt4,txt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_biodata);

        dbHelper = new DbConfig(this);
        txt1 = (TextView) findViewById(R.id.textView01);
        txt2 = (TextView) findViewById(R.id.textView02);
        txt3 = (TextView) findViewById(R.id.textView03);
        txt4 = (TextView) findViewById(R.id.textView04);
        txt5 = (TextView) findViewById(R.id.textView05);
        btn = (Button) findViewById(R.id.button);

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        cursor = db.rawQuery("SELECT * FROM biodata WHERE nama = '"+getIntent().getStringExtra("nama")+"'", null);
        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            cursor.moveToPosition(0);
            txt1.setText(cursor.getString(0).toString());
            txt2.setText(cursor.getString(1).toString());
            txt3.setText(cursor.getString(2).toString());
            txt4.setText(cursor.getString(3).toString());
            txt5.setText(cursor.getString(4).toString());

        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
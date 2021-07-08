package com.appspouch.edumed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);

        Button sbutton = (Button) findViewById(R.id.btn_search);
        Button mbutton = (Button) findViewById(R.id.btn_measure);
        {
            sbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent searchintent = new Intent(StartActivity.this, MainActivity.class);
                    startActivity(searchintent);
                }
            });

            mbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent measureintent = new Intent(StartActivity.this, MeasureActivity.class);
                    startActivity(measureintent);
                }
            });
        }
    }
}
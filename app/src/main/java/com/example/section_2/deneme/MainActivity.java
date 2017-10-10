package com.example.section_2.deneme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"System Ready on slm", Toast.LENGTH_SHORT).show();

    }




    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"System Ready on Pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"System Ready on Destroy", Toast.LENGTH_SHORT).show();
    }
}

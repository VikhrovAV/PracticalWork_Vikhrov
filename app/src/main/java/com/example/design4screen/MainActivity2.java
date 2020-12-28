package com.example.design4screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void openreg (View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void opencam (View view)
    {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void opengal (View view)
    {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

}
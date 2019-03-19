package com.example.probniprojekat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dugmeKlik(View dugme) {
        Button d = (Button) dugme;
        TextView l = (TextView) findViewById(R.id.labela);
        if (d.getText().equals(getString(R.string.dugme))) {
            d.setText(R.string.dugme2);
            l.setText(R.string.labela2);
        } else {
            d.setText(R.string.dugme);
            l.setText(R.string.labela);
        }
    }
}

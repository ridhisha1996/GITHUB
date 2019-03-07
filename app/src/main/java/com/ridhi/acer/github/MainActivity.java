package com.ridhi.acer.github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed = findViewById(R.id.edit);
    }

    public void click(View view) {
        String a = ed.getText().toString();
        Toast.makeText(this, a, Toast.LENGTH_SHORT).show();
    }
}

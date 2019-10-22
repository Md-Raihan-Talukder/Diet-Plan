package com.example.user.dietplan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowTips extends AppCompatActivity {

    TextView txt;
    String tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_tips);

        txt = (TextView)findViewById(R.id.txt);

        tv = getIntent().getStringExtra("value");
        txt.setText(tv);
    }
}

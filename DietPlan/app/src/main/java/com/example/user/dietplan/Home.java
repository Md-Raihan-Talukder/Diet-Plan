package com.example.user.dietplan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    EditText b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        b = (EditText)findViewById(R.id.bmi);

        TextView h = (TextView)findViewById(R.id.hel);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bmi = b.getText().toString();
                Intent intent = new Intent(Home.this,Htips.class);
                intent.putExtra("value",bmi);
                startActivity(intent);
            }
        });
    }
    public void onBMI(View V){
        EditText h = (EditText)findViewById(R.id.height);
        EditText w = (EditText)findViewById(R.id.weight);
        double h1 = Integer.parseInt(h.getText().toString());
        double w1 = Integer.parseInt(w.getText().toString());

        double h2 = (h1 / 100);
        double num = ((w1 / h2) / h2);
        b.setText(Double.toString(num));

    }
}



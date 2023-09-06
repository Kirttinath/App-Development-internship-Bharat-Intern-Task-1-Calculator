package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    TextView res;
    Button add, sub, mul, div,mod;
    TextClock tc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=findViewById(R.id.buttonadd);
        sub=findViewById(R.id.buttonsub);
        mul=findViewById(R.id.buttonmul);
        div=findViewById(R.id.buttondiv);
        mod=findViewById(R.id.buttonmod);
        e1=findViewById(R.id.editText1st);
        e2=findViewById(R.id.editText2nd);
        res=findViewById(R.id.editTextres);
        tc=findViewById(R.id.textClock);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 =Integer.parseInt(e2.getText().toString());
                int n3= n1+n2;
                res.setText("Sum Of 2 Numbers = "+n3);
                Toast.makeText(MainActivity.this, "Adding Inputs : ", Toast.LENGTH_SHORT).show();

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 =Integer.parseInt(e2.getText().toString());
                int n3= n1-n2;
                res.setText("Substraction Of 2 Numbers = "+n3);
                Toast.makeText(MainActivity.this, "Substracting Inputs : ", Toast.LENGTH_SHORT).show();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 =Integer.parseInt(e2.getText().toString());
                int n3= n1*n2;
                res.setText("Multiplication Of 2 Numbers = "+n3);
                Toast.makeText(MainActivity.this, "Multiplying Inputs : ", Toast.LENGTH_SHORT).show();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 =Integer.parseInt(e2.getText().toString());
                float n3= (float)n1/n2;
                res.setText("Division Of 2 Numbers = "+n3);
                Toast.makeText(MainActivity.this, "Dividing Inputs : ", Toast.LENGTH_SHORT).show();
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 =Integer.parseInt(e2.getText().toString());
                int n3= n1%n2;
                res.setText("Modulus Of 2 Numbers = "+n3);
                Toast.makeText(MainActivity.this, "Moduling Inputs : ", Toast.LENGTH_SHORT).show();
            }
        });
        tc.setFormat24Hour("hh:mm a");

    }
}

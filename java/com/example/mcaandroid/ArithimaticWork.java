package com.example.mcaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.Toast;

public class ArithimaticWork extends AppCompatActivity {
    EditText e1, e2, res;
    Button add, sub, mul, div,mod;
    TextClock tc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithimatic_work);
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
                Toast.makeText(ArithimaticWork.this, "Adding Inputs : ", Toast.LENGTH_SHORT).show();

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 =Integer.parseInt(e2.getText().toString());
                int n3= n1-n2;
                res.setText("Substaction Of 2 Numbers = "+n3);
                Toast.makeText(ArithimaticWork.this, "Substracting Inputs : ", Toast.LENGTH_SHORT).show();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 =Integer.parseInt(e2.getText().toString());
                int n3= n1*n2;
                res.setText("Multiplication Of 2 Numbers = "+n3);
                Toast.makeText(ArithimaticWork.this, "Multiplying Inputs : ", Toast.LENGTH_SHORT).show();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 =Integer.parseInt(e2.getText().toString());
                float n3= (float)n1/n2;
                res.setText("Division Of 2 Numbers = "+n3);
                Toast.makeText(ArithimaticWork.this, "Dividing Inputs : ", Toast.LENGTH_SHORT).show();
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(e1.getText().toString());
                int n2 =Integer.parseInt(e2.getText().toString());
                int n3= n1%n2;
                res.setText("Modulus Of 2 Numbers = "+n3);
                Toast.makeText(ArithimaticWork.this, "Moduling Inputs : ", Toast.LENGTH_SHORT).show();
            }
        });
        tc.setFormat24Hour("hh:mm a");

    }
}
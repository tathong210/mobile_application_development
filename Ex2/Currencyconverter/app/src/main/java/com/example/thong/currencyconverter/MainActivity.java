package com.example.thong.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    DecimalFormat usaDf = new DecimalFormat("###,###,###,###.##");
    private double usd2vnd=22735;
    private double eur2vnd=27890.01;
    private double usd2eur=0.80864;
    private double eur2usd=1.2367;
    private int choice;
    Button btnUSD2VND;
    Button btnEUR2VND;
    Button btnUSD2EUR;
    Button btnEUR2USD;
    Button btnClear;
    Button btnConvert;
    TextView textView1;
    TextView textView2;
    EditText txtInput;
    EditText txtOutput;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnUSD2VND =(Button) findViewById(R.id.btnusd_vnd);
        btnEUR2USD =(Button) findViewById(R.id.btneur_usd);
        btnUSD2EUR =(Button) findViewById(R.id.btnusd_eur);
        btnEUR2VND =(Button) findViewById(R.id.btneur_vnd);
        btnClear = (Button)findViewById(R.id.btnClear);
        btnConvert=(Button) findViewById(R.id.btnConvert);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        txtInput =(EditText) findViewById(R.id.txtInput);
        txtOutput =(EditText) findViewById(R.id.txtOutput);
        linearLayout=(LinearLayout) findViewById(R.id.linearlayout);
        btnClear.setOnClickListener(new View.OnClickListener() {
            // clear the text boxes
            @Override
            public void onClick(View v) {

                txtInput.setText("");
                txtOutput.setText("");
            }
        });
        btnUSD2VND.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice=1;
                txtInput.setText("");
                txtOutput.setText("");
                linearLayout.setVisibility(View.VISIBLE);
                textView1.setText("USD");
                textView2.setText("VND");
                txtInput.setHint("Enter US Dollars amount");
            }
        });
        btnUSD2EUR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice=3;
                txtInput.setText("");
                txtOutput.setText("");
                linearLayout.setVisibility(View.VISIBLE);
                textView1.setText("USD");
                textView2.setText("EUR");
                txtInput.setHint("Enter US Dollars amount");
            }
        });
        btnEUR2VND.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice=2;
                txtInput.setText("");
                txtOutput.setText("");
                linearLayout.setVisibility(View.VISIBLE);
                textView1.setText("EUR");
                textView2.setText("VND");
                txtInput.setHint("Enter EURO amount");
            }
        });
        btnEUR2USD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice=4;
                txtInput.setText("");
                txtOutput.setText("");
                linearLayout.setVisibility(View.VISIBLE);
                textView1.setText("EUR");
                textView2.setText("USD");
                txtInput.setHint("Enter EURO amount");
            }
        });

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                Double input = Double.parseDouble(txtInput.getText().toString());
                    switch (choice) {
                        //usd2vnd
                        case 1:
                            txtOutput.setText(String.valueOf(usaDf.format(input * usd2vnd)) );
                            break;
                        //eur2vnd
                        case 2:
                            txtOutput.setText(String.valueOf(usaDf.format(input * eur2vnd)));
                            break;
                        //usd2eur
                        case 3:
                            txtOutput.setText( String.valueOf(usaDf.format(input * usd2eur)));
                            break;
                        //eur2usd
                        case 4:
                            txtOutput.setText(String.valueOf(usaDf.format(input * eur2usd)));
                            break;
                    }

                }
                catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Nhập sai", Toast.LENGTH_LONG).show();
                }
            }

        });
    }
}

package com.intreve.fibonnaciques;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout;
    Button btnPrint;
    TextView tvFib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=findViewById(R.id.layout);
        btnPrint=findViewById(R.id.btnPrint);
        tvFib=findViewById(R.id.tvFib);


        btnPrint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder fib=new StringBuilder();
                int first=0;
                int second=1;
                for(int i=0; i<10 ; i++){
                    fib.append(first).append(" ");
                    int next=first+second;
                    first=second;
                    second=next;

                }

                String fibString= fib.toString();
                tvFib.setText(fibString);

                layout.setBackgroundColor(Color.GREEN);
            }
        });
    }
}
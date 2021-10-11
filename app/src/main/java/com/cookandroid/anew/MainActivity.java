package com.cookandroid.anew;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int c_btn3, c_btn4, c_btn5, c_btn11, c_btn12, c_btn13, c_btnw, c_btncw, c_btncreamw;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setTitle("WECLOME!");

        Button btn3, btn4, btn5, btn11, btn12, btn13, btnw, btncw, btncreamw, btnresult;
        TextView textResult = null;
        final Integer[] result = {0};
        setContentView(R.layout.activity_main);


        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn4);

        btn11 = (Button) findViewById(R.id.btn11);
        btn12 = (Button) findViewById(R.id.btn12);
        btn13 = (Button) findViewById(R.id.btn13);

        btnw = (Button) findViewById(R.id.btnw);
        btncw = (Button) findViewById(R.id.btncw);
        btncreamw = (Button) findViewById(R.id.btncreamw);

        btnresult = (Button) findViewById(R.id.btnresult);
        View.OnClickListener m_listener;

        m_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setText(String.valueOf(++c_btn3));
                btn4.setText(String.valueOf(++c_btn4));
                btn5.setText(String.valueOf(++c_btn5));

                btn11.setText(String.valueOf(++c_btn11));
                btn12.setText(String.valueOf(++c_btn12));
                btn13.setText(String.valueOf(++c_btn13));

                btnw.setText(String.valueOf(++c_btnw));
                btncw.setText(String.valueOf(++c_btncw));
                btncreamw.setText(String.valueOf(++c_btncreamw));

            }
        };


        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "아메리카노 1잔 : 3000원 ", Toast.LENGTH_SHORT).show();
            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "라떼 1잔 : 4000원 ", Toast.LENGTH_SHORT).show();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "모카 1잔 : 4500원 ", Toast.LENGTH_SHORT).show();
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "1샷 추가 : 500원 ", Toast.LENGTH_SHORT).show();
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "2샷 추가 : 1000원 ", Toast.LENGTH_SHORT).show();
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "3샷 추가 : 1500원 ", Toast.LENGTH_SHORT).show();
            }
        });
        btnw.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "와플 : 3000원 ", Toast.LENGTH_SHORT).show();
            }
        });
        btncw.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "초코와플 : 3500원 ", Toast.LENGTH_SHORT).show();
            }
        });
        btncreamw.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "생크림 와플 : 3500원 ", Toast.LENGTH_SHORT).show();
            }
        });

        btnresult.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                result[0] = 3000 * c_btn3 + 3500 * c_btn4 + 4000 * c_btn5
                        + 500 * c_btn11 + 1000 * c_btn12 + 1500 * c_btn13
                        + 3000 * c_btnw + 3500 * c_btncw + 3500 * c_btncreamw;
                textResult.setText("결제금액 :" + result[0].toString());
            }

        });


    }
}
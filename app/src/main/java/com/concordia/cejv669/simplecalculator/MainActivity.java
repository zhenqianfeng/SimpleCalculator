package com.concordia.cejv669.simplecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv = findViewById(R.id.tv_display);
        final String operator = "";

        Button b0 = findViewById(R.id.btn_0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if(str.length()>=11)
                    tv.setText(str);
                else
                    tv.setText(str+"0");
            }
        });

        Button b1 = findViewById(R.id.btn_1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (str.equals("0"))
                    tv.setText("1");
                else if(str.length()>=11)
                    tv.setText(str);
                else
                    tv.setText(str+"1");
            }
        });

        Button b2 = findViewById(R.id.btn_2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (str.equals("0"))
                    tv.setText("2");
                else if(str.length()>=11)
                    tv.setText(str);
                else
                    tv.setText(str+"2");
            }
        });

        Button b3 = findViewById(R.id.btn_3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (str.equals("0"))
                    tv.setText("3");
                else if(str.length()>=11)
                    tv.setText(str);
                else
                    tv.setText(str+"3");
            }
        });

        Button b4 = findViewById(R.id.btn_4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (str.equals("0"))
                    tv.setText("4");
                else if(str.length()>=11)
                    tv.setText(str);
                else
                    tv.setText(str+"4");
            }
        });

        Button b5 = findViewById(R.id.btn_5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (str.equals("0"))
                    tv.setText("5");
                else if(str.length()>=11)
                    tv.setText(str);
                else
                    tv.setText(str+"5");
            }
        });

        Button b6 = findViewById(R.id.btn_6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (str.equals("0"))
                    tv.setText("6");
                else if(str.length()>=11)
                    tv.setText(str);
                else
                    tv.setText(str+"6");
            }
        });

        Button b7 = findViewById(R.id.btn_7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (str.equals("0"))
                    tv.setText("7");
                else if(str.length()>=11)
                    tv.setText(str);
                else
                    tv.setText(str+"7");
            }
        });

        Button b8 = findViewById(R.id.btn_8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (str.equals("0"))
                    tv.setText("8");
                else if(str.length()>=11)
                    tv.setText(str);
                else
                    tv.setText(str+"8");
            }
        });

        Button b9 = findViewById(R.id.btn_9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (str.equals("0"))
                    tv.setText("9");
                else if(str.length()>=11)
                    tv.setText(str);
                else
                    tv.setText(str+"9");
            }
        });

        Button b_dot = findViewById(R.id.btn_dot);
        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (str.contains(".")||str.length()>=11)
                    tv.setText(str);
                else
                    tv.setText(str+".");
            }
        });

        Button b_sign = findViewById(R.id.btn_sign);
        b_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (str.contains("-"))
                    tv.setText(str.substring(1));
                else
                    tv.setText("-"+str);
            }
        });


        Button b_percent = findViewById(R.id.btn_percentage);
        b_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                String resultstr;
                if (str.contains("."))
                {
                    Double db = Double.parseDouble(str);
                    resultstr = db*100+"";
                } else
                {
                    Integer i = Integer.parseInt(str);
                    resultstr = i*100+"";
                }

                if (str.length()>11)
                {
                    if (str.contains("-"))
                        tv.setText( resultstr.substring(0,11));
                    else
                        tv.setText(resultstr.substring(0,10));
                } else
                    tv.setText(resultstr);
            }
        });


        Button b_plus = findViewById(R.id.btn_plus);
        b_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = tv.getText().toString();
                Double n1 = Double.parseDouble(str);
                String tmp_operator = "+";

            }
        });

        Button b_clear= findViewById(R.id.btn_clear);
        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("0");
            }
        });

        Button b_del = findViewById(R.id.btn_del);
        b_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (str.length() == 1 || (str.length()==2 && str.contains("-")))
                    tv.setText("0");
                else if (str.substring(str.length()-2).contains("."))
                    tv.setText(str.substring(0,str.length()-2));
                else
                    tv.setText(str.substring(0,str.length()-1));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.side_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int itemId=item.getItemId();

        if (itemId == R.id.history) {
//            Toast.makeText(getApplicationContext(), "You Clicked on History", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(), History.class);
            startActivity(i);
        }
        return true;
    }




}

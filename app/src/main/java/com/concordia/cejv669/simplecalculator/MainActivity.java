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
    private static final int STRING_LENGTH_MAX=14;
    final StringBuilder historylog= new StringBuilder();
    Double[] number = new Double[2];
    Integer[] i = new Integer[2];
    String[] op = {""};
    Boolean numinit = true;


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
                if (!numinit)
                {
                    if (str.length() >= STRING_LENGTH_MAX) {
                        tv.setText(str);
                        historylog.append(str);
                    } else if (!str.equals("0")) {
                        tv.setText(str + "0");
                        historylog.append(str + "0");
                    }
                }
            }
        });

        Button b1 = findViewById(R.id.btn_1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (numinit) {
                    tv.setText("1");
                    historylog.append("1");
                    numinit = false;
                }
                else if(str.length()>=STRING_LENGTH_MAX) {
                    tv.setText(str);
                }
                else {
                    tv.setText(str + "1");
                    historylog.append("1");
                }
            }
        });

        Button b2 = findViewById(R.id.btn_2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (numinit){
                    tv.setText("2");
                    historylog.append("2");
                    numinit = false;
                }
                else if(str.length()>=STRING_LENGTH_MAX)
                    tv.setText(str);
                else{
                    tv.setText(str + "2");
                    historylog.append("2");
                }
            }
        });

        Button b3 = findViewById(R.id.btn_3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (numinit) {
                    tv.setText("3");
                    historylog.append("3");
                    numinit = false;
                }
                else if(str.length()>=STRING_LENGTH_MAX)
                    tv.setText(str);
                else{
                    tv.setText(str + "3");
                    historylog.append("3");
                }
            }
        });

        Button b4 = findViewById(R.id.btn_4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (numinit) {
                    tv.setText("4");
                    historylog.append("4");
                    numinit = false;
                }
                else if(str.length()>=STRING_LENGTH_MAX)
                    tv.setText(str);
                else{
                    tv.setText(str + "4");
                    historylog.append("4");
                }
            }
        });

        Button b5 = findViewById(R.id.btn_5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (numinit) {
                    tv.setText("5");
                    historylog.append("5");
                    numinit = false;
                }
                else if(str.length()>=STRING_LENGTH_MAX)
                    tv.setText(str);
                else{
                    tv.setText(str + "5");
                    historylog.append("5");
                }
            }
        });

        Button b6 = findViewById(R.id.btn_6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (numinit) {
                    tv.setText("6");
                    historylog.append("6");
                    numinit = false;
                }
                else if(str.length()>=STRING_LENGTH_MAX)
                    tv.setText(str);
                else{
                    tv.setText(str + "6");
                    historylog.append("6");
                }
            }
        });

        Button b7 = findViewById(R.id.btn_7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (numinit) {
                    tv.setText("7");
                    historylog.append("7");
                    numinit = false;
                }
                else if(str.length()>=STRING_LENGTH_MAX)
                    tv.setText(str);
                else{
                    tv.setText(str + "7");
                    historylog.append("7");
                }
            }
        });

        Button b8 = findViewById(R.id.btn_8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (numinit) {
                    tv.setText("8");
                    historylog.append("8");
                    numinit = false;
                }
                else if(str.length()>=STRING_LENGTH_MAX)
                    tv.setText(str);
                else{
                    tv.setText(str + "8");
                    historylog.append("8");
                }
            }
        });

        Button b9 = findViewById(R.id.btn_9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (numinit) {
                    tv.setText("9");
                    historylog.append("9");
                    numinit = false;
                }
                else if(str.length()>=STRING_LENGTH_MAX)
                    tv.setText(str);
                else{
                    tv.setText(str + "9");
                    historylog.append("9");
                }
            }
        });

        Button b_dot = findViewById(R.id.btn_dot);
        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                if (str.contains(".")||str.length()>=STRING_LENGTH_MAX)
                    tv.setText(str);
                else{
                    tv.setText(str + ".");
                    historylog.append(".");
                }
            }
        });

        Button b_sign = findViewById(R.id.btn_sign);
        b_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=tv.getText().toString();
                boolean neg = str.contains("-");
                if (str.contains("-"))
                {
                    str = str.substring(1);
                    tv.setText(str);
                    historylog.append("\n" + str);
                }
                else {
                    tv.setText("-" + str);
                    historylog.append("\n-" + str);
                }
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
                    resultstr = db/100+"";
                } else
                {
                    Integer i = Integer.parseInt(str);
                    resultstr = i/100+"";
                }

                if (resultstr.length()>STRING_LENGTH_MAX)
                {
                    if (resultstr.contains("-"))
                        tv.setText( resultstr.substring(0,STRING_LENGTH_MAX));
                    else
                        tv.setText(resultstr.substring(0,STRING_LENGTH_MAX-1));
                } else
                    tv.setText(resultstr);
            }
        });


        Button b_clear= findViewById(R.id.btn_clear);
        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("0");
                numinit = true;
                historylog.append("\n(clear)\n");
                op[0] = "";
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


        Button b_plus = findViewById(R.id.btn_plus);
        b_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = tv.getText().toString();
                Double n1 = Double.parseDouble(str);
                if (!op[0].equals("+"))
                {
                    historylog.append("\n+\n");
                }
                number[0]=n1;
                op[0] = "+";
                numinit = true;
            }
        });

        Button b_minus = findViewById(R.id.btn_minus);
        b_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = tv.getText().toString();
                Double n1 = Double.parseDouble(str);
                if (!op[0].equals("-"))
                {
                    historylog.append("\n-\n");
                }
                number[0]=n1;
                op[0] = "-";
                numinit = true;
            }
        });

        Button b_multiply = findViewById(R.id.btn_multiply);
        b_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = tv.getText().toString();
                Double n1 = Double.parseDouble(str);
                if (!op[0].equals("*"))
                {
                    historylog.append("\n*\n");
                }
                number[0]=n1;
                op[0] = "*";
                numinit = true;
            }
        });

        Button b_divide = findViewById(R.id.btn_divide);
        b_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = tv.getText().toString();
                Double n1 = Double.parseDouble(str);
                if (!op[0].equals("/"))
                {
                    historylog.append("\n/\n");
                }
                number[0]=n1;
                op[0] = "/";
                numinit = true;
            }
        });



        Button b_equal = findViewById(R.id.btn_equal);
        b_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = tv.getText().toString();
                Double n1 = Double.parseDouble(str);
                Double result = Double.parseDouble(str);
                number[1] = n1;

                switch (op[0]) {
                    case "+": result = number[0] + number[1]; break;
                    case "-": result = number[0] - number[1]; break;
                    case "*": result = number[0] * number[1]; break;
                    case "/": result = number[0] / number[1]; break;
                }
                String fullStr=result.toString();
                int strLength=fullStr.length();
                String displayStr=fullStr;
                if (strLength>STRING_LENGTH_MAX) displayStr=fullStr.substring(0,STRING_LENGTH_MAX);
                tv.setText(displayStr);
                historylog.append("\n=" + displayStr);
                op[0]="";
                numinit = true;

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
    public boolean onPrepareOptionsMenu(Menu menu) {

        menu.findItem(R.id.about).setVisible(true);
        menu.findItem(R.id.history).setVisible(true);
        menu.findItem(R.id.back).setVisible(false);

        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int itemId=item.getItemId();

        if (itemId == R.id.history) {
//            Toast.makeText(getApplicationContext(), "You Clicked on History", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(), History.class);
            i.putExtra("HistoryLog",historylog.toString());
            String test = historylog.toString();
            startActivity(i);
        }

        if (itemId == R.id.about) {
//            Toast.makeText(getApplicationContext(), "You Clicked on History", Toast.LENGTH_SHORT).show();
            String aboutInfo = "sdfasfsafdsafdsafsadfdsafdsafsadf";
            Intent i = new Intent(getApplicationContext(), About.class);
            i.putExtra("AboutInfo",aboutInfo);
            startActivity(i);
        }



        return true;
    }

}

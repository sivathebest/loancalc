package com.loancalc.dtailcode.loancalc;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by sivarock on 8/1/2015.
 * @version 2.0
 */
public class Home extends AppCompatActivity {
    ImageView b;
    EditText amount ,interest,numberOfDues;
    TextView textView1,textView_interest_16, textView_interest_24, textView_interest_27;
    Button r1,r2,r3,due_6,due_10,due_12,due_18,due_24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        amount  = (EditText) findViewById(R.id.editText1);
        interest = (EditText) findViewById(R.id.editText2);
        numberOfDues = (EditText) findViewById(R.id.editText3);
        textView1 = (TextView) findViewById(R.id.textView4);
        textView_interest_16 = (TextView) findViewById(R.id.res_16);
        textView_interest_24 = (TextView) findViewById(R.id.res_24);
        textView_interest_27 = (TextView) findViewById(R.id.res_27);

        r1 = (Button) findViewById(R.id.resetbut1);
        r2 = (Button) findViewById(R.id.resetbut2);
        r3 = (Button) findViewById(R.id.resetbut3);
        r1.setVisibility(View.GONE);
        r2.setVisibility(View.GONE);
        r3.setVisibility(View.GONE);

        due_6 = (Button) findViewById(R.id.due_6);
        due_10 = (Button) findViewById(R.id.due_10);
        due_12 = (Button) findViewById(R.id.due_12);
        due_18 = (Button) findViewById(R.id.due_18);
        due_24 = (Button) findViewById(R.id.due_24);
        
        /**
         * Clear button on click listeners.
         */

        r1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                amount .setText("");
                cal();
            }

        });
        r2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                interest.setText("");
                cal();
            }

        });
        r3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numberOfDues.setText("");
                cal();
            }

        });
        due_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numberOfDues.setText("6");
                cal();
            }

        });

        due_10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numberOfDues.setText("10");
                cal();
            }

        });due_12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numberOfDues.setText("12");
                cal();
            }

        });due_18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numberOfDues.setText("18");
                cal();
            }

        });due_24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numberOfDues.setText("24");
                cal();
            }

        });


        /*
         * this is text watcher for Total Amount EditText
            */
        amount .addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(s.length() != 0){
                    r1.setVisibility(View.VISIBLE);
                }else{
                    r1.setVisibility(View.GONE);
                }
               cal();

            }
        });

        /*
         * this is text watcher for interest EditText
            */
        interest.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(s.length() != 0){
                    r2.setVisibility(View.VISIBLE);
                }else{
                    r2.setVisibility(View.GONE);
                }
                cal();

            }
        });

        /*
         * this is text watcher for numberOfDues EditText
            */

        numberOfDues.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(s.length() != 0){
                    r3.setVisibility(View.VISIBLE);
                }else{
                    r3.setVisibility(View.GONE);
                }
                cal();

            }
        });

        /*final Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String a="",i="",d="";
                a = amt.getText().toString();
                i = interest.getText().toString();
                d = dues.getText().toString();

                if((a == null) || (a.equals("")) || (a.equals("0")))
                {
                    amt.setError("Please enter valid amount");
                }else if((i == null) || (i.equals("")) || (i.equals("0")))
                {
                    interest.setError("Please enter valid interest");
                }else if((d == null) || (d.equals("")) || (d.equals("0")))
                {
                    dues.setError("Please enter valid dues");
                }else{
                    Double amt1 = Double.parseDouble(amt.getText().toString());
                    Double i1 = Double.parseDouble(interest.getText().toString());
                    Double d1 = Double.parseDouble(dues.getText().toString());

                    Double amt2 = amt1/d1;
                    Double i2 = i1/12;
                    Double tot = amt2 + ((amt1 * i2)/100);
                    String tot1 = String.format("%.2f", tot);
                    textView1.setText(""+tot1);

                }

            }

        });*/








//        AdView mAdView = (AdView) findViewById(R.id.adView);

        /*final TelephonyManager tm = (TelephonyManager)getBaseContext().getSystemService(Context.TELEPHONY_SERVICE);
        String deviceid = tm.getDeviceId();*/

      /*  AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);*/

    }
     /*
         * this is cal method, whenever textwatcher listen this will excute.
            */

    public void cal(){

        String a="",i="",d="";
        a = amount .getText().toString();
        i = interest.getText().toString();
        d = numberOfDues.getText().toString();

        if((a != null) && !(a.equals("")) && !(a.equals("0")))
        {
            if((d != null) && !(d.equals("")) && !(d.equals("0"))){
                Double amt1 = Double.parseDouble(amount .getText().toString());
                Double i3 = 24.0;
                Double i1 = 18.0;
                Double i5 = 27.0;

                Double d1 = Double.parseDouble(numberOfDues.getText().toString());

                Double amt2 = amt1/d1;
                Double i2 = i1/12;
                Double i4 = i3/12;
                Double i6 = i5/12;
                Double tot_16 = amt2 + ((amt1 * i2)/100);
                Double tot_24 = amt2 + ((amt1 * i4)/100);
                Double tot_27 = amt2 + ((amt1 * i6)/100);
                String tot1_16 = String.format("%.2f", tot_16);
                String tot1_24 = String.format("%.2f", tot_24);
                String tot1_27 = String.format("%.2f", tot_27);
                textView_interest_16.setText(""+tot1_16);
                textView_interest_24.setText(""+tot1_24);
                textView_interest_27.setText(""+tot1_27);

            }else {
                textView_interest_16.setText("0");
                textView_interest_24.setText("0");
                textView_interest_27.setText("0");

            }


        }else{
            textView_interest_16.setText("0");
            textView_interest_24.setText("0");
            textView_interest_27.setText("0");
        }

        if((a == null) || (a.equals("")) || (a.equals("0")))
        {
            textView1.setText("0");
        }else if((i == null) || (i.equals("")) || (i.equals("0")))
        {
            textView1.setText("0");
        }else if((d == null) || (d.equals("")) || (d.equals("0")))
        {
            textView1.setText("0");
        }else{
            Double amt1 = Double.parseDouble(amount .getText().toString());
            Double i1 = Double.parseDouble(interest.getText().toString());
            Double d1 = Double.parseDouble(numberOfDues.getText().toString());

            Double amt2 = amt1/d1;
            Double i2 = i1/12;
            Double tot = amt2 + ((amt1 * i2)/100);
            String tot1 = String.format("%.2f", tot);
            textView1.setText(""+tot1);

        }





    }




}



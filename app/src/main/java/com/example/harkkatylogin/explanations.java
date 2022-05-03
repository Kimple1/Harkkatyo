package com.example.harkkatylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class explanations extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explanations);
        TableLayout tbl = (TableLayout) findViewById(R.id.tableLayout);
        ScrollView scr = (ScrollView) findViewById(R.id.scrollView1);
        String str;
        String[] strArr;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(getAssets().open("explanations.txt")));
            while ((str = br.readLine()) != null) {
                strArr = str.split(";");
                TableRow row = new TableRow(this);
                TextView text = new TextView(this);
                row.setBackgroundColor(getColor(R.color.white));
                TableLayout.LayoutParams params = new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT);
                params.setMargins(0, 2, 0, 0);
                row.setLayoutParams(params);
                tbl.addView(row);
                text.setText(strArr[0]);
                text.setTextSize(20);
                text.setGravity(Gravity.TOP);
                text.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
                row.addView(text, 525, 300);
                TextView txxt = new TextView(this);
                if (strArr[1].contains("http:") || strArr[1].contains("@")) {
                    txxt.setTextIsSelectable(true);//makes the links copypasteable to web browser
                }
                txxt.setText(strArr[1]);
                txxt.setTextSize(20);
                txxt.setGravity(Gravity.TOP);
                txxt.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
                row.addView(txxt, 525, 70 * strArr[1].length() / 20 + 150);//dynamical adjustment of the row height depending on the text length
                strArr = null;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
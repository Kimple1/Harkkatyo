package com.example.harkkatylogin;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SkaterOtherView extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        readSkaterStats read = new readSkaterStats();
        setContentView(R.layout.activity_skater_other_view);
        HorizontalScrollView ScrollViewMainH = findViewById(R.id.ScrollViewMainHorizontal);
        ScrollView ScrollViewMainV = findViewById(R.id.ScrollViewMainVertical);
        TableLayout tableMain = (TableLayout) findViewById(R.id.tableMain);
        ScrollView ScrollViewLeft = findViewById(R.id.ScrollViewLeft);
        HorizontalScrollView ScrollViewTop = findViewById(R.id.ScrollViewTop);
        LinearLayout tableLeft = findViewById(R.id.LayoutLeft);
        LinearLayout tableTop = findViewById(R.id.LayoutTop);
        LinearLayout linMain = findViewById(R.id.LinLayoutMain);
        ArrayList<Skater> skaterList = read.CreateList(this);

        createStatView(SkaterOtherView.this, tableMain, tableLeft, tableTop, skaterList);
        ScrollViewMainH.setOnScrollChangeListener(new View.OnScrollChangeListener() {//these listeners sync the top, left side and main scrollViews to make the UI better
            @Override
            public void onScrollChange(View view, int i, int i1, int i2, int i3) {
                ScrollViewTop.scrollTo(ScrollViewMainH.getScrollX(),0);//when the main scrollview horizontal coordinate is changed, it also changes the coordinate of the top Scroll
            }
        });
        ScrollViewMainV.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View view, int i, int i1, int i2, int i3) {//The same for vertical direction of the main Scroll and the left scroll
                ScrollViewLeft.scrollTo(0,ScrollViewMainV.getScrollY());
            }
        });
        ScrollViewTop.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View view, int i, int i1, int i2, int i3) {//and vice versa with the horizontal scrolls
                ScrollViewMainH.scrollTo(ScrollViewTop.getScrollX(),ScrollViewMainV.getScrollY());
            }
        });
        ScrollViewLeft.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View view, int i, int i1, int i2, int i3) {
                ScrollViewMainV.scrollTo(ScrollViewMainH.getScrollX(),ScrollViewLeft.getScrollY());
            }
        });
        // got help on how to make scrollView scrollable diagonally from https://stackoverflow.com/questions/2044775/scrollview-vertical-and-horizontal-in-android
        ScrollViewMainH.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return false;
            }
        });
        ScrollViewMainV.setOnTouchListener(new View.OnTouchListener() {
            private float mx, my, curX, curY;
            private boolean started = false;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                curX = event.getX();
                curY = event.getY();
                int dx = (int) (mx - curX);
                int dy = (int) (my - curY);
                switch (event.getAction()) {
                    case MotionEvent.ACTION_MOVE:
                        if (started) {
                            ScrollViewMainV.scrollBy(0, dy);
                            ScrollViewMainH.scrollBy(dx, 0);
                        } else {
                            started = true;
                        }
                        mx = curX;
                        my = curY;
                        break;
                    case MotionEvent.ACTION_UP:
                        ScrollViewMainV.scrollBy(0, dy);
                        ScrollViewMainH.scrollBy(dx, 0);
                        started = false;
                        break;
                }
                return true;
            }
        });


    }

    public void createStatView(Activity activity, TableLayout tableMain, LinearLayout tableLeft, LinearLayout tableTop, ArrayList<Skater> skaterList) {
        try {

            String str;
            String[] dataArrSkater; // array for the names of the skater-data variables
            BufferedReader br = new BufferedReader(new InputStreamReader(getAssets().open("skaters.csv")));
            str = br.readLine();
            dataArrSkater = str.split(",");//read the names of each stat to reference to it in skater-object

            int i;
            int j;

            for (i = 0; i < dataArrSkater.length; i++) {
                String dataName = dataArrSkater[i];//Lets first make the top bar with stat explanations
                if(dataName.equals("name")){//name-stat goes to the sidebar

                }
                else {
                    dataName = dataName.replace("_", " ");//tidy up the interface
                    TableRow statRow = new TableRow(activity);
                    statRow.setBackgroundColor(getColor(R.color.white));
                    TableLayout.LayoutParams params = new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT);
                    params.setMargins(2, 0, 0, 2);//the layout background is black, and the row is white, with these margins we get beautiful gridlines
                    statRow.setLayoutParams(params);
                    tableTop.addView(statRow);
                    TextView statName = new TextView(activity);
                    statName.setTextSize(14);
                    statName.setText(dataName);
                    statName.setGravity(Gravity.CENTER);
                    statName.setTextColor(Color.BLACK);
                    statRow.addView(statName, 250, 250);
                }
            }
            i=0;
            for(Skater skater : skaterList) {
                if(skater.getOtherStats().getGames_played()>50) {
                    TableRow nameRow = new TableRow(activity);//First lets get the skater name in the left bar
                    TableLayout.LayoutParams params = new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT);
                    params.setMargins(0, 2, 2, 2);
                    nameRow.setBackgroundColor(getColor(R.color.white));
                    nameRow.setLayoutParams(params);
                    tableLeft.addView(nameRow);
                    TextView name = new TextView(this);
                    name.setText(skater.getFullName());
                    name.setGravity(Gravity.CENTER);
                    name.setTextColor(Color.BLACK);
                    nameRow.addView(name, 200, 140);
                    TableRow row = new TableRow(activity);
                    TableLayout.LayoutParams params1 = new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT);
                    params1.setMargins(0, 2, 2, 2);
                    row.setBackgroundColor(getColor(R.color.white));
                    row.setLayoutParams(params1);
                    TextView text1 = new TextView(activity);//few strings hard-coded into the layout first
                    text1.setText(Integer.toString(skater.getID()));
                    text1.setTextSize(16);
                    text1.setTextColor(Color.BLACK);
                    text1.setGravity(Gravity.CENTER);
                    text1.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                    row.addView(text1, 252, 140);
                    TextView text2 = new TextView(activity);
                    text2.setText("2021-2022");
                    text2.setTextSize(16);
                    text2.setTextColor(Color.BLACK);
                    text2.setGravity(Gravity.CENTER);
                    text2.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                    row.addView(text2, 252, 140);
                    TextView text3 = new TextView(activity);
                    text3.setText(skater.getTeam());
                    text3.setTextSize(16);
                    text3.setTextColor(Color.BLACK);
                    text3.setGravity(Gravity.CENTER);
                    text3.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                    row.addView(text3, 252, 140);
                    TextView text4 = new TextView(activity);
                    text4.setText(skater.getPosition());
                    text4.setTextSize(16);
                    text4.setTextColor(Color.BLACK);
                    text4.setGravity(Gravity.CENTER);
                    text4.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                    row.addView(text4, 252, 140);
                    TextView text5 = new TextView(activity);
                    text5.setText("Other");
                    text5.setTextSize(16);
                    text5.setTextColor(Color.BLACK);
                    text5.setGravity(Gravity.CENTER);
                    text5.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                    row.addView(text5, 252, 140);
                    TextView text6 = new TextView(activity);
                    text6.setText(Integer.toString(skater.getAllStats().getGames_played()));
                    text6.setTextSize(16);
                    text6.setTextColor(Color.BLACK);
                    text6.setGravity(Gravity.CENTER);
                    text6.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                    row.addView(text6, 252, 140);
                    SkaterOtherStats stats = skater.getOtherStats();

                    for (j = 7; j < dataArrSkater.length; j++) {
                        String varName = "get" + dataArrSkater[j];//Rest of the data follows consistant pattern, so we can just refer to each get-method by the stat name it gets
                        TextView text = new TextView(activity);
                        text.setId(i);
                        Method m = stats.getClass().getMethod(varName);
                        Float data = (Float) m.invoke(stats);

                        if (data == Math.round(data)) {
                            String textData = String.format("%d", Math.round(data));//Do some formatting, to remove excess decimal places
                            text.setText(textData);
                        } else {
                            String textData = String.format("%s", data);
                            text.setText(textData);
                        }
                        text.setTextSize(16);
                        text.setTextColor(Color.BLACK);
                        text.setGravity(Gravity.CENTER);
                        text.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                        row.addView(text, 252, 140);
                    }
                    tableMain.addView(row);
                }

            }

        } catch (IOException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


}

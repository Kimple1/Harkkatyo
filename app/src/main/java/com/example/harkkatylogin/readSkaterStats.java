package com.example.harkkatylogin;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class readSkaterStats extends AppCompatActivity {
    private String delimiter=",";
    private Context ContextInstance;

    public ArrayList<Skater> CreateList(Context c) {
        ArrayList<Skater> skaters = new ArrayList<Skater>();
        BufferedReader br=null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(c.getAssets().open("skaters.csv"))
            );
            String line = "";
            String [] OtherArr, AllArr, _5_on_5_Arr, _4_on_5_Arr, _5_on_4_Arr;
            String [] dataArrSkater; // array for the names of the skater-data variables
            line=br.readLine();
            //dataArrSkater=line.split(delimiter);


            while ((line = br.readLine()) != null) {
                //Every Skater has 5 lines of data (from different situations) in the file
                OtherArr = line.split(delimiter);
                line=br.readLine();
                AllArr=line.split(delimiter);
                line=br.readLine();
                _5_on_5_Arr=line.split(delimiter);
                line=br.readLine();
                _4_on_5_Arr=line.split(delimiter);
                line=br.readLine();
                _5_on_4_Arr=line.split(delimiter);
                //Skater objects
                //name,ID,team,position,otherStats,allStats,5on5Stats,4on5Stats,5on4,stats:
                skaters.add(new Skater(AllArr[2],Integer.parseInt(AllArr[0]),AllArr[3],AllArr[4],
                        OtherArr,AllArr,_5_on_5_Arr, _4_on_5_Arr, _5_on_4_Arr));
                OtherArr=null;
                AllArr=null;
                _4_on_5_Arr=null;
                _5_on_4_Arr=null;
                _5_on_5_Arr=null;


            }

            br.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        return skaters;
    }

}

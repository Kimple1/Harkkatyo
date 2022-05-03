package com.example.harkkatylogin;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class readGoalieStats extends AppCompatActivity {
    private String delimiter=",";
    private Context ContextInstance;

    public ArrayList<Goalie> CreateList(Context c) {
        ArrayList<Goalie> goalies = new ArrayList<Goalie>();
        BufferedReader br=null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(c.getAssets().open("goalie.csv"))
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
                goalies.add(new Goalie(AllArr[2],Integer.parseInt(AllArr[0]),AllArr[2],AllArr[3],
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
        return goalies;
    }

}

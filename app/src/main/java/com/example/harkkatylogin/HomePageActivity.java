package com.example.harkkatylogin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

public class HomePageActivity extends AppCompatActivity {

    // Activity handles the main app page, connecting different activities and loading necessary info from the internet
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;

    private TextView tvFavoritePlayer;
    private EditText eFavoriteplayer;
    private Button eMakeFavorite;

    public Favorites favorites;

    String sUser;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor sharedPreferencesEditor;

    //Arraylists for objects
    ArrayList<Skater> skaters = new ArrayList<Skater>();
    ArrayList<Goalie> goalies = new ArrayList<Goalie>();
    ArrayList<Team> teams = new ArrayList<Team>();

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        new MyTask().execute();

        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);

        AnimationDrawable animationDrawable = (AnimationDrawable) drawerLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();

        navigationView = findViewById(R.id.navigationView);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.menu_Open, R.string.menu_Close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        eFavoriteplayer = findViewById(R.id.etFavoritePlayer);
        eMakeFavorite = findViewById(R.id.btnAddFavorites);
        tvFavoritePlayer = findViewById(R.id.tvFavoritePlayer);
        favorites = new Favorites();
        sUser = MainActivity.getsUser();
        // File where users favorite player is saved
        sharedPreferences = getApplicationContext().getSharedPreferences("FavoritesDB", MODE_PRIVATE);
        sharedPreferencesEditor = sharedPreferences.edit();

        tvFavoritePlayer.setText("Loading...");



        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // Switching activities from the drawer
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        Log.i("MENU_DRAWER_TAG", "Home item is clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        startActivity(new Intent(getApplicationContext(), HomePageActivity.class));
                        break;

                    case R.id.nav_explanations:
                        Log.i("WebView", "WebView item is clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        startActivity(new Intent(getApplicationContext(), explanations.class));
                        break;

                    case R.id.nav_webView:
                        Log.i("WebView", "WebView item is clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        startActivity(new Intent(getApplicationContext(), Webview.class));
                        break;

                    case R.id.nav_5_on_5_stats:
                        Log.i("nav_5_on_5_stats", "nav_5_on_5_stats item is clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        startActivity(new Intent(getApplicationContext(), Skater5on5View.class));
                        break;
                    case R.id.nav_5_on_4_stats:
                        Log.i("nav_5_on_4_stats", "nav_5_on_4_stats item is clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        startActivity(new Intent(getApplicationContext(), Skater5on4View.class));
                        break;
                    case R.id.nav_All_stats:
                        Log.i("nav_All_stats", "nav_All_stats item is clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        startActivity(new Intent(getApplicationContext(), SkaterAllView.class));
                        break;
                    case R.id.nav_Other_stats:
                        Log.i("nav_Other_stats", "nav_Other_stats item is clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        startActivity(new Intent(getApplicationContext(), SkaterOtherView.class));
                        break;
                    case R.id.nav_Goalie_stats:
                        Log.i("nav_Goalie_stats", "nav_Goalie_stats item is clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        startActivity(new Intent(getApplicationContext(), GoalieAllView.class));
                        break;
                    case R.id.nav_Team_stats:
                        Log.i("nav_Team_stats", "nav_Team_stats item is clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        startActivity(new Intent(getApplicationContext(), TeamView.class));
                        break;

                }
                return true;
            }
        });

        eMakeFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean found = false;
                String favoritePlayer = eFavoriteplayer.getText().toString();
                favorites.addFavorites(sUser, favoritePlayer);
                tvFavoritePlayer.setText(favoritePlayer);
                sharedPreferencesEditor.putString(sUser, favoritePlayer);
                sharedPreferencesEditor.apply();

                for(int i=0; i<skaters.size();i++) {
                    if (skaters.get(i).getFullName().equals(favoritePlayer)) {
                        tvFavoritePlayer.setText(favoritePlayer+", "+skaters.get(i).getTeam()+"\n Points: "+ (int) skaters.get(i).getAllStats().getI_F_points()+
                                "\n Goals: "+ (int) skaters.get(i).getAllStats().getI_F_goals() + "\n Assists: "+ (int)(skaters.get(i).getAllStats().getI_F_primaryAssists()+skaters.get(i).getAllStats().getI_F_secondaryAssists()));
                        found = true;
                    }
                }

                if(!found){
                    tvFavoritePlayer.setText("");
                    Toast.makeText(getApplicationContext(), "No players by that name in the database!", Toast.LENGTH_SHORT).show();
                }
            }

        });


    }




    //URL:s to get data
    final String skaterdataurl = "https://moneypuck.com/moneypuck/playerData/seasonSummary/2021/regular/skaters.csv";
    final String goaliedataurl = "https://moneypuck.com/moneypuck/playerData/seasonSummary/2021/regular/goalies.csv";
    final String teamdataurl = "https://moneypuck.com/moneypuck/playerData/seasonSummary/2021/regular/teams.csv";



    //File reading things
    private final String delimiter = ",";
    Context context = null;
    //


    //Reading the datafiles from the internet and making the objects (in the backround)...
    private class MyTask extends AsyncTask<Void, Void, Void> {
        String result;

        @Override
        protected Void doInBackground(Void... voids) {
            URL url;

            try {

                //1. Skater data
                url = new URL(skaterdataurl);
                BufferedReader br1 = new BufferedReader(new InputStreamReader(url.openStream()));
                String line;
                String[] string;

                line = br1.readLine();
                //5 lines of data per player -> 5 different arrays
                String[] OtherArr, AllArr, _5_on_5_Arr, _4_on_5_Arr, _5_on_4_Arr;
                while ((line = br1.readLine()) != null) {

                    OtherArr = line.split(delimiter);
                    if (OtherArr[0].equals("playerID")) { /*If the first line is the "title" -line -> The next
                     line is the correct dataline (for the OtherArr). Sometimes the title-line is included in the file
                     but sometimes don't*/
                        OtherArr = br1.readLine().split(delimiter);
                    }
                    AllArr = br1.readLine().split(delimiter);
                    _5_on_5_Arr = br1.readLine().split(delimiter);
                    _4_on_5_Arr = br1.readLine().split(delimiter);
                    _5_on_4_Arr = br1.readLine().split(delimiter);
                    skaters.add(new Skater(AllArr[2], Integer.parseInt(AllArr[0]), AllArr[3], AllArr[4],
                            OtherArr, AllArr, _5_on_5_Arr, _4_on_5_Arr, _5_on_4_Arr));
                }
                br1.close();


                //2. Goalie data
                url = new URL(goaliedataurl);

                BufferedReader br2 = new BufferedReader(new InputStreamReader(url.openStream()));


                while ((line = br2.readLine()) != null) {
                    OtherArr = line.split(delimiter);
                    if (OtherArr[0].equals("playerId")) { /*If the first line is the "title" -line -> The next
                     line is the correct dataline (for the OtherArr). Sometimes the title-line is included in the file
                     but sometimes don't*/
                        OtherArr = br2.readLine().split(delimiter);
                    }
                    AllArr = br2.readLine().split(delimiter);
                    _5_on_5_Arr = br2.readLine().split(delimiter);
                    _4_on_5_Arr = br2.readLine().split(delimiter);
                    _5_on_4_Arr = br2.readLine().split(delimiter);
                    goalies.add(new Goalie(AllArr[2], Integer.parseInt(AllArr[0]), AllArr[2], AllArr[3],
                            OtherArr, AllArr, _5_on_5_Arr, _4_on_5_Arr, _5_on_4_Arr));
                }
                br2.close();

                //3. Team data
                url = new URL(teamdataurl);

                BufferedReader br3 = new BufferedReader(new InputStreamReader(url.openStream()));
                while ((line = br3.readLine()) != null) {
                    OtherArr = line.split(delimiter);
                    if (OtherArr[0].equals("team")) { /*If the first line is the "title" -line -> The next
                     line is the correct dataline (for the OtherArr). Sometimes the title-line is included in the file
                     but sometimes don't*/
                        OtherArr = br3.readLine().split(delimiter);
                    }
                    AllArr = br3.readLine().split(delimiter);
                    _5_on_5_Arr = br3.readLine().split(delimiter);
                    _4_on_5_Arr = br3.readLine().split(delimiter);
                    _5_on_4_Arr = br3.readLine().split(delimiter);
                    teams.add(new Team(AllArr[0], AllArr[3],
                            OtherArr, AllArr, _5_on_5_Arr, _4_on_5_Arr, _5_on_4_Arr));
                }
                br3.close();
                // Loading favorites if the file is not empty
                if (sharedPreferences != null) {
                    Map<String, ?> preferencesMap = sharedPreferences.getAll();
                    if (preferencesMap != null) {
                        favorites.loadFavorites(preferencesMap);
                        if (preferencesMap.containsKey(sUser)) {
                            tvFavoritePlayer.setText(preferencesMap.get(sUser).toString());

                            String favoritePlayer = preferencesMap.get(sUser).toString();
                            for(int i=0; i<skaters.size();i++) {

                                if (skaters.get(i).getFullName().equals(favoritePlayer)) {
                                    tvFavoritePlayer.setText(favoritePlayer+", "+skaters.get(i).getTeam()+"\n Points: "+ (int) skaters.get(i).getAllStats().getI_F_points()+
                                            "\n Goals: "+ (int) skaters.get(i).getAllStats().getI_F_goals() + "\n Assists: "+ (int)(skaters.get(i).getAllStats().getI_F_primaryAssists()+skaters.get(i).getAllStats().getI_F_secondaryAssists()));
                                }
                            }

                        }

                    }
                }


            } catch (IOException e) {
                e.printStackTrace();
                result = e.toString();
            }
            return null;
        }


    }

}


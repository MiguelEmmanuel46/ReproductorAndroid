package com.sombra.sombra.sombrassplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ListView listView ;
        final Button btn = (Button) findViewById(R.id.buttonv);
        final Intent uno = new Intent(getApplicationContext(),Reproductor.class);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                startActivity(uno);
            }


        });


/*************************************************************************************************************************/

        listView = (ListView) findViewById(R.id.list);

        // Defined Array values to show in ListView
        String[] values = new String[12];

        values[0] = "aboutagirl";
        values[1] = "heartshapedbox";
        values[2] = "lithium";
        values[3] = "backinblack";
        values[4] = "highwaytohell";
        values[5] = "thunderstruck";
        values[6] = "breakonthrough";
        values[7] = "lightmyfire";
        values[8] = "roadhouseblues";
        values[9] = "dustinthewind";
        values[10] = "rhythmoflove";
        values[11] = "windofchange";

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                  // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "  Seleccion : " +itemValue , Toast.LENGTH_LONG)
                        .show();


                 Intent  toes = new Intent (MainActivity.this, Reproductor.class);
                toes.putExtra("songs", itemValue+"");

                startActivity(toes);

            }

        });

/**************************************+*********************************************************************************/


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}

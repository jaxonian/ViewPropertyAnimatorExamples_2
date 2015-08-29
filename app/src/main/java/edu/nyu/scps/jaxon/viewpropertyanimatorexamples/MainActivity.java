package edu.nyu.scps.jaxon.viewpropertyanimatorexamples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn1);
        final TextView txt1 = (TextView) findViewById(R.id.txt1);
        final TextView animatingButton = (TextView) findViewById(R.id.animatingButton);

        //-----------------------------------------------------







        btn1.setOnClickListener(new View.OnClickListener() {
        int toggle=0;

            DisplayMetrics metrics = getApplicationContext().getResources().getDisplayMetrics();
            int width = metrics.widthPixels;
            int height = metrics.heightPixels;


            @Override
            public void onClick(View v) {
               if (toggle==0) {

                    // txt1.animate().alpha(0);
                   txt1.animate().scaleY(10f);
                    toggle=1;

                }else{
                    //txt1.animate().alpha(1);

                   txt1.animate().scaleY(height);
                    toggle=0;

                }  // END IF ELSE



                animatingButton.animate().rotationYBy(720);

            } // END ONCLICK
        }); // END BTN1 ON CLICK LISTENER
        
    } // END ON CREATE



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
}  // END MAIN CLASS

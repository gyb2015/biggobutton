package edu.washington.gyb2015.biggobutton;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {
    private int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        num = 0;
        Button MyButton = (Button)findViewById(R.id.MyButton);

        MyButton.setTextSize(40);

        MyButton.setOnClickListener(
                new View.OnClickListener(){

                @Override
                public void onClick(View v){
                    num++;
                    System.out.print(num);
                    Button innerButton = (Button) findViewById(R.id.MyButton);
                    String numString = String.valueOf(num);
                    innerButton.setText("You have pushed me " + numString + " times");

                    }
                }
        );

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

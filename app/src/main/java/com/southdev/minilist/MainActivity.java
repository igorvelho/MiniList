package com.southdev.minilist;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.tooleap.sdk.Tooleap;
import com.tooleap.sdk.TooleapPopOutMiniApp;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, FloatMainActivity.class);

        TooleapPopOutMiniApp miniApp = new TooleapPopOutMiniApp(this, intent);
        miniApp.contentTitle = "Lista de compras";
        miniApp.notificationText = "Oi, eu sou a bolha da sua lista de compras, clique aqui!";

        Tooleap tooleap = Tooleap.getInstance(this);
        tooleap.addMiniApp(miniApp);

        finish();
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

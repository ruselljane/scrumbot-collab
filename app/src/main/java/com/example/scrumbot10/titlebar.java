package com.example.scrumbot10;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class titlebar extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titlebar);

        mDrawerLayout=(DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close );
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Declaring of btns and ...
        ImageButton menu = (ImageButton)findViewById(R.id.menubtn);
        ImageButton search = (ImageButton)findViewById(R.id.searchbtn);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(titlebar.this, Splash.class));
            }
        });

//        @Override
//                public boolean onOptionsItemSelected(MenuItem item){
//            if (mToggle.onOptionsItemSelected(item)){
//                return true;
//            }
//            return super.onOptionsItemSelected(item);
//        }
    }
}

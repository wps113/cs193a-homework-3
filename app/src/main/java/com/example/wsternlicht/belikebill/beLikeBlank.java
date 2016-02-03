package com.example.wsternlicht.belikebill;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class beLikeBlank extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_like_blank);
        Intent nameIntent = getIntent();
        String name = nameIntent.getStringExtra("name");

        //update 'bill' names

        TextView nameTop = (TextView) findViewById(R.id.nameTop);
        TextView nameBottom = (TextView) findViewById(R.id.nameBottom);

        nameTop.setText(name);
        nameBottom.setText(name);

    }



    public void returnHome(View view) {
        //Return home
        Intent goHomeIntent = new Intent(this, MainActivity.class);
        startActivity(goHomeIntent);
    }

}

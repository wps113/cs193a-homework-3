package com.example.wsternlicht.belikebill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





    public void goToResult(View view) {


        //get entered text:
        EditText nameEditText = (EditText) findViewById(R.id.nameEntry);
        String nameStr = nameEditText.getText().toString();
        if (nameStr.matches("Name")) {
            Toast.makeText(this, "Please Enter Your Name!", Toast.LENGTH_SHORT).show();
            return;
        }

        //Go to Be like blank screen
        Intent goToIntent = new Intent(this, beLikeBlank.class);
        goToIntent.putExtra("name", nameStr);
        startActivity(goToIntent);
    }

}

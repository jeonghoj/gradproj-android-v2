package com.example.pc.android_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserPage extends AppCompatActivity {

    Button word, script;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_page);

        word = (Button)findViewById(R.id.word);
        script = (Button)findViewById(R.id.script);




    }

    public void word(View view) {
        Intent intent = new Intent(this, Review_word.class);
        startActivity(intent);


    }

    public void script(View view) {
        Intent intent = new Intent(this, Review_script.class);
        startActivity(intent);

    }


}
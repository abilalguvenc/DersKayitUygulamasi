package com.example.a16011069_bilgikayituygulamasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText etId, etPw;
    String id = "admin", pw = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etId = findViewById(R.id.etUsername);
        etPw = findViewById(R.id.etPassword);


        Intent intent = new Intent(this, FormActivity.class);
        startActivity(intent);
    }

    public void signin (View view)
    {
        // get inputs and check
        if ( etId.getText().toString().equals(id) && etPw.getText().toString().equals(pw) )
        {
            // if id and pw matches proceed to the next activity
            Intent intent = new Intent(this, FormActivity.class);
            startActivity(intent);
        }
        else
        {
            Toast toast = Toast.makeText(getApplicationContext(), " Wrong username or password! ", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}

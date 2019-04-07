package com.example.a16011069_bilgikayituygulamasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class FormActivity extends AppCompatActivity
{
    EditText eName, eSurname, eId, eMail, eTel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        eName = findViewById(R.id.etName);
        eSurname = findViewById(R.id.etSurname);
        eId = findViewById(R.id.etId);
        eMail = findViewById(R.id.etMail);
        eTel = findViewById(R.id.etTel);
    }

    public void clearAll (View view)
    {
        eName.setText("");
        eSurname.setText("");
        eId.setText("");
        eMail.setText("");
        eTel.setText("");
    }

    public void save (View v)
    {
        String name, surname, id, mail, tel;

        name = eName.getText().toString();
        surname = eSurname.getText().toString();
        id = eId.getText().toString();
        mail = eMail.getText().toString();
        tel = eTel.getText().toString();


        Intent intent = new Intent(this, ListActivity.class);

        intent.putExtra ("name", name);
        intent.putExtra ("surname", surname);
        intent.putExtra ("id", id);
        intent.putExtra ("mail", mail);
        intent.putExtra ("tel", tel);

        startActivity(intent);
    }
}

package com.example.a16011069_bilgikayituygulamasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity
{
    TextView eName, eSurname, eId, eMail, eTel;
    String name, surname, id, mail, tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        init();
    }

    void init ()
    {
        Intent i = getIntent ();

        name = (String) i.getSerializableExtra ("name");
        surname = (String) i.getSerializableExtra ("surname");
        id = (String) i.getSerializableExtra ("id");
        mail = (String) i.getSerializableExtra ("mail");
        tel = (String) i.getSerializableExtra ("tel");

        eName = findViewById (R.id.tvName);
        eSurname = findViewById (R.id.tvSurname);
        eId = findViewById (R.id.tvId);
        eMail = findViewById (R.id.tvMail);
        eTel = findViewById (R.id.tvPhone);

        eName.setText(name);
        eSurname.setText(surname);
        eId.setText(id);
        eMail.setText(mail);
        eTel.setText(tel);
    }
}

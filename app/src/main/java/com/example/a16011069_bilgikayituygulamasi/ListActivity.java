package com.example.a16011069_bilgikayituygulamasi;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity
{
    TextView eName, eSurname, eId, eMail, eTel;
    ImageView eImage;
    String name, surname, id, mail, tel;
    Uri image;

    RecyclerView recyclerView;

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
        image = (Uri) i.getSerializableExtra ("img");

        eName = findViewById (R.id.tvName);
        eSurname = findViewById (R.id.tvSurname);
        eId = findViewById (R.id.tvId);
        eMail = findViewById (R.id.tvMail);
        eTel = findViewById (R.id.tvPhone);
        eImage = findViewById (R.id.imageView);

        eName.setText(name);
        eSurname.setText(surname);
        eId.setText(id);
        eMail.setText(mail);
        eTel.setText(tel);
        eImage.setImageURI(image);

        recyclerView = findViewById(R.id.recyclerView);

        CourseAdapter courseAdapter = new CourseAdapter(this, Course.getData());
        recyclerView.setAdapter(courseAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    public void call (View view)
    {
        String uri = "tel:" + tel.trim();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(uri));
        startActivity(intent);
    }

    public void mail (View view)
    {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL  , mail);
        i.putExtra(Intent.EXTRA_SUBJECT, "Mail Test");
        i.putExtra(Intent.EXTRA_TEXT   , "My app is sending this mail.");
        try {
            startActivity(Intent.createChooser(i, "Send this with..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }
}

package com.example.a16011069_bilgikayituygulamasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity
{
    TextView eName, eSurname, eId, eMail, eTel;
    String name, surname, id, mail, tel;
    ArrayList<Course> course;

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



        course.add (new Course("Introduction to Mobile Programming", "54", "79", "95"));
        course.add (new Course("Introduction to Game Development", "50", "90", "97"));
        course.add (new Course("Artificial Intelligence", "45", "72", "58"));
        course.add (new Course("Network Technologies", "145", "32", "42"));
        course.add (new Course("Software Engineering", "60", "67", "77"));
        course.add (new Course("Numerical Analysis", "86", "72", "56"));
        course.add (new Course("Behaviour Sciences", "73", "42", "21"));

        recyclerView = findViewById(R.id.recyclerView);

        CourseAdapter courseAdapter = new CourseAdapter(this, Course.getData());
        recyclerView.setAdapter(courseAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}

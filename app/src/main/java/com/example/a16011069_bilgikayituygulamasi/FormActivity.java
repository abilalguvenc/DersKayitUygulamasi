package com.example.a16011069_bilgikayituygulamasi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class FormActivity extends AppCompatActivity
{
    EditText eName, eSurname, eId, eMail, eTel;
    Uri image;

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
        intent.putExtra ("img", image);

        startActivity(intent);
    }

    public void addPhoto (View view)
    {
        //Create an Intent with action as ACTION_PICK
        Intent intent=new Intent(Intent.ACTION_PICK);
        // Sets the type as image/*. This ensures only components of type image are selected
        intent.setType("image/*");
        //We pass an extra array with the accepted mime types. This will ensure only components with these MIME types as targeted.
        String[] mimeTypes = {"image/jpeg", "image/png"};
        intent.putExtra(Intent.EXTRA_MIME_TYPES,mimeTypes);
        // Launching the Intent
        startActivityForResult(intent,GALLERY_REQUEST_CODE);
    }

    @Override
    public void onActivityResult(int requestCode,int resultCode,Intent data){
        // Result code is RESULT_OK only if the user selects an Image
        if (resultCode == Activity.RESULT_OK)
            switch (requestCode){
                case GALLERY_REQUEST_CODE:
                    //data.getData returns the content URI for the selected Image
                    Uri image = data.getData();
                    break;
            }
    }
}

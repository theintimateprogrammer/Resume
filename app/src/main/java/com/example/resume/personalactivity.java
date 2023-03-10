package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class personalactivity extends AppCompatActivity {
    EditText Name,Address,Email,contactnumber;
    String edtname,edtaddress,edtemail,edtcontactnumber;
    Button Reset,Next;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalactivity);


        Name = findViewById(R.id.name);
        Address = findViewById(R.id.address);
        Email = findViewById(R.id.email);
        contactnumber = findViewById(R.id.contact);
        Reset= findViewById(R.id.btnreset);
        Next= findViewById(R.id.btnnext);

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Name.setText("");
                Email.setText("");
                Address.setText("");
                contactnumber.setText("");
                Name.setText("");

            }
        });

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                edtname = Name.getText().toString();
                edtemail= Email.getText().toString();
                edtaddress =Address .getText().toString();
                edtcontactnumber = contactnumber.getText().toString();


                Intent intent = new Intent(personalactivity.this,.class);
                startActivity(intent);
            }
        });





    }
}
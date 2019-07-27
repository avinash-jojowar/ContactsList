package com.example.contactslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ContactDetailActivity extends AppCompatActivity {

    private TextView contact_name;
    private TextView contact_phone_no;
    private TextView contact_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_detail);

        contact_name = (TextView) findViewById(R.id.contact_name);
        contact_phone_no = (TextView) findViewById(R.id.contact_phone_no);
        contact_email = (TextView) findViewById(R.id.contact_email);

        if(getIntent().hasExtra("selected_contact")) {
            Contact incomingContact = getIntent().getParcelableExtra("selected_contact");
            contact_name.setText(incomingContact.getName());
            contact_phone_no.setText(incomingContact.getPhone_no());
            contact_email.setText(incomingContact.getEmail());
        }

    }


}

package com.example.contactslist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ContactListAdapter.OnContactListener{

    private RecyclerView recycler_view;
    private ArrayList<Contact> contacts = new ArrayList<>();
    private ContactListAdapter contact_list_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler_view = findViewById(R.id.recycler_view);
        initRecyclerView();

        Contact toni = new Contact();
        toni.setName("Toni Stark");
        toni.setPhone_no("9999999999");
        toni.setEmail("tonistark@gmail.com");
        contacts.add(toni);

        Contact steve = new Contact();
        steve.setName("Steve Rogers");
        steve.setPhone_no("9999999998");
        steve.setEmail("steverogers@gmail.com");
        contacts.add(steve);

        Contact thor = new Contact();
        thor.setName("Thor : Son of Odin");
        thor.setPhone_no("9999999997");
        thor.setEmail("thorsonofodin@gmail.com");
        contacts.add(thor);

        Contact hulk = new Contact();
        hulk.setName("Bruce Banner");
        hulk.setPhone_no("9999999996");
        hulk.setEmail("brucebanner@gmail.com");
        contacts.add(hulk);

        Contact natasha = new Contact();
        natasha.setName("Natasha Ramanoff");
        natasha.setPhone_no("9999999995");
        natasha.setEmail("natasharamanoff@gmail.com");
        contacts.add(natasha);

        Contact clint = new Contact();
        clint.setName("Clint Barton");
        clint.setPhone_no("9999999994");
        clint.setEmail("clintbarton@gmail.com");
        contacts.add(clint);

        Contact peter = new Contact();
        peter.setName("Peter Parker");
        peter.setPhone_no("9999999993");
        peter.setEmail("peterparker@gmail.com");
        contacts.add(peter);

        Contact scott = new Contact();
        scott.setName("Scott Lang");
        scott.setPhone_no("9999999992");
        scott.setEmail("scottlang@gmail.com");
        contacts.add(scott);

        Contact strange = new Contact();
        strange.setName("Dr. Stephen Strange");
        strange.setPhone_no("9999999991");
        strange.setEmail("stephenstrange@gmail.com");
        contacts.add(strange);

        Contact loki = new Contact();
        loki.setName("Loki");
        loki.setPhone_no("9999999990");
        loki.setEmail("loki@gmail.com");
        contacts.add(loki);

        Contact witch = new Contact();
        witch.setName("Scarlet Witch");
        witch.setPhone_no("9999999989");
        witch.setEmail("scarletwitch@gmail.com");
        contacts.add(witch);

        Contact fury = new Contact();
        fury.setName("Nick Fury");
        fury.setPhone_no("9999999988");
        fury.setEmail("nickfury@gmail.com");
        contacts.add(fury);

        Contact marvel = new Contact();
        marvel.setName("Captain Marvel");
        marvel.setPhone_no("9999999987");
        marvel.setEmail("captainmarvel@gmail.com");
        contacts.add(marvel);

        Contact starLord = new Contact();
        starLord.setName("Star Lord");
        starLord.setPhone_no("9999999986");
        starLord.setEmail("starlord@gmail.com");
        contacts.add(starLord);

        contact_list_adapter.notifyDataSetChanged();
    }

    /**public void inputs() {
        for (int i = 0; i < 10; i++) {
            Contact contact = new Contact();
            contact.setName("Toni Stark");
            contact.setPhone_no("9999999999");
            contact.setEmail("aaaaaa@gmail.com");
            contacts.add(contact);
        }
        contact_list_adapter.notifyDataSetChanged();
    }**/

    public void initRecyclerView() {
        LinearLayoutManager linear_layout_manager = new LinearLayoutManager(this);
        recycler_view.setLayoutManager(linear_layout_manager);
        contact_list_adapter = new ContactListAdapter(contacts, this);
        recycler_view.setAdapter(contact_list_adapter);
    }

    @Override
    public void onContactClick(int position) {
        Intent intent = new Intent(this, ContactDetailActivity.class);
        intent.putExtra("selected_contact", contacts.get(position));
        startActivity(intent);
    }
}

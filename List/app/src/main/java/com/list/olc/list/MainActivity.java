package com.list.olc.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.list.olc.list.contact.AdapterContact;
import com.list.olc.list.contact.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView list_contact;
    private List<Contact> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_contact = (RecyclerView) findViewById(R.id.list_contact);

        data = new ArrayList<>();
        for(int i=0; i<20; i++) data.add(new Contact("Person " +
                (i+1), "08123456" + i));

        AdapterContact adapter = new AdapterContact(data);

//        GridLayoutManager llm = new GridLayoutManager(this, 2);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        list_contact.setLayoutManager(llm);
        list_contact.setAdapter(adapter);

    }
}

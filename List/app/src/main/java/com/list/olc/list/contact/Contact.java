package com.list.olc.list.contact;

import android.support.v7.widget.RecyclerView;

/**
 * Created by raihanyuwono on 5/6/17.
 */

public class Contact {
    private String name, phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}

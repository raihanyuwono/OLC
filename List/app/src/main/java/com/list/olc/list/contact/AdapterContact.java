package com.list.olc.list.contact;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.list.olc.list.R;

import java.util.List;


/**
 * Created by raihanyuwono on 5/6/17.
 */

public class AdapterContact extends RecyclerView.Adapter<AdapterContact.HolderContact> {

    public class HolderContact extends RecyclerView.ViewHolder {

        private TextView name, phone;

        public HolderContact(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            phone = (TextView) itemView.findViewById(R.id.phone);
        }

        public void onBind(Contact data) {
            this.name.setText(data.getName());
            this.phone.setText(data.getPhone());
        }
    }

    List<Contact> data;

    public AdapterContact(List<Contact> data) {
        this.data = data;
    }

    @Override
    public HolderContact onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_contact, parent, false);
        return new HolderContact(view);
    }

    @Override
    public void onBindViewHolder(HolderContact holder, int position) {
        holder.onBind(data.get(position));
    }


    @Override
    public int getItemCount() {
        return data.size();
    }

}

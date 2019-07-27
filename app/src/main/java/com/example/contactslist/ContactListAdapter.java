package com.example.contactslist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ContactListAdapter extends RecyclerView.Adapter<ContactListAdapter.ViewHolder> {

    private ArrayList<Contact> contacts = new ArrayList<>();
    private OnContactListener onContactListener;

    public ContactListAdapter(ArrayList<Contact> contacts, OnContactListener onContactListener) {
        this.contacts = contacts;
        this.onContactListener = onContactListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contacts_list, viewGroup, false);
        return new ViewHolder(view, onContactListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.contact_image.setImageResource(R.drawable.avengers);
        viewHolder.contact_name.setText(contacts.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView contact_image;
        TextView contact_name;
        OnContactListener onContactListener;

        public ViewHolder (View itemView, OnContactListener onContactListener) {
            super(itemView);
            contact_image = itemView.findViewById(R.id.contact_image);
            contact_name = itemView.findViewById(R.id.contact_name);
            this.onContactListener = onContactListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onContactListener.onContactClick(getAdapterPosition());
        }
    }

    public interface OnContactListener {

        void onContactClick(int position);
    }
}

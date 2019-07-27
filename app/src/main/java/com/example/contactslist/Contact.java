package com.example.contactslist;

import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;

public class Contact implements Parcelable {

    private String name;
    private String phone_no;
    private String email;
    private Image image;

    public Contact(String name, String phone_no, String email) {
        this.name = name;
        this.phone_no = phone_no;
        this.email = email;
    }

    public Contact() {

    }

    protected Contact(Parcel in) {
        name = in.readString();
        phone_no = in.readString();
        email = in.readString();

    }

    public static final Creator<Contact> CREATOR = new Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Image getImage() {
        return image;
    }

    public void setImage() {
        this.image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(phone_no);
        parcel.writeString(email);
    }


}

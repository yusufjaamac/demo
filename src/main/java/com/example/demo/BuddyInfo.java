package com.example.demo;

public class BuddyInfo {
    //yusuf
    private String phonenumber;
    private String name;
    private String address;

    public BuddyInfo(String phonenumber, String name, String address){
        this.phonenumber = phonenumber;
        this.name=name;
        this.address=address;

    }

    public String getPhonenumber() {
        return phonenumber;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        String string = "";

        string += this.getName() + " " + this.getAddress() + " " + this.getPhonenumber();

        return string;
    }


    public static void main(String[] args) {
        BuddyInfo b = new BuddyInfo("435345435", "yusuf", "carleton");
        System.out.println("Hello" + " " + b.getName());
    }

}

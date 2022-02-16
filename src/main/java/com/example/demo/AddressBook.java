package com.example.demo;
import javax.swing.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

//yj
public class AddressBook extends DefaultListModel<BuddyInfo> {
    private static AtomicInteger counter;
    private ArrayList<BuddyInfo>buds;


    public AddressBook(long l){
        buds = new ArrayList();
    }

    public void addBuddy(BuddyInfo aBuddy){
        if(aBuddy!=null) {
            buds.add(aBuddy);

        }
    }

    public BuddyInfo removeBuddy(int index){

        if(index>=0 && index < buds.size()){
            return buds.remove(index);

        }
        return null;
    }


    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("6666","yusuf","carleton");
        AddressBook b = new AddressBook(counter.incrementAndGet());
    }
}
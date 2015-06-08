package com.nameGenarator;


import java.util.ArrayList;


/**
 * Created by Adam on 08/06/2015.
 */
public class NameGen {

    ArrayList<String> names = new ArrayList<>();

    public void NameGon(){
        names.add("Adam");
        names.add("Thomas");
        names.add("Alex");
        names.add("James");
        selectName();

    }

    public void selectName(){

        System.out.println(names.get((int) (Math.random()*4)));
    }
}

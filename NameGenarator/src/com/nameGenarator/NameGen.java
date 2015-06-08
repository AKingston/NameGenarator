package com.nameGenarator;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Adam on 08/06/2015.
 */
public class NameGen {

    ArrayList<String> names = new ArrayList<String>();

    public NameGen(){
        names.add("Adam");
        names.add("Thomas");
        names.add("Alex");
        names.add("James");
        selectName();

    }

    public void selectName(){

        for(int i=0; i<names.length; i++){

            System.out.println(Random.Math[i]);
        }

    }


}

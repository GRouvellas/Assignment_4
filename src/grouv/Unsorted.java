/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouv;

import grouv.model.TShirt;
import java.util.ArrayList;

/**
 *
 * @author Geo
 */
public class Unsorted {

    public void createUnsortedArraylist(int numberOfTshirts, TShirt t, ArrayList<TShirt> tShirt_list) {
        long starttime = System.currentTimeMillis();
        
        for (int i = 0; i < numberOfTshirts; i++) {
            tShirt_list.add(t.tShirtGenerator());
            System.out.println("T-Shirt " + (i + 1) + ": " + tShirt_list.get(i));
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime-starttime;
        System.out.println("Duration Unsorted-> " + duration + "ms");
    }

}

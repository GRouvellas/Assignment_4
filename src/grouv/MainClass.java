/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouv;

import grouv.model.TShirt;
import grouv.sorting.BubbleSort;
import grouv.sorting.BucketSort;
import grouv.sorting.QuickSort;
import java.util.ArrayList;

/**
 *
 * @author Geo
 */
public class MainClass {

    public static void main(String args[]) {
        int numberOfTshirts = 40;
        TShirt t = new TShirt();
        ArrayList<TShirt> tShirt_list = new ArrayList<>();
        ArrayList<ArrayList<TShirt>> tShirts = new ArrayList<ArrayList<TShirt>>(numberOfTshirts);
        

//        <-----FOR BUBBLESORT AND QUICKSORT uncomment the following blocks ----->

//        Unsorted xima = new Unsorted();
//        xima.createUnsortedArraylist(numberOfTshirts, t, tShirt_list);

//        BubbleSort bs = new BubbleSort();
//        bs.bubbleSortBySizeAsc(tShirt_list);
//        bs.bubbleSortBySizeDesc(tShirt_list);
//        bs.bubbleSortByColorAsc(tShirt_list);
//        bs.bubbleSortByColorDesc(tShirt_list);
//        bs.bubbleSortByFabricAsc(tShirt_list);
//        bs.bubbleSortByFabricDesc(tShirt_list);
//        bs.bubbleSortBySizeColorFabricAsc(tShirt_list);
//        bs.bubbleSortBySizeColorFabricDesc(tShirt_list);

//        QuickSort qs = new QuickSort();
//        qs.quickSortBySizeAsc(numberOfTshirts, tShirt_list);
//        qs.quickSortBySizeDesc(numberOfTshirts, tShirt_list);
//        qs.quickSortByColorAsc(numberOfTshirts, tShirt_list);
//        qs.quickSortByColorDesc(numberOfTshirts, tShirt_list);
//        qs.quickSortByFabricAsc(numberOfTshirts, tShirt_list);
//        qs.quickSortByFabricDesc(numberOfTshirts, tShirt_list);
//        qs.quickSortBySizeColorFabricAsc(numberOfTshirts, tShirt_list);
//        qs.quickSortBySizeColorFabricDesc(numberOfTshirts, tShirt_list);

//<-----FOR BUCKETSORT uncomment the following blocks ----->

        for (int i = 0; i < numberOfTshirts; i++) {
            tShirt_list = new ArrayList<TShirt>();
            tShirt_list.add(t.tShirtGenerator());
            tShirts.add(tShirt_list);
        }

        BucketSort bk = new BucketSort();

        bk.showMyBucketSortBySizeAsc(tShirts, numberOfTshirts);
        bk.showMyBucketSortBySizeDesc(tShirts, numberOfTshirts);
        bk.showMyBucketSortByColorAsc(tShirts, numberOfTshirts);
        bk.showMyBucketSortByColorDesc(tShirts, numberOfTshirts);
        bk.showMyBucketSortByFabricAsc(tShirts, numberOfTshirts);
        bk.showMyBucketSortByFabricDesc(tShirts, numberOfTshirts);
        bk.showMyBucketSortBySizeColorFabricAsc(tShirts, numberOfTshirts);
        bk.showMyBucketSortBySizeColorFabricDesc(tShirts, numberOfTshirts);
    }

}

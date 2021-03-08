/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouv.sorting;

import grouv.model.TShirt;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Geo
 */
public class BubbleSort {

    public void bubbleSortBySizeAsc(ArrayList<TShirt> tShirt_list) {
        int n = tShirt_list.size();
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (tShirt_list.get(j - 1).getSize().compareTo(tShirt_list.get(j).getSize()) > 0) {
                    Collections.swap(tShirt_list, j, j - 1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("T-Shirt " + (i + 1) + ": " + tShirt_list.get(i));
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration BubbleSort By Size Asc-> " + duration + "ms");

    }

    public void bubbleSortBySizeDesc(ArrayList<TShirt> tShirt_list) {
        int n = tShirt_list.size();
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (tShirt_list.get(j - 1).getSize().compareTo(tShirt_list.get(j).getSize()) < 0) {
                    Collections.swap(tShirt_list, j, j - 1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("T-Shirt " + (i + 1) + ": " + tShirt_list.get(i));
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration BubbleSort By Size Desc-> " + duration + "ms");
    }

    public void bubbleSortByColorAsc(ArrayList<TShirt> tShirt_list) {
        int n = tShirt_list.size();
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (tShirt_list.get(j - 1).getColor().compareTo(tShirt_list.get(j).getColor()) > 0) {
                    Collections.swap(tShirt_list, j, j - 1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("T-Shirt " + (i + 1) + ": " + tShirt_list.get(i));
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration BubbleSort By Color Asc-> " + duration + "ms");

    }

    public void bubbleSortByColorDesc(ArrayList<TShirt> tShirt_list) {
        int n = tShirt_list.size();
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (tShirt_list.get(j - 1).getColor().compareTo(tShirt_list.get(j).getColor()) < 0) {
                    Collections.swap(tShirt_list, j, j - 1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("T-Shirt " + (i + 1) + ": " + tShirt_list.get(i));
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration BubbleSort By Color Desc-> " + duration + "ms");
    }

    public void bubbleSortByFabricAsc(ArrayList<TShirt> tShirt_list) {
        int n = tShirt_list.size();
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (tShirt_list.get(j - 1).getFabric().compareTo(tShirt_list.get(j).getFabric()) > 0) {
                    Collections.swap(tShirt_list, j, j - 1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("T-Shirt " + (i + 1) + ": " + tShirt_list.get(i));
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration BubbleSort By Fabric Asc-> " + duration + "ms");

    }

    public void bubbleSortByFabricDesc(ArrayList<TShirt> tShirt_list) {
        int n = tShirt_list.size();
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (tShirt_list.get(j - 1).getFabric().compareTo(tShirt_list.get(j).getFabric()) < 0) {
                    Collections.swap(tShirt_list, j, j - 1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("T-Shirt " + (i + 1) + ": " + tShirt_list.get(i));
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration BubbleSort By Fabric Desc-> " + duration + "ms");
    }

    public void bubbleSortBySizeColorFabricAsc(ArrayList<TShirt> tShirt_list) {
        int n = tShirt_list.size();
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (tShirt_list.get(j - 1).getSize().compareTo(tShirt_list.get(j).getSize()) > 0) {
                    Collections.swap(tShirt_list, j, j - 1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (tShirt_list.get(j - 1).getSize().equals(tShirt_list.get(j).getSize())) {
                    if (tShirt_list.get(j - 1).getColor().compareTo(tShirt_list.get(j).getColor()) > 0) {
                        Collections.swap(tShirt_list, j, j - 1);
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (tShirt_list.get(j - 1).getSize().equals(tShirt_list.get(j).getSize())) {
                    if (tShirt_list.get(j - 1).getColor().equals(tShirt_list.get(j).getColor())) {
                        if (tShirt_list.get(j - 1).getFabric().compareTo(tShirt_list.get(j).getFabric()) > 0) {
                        Collections.swap(tShirt_list, j, j - 1);
                    }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("T-Shirt " + (i + 1) + ": " + tShirt_list.get(i));
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration BubbleSort By SizeColorFabric Asc-> " + duration + "ms");
    }

    public void bubbleSortBySizeColorFabricDesc(ArrayList<TShirt> tShirt_list) {
        int n = tShirt_list.size();
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (tShirt_list.get(j - 1).getSize().compareTo(tShirt_list.get(j).getSize()) < 0) {
                    Collections.swap(tShirt_list, j, j - 1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (tShirt_list.get(j - 1).getSize().equals(tShirt_list.get(j).getSize())) {
                    if (tShirt_list.get(j - 1).getColor().compareTo(tShirt_list.get(j).getColor()) < 0) {
                        Collections.swap(tShirt_list, j, j - 1);
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (tShirt_list.get(j - 1).getSize().equals(tShirt_list.get(j).getSize())) {
                    if (tShirt_list.get(j - 1).getColor().equals(tShirt_list.get(j).getColor())) {
                        if (tShirt_list.get(j - 1).getFabric().compareTo(tShirt_list.get(j).getFabric()) < 0) {
                        Collections.swap(tShirt_list, j, j - 1);
                    }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("T-Shirt " + (i + 1) + ": " + tShirt_list.get(i));
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration BubbleSort By SizeColorFabric Desc-> " + duration + "ms");
    }
    
    
}

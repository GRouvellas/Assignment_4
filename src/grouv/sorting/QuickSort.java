package grouv.sorting;

import grouv.model.TShirt;
import java.util.ArrayList;

/**
 *
 * @author Geo
 */
public class QuickSort {

    int[] arr;
    ArrayList<TShirt> tShirt_li;

    public QuickSort(int[] arr) {
        this.arr = arr;
    }

    public QuickSort(ArrayList<TShirt> tShirt) {
        this.tShirt_li = tShirt;
    }

    public QuickSort() {
    }

    private int myquickPartition_ci_asc(ArrayList<TShirt> arr, int low, int high) {

        TShirt pivot = arr.get(high);

        int i = (low - 1); // index of smaller element 
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot 
            if (arr.get(j).getCi() < pivot.getCi()) {
                i++;
                // swap arr[i] and arr[j] 
                TShirt temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        TShirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;
    }

    private int myquickPartition_si_asc(ArrayList<TShirt> arr, int low, int high) {

        TShirt pivot = arr.get(high);

        int i = (low - 1); // index of smaller element 
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot 
            if (arr.get(j).getSi() < pivot.getSi()) {
                i++;
                // swap arr[i] and arr[j] 
                TShirt temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        TShirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;
    }

    private int myquickPartition_fi_asc(ArrayList<TShirt> arr, int low, int high) {

        TShirt pivot = arr.get(high);

        int i = (low - 1); // index of smaller element 
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot 
            if (arr.get(j).getFi() < pivot.getFi()) {
                i++;
                // swap arr[i] and arr[j] 
                TShirt temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        TShirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;
    }

    private int myquickPartition_sicifi_asc(ArrayList<TShirt> arr, int low, int high) {

        TShirt pivot = arr.get(high);

        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr.get(j).getSi() < pivot.getSi()) {
                i++;
                TShirt temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
            if (arr.get(j).getSi() == pivot.getSi()) {
                if (arr.get(j).getCi() < pivot.getCi()) {
                    i++;
                    TShirt temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
            if (arr.get(j).getSi() == pivot.getSi()) {
                if (arr.get(j).getCi() == pivot.getCi()) {
                    if (arr.get(j).getFi() < pivot.getFi()) {
                        i++;
                        TShirt temp = arr.get(i);
                        arr.set(i, arr.get(j));
                        arr.set(j, temp);
                    }
                }
            }
        }
        TShirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;
    }

    private int myquickPartition_ci_desc(ArrayList<TShirt> arr, int low, int high) {

        TShirt pivot = arr.get(high);

        int i = (low - 1); // index of smaller element 
        for (int j = low; j < high; j++) {
            // If current element is bigger than the pivot 
            if (arr.get(j).getCi() > pivot.getCi()) {
                i++;
                // swap arr[i] and arr[j] 
                TShirt temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        TShirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;
    }

    private int myquickPartition_si_desc(ArrayList<TShirt> arr, int low, int high) {

        TShirt pivot = arr.get(high);

        int i = (low - 1); // index of smaller element 
        for (int j = low; j < high; j++) {
            // If current element is bigger than the pivot 
            if (arr.get(j).getSi() > pivot.getSi()) {
                i++;
                // swap arr[i] and arr[j] 
                TShirt temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        TShirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;
    }

    private int myquickPartition_fi_desc(ArrayList<TShirt> arr, int low, int high) {

        TShirt pivot = arr.get(high);

        int i = (low - 1); // index of smaller element 
        for (int j = low; j < high; j++) {
            // If current element is bigger than the pivot 
            if (arr.get(j).getFi() > pivot.getFi()) {
                i++;
                // swap arr[i] and arr[j] 
                TShirt temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        TShirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;
    }

    private int myquickPartition_sicifi_desc(ArrayList<TShirt> arr, int low, int high) {

        TShirt pivot = arr.get(high);

        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr.get(j).getSi() > pivot.getSi()) {
                i++;
                TShirt temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
            if (arr.get(j).getSi() == pivot.getSi()) {
                if (arr.get(j).getCi() > pivot.getCi()) {
                    i++;
                    TShirt temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
            if (arr.get(j).getSi() == pivot.getSi()) {
                if (arr.get(j).getCi() == pivot.getCi()) {
                    if (arr.get(j).getFi() > pivot.getFi()) {
                        i++;
                        TShirt temp = arr.get(i);
                        arr.set(i, arr.get(j));
                        arr.set(j, temp);
                    }
                }
            }
        }
        TShirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;
    }

    public ArrayList<TShirt> myquickSort_ci_asc(int low, int high) {

        if (low < high) {
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = myquickPartition_ci_asc(tShirt_li, low, high);
            // Recursively sort elements before 
            // partition and after partition 
            myquickSort_ci_asc(low, pi - 1);
            myquickSort_ci_asc(pi + 1, high);
        }
        return tShirt_li;
    }

    public ArrayList<TShirt> myquickSort_si_asc(int low, int high) {

        if (low < high) {
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = myquickPartition_si_asc(tShirt_li, low, high);
            // Recursively sort elements before 
            // partition and after partition 
            myquickSort_si_asc(low, pi - 1);
            myquickSort_si_asc(pi + 1, high);
        }
        return tShirt_li;
    }

    public ArrayList<TShirt> myquickSort_fi_asc(int low, int high) {

        if (low < high) {
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = myquickPartition_fi_asc(tShirt_li, low, high);
            // Recursively sort elements before 
            // partition and after partition 
            myquickSort_fi_asc(low, pi - 1);
            myquickSort_fi_asc(pi + 1, high);
        }
        return tShirt_li;
    }

    public ArrayList<TShirt> myquickSort_sicifi_asc(int low, int high) {

        if (low < high) {
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = myquickPartition_sicifi_asc(tShirt_li, low, high);
            // Recursively sort elements before 
            // partition and after partition 
            myquickSort_sicifi_asc(low, pi - 1);
            myquickSort_sicifi_asc(pi + 1, high);
        }
        return tShirt_li;
    }

    public ArrayList<TShirt> myquickSort_ci_desc(int low, int high) {

        if (low < high) {
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = myquickPartition_ci_desc(tShirt_li, low, high);
            // Recursively sort elements before 
            // partition and after partition 
            myquickSort_ci_desc(low, pi - 1);
            myquickSort_ci_desc(pi + 1, high);
        }
        return tShirt_li;
    }

    public ArrayList<TShirt> myquickSort_si_desc(int low, int high) {

        if (low < high) {
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = myquickPartition_si_desc(tShirt_li, low, high);
            // Recursively sort elements before 
            // partition and after partition 
            myquickSort_si_desc(low, pi - 1);
            myquickSort_si_desc(pi + 1, high);
        }
        return tShirt_li;
    }

    public ArrayList<TShirt> myquickSort_fi_desc(int low, int high) {

        if (low < high) {
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = myquickPartition_fi_desc(tShirt_li, low, high);
            // Recursively sort elements before 
            // partition and after partition 
            myquickSort_fi_desc(low, pi - 1);
            myquickSort_fi_desc(pi + 1, high);
        }
        return tShirt_li;
    }

    public ArrayList<TShirt> myquickSort_sicifi_desc(int low, int high) {

        if (low < high) {
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = myquickPartition_sicifi_desc(tShirt_li, low, high);
            // Recursively sort elements before 
            // partition and after partition 
            myquickSort_sicifi_desc(low, pi - 1);
            myquickSort_sicifi_desc(pi + 1, high);
        }
        return tShirt_li;
    }

    public void quickSortByColorAsc(int n, ArrayList<TShirt> tsli) {
        ArrayList<TShirt> tShirt_qS;
        long starttime = System.currentTimeMillis();
        QuickSort qsort_q = new QuickSort(tsli);
        tShirt_qS = qsort_q.myquickSort_ci_asc(0, tsli.size() - 1);
        for (int i = 0; i < n; i++) {
            System.out.println("T-Shirt " + (i + 1) + ": " + tsli.get(i));
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration QuickSort By Color Asc-> " + duration + "ms");
    }

    public void quickSortBySizeAsc(int n, ArrayList<TShirt> tsli) {
        ArrayList<TShirt> tShirt_qS;
        long starttime = System.currentTimeMillis();
        QuickSort qsort_q = new QuickSort(tsli);
        tShirt_qS = qsort_q.myquickSort_si_asc(0, tsli.size() - 1);
        for (int i = 0; i < n; i++) {
            System.out.println("T-Shirt " + (i + 1) + ": " + tsli.get(i));
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration QuickSort By Size Asc-> " + duration + "ms");
    }

    public void quickSortByFabricAsc(int n, ArrayList<TShirt> tsli) {
        ArrayList<TShirt> tShirt_qS;
        long starttime = System.currentTimeMillis();
        QuickSort qsort_q = new QuickSort(tsli);
        tShirt_qS = qsort_q.myquickSort_fi_asc(0, tsli.size() - 1);
        for (int i = 0; i < n; i++) {
            System.out.println("T-Shirt " + (i + 1) + ": " + tsli.get(i));
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration QuickSort By Fabric Asc-> " + duration + "ms");
    }

    public void quickSortBySizeColorFabricAsc(int n, ArrayList<TShirt> tsli) {
        ArrayList<TShirt> tShirt_qS;
        long starttime = System.currentTimeMillis();
        QuickSort qsort_q = new QuickSort(tsli);
        tShirt_qS = qsort_q.myquickSort_sicifi_asc(0, tsli.size() - 1);
        for (int i = 0; i < n; i++) {
            System.out.println("T-Shirt " + (i + 1) + ": " + tsli.get(i));
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration QuickSort By SizeColorFabric Asc-> " + duration + "ms");
    }

    public void quickSortByColorDesc(int n, ArrayList<TShirt> tsli) {
        ArrayList<TShirt> tShirt_qS;
        long starttime = System.currentTimeMillis();
        QuickSort qsort_q = new QuickSort(tsli);
        tShirt_qS = qsort_q.myquickSort_ci_desc(0, tsli.size() - 1);
        for (int i = 0; i < n; i++) {
            System.out.println("T-Shirt " + (i + 1) + ": " + tsli.get(i));
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration QuickSort By Color Desc-> " + duration + "ms");
    }

    public void quickSortBySizeDesc(int n, ArrayList<TShirt> tsli) {
        ArrayList<TShirt> tShirt_qS;
        long starttime = System.currentTimeMillis();
        QuickSort qsort_q = new QuickSort(tsli);
        tShirt_qS = qsort_q.myquickSort_si_desc(0, tsli.size() - 1);
        for (int i = 0; i < n; i++) {
            System.out.println("T-Shirt " + (i + 1) + ": " + tsli.get(i));
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration QuickSort By Size Desc-> " + duration + "ms");
    }

    public void quickSortByFabricDesc(int n, ArrayList<TShirt> tsli) {
        ArrayList<TShirt> tShirt_qS;
        long starttime = System.currentTimeMillis();
        QuickSort qsort_q = new QuickSort(tsli);
        tShirt_qS = qsort_q.myquickSort_fi_desc(0, tsli.size() - 1);
        for (int i = 0; i < n; i++) {
            System.out.println("T-Shirt " + (i + 1) + ": " + tsli.get(i));
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration QuickSort By Fabric Desc-> " + duration + "ms");
    }

    public void quickSortBySizeColorFabricDesc(int n, ArrayList<TShirt> tsli) {
        ArrayList<TShirt> tShirt_qS;
        long starttime = System.currentTimeMillis();
        QuickSort qsort_q = new QuickSort(tsli);
        tShirt_qS = qsort_q.myquickSort_sicifi_desc(0, tsli.size() - 1);
        for (int i = 0; i < n; i++) {
            System.out.println("T-Shirt " + (i + 1) + ": " + tsli.get(i));
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration QuickSort By SizeColorFabric Desc-> " + duration + "ms");
    }

}

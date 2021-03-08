package grouv.sorting;

import grouv.model.TShirt;
import java.util.ArrayList;
import java.util.List;

public class BucketSort {

    ArrayList<TShirt> tShirt_s;

    public ArrayList<TShirt> myBucketSortBySizeAsc(ArrayList<ArrayList<TShirt>> tShirt, int maxval) {

        List<List<TShirt>> bucket = new ArrayList<>();
        ArrayList<TShirt> newList = new ArrayList<>();

        for (int i = 0; i < maxval; i++) {
            bucket.add(new ArrayList());
        }
        for (int i = 0; i < tShirt.size(); i++) {
            Integer ordinal = tShirt.get(i).get(0).getSi();
            bucket.get(ordinal).add(tShirt.get(i).get(0));
        }
        for (int i = 0; i < bucket.size(); i++) {
            for (int j = 0; j < bucket.get(i).size(); j++) {
                newList.add(bucket.get(i).get(j));
            }
        }
        return newList;
    }

    public void showMyBucketSortBySizeAsc(ArrayList<ArrayList<TShirt>> tShirt, int maxval) {
        long starttime = System.currentTimeMillis();
        tShirt_s = myBucketSortBySizeAsc(tShirt, maxval);
        for (int k = 0; k < tShirt_s.size(); k++) {
            System.out.println("T-Shirt " + (k + 1) + ": " + tShirt_s.get(k).toString());
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration BucketSort By Size Asc-> " + duration + "ms");
    }

    public ArrayList<TShirt> myBucketSortByColorAsc(ArrayList<ArrayList<TShirt>> tShirt, int maxval) {

        List<List<TShirt>> bucket = new ArrayList<>();
        ArrayList<TShirt> newList = new ArrayList<>();

        for (int i = 0; i < maxval; i++) {
            bucket.add(new ArrayList());
        }
        for (int i = 0; i < tShirt.size(); i++) {
            Integer ordinal = tShirt.get(i).get(0).getCi();
            bucket.get(ordinal).add(tShirt.get(i).get(0));
        }
        for (int i = 0; i < bucket.size(); i++) {
            for (int j = 0; j < bucket.get(i).size(); j++) {
                newList.add(bucket.get(i).get(j));
            }
        }
        return newList;
    }

    public void showMyBucketSortByColorAsc(ArrayList<ArrayList<TShirt>> tShirt, int maxval) {
        long starttime = System.currentTimeMillis();
        tShirt_s = myBucketSortByColorAsc(tShirt, maxval);
        for (int k = 0; k < tShirt_s.size(); k++) {
            System.out.println("T-Shirt " + (k + 1) + ": " + tShirt_s.get(k).toString());
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration BucketSort By Color Asc-> " + duration + "ms");
    }

    public ArrayList<TShirt> myBucketSortByFabricAsc(ArrayList<ArrayList<TShirt>> tShirt, int maxval) {

        List<List<TShirt>> bucket = new ArrayList<>();
        ArrayList<TShirt> newList = new ArrayList<>();

        for (int i = 0; i < maxval; i++) {
            bucket.add(new ArrayList());
        }
        for (int i = 0; i < tShirt.size(); i++) {
            Integer ordinal = tShirt.get(i).get(0).getFi();
            bucket.get(ordinal).add(tShirt.get(i).get(0));
        }
        for (int i = 0; i < bucket.size(); i++) {
            for (int j = 0; j < bucket.get(i).size(); j++) {
                newList.add(bucket.get(i).get(j));
            }
        }
        return newList;
    }

    public void showMyBucketSortByFabricAsc(ArrayList<ArrayList<TShirt>> tShirt, int maxval) {
        long starttime = System.currentTimeMillis();
        tShirt_s = myBucketSortByFabricAsc(tShirt, maxval);
        for (int k = 0; k < tShirt_s.size(); k++) {
            System.out.println("T-Shirt " + (k + 1) + ": " + tShirt_s.get(k).toString());
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration BucketSort By Fabric Asc-> " + duration + "ms");
    }

    public ArrayList<TShirt> myBucketSortBySizeDesc(ArrayList<ArrayList<TShirt>> tShirt, int maxval) {
        List<List<TShirt>> bucket = new ArrayList<>();
        ArrayList<TShirt> newList = new ArrayList<>();
        for (int i = 0; i < maxval; i++) {
            bucket.add(new ArrayList());
        }
        for (int i = 0; i < tShirt.size(); i++) {
            Integer ordinal = tShirt.get(i).get(0).getSi();
            bucket.get(ordinal).add(tShirt.get(i).get(0));
        }
        for (int i = bucket.size() - 1; i >= 0; i--) {
            for (int j = bucket.get(i).size() - 1; j >= 0; j--) {
                newList.add(bucket.get(i).get(j));
            }
        }
        return newList;
    }

    public void showMyBucketSortBySizeDesc(ArrayList<ArrayList<TShirt>> tShirt, int maxval) {
        long starttime = System.currentTimeMillis();
        tShirt_s = myBucketSortBySizeDesc(tShirt, maxval);
        for (int k = 0; k < tShirt_s.size(); k++) {
            System.out.println("T-Shirt " + (k + 1) + ": " + tShirt_s.get(k).toString());
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration BucketSort By Size Desc-> " + duration + "ms");
    }

    public ArrayList<TShirt> myBucketSortByColorDesc(ArrayList<ArrayList<TShirt>> tShirt, int maxval) {
        List<List<TShirt>> bucket = new ArrayList<>();
        ArrayList<TShirt> newList = new ArrayList<>();
        for (int i = 0; i < maxval; i++) {
            bucket.add(new ArrayList());
        }
        for (int i = 0; i < tShirt.size(); i++) {
            Integer ordinal = tShirt.get(i).get(0).getCi();
            bucket.get(ordinal).add(tShirt.get(i).get(0));
        }
        for (int i = bucket.size() - 1; i >= 0; i--) {
            for (int j = bucket.get(i).size() - 1; j >= 0; j--) {
                newList.add(bucket.get(i).get(j));
            }
        }
        return newList;
    }

    public void showMyBucketSortByColorDesc(ArrayList<ArrayList<TShirt>> tShirt, int maxval) {
        long starttime = System.currentTimeMillis();
        tShirt_s = myBucketSortByColorDesc(tShirt, maxval);
        for (int k = 0; k < tShirt_s.size(); k++) {
            System.out.println("T-Shirt " + (k + 1) + ": " + tShirt_s.get(k).toString());
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration BucketSort By Color Desc-> " + duration + "ms");
    }

    public ArrayList<TShirt> myBucketSortByFabricDesc(ArrayList<ArrayList<TShirt>> tShirt, int maxval) {
        List<List<TShirt>> bucket = new ArrayList<>();
        ArrayList<TShirt> newList = new ArrayList<>();
        for (int i = 0; i < maxval; i++) {
            bucket.add(new ArrayList());
        }
        for (int i = 0; i < tShirt.size(); i++) {
            Integer ordinal = tShirt.get(i).get(0).getFi();
            bucket.get(ordinal).add(tShirt.get(i).get(0));
        }
        for (int i = bucket.size() - 1; i >= 0; i--) {
            for (int j = bucket.get(i).size() - 1; j >= 0; j--) {
                newList.add(bucket.get(i).get(j));
            }
        }
        return newList;
    }

    public void showMyBucketSortByFabricDesc(ArrayList<ArrayList<TShirt>> tShirt, int maxval) {
        long starttime = System.currentTimeMillis();
        tShirt_s = myBucketSortByFabricDesc(tShirt, maxval);
        for (int k = 0; k < tShirt_s.size(); k++) {
            System.out.println("T-Shirt " + (k + 1) + ": " + tShirt_s.get(k).toString());
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration BucketSort By Fabric Desc-> " + duration + "ms");
    }

    public ArrayList<TShirt> myBucketSortBySizeColorFabricAsc(ArrayList<ArrayList<TShirt>> tShirt, int maxval) {

        List<List<TShirt>> bucket = new ArrayList<>();
        ArrayList<TShirt> newList = new ArrayList<>();

        for (int i = 0; i < maxval * 100; i++) {
            bucket.add(new ArrayList());
        }
        for (int i = 0; i < tShirt.size(); i++) {
            Integer ordinal = tShirt.get(i).get(0).getSi() * 100 + tShirt.get(i).get(0).getCi() * 10 + tShirt.get(i).get(0).getFi();
            bucket.get(ordinal).add(tShirt.get(i).get(0));
        }
        for (int i = 0; i < bucket.size(); i++) {
            for (int j = 0; j < bucket.get(i).size(); j++) {
                newList.add(bucket.get(i).get(j));
            }
        }
        return newList;
    }

    public void showMyBucketSortBySizeColorFabricAsc(ArrayList<ArrayList<TShirt>> tShirt, int maxval) {
        long starttime = System.currentTimeMillis();
        tShirt_s = myBucketSortBySizeColorFabricAsc(tShirt, maxval);
        for (int k = 0; k < tShirt_s.size(); k++) {
            System.out.println("T-Shirt " + (k + 1) + ": " + tShirt_s.get(k).toString());
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration BucketSort By SizeColorFabric Asc-> " + duration + "ms");
    }

    public ArrayList<TShirt> myBucketSortBySizeColorFabricDesc(ArrayList<ArrayList<TShirt>> tShirt, int maxval) {

        List<List<TShirt>> bucket = new ArrayList<>();
        ArrayList<TShirt> newList = new ArrayList<>();

        for (int i = 0; i < maxval * 100; i++) {
            bucket.add(new ArrayList());
        }
        for (int i = 0; i < tShirt.size(); i++) {
            Integer ordinal = tShirt.get(i).get(0).getSi() * 100 + tShirt.get(i).get(0).getCi() * 10 + tShirt.get(i).get(0).getFi();
            bucket.get(ordinal).add(tShirt.get(i).get(0));
        }
        for (int i = bucket.size() - 1; i >= 0; i--) {
            for (int j = bucket.get(i).size() - 1; j >= 0; j--) {
                newList.add(bucket.get(i).get(j));
            }
        }
        return newList;
    }

    public void showMyBucketSortBySizeColorFabricDesc(ArrayList<ArrayList<TShirt>> tShirt, int maxval) {
        long starttime = System.currentTimeMillis();
        tShirt_s = myBucketSortBySizeColorFabricDesc(tShirt, maxval);
        for (int k = 0; k < tShirt_s.size(); k++) {
            System.out.println("T-Shirt " + (k + 1) + ": " + tShirt_s.get(k).toString());
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime - starttime;
        System.out.println("Duration BucketSort By SizeColorFabric Desc-> " + duration + "ms");
    }

    
}

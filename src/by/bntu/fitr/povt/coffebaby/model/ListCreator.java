package by.bntu.fitr.povt.coffebaby.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ListCreator {
    public ArrayList<Integer> createSortedList(int len, int min, int max){
        int i = 0;
        Random rd = new Random();
        ArrayList<Integer> totalList = new ArrayList<Integer>();
        while(i < len){
            totalList.add(rd.nextInt(max) + min);
            i++;
        }
        Collections.sort(totalList);
        return totalList;
    }
}

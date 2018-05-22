package by.bntu.fitr.povt.coffebaby.model;

import java.util.ArrayList;

public class Logic {

    public static void sorting(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.ensureCapacity(list1.size() + list2.size());
        int i = 0;
        int k = 0;
        int sizeSecondList;

        for (sizeSecondList = list2.size(); i < list1.size() - 1 && k != sizeSecondList; ++i) {
            if (((Integer) list1.get(i)).intValue() < ((Integer) list2.get(k)).intValue() && ((Integer) list1.get(i + 1)).intValue() > ((Integer) list2.get(k)).intValue()) {
                supportFunk(list1, i + 1, ((Integer) list2.get(k)).intValue());
                ++k;
            }
        }

        if (k < list2.size()) {
            list1.addAll(list2.subList(k, sizeSecondList));
        }

    }

    private static void supportFunk(ArrayList<Integer> a, int i, int count) {
        int len = a.size();

        for (int j = len - 1; j > i; --j) {
            a.set(j, (Integer) a.get(j - 1));
        }

        a.set(i, count);
    }
}
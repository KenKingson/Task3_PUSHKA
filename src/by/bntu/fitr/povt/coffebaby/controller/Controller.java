package by.bntu.fitr.povt.coffebaby.controller;

import by.bntu.fitr.povt.coffebaby.model.ListCreator;
import by.bntu.fitr.povt.coffebaby.model.Logic;
import by.bntu.fitr.povt.coffebaby.view.View;

import java.util.ArrayList;

public class Controller {
    public static void main(String[] args) {
        ListCreator listCreator = new ListCreator();


        ArrayList<Integer> list1 = listCreator.createSortedList(1000000, 1, 1000);
        ArrayList<Integer> list2 = listCreator.createSortedList(1000000, 1, 1000);


                Logic.sorting(list1, list2);
                View.print(list1.toString());

    }
}

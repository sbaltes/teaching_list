package dev.baltes.teaching.list;

public class Main {
    public static void main(String[] args) {

        // Create list and add some values...
        List list = new List();
        list.append(new double[]{0.5, 4.2, 3.3, 0.9});

        System.out.println("\nThe list contains the following elements:");
        list.print();
    }
}

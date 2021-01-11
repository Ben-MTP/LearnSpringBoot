package com.manhkm.level3;

import com.manhkm.level2.VeryComplexService;

public class MainDemo {
    public static void main(String[] args) {
        SortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        SortAlgorithm quickSortAlgorithm = new QuicksortAlgorithm();

        VeryComplexService business1 = new VeryComplexService();
        VeryComplexService business2 = new VeryComplexService();
        System.out.println("End process");
    }
}

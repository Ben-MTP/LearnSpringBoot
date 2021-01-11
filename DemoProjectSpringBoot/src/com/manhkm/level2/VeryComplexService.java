package com.manhkm.level2;

public class VeryComplexService {
    private SortAlgorithm sortAlgorithm;

    //Constructor:
    public VeryComplexService(){
        sortAlgorithm = new BubbleSortAlgorithm();
    }

    public void complexBusiness(int array[]){
        sortAlgorithm.sort(array);
        System.out.println("The end of");

    }
}

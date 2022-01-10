package home_work_4.service;

import home_work_4.dto.DataContainer;
import home_work_4.service.comparator.DataContainerComparator;

import java.util.Arrays;

public class DataContainerService {
    public void run(){
        Integer [] arr = {1, 2, 3, null, null};
        DataContainer<Integer> dataContainer = new DataContainer<>(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(dataContainer.add(77));
        System.out.println(Arrays.toString(dataContainer.getItems()));
        System.out.println(dataContainer.get(2));
        System.out.println(dataContainer.deleteIndex(1));
        System.out.println(dataContainer.deleteItem(77));
        System.out.println(Arrays.toString(dataContainer.getItems()));
        System.out.println(dataContainer.toString());
        System.out.println("-------------");

        Integer [] arr2 = {1, null, 3, null, null};
        DataContainer<Integer> dataContainer2 = new DataContainer<>(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(dataContainer2.toString());
        System.out.println(dataContainer2.add(77));
        System.out.println(Arrays.toString(dataContainer2.getItems()));
        System.out.println(dataContainer2.toString());
        System.out.println("-------------");

        Integer [] arr3 = {null, null, null, null, null};
        DataContainer<Integer> dataContainer3 = new DataContainer<>(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println(dataContainer3.add(null));
        System.out.println(Arrays.toString(dataContainer3.getItems()));
        System.out.println(dataContainer3.toString());
        System.out.println("-------------");

        Integer [] arr4 = {};
        DataContainer<Integer> dataContainer4 = new DataContainer<>(arr4);
        System.out.println(Arrays.toString(arr4));
        System.out.println(dataContainer4.add(77));
        System.out.println(Arrays.toString(dataContainer4.getItems()));
        System.out.println("-------------");

        Integer [] arr5 = {1,2,3};
        DataContainer<Integer> dataContainer5 = new DataContainer<>(arr5);
        System.out.println(Arrays.toString(arr5));
        System.out.println(dataContainer5.add(77));
        System.out.println(Arrays.toString(dataContainer5.getItems()));
        System.out.println("-------------");

        Integer [] arr6 = {7,3,8,9,2};
        DataContainer<Integer> dataContainer6 = new DataContainer<>(arr6);
        System.out.println(Arrays.toString(dataContainer6.getItems()));
        DataContainerComparator comparator = new DataContainerComparator();
        dataContainer6.sort(comparator);
//        dataContainer6.sort(comparator);
//        dataContainer6.sort(comparator);
//        dataContainer6.sort(comparator);
        System.out.println(Arrays.toString(dataContainer6.getItems()));
    }

}

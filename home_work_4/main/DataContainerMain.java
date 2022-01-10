package home_work_4.main;

import home_work_4.service.DataContainerService;

public class DataContainerMain {
    public static void main(String[] args) {
//        DataContainer<Integer>[] data = {1,2, null, null, 5};
//        DataContainer<String> container = new DataContainer<>();
//        int index1 = container.add("Привет");
//        int index2 = container.add("Как дела");
//        int index3 = container.add("Работаю");
//        int index4 = container.add("Давай потом");
//        String text1 = container.get(index1);
//        String text2 = container.get(index2);
//        String text3 = container.get(index3);
//        String text4 = container.get(index4);
//        System.out.println(text1); //Привет***********
//        System.out.println(text2); //Как дела
//        System.out.println(text3); //Работаю
//        System.out.println(text4); //Давай потом
//        container.delete(text1);
//        System.out.println(container.get(index1)); //Как дела

//        System.out.println(data.add(77));
        DataContainerService dataContainerService = new DataContainerService();
        dataContainerService.run();
        
    }
}

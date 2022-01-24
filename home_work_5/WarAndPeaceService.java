package home_work_5;

import home_work_5.dto.api.ISearchEngine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class WarAndPeaceService implements ISearchEngine {
   public void run (){

        //открываем файл
        BufferedReader bufferedReader = null;
        Path pathToFile = Path.of("Война и мир_книга.txt");
        try {
            bufferedReader = new BufferedReader(
                    new FileReader(pathToFile.toFile())
            );
        } catch (FileNotFoundException e) {
            System.out.println("Вы ввели неправильный адрес");
        }


        //хотим поместить слова в множество
        List<String> data = new ArrayList<>();

        //читаем весь текст
        try {
            int charFromFile = bufferedReader.read();

            StringBuilder builder = new StringBuilder();
            while (charFromFile != -1) {

                if (Character.isLetter(charFromFile)) {
                    //сохраняем символ в билдер
                    builder.append((char) charFromFile);
                } else {
                    //проверяем пустой ли билдер
                    if (builder.length() > 0) {
                        //достаем строку
                        data.add(builder.toString());
                        //сбрасываем билдер
                        builder.setLength(0);
                    }
                }
                charFromFile = bufferedReader.read();
            }
            data.add(builder.toString());
        } catch (IOException e) {
            System.out.println("Проблемы при чтении файла");
        }

        //распечатываем наш лист
        System.out.println(data);
        System.out.println("Итого слов в тексте: " + data.size());
        System.out.println("-----------------------------------");


        Map<String, Integer> map = new HashMap<>();
        for (String word : data) {
            // если уже есть ключ, то прибавляем единицу
            if (map.keySet().contains(word)) {
                map.put(word, map.get(word) + 1);
                // если нет, то кладем ключ и присваиваем значение 1
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
        System.out.println("Итого ключей в тексте: " + map.keySet().size());
        System.out.println("-----------------------------------");


        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        System.out.println("\nТоп-10 самых часто встречаемых слов: ");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    public long search(String text, String word) {
        int i = text.indexOf(word);
        int count = 0;
        while (i >= 0) {
            count++;
            i = text.indexOf(word, i + 1);
        }
        return count;
    }
}

//            for (Map.Entry<String, Integer> item : map.entrySet()){
//            System.out.printf("Key: %s Value: %d \n", item.getKey(), item.getValue());}
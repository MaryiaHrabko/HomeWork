package home_work_5;

import home_work_5.main.WarAndPeaceMain;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad_7 extends WarAndPeaceMain.RegExSearch {
    private static List<File> listWithFileNames = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите адрес папки, в которой находятся текстовые файлы для чтения: ");
        String path = scan.nextLine();
        //getListFiles("/Users/maria/IdeaProjects/JD1/Zad_7");
        getListFiles(path);

        for (File file : listWithFileNames) {
            System.out.println(file.getName());
        }

        System.out.println("Выберите один из тектовых файлов и напишите его имя в точности с раширением " +
                "(например: Война и мир_книга copy 3.txt)");
        String fileName = scan.nextLine();

        boolean finish;
        WarAndPeaceMain.RegExSearch regExSearch = new WarAndPeaceMain.RegExSearch();
        do {
            finish =true;
            System.out.println("Введите слово, которое хотите найти в тексте. Для выхода из поиска введите null: ");
            String wordToFind = scan.nextLine();
            if (wordToFind == null){
                finish = false;
            } else {
                regExSearch.search(fileName, wordToFind);
                write();
            }
        } while(!finish);
    }

    public static void getListFiles(String str) {
        File file = new File(str);
        for (File item : file.listFiles()) {
            if (item.isFile()) {
                listWithFileNames.add(item);
            } else if (item.isDirectory()) {
                getListFiles(item.getAbsolutePath());
            }
        }
    }

    public static void write() throws Exception {
        FileWriter fileWriter = new FileWriter("result.txt");
        fileWriter.write("мир");
        fileWriter.close();
    }
}

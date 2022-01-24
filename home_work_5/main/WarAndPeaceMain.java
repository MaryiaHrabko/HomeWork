package home_work_5.main;

import home_work_5.WarAndPeaceService;
import home_work_5.dto.api.ISearchEngine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WarAndPeaceMain {
    public static void main(String[] args) throws IOException {
        WarAndPeaceService service = new WarAndPeaceService();
        service.run();
        String fileName = "Война и мир_книга.txt";
        String contents = readUsingBufferedReader(fileName);

        String text = ("Привет Земляне! Это ваши братья с Марса. Привет-привет!");
        System.out.println("Количество использования слова в тексте: " + service.search(text, "Привет"));
       // System.out.println("Количество использования слова в тексте: " + service.search(contents, "мир"));

        EasySearch easySearch = new EasySearch();
        System.out.println("Количество использования слова с учетом регистра: " + easySearch.search(text, "При"));


        RegExSearch regExSearch = new RegExSearch();
        System.out.println("Количество использования слова без учета регистра: " + regExSearch.search(text, "привет"));
    }

    public static class EasySearch implements ISearchEngine {
        @Override
        public long search(String text, String word) {
            int lastIndex = 0;
            List<Integer> result = new ArrayList<Integer>();

            while (lastIndex != -1) {
                lastIndex = text.indexOf(word, lastIndex);

                if (lastIndex != -1) {
                    result.add(lastIndex);
                    lastIndex += 1;
                }
            }
            return result.size();
        }
    }


    public static class RegExSearch implements ISearchEngine {
        @Override
        public long search(String text, String word) {
//            Pattern pattern = Pattern.compile("(?=(.ривет))");
//            Matcher matcher = pattern.matcher(text);
            Matcher matcher = Pattern.compile("(?=(.ривет))").matcher(text);

            /*
            Как сделать, чтобы поиск происходил не по конкретно тому, что в скобках (.ривет)
            а передать ему любое слово, которое я передам при использовании метода?
            (?i)(word) не работает
             */
//            Matcher matcher = Pattern.compile("(?i)(Привет|привет)").matcher(text);
//            Matcher matcher2 = Pattern.compile("(Привет|привет)").matcher(text);

            List<Integer> pos = new ArrayList<Integer>();
            while (matcher.find()) {
                pos.add(matcher.start());
            }
            return pos.size();
        }
    }

    public static String readUsingBufferedReader(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}


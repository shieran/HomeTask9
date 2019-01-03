import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StringBuilderTest {

    public static String buffReader() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter file address");
        String string = scanner.next();
        File file = new File(string);
        String str = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = br.readLine()) != null){
                str = line;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return str;
    }

    public static StringBuilder strSort(String s){

        Pattern pattern = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");
        String[] words = pattern.split(s);
        for (String word: words) {
            System.out.println(word);
        }

        StringBuilder result = new StringBuilder();
        ArrayList<String> wordlist = new ArrayList<>(Arrays.asList(words));
        while (wordlist.remove("")){ //удаляем пустые строки
            wordlist.remove("");
        }

        while (isYes(wordlist)) { //самое главное в реализации задачи
            Collections.shuffle(wordlist); //перемешиваем слова случайно в цикле, пока не найдется нужная цепочка слов
        }

        for (String word: wordlist){ //в списке теперь лежит нужная цепочка
            result.append(word).append(" ");
        }
        result.deleteCharAt(result.length()-1);//удалили последний пробел
        return result;

    }


    public static boolean isYes(ArrayList<String> wordsList){//метод тупо проверяет цепочку на хотя первое попавшееся несовпадение
        //когда не совпали буквы он возвращает true, чтобы вызвавший его цикл сработал еще раз и перемешал содержимое списка!
        for (int i = 0; i < wordsList.size()-1; i++) {
            String firstWord = wordsList.get(i).toLowerCase();
            String secondWord = wordsList.get(i+1).toLowerCase();
            if (firstWord.charAt(firstWord.length()-1)!= secondWord.charAt(0)) return true;
        }
        return false; //тут вся цепочка получилась!
    }







}

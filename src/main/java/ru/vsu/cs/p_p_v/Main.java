package ru.vsu.cs.p_p_v;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class Main {

/*    Обработать текст следующим образом: в конце каждого слова приписать в скобках
      длину данного слова. Словом считается непрерывная последовательность символов
      (строчных и прописных) А-Я, A-Z и цифр. Например, в результате обработки текста
      "Придумайте сложный пароль вида Az12-67$AF2" должен получиться текст
      "Придумайте(10) сложный(7) пароль(6) вида(4) Az12(4)-67(2)$AF2(3)".
 */

    public static void main(String[] args) {
        System.out.print("Введите предложение: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String output = markLengthOfWords(input);

        System.out.println(output);
    }

    public static String markLengthOfWords(String input) {
        Pattern pattern = Pattern.compile("([А-Яа-яa-zA-Z0-9]+)");
        List<String> matches = new ArrayList<String>();
        StringBuilder result = new StringBuilder();
        Matcher m = pattern.matcher(input);
        while (m.find()) {
            m.appendReplacement(result, m.group() + "(" + m.group().length() + ")");
//            String match = m.group();
//            input = input.replace(match, match + "(" + match.length() + ")");
        }
        m.appendTail(result);

        return result.toString();
    }
}

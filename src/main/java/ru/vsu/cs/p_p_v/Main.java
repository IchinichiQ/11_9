package ru.vsu.cs.p_p_v;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class Main {

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
        StringBuffer result = new StringBuffer();
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

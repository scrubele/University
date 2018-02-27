package com.company;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    /*Порахувати кількість голосних букв в кожному реченні і вивести результат 1 речення: <число> голосних.
     Текст  слід ввести з консолі*/

    public static void main(String[] args) {

        StringProcessor processor = new StringProcessor();

        try {
            String textUse = processor.readTextFromConsole();
            textUse = processor.processText(textUse);
            processor.showResults(textUse);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

class StringProcessor {

    public String readTextFromConsole() throws IOException {
        Scanner input = new Scanner(System.in);
        StringBuilder text = new StringBuilder();

        String paragraph;
        while (!(paragraph = input.nextLine()).equals("")) {
            text = text.append(paragraph);

        }
        if (text.toString().equals("")) throw new IOException("Please, enter text");
        return text.toString();
    }

    public String processText(String input) {

        String newInput = "";
        int countOfVowels;

        String[] sentences = input.split("[.!?]\\s");

        for (String sentence : sentences) {
            int from = 0;
            countOfVowels = 0;

            Matcher matcher = Pattern.compile("[aeiou]").matcher(sentence);

            while (matcher.find(from)) {
                countOfVowels++;
                from = matcher.start() + 1;
            }

            newInput = newInput.concat(sentence + ": " + countOfVowels + "|");

        }
        return newInput;

    }

    public void showResults(String input) {
        String sentences[] = input.split("\\|");
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }

}

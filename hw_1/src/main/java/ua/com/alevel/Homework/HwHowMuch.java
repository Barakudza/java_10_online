package ua.com.alevel.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HwHowMuch {
    public static void hw2() throws IOException {
        System.out.println("Enter word: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String read = reader.readLine();
        char[] letters = read.toCharArray();
        int counter = 1;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] >= 'A' && letters[i] <= 'Z' || letters[i] >= 'a' && letters[i] <= 'z' || letters[i] >= 'А' && letters[i] <= 'Я' || letters[i] <= 'а' && letters[i] >= 'я') {
                System.out.print(letters[i] + "=");
                for (int j = i+1; j < letters.length; j++) {
                    if (letters[i]==letters[j]){
                        counter++;
                        letters[j]='0';
                    }
                }
                System.out.println(counter);
                counter=1;
            }
        }
    }
}
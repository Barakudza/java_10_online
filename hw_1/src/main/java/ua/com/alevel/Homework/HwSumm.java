package ua.com.alevel.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HwSumm {
    public static void SummNumbers() throws IOException {
        System.out.println("Ввод: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String read = reader.readLine();
        int numbers = find_numbers(read);
            System.out.println("Вывод: "+ numbers);
    }
    public static int find_numbers(String read) {
        int numbers = 0;
        char[] chars = read.toCharArray();
        for (char c : chars) {
            if(c==48||c==49||c==50||c==51||c==52||c==53||c==54||c==55||c==56||c==57) numbers += c-'0';
        }

        return numbers;
    }
}

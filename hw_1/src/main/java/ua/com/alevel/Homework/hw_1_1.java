package ua.com.alevel.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw_1_1 {
    public static void all() throws IOException {
        System.out.println("Ввод: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String r1 = reader.readLine();
        int numbers = find_numbers(r1);
            System.out.println("Вывод: "+ numbers);
    }
    public static int find_numbers(String r1) {
        int numbers = 0;
        char[] chars = r1.toCharArray();
        for (char c : chars) {
            if(c==48||c==49||c==50||c==51||c==52||c==53||c==54||c==55||c==56||c==57) numbers += c-'0';
        }

        return numbers;
    }
}

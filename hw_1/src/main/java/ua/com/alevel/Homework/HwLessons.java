package ua.com.alevel.Homework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HwLessons {
    public static void hw3() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Type number lesson: ");
    int lessonNumber = Integer.parseInt(reader.readLine());

        int startLessons=9*60;
        int oneLesson = 45;
        int paired= 110;
        int notPaired= 50;

        int result = startLessons + oneLesson + (((lessonNumber-1)/2)*paired)+(((lessonNumber-1) %2)*notPaired);
        System.out.print("Time lesson end " + result/60+":"+result%60);
    }
}

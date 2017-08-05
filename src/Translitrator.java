import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Translitrator {

    public static void main(String[] args) throws IOException {

        BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream("letters.txt"), "UTF-16"));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream("TranslitratedWords.txt")));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(
                "\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t\t12\t\t13\n" +
                        "1\tஃ\tஅ\tஆ\tஇ\tஈ\tஉ\tஊ\tஎ\tஏ\tஐ\tஒ\t    ஓ\t    ஔ\n" +
                        "2\tக்\tக\tகா\tகி\tகீ\tகு\tகூ\tகெ\tகே\tகை\tகொ\tகோ\tகௌ\n" +
                        "3\tங்\tங\tஙா\tஙி\tஙீ\tஙு\tஙூ\tஙெ\tஙே\tஙை\tஙொ\tஙோ\tஙௌ\n" +
                        "4\tச்\tச\tசா\tசி\tசீ\tசு\tசூ\tசெ\tசே\tசை\tசொ\t    சோ\t    சௌ\n" +
                        "5\tஞ்\tஞ\tஞா\tஞி\tஞீ\tஞு\tஞூ\tஞெ\tஞே\tஞை\tஞொ\tஞோ\tஞௌ\n" +
                        "6\tட\tட்\tடா\tடி\tடீ\tடு\tடூ\tடெ\tடே\tடை\tடொ\tடோ\tடௌ\n" +
                        "7\tண்\tண\tணா\tணி\tணீ\tணு\tணூ\tணெ\tணே\tணை\tணொ\tணோ\tணௌ\n" +
                        "8\tத்\tத\tதா\tதி\tதீ\tது\tதூ\tதெ\tதே\tதை\tதொ\tதோ\tதௌ\n" +
                        "9\tந்\tந\tநா\tநி\tநீ\tநு\tநூ\tநெ\tநே\tநை\tநொ\tநோ\tநௌ\n" +
                        "10\tப்\tப\tபா\tபி\tபீ\tபு\tபூ\tபெ\tபே\tபை\tபொ\tபோ\tபௌ\n" +
                        "11\tம்\tம\tமா\tமி\tமீ\tமு\tமூ\tமெ\tமே\tமை\tமொ\tமோ\tமௌ\n" +
                        "12\tய்\tய\tயா\tயி\tயீ\tயு\tயூ\tயெ\tயே\tயை\tயொ\tயோ\tயௌ\n" +
                        "13\tர்\tர\tரா\tரி\tரீ\tரு\tரூ\tரெ\tரே\tரை\tரொ  \tரோ\t    ரௌ\n" +
                        "14\tல்\tல\tலா\tலி\tலீ\tலு\tலூ\tலெ\tலே\tலை\tலொ\tலோ\tலௌ\n" +
                        "15\tவ்\tவ\tவா\tவி\tவீ\tவு\tவூ\tவெ\tவே\tவை\tவொ\tவோ\tவௌ\n" +
                        "16\tழ்\tழ\tழா\tழி\tழீ\tழு\tழூ\tழெ\tழே\tழை\tழொ\tழோ\tழௌ\n" +
                        "17\tள்\tள\tளா\tளி\tளீ\tளு\tளூ\tளெ\tளே\tளை\tளொ\tளோ\tளௌ\n" +
                        "18\tற்\tற\tறா\tறி\tறீ\tறு\tறூ\tறெ\tறே\tறை\tறொ\tறோ\tறௌ\n" +
                        "19\tன்\tன\tனா\tனி\tனீ\tனு\tனூ\tனெ\tனே\tனை\tனொ\tனோ\tனௌ");

        String tamilAlphabetList[][] = new String[20][14];
        String translitratedList[][] = new String[20][14];
        StringTokenizer st1 = new StringTokenizer(br1.readLine());
        StringTokenizer st2 = new StringTokenizer(br2.readLine());

        tamilAlphabetList[0][0] = " ";
        translitratedList[0][0] = " ";
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 14; j++) {
                tamilAlphabetList[i][j] = st1.nextToken();
            }
        }

        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 14; j++) {
                translitratedList[i][j] = st2.nextToken();
            }
        }
        String inputWord[] = new String[50];
        String outputWord[] = new String[50];

        System.out.print("Enter word length: ");
        int input_length = Integer.parseInt(br3.readLine());

        for (int i = 0; i < input_length; i++) {
            StringTokenizer st3 = new StringTokenizer(br3.readLine());
            int temp1 = Integer.parseInt(st3.nextToken());
            int temp2 = Integer.parseInt(st3.nextToken());
            inputWord[i] = tamilAlphabetList[temp1][temp2];
            outputWord[i] = translitratedList[temp1][temp2];
        }

        System.out.print("Entered Input Word: ");
        for (int i = 0; i < input_length; i++) {
            System.out.print(inputWord[i]);
        }
        System.out.println();

        System.out.print("Translitrated Word: ");
        for (int i = 0; i < input_length; i++) {
            System.out.print(outputWord[i]);
        }

    }
}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ukey =

        String[] stories ={"src/main/resources/goldilocks.txt", "src/main/resources/hansel_and_gretel.txt","src/main/resources/mary_had_a_little_lamb.txt" };
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(stories[]));

            while((stories = new String[]{bufferedReader.readLine()}) != null) {
                Thread.sleep(200);
                System.out.println(Arrays.toString(stories));


            }

        } catch (FileNotFoundException e) {
            System.out.println("Can't find it");
        }catch (IOException e) {
            System.out.println("Something went wrong");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }



    }


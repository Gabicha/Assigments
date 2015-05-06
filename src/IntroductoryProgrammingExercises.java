import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import sun.java2d.pipe.AAShapePipe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by gchasifa on 5/5/15.
 */
public class IntroductoryProgrammingExercises {
    public static void main(String[] args) throws IOException {
        IntroductoryProgrammingExercises exercise = new IntroductoryProgrammingExercises();
        exercise.printOneAsterisk();
        exercise.drawHorizontalLine();
        exercise.drawVerticalLine();
        exercise.drawRightTriangle();
        exercise.isocelesTriangle();
        exercise.diamond();
        exercise.diamondWithName();
        exercise.FizzBuzz();
        System.out.println("9. Prime Factors");
        System.out.println("please enter a number:");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            String inputLine = is.readLine();
            Integer inputLength = Integer.parseInt(inputLine);
            exercise.generate(inputLength);
        } catch (NumberFormatException ex) {
            System.out.println("only numbers are allowed!!!" + ex);
        }
    }

    public void printOneAsterisk() throws IOException {
        System.out.println("1. Print one asterisk");
        System.out.println("*");
    }

    public void drawHorizontalLine() throws IOException {
        System.out.println("2. Draw a horizontal line");
        System.out.println("please enter a number:");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            String inputLine = is.readLine();
            Integer inputLength = Integer.parseInt(inputLine);
            for (int i = 0; i < inputLength; i++) {
                System.out.print("*");
            }
        } catch (NumberFormatException ex) {
            System.out.println("only numbers are allowed!!!" + ex);
        }
        System.out.println("");
    }

    public void drawVerticalLine() throws IOException {
        System.out.println("3. Draw a vertical line");
        System.out.println("please enter a number:");
        try {
            BufferedReader is2 = new BufferedReader(new InputStreamReader(System.in));
            int inputLine2 = Integer.parseInt(is2.readLine());
            for (int i = 0; i < inputLine2; i++) {
                System.out.println("*");
            }
        } catch (NumberFormatException ex) {
            System.out.println("only numbers are allowed!!!" + ex);
        }
    }

    public void drawRightTriangle() throws IOException {
        System.out.println("4. Draw a right triangle");
        System.out.println("please enter a number:");
        try {
            BufferedReader is2 = new BufferedReader(new InputStreamReader(System.in));
            int inputLine2 = Integer.parseInt(is2.readLine());
            for (int i = 0; i < inputLine2; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        } catch (NumberFormatException ex) {
            System.out.println("only numbers are allowed!!!" + ex);
        }
    }

    public void isocelesTriangle() throws IOException {
        System.out.println("5.  Isosceles Triangle");
        System.out.println("please enter a number:");
        try {
            BufferedReader is2 = new BufferedReader(new InputStreamReader(System.in));
            int inputLine2 = Integer.parseInt(is2.readLine());
            int lengthTotal = (inputLine2 * 2) - 1;
            int lengthChange = lengthTotal;
            int countasterisks = 1;
            for (int i = 0; i < inputLine2; i++) {
                String asterisks = "";
                for (int j = 0; j < countasterisks; j++) {
                    asterisks += "*";
                }
                lengthChange = ((lengthTotal - countasterisks) / 2) + countasterisks;
                String cadena = String.format("%-" + lengthTotal + "s", (String.format("%" + lengthChange + "s", asterisks)));
                countasterisks += 2;
                System.out.println(cadena);
            }

        } catch (NumberFormatException ex) {
            System.out.println("only numbers are allowed!!!" + ex);
        }
    }

    public void diamond() throws IOException {
        System.out.println("6.  Diamond");
        System.out.println("please enter a number:");
        try {
            BufferedReader is2 = new BufferedReader(new InputStreamReader(System.in));
            int inputLine2 = Integer.parseInt(is2.readLine());
            int lengthTotal = (inputLine2 * 2) - 1;
            int lengthChange = lengthTotal;
            int countasterisks = 1;
            for (int i = 0; i < inputLine2; i++) {
                String asterisks = "";
                for (int j = 0; j < countasterisks; j++) {
                    asterisks += "*";
                }
                lengthChange = ((lengthTotal - countasterisks) / 2) + countasterisks;
                String cadena = String.format("%-" + lengthTotal + "s", (String.format("%" + lengthChange + "s", asterisks)));
                countasterisks += 2;
                System.out.println(cadena);
            }
            countasterisks = lengthTotal;
            for (int i = 0; i < inputLine2 - 1; i++) {
                String asterisks = "";
                countasterisks -= 2;
                for (int j = 0; j < countasterisks; j++) {
                    asterisks += "*";
                }
                lengthChange = ((lengthTotal - countasterisks) / 2) + countasterisks;
                String cadena = String.format("%-" + lengthTotal + "s", (String.format("%" + lengthChange + "s", asterisks)));
                System.out.println(cadena);
            }

        } catch (NumberFormatException ex) {
            System.out.println("only numbers are allowed!!!" + ex);
        }
    }

    public void diamondWithName() throws IOException {
        System.out.println("7.  Diamond with Name");
        System.out.println("please enter a number:");
        try {
            BufferedReader is2 = new BufferedReader(new InputStreamReader(System.in));
            int inputLine2 = Integer.parseInt(is2.readLine());
            int lengthTotal = (inputLine2 * 2) - 1;
            int lengthChange = lengthTotal;
            int countasterisks = 1;
            for (int i = 0; i < inputLine2; i++) {
                String asterisks = "";
                for (int j = 0; j < countasterisks; j++) {
                    asterisks += "*";
                }
                lengthChange = ((lengthTotal - countasterisks) / 2) + countasterisks;
                String cadena = String.format("%-" + lengthTotal + "s", (String.format("%" + lengthChange + "s", asterisks)));
                if (lengthTotal == countasterisks) {
                    cadena = "Gabriela";
                }
                countasterisks += 2;
                System.out.println(cadena);
            }
            countasterisks = lengthTotal;
            for (int i = 0; i < inputLine2 - 1; i++) {
                String asterisks = "";
                countasterisks -= 2;
                for (int j = 0; j < countasterisks; j++) {
                    asterisks += "*";
                }
                lengthChange = ((lengthTotal - countasterisks) / 2) + countasterisks;
                String cadena = String.format("%-" + lengthTotal + "s", (String.format("%" + lengthChange + "s", asterisks)));
                System.out.println(cadena);
            }

        } catch (NumberFormatException ex) {
            System.out.println("only numbers are allowed!!!" + ex);
        }
    }
    public void FizzBuzz() throws IOException{
        System.out.println("pulse una tecla para continuar");
        BufferedReader is2 = new BufferedReader(new InputStreamReader(System.in));
        String input=is2.readLine();
        System.out.println("8. FizzBuzz");
        for (int i = 1; i <= 100; i++) {
            boolean divisible3=false;
            boolean divisible5=false;
            if (i%3==0){
                divisible3=true;
            }
            if (i%5==0){
                divisible5=true;
            }
            if (divisible3 &&!divisible5){
                System.out.println("Fizz");
            }
            if (divisible5 &&!divisible3){  
                System.out.println("Buzz");
            }
            if (divisible3 && divisible5){
                System.out.println("FizzBuzz");
            }
            if (!divisible3 && !divisible5){
                System.out.println(i);
            }
        }
    }
    public void generate(int pNumber){
        ArrayList<Integer> lista=new ArrayList<Integer>();
        int divisor=2;
        while (pNumber!=1){
            if(pNumber%divisor==0){
                pNumber=pNumber/divisor;
                if (!lista.contains(divisor)){
                    lista.add(divisor);
                }
            }else{
                divisor++;
            }
        }
        System.out.println(lista);
    }
}
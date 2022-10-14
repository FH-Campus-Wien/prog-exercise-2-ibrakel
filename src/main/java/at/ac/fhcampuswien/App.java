package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        double number; int count = 1;double max=1;

        do {
            System.out.print("Number "+count+": ");
            Scanner scan = new Scanner(System.in);
            number = scan.nextDouble();
            if(number<0 && count ==1){System.out.println("No number entered.");break;}
            if (number/max>1){max=number;}
            count++;
            if (number <= 0){
                System.out.println("The largest number is "+String.format("%.2f",max));
                break;
            }
        } while (number >0);

    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        // constant ints must be declared with final and must have uppercase name

        System.out.print("n: ");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        if (rows<=0){System.out.println("Invalid number!");}
        int x = 1;
        for (int i=0;i<rows;i++){
            for(int j=1;j<i+2;++j){
                System.out.print(x+" ");
                x++;
            }
            System.out.print("\n");

        }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        final int ROWS = 6;
        for (int i = 1;i<=ROWS;++i){
            for(int j = 0;j < ROWS-i ;j++){
                System.out.print(" ");}
            for(int w = 0;w<2*i-1;++w){
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        // c = scan.next().charAt();
        // c-- ( even if its a char we can subtract or add to it and we get the character before or after respectively)
    }

    //todo Task 5
    public void marks(){
        // input your solution here

        Scanner scan = new Scanner(System.in);
        double marks=0; int count = 1; int negatives=0;
        for (int i=1;;i++){
            System.out.print("Mark "+i+": ");
            int mark = scan.nextInt();
            if (mark <0 | mark>5){
                System.out.println("Invalid mark!");
                mark = mark - mark;
                i--;
                continue;
            }
            marks += mark;
            if (mark ==5){negatives++; }
            if (mark == 0){
                //i--;
                break;
            }
            count = i ;
        }
        System.out.println("Average: "+String.format("%.2f",marks/count));
        System.out.println("Negative marks: "+ negatives );
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}
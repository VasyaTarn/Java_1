package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // --------- 1 ---------
        System.out.println("1.");
        System.out.print("“Your time is limited,\n\tso don’t waste it\n\t\tliving someone else’s life”\n\t\t\tSteve Jobs\n");

        System.out.println();
        // --------- 2 ---------
        System.out.println("2.");

        System.out.print("value: ");
        int value = scanner.nextInt();

        System.out.print("percent: ");
        int percent = scanner.nextInt();

        System.out.println(value * percent / 100);

        System.out.println();
        // --------- 3 ---------
        System.out.println("3.");

        int a = scanner.nextInt();

        int b = scanner.nextInt();

        int c = scanner.nextInt();

        System.out.printf("%d%d%d", a, b, c);

        System.out.println();
        // --------- 4 ---------
        System.out.println("4.");

        System.out.print("Number: ");
        int number = scanner.nextInt();

        String numberAsString = Long.toString(number);
        if(numberAsString.length() > 6)
        {
            System.out.println("Number is too long");
        }
        else
        {
            int[] digits = new int[numberAsString.length()];

            for (int i = 0; i < numberAsString.length(); i++) {
                digits[i] = Character.getNumericValue(numberAsString.charAt(i));
            }

            int tempDigit = digits[0];

            digits[0] = digits[digits.length - 1];
            digits[digits.length - 1] = tempDigit;

            for (int digit : digits) {
                System.out.print(digit);
            }
        }

        System.out.println();
        // --------- 5 ---------
        System.out.println("5.");

        System.out.print("Month number: ");
        int monthNumber = scanner.nextInt();

        if(monthNumber > 1 && monthNumber < 12)
        {
            if(monthNumber == 1 || monthNumber == 2 || monthNumber == 12)
            {
                System.out.println("Winter");
            }
            else if(monthNumber >= 3 && monthNumber <= 5)
            {
                System.out.println("Spring");
            }
            else if(monthNumber >= 6 && monthNumber <= 8)
            {
                System.out.println("Summer");
            }
            else
            {
                System.out.println("Autumn");
            }
        }
        else
        {
            System.out.println("Month number is invalid");
        }

        System.out.println();
        // --------- 6 ---------
        System.out.println("6.");


        System.out.print("Number of meters: ");
        double meters = scanner.nextDouble();

        System.out.println("Select the unit of measurement to convert:");
        System.out.println("1: Miles");
        System.out.println("2: Inches");
        System.out.println("3: Yards");
        System.out.print("Enter the number of the selected option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double miles = meters / 1609.34;
                System.out.println(miles);
                break;
            case 2:
                double inches = meters * 39.3701;
                System.out.println(inches);
                break;
            case 3:
                double yards = meters * 1.09361;
                System.out.println(yards);
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }

        System.out.println();
        // --------- 7 ---------
        System.out.println("7.");

        System.out.print("First number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Second number: ");
        int secondNumber = scanner.nextInt();

        if(firstNumber < secondNumber)
        {
            for(int i = firstNumber; i <= secondNumber; i++)
            {
                if(i % 2 != 0)
                {
                    System.out.print(i + " ");
                }
            }
        }
        else
        {
            for(int i = secondNumber; i <= firstNumber; i++)
            {
                if(i % 2 != 0)
                {
                    System.out.print(i + " ");
                }
            }
        }

        System.out.println();
        // --------- 8 ---------
        System.out.println("8.");

        System.out.print("Start of range: ");
        int start = scanner.nextInt();
        System.out.print("End of range: ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d\t", i, j, i * j);
            }
            System.out.println();
        }

        System.out.println();
        // --------- 9 ---------
        System.out.println("9.");

        int[] arr = new int[] {5, -2, 16, 0, 23, 54, 0, -5423, 24, -87, 0};

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int nPositive = 0;
        int nNegative = 0;
        int nZero = 0;

        for (int i : arr) {
            if(i < 0)
            {
                nNegative++;
            }
            else if(i > 0)
            {
                nPositive++;
            }
            else
            {
                nZero++;
            }
        }

        System.out.printf("Max = %d\nMin = %d\nPositive = %d\nNegative = %d\nZero = %d\n", max, min, nPositive, nNegative, nZero);


        System.out.println();
        // --------- 10 ---------
        System.out.println("10.");

        int[] array = new int[] {3, 53, 93, 954, -43, -1, -4, 3, 223, 513, -54, -45, 77};

        ArrayList<Integer> arrEven = new ArrayList<>();
        ArrayList<Integer> arrOdd = new ArrayList<>();
        ArrayList<Integer> arrPositive = new ArrayList<>();
        ArrayList<Integer> arrNegative = new ArrayList<>();

        for(int i : array)
        {
            if(i % 2 == 0 && i > 0)
            {
                arrEven.add(i);
                arrPositive.add(i);
            }
            else if(i % 2 == 0 && i < 0)
            {
                arrEven.add(i);
                arrNegative.add(i);
            }
            else if(i % 2 != 0 && i < 0)
            {
                arrOdd.add(i);
                arrNegative.add(i);
            }
            else if(i % 2 != 0 && i > 0)
            {
                arrOdd.add(i);
                arrPositive.add(i);
            }
        }

        System.out.println("Even numbers:");
        printArr(arrEven);

        System.out.println("Odd numbers:");
        printArr(arrOdd);

        System.out.println("Positive numbers:");
        printArr(arrPositive);

        System.out.println("Negative numbers:");
        printArr(arrNegative);


        System.out.println();
        // --------- 11 ---------
        System.out.println("11.");

        drawLine(20, Direction.HORIZONTAL, "*");
        System.out.println("\n");
        drawLine(10, Direction.VERTICAL, "#");


        System.out.println();
        // --------- 12 ---------
        System.out.println("12.");
        int[] array_12 = {3, 53, 93, 954, -43, -1, -4, 3, 223, 513, -54, -45, 77};

        System.out.println("Sort order (1 - ascending, 2 - descending): ");
        int choice_12 = scanner.nextInt();

        if(choice_12 < 1 || choice_12 > 2)
        {
            System.out.println("Invalid choice");
            return;
        }

        SortOrder sortOrder = (choice_12 == 1) ? SortOrder.ASCENDING : SortOrder.DESCENDING;


        sortArray(array_12, sortOrder);

        System.out.println("Sorted array: " + Arrays.toString(array_12));


    }

    public enum Direction {
        HORIZONTAL,
        VERTICAL,
    }

    public enum SortOrder {
        ASCENDING,
        DESCENDING
    }

    private static void printArr(ArrayList<Integer> arr)
    {
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private  static void drawLine(int len, Direction direction, String symbol)
    {
        switch (direction)
        {
            case HORIZONTAL:
                for (int i = 0; i < len; i++)
                {
                    System.out.print(symbol);
                }
                break;
            case VERTICAL:
                for (int i = 0; i < len; i++)
                {
                    System.out.println(symbol);
                }
                break;
        }
    }

    private static void sortArray(int[] array, SortOrder sortOrder)
    {
        if (sortOrder == SortOrder.ASCENDING)
        {
            Arrays.sort(array);
        }
        else if (sortOrder == SortOrder.DESCENDING)
        {
            Arrays.sort(array);
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        }
    }
}
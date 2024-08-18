package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

    private static final double MILE_UNIT = 1609.34;
    private static final double INCHE_UNIT = 39.3701;
    private static final double YARD_UNIT = 1.09361;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // --------- 1 ---------
        System.out.println("1.");
        System.out.print("“Your time is limited,\n\tso don’t waste it\n\t\tliving someone else’s life”\n\t\t\tSteve Jobs\n");

        System.out.println();
        // --------- 2 ---------
        System.out.println("2.");

        System.out.print("value: ");
        float value = scanner.nextFloat();

        System.out.print("percent: ");
        float percent = scanner.nextFloat();

        System.out.println(value * percent / 100);

        System.out.println();
        // --------- 3 ---------
        System.out.println("3.");

        int a;
        int b;
        int c;

        do
        {
            System.out.print("a = ");
            a = scanner.nextInt();

            System.out.print("b = ");
            b = scanner.nextInt();

            System.out.print("c = ");
            c = scanner.nextInt();
        }while (a <= 0 || b <= 0 || c <= 0);

        int convertNumber_3 = Integer.parseInt("" + a + b + c);
        System.out.print(convertNumber_3);

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

            String str = "";
            for (int digit : digits) {
                str += digit;
            }

            int convertNumber_4 = Integer.parseInt(str);
            System.out.print(convertNumber_4 + 1);
        }

        System.out.println();
        // --------- 5 ---------
        System.out.println("5.");

        int monthNumber;
        do
        {
            System.out.print("Month number: ");
            monthNumber = scanner.nextInt();
        } while (monthNumber < 1 || monthNumber > 12);

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

        double meters;

        do
        {
            System.out.print("Number of meters: ");
            meters = scanner.nextDouble();
        }while (meters <= 0);

        System.out.println("Select the unit of measurement to convert:");
        System.out.println("1: Miles");
        System.out.println("2: Inches");
        System.out.println("3: Yards");
        System.out.print("Enter the number of the selected option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double miles = meters / MILE_UNIT;
                System.out.println(miles);
                break;
            case 2:
                double inches = meters * INCHE_UNIT;
                System.out.println(inches);
                break;
            case 3:
                double yards = meters * YARD_UNIT;
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

        int start;
        int end;

        do
        {
            System.out.print("Start of range: ");
            start = scanner.nextInt();
            System.out.print("End of range: ");
            end = scanner.nextInt();
        }while(start >= end || start < 2 || end > 9);

        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d\t", i, j, i * j);
            }
            System.out.println();
        }

        System.out.println();
        // --------- 9 ---------
        System.out.println("9.");

        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(201) - 100;
        }

        System.out.println(Arrays.toString(arr));

        int max = searchMax(arr);
        int min = searchMin(arr);
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

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        System.out.println(Arrays.toString(array));

        int[] arrEven = new int[20];
        int[] arrOdd = new int[20];
        int[] arrPositive = new int[20];
        int[] arrNegative = new int[20];

        int evenIndex = 0;
        int oddIndex = 0;
        int positiveIndex = 0;
        int negativeIndex = 0;

        for (int i : array) {
            if (i % 2 == 0) {
                arrEven[evenIndex++] = i;
            } else {
                arrOdd[oddIndex++] = i;
            }
            if (i > 0) {
                arrPositive[positiveIndex++] = i;
            } else if (i < 0) {
                arrNegative[negativeIndex++] = i;
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
        int[] array_12 = new int[20];

        for (int i = 0; i < array_12.length; i++) {
            array_12[i] = random.nextInt(201) - 100;
        }

        System.out.println(Arrays.toString(array_12));

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

    private static void printArr(int[] arr)
    {
        for(int i : arr)
        {
            if(i != 0)
            {
                System.out.print(i + " ");
            }
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

    private static int searchMax(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        return max;
    }

    private static int searchMin(int[] arr)
    {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        return min;
    }
}
package java_version;

import java.io.File;
import java.util.Scanner;

class Run
{
    public static void main(String[] args)
    {
        int n_numbers = 1000;
        // int n_numbers = 10000;
        // int n_numbers = 100000;

    try
    {
        int[] array = new int[n_numbers];
        int i = 0;

        File currentDir = new File(".");
        File parentDir = currentDir.getParentFile();
        File file = new File(parentDir,n_numbers + "_numbers.txt");;
        Scanner file_scanner = new Scanner(file);

        while (file_scanner.hasNextLine()) 
        {
            array[i++] = file_scanner.nextInt();
        }
        file_scanner.close();
        Quicksort.sort(array, 0, n_numbers);
            for(int j:array)
        System.out.print(j + "\n");
    } catch (Exception e) { ; }
    }
}
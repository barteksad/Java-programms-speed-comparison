package java_version;

import java.io.File;
import java.util.Scanner;

public class Run
{
    public static void main(String[] args)
    {
        int n_numbers = 1000000;
        int how_many_times = 10;

    try
    {
        while(how_many_times-- > 0)
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
        }
    } catch (Exception e) { ; }
    }
}
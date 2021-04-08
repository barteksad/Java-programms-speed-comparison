package java_version;

class Quicksort
{
    private static final void swap(int[] array, int elem1_index, int elem2_index)
    {
        int temp = array[elem1_index];
        array[elem1_index] = array[elem2_index];
        array[elem2_index] = temp;
    }

    private static final int partition(int[] array, int begin, int end)
    {
        int pivot = array[end - 1];
        int bound = begin;

        for (int j = begin; j != end; j++)
            if (array[j] < pivot)
            {
                Quicksort.swap(array, bound, j);
                bound++;
            }
        Quicksort.swap(array, bound, end - 1);
        return bound;
    }

    public static final void sort(int[] array, int begin, int end)
    {
        if (begin < end)
        {
            int bound = partition(array, begin, end);
            Quicksort.sort(array, begin, bound);
            Quicksort.sort(array, bound + 1, end);
        }
    }
}
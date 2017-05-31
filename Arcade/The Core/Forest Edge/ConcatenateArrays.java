/*

Given two arrays of integers a and b, obtain the array formed by the elements of a followed by the elements of b.

Example

For a = [2, 2, 1] and b = [10, 11], the output should be
concatenateArrays(a, b) = [2, 2, 1, 10, 11].


*/










int[] concatenateArrays(int[] a, int[] b) 
{
    int[] arrConc = new int[a.length + b.length];
    System.arraycopy(a, 0, arrConc, 0, a.length);
    System.arraycopy(b, 0, arrConc, a.length, b.length);
    
    return arrConc;
}

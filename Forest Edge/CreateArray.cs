/*


Given an integer size, return array of length size filled with 1s.

Example

For size = 4, the output should be
createArray(size) = [1, 1, 1, 1].



*/



int[] createArray(int size)
{
    int i;
    int[] arr = new int[size];
    string k;
    for(i = 0; i < arr.Length; i++)
    {
        arr[i] = 1; 
    }
    return arr;
}

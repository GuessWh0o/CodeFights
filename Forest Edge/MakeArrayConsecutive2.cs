/*

Given an array of integers, we need to find the number of "holes" that need to be filled such that it contains all the integers from some range.

Example

For sequence = [6, 2, 3, 8], the output should be
makeArrayConsecutive2(sequence) = 3.

We need to add in 4, 5 and 7.


*/






int makeArrayConsecutive2(int[] sequence) 
{
    Array.Sort(sequence);
    int holes=0;
    for (int i = sequence[0]; i <= sequence[sequence.Length - 1]; i++)
        if(!sequence.Contains(i))
            holes++;
    return holes;
}

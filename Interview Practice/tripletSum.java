/**
*Note: Write a solution with O(n2) time complexity, since this is what you would be asked to do during a real interview.
*
*You have an array a composed of exactly n elements. Given a number x, determine whether or not a contains three elements 
*for which the sum is exactly x.
*
*Example
*
*For x = 15 and a = [14, 1, 2, 3, 8, 15, 3], the output should be
*tripletSum(x, a) = false;
*
*For x = 8 and a = [1, 1, 2, 5, 3], the output should be
*tripletSum(x, a) = true.
*
*The given array contains the elements 1,2, and 5, which add up to 8.
*
**/


boolean tripletSum(int x, int[] a) {
     
    int l, r;
    int array_size = a.length;
    //First sort array
    quickSort(a, 0, array_size - 1);
        
      for (int i = 0; i < array_size - 2; i++) {
            l = i + 1; 
            r = array_size - 1;
            while (l < r) {
                if (a[i] + a[l] + a[r] == x) {
                    return true;
                } else if (a[i] + a[l] + a[r] < x)
                    l++;
                 
                else
                    r--;
            }
        }
        return false;
}


void quickSort(int array[], int start, int end){
    int pi;
    
    if(start < end){
        pi = partition(array, start, end);
        quickSort(array, start, pi - 1);
        quickSort(array, pi + 1, end);
    }
}

int partition(int array[], int start, int end){
    int x = array[end];
    int i = (start - 1);
    int j;
    
    for (j = start; j <= end - 1; j++) {
        if (array[j] <= x) {
            i++;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;
        return (i + 1);
}

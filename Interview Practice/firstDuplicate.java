/*
Write a solution with O(n) time complexity and O(1) additional space complexity

Given an array a that contains only numbers in the range from 1 to a.length, 
find the first duplicate number for which the second occurrence has the minimal index. 
In other words, if there are more than 1 duplicated numbers, return the number 
for which the second occurrence has a smaller index than the second occurrence of the other number does. 
If there are no such elements, return -1.

Example

For a = [2, 3, 3, 1, 5, 2], the output should be
firstDuplicate(a) = 3.

There are 2 duplicates: numbers 2 and 3. 
The second occurrence of 3 has a smaller index than than second occurrence of 2 does, so the answer is 3.

For a = [2, 4, 3, 5, 1], the output should be
firstDuplicate(a) = -1.

Input/Output

[execution time limit] 3 seconds (java)


The element in a that occurs in the array more than once and has the minimal index for its second occurrence. 
If there are no such elements, return -1.
*/



int firstDuplicate(int[] a) {
   Map<Integer, Integer> second = new HashMap<Integer, Integer>();
   Set<Integer> first = new HashSet<Integer>();
   for (int i = 0; i < a.length; ++i) {
      int num = a[i];
      if (first.contains(num) && !second.containsKey(num)) {
         second.put(num, i);
      }
      first.add(num);
   }
   int selected = -1;
   int minIndex = a.length;
   for (Map.Entry<Integer, Integer> entry : second.entrySet()) {
      if (entry.getValue() < minIndex) {
         minIndex = entry.getValue();
         selected = entry.getKey();
      }
    }
   return selected;
}

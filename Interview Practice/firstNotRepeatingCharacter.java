/*
Note: Write a solution that only iterates over the string once and uses O(1) additional memory, since this is what you would be asked to do during a real interview.

Given a string s, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.

Example

For s = "abacabad", the output should be
firstNotRepeatingCharacter(s) = 'c'.

There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.

For s = "abacabaabacaba", the output should be
firstNotRepeatingCharacter(s) = '_'.

There are no characters in this string that do not repeat.

Input/Output

[execution time limit] 3 seconds (java)

*/


char firstNotRepeatingCharacter(String s) {
 int index = 0;
      //Arrays of int are always initialized to 0
      int[] letters = new int[s.length];
      int[] order = new int[s.length];
    
      for(int i : s.getBytes()){
            letters[i-97]++;
            order[i-97] += index;
            index++;
      }
      
      int minindex = s.length();
      int result = -2;
 
      for(int i = 0; i < letters.length; i++){
            if(letters[i] == 1 && order[i] < minindex){
                  minindex = order[i];
                  result = i;
                  }
      }
      return (char) (result+97);
}

/*
    HashMap<Character, Boolean> charactersAndIfHasDuplicates = new HashMap<>();
    ArrayList<Character> charsWithoutDuplicates = new ArrayList<>();
    for(int i = 0; i < s.length(); i++) {
        char atI = s.charAt(i);
        if(!charactersAndIfHasDuplicates.containsKey(atI)) {
            charactersAndIfHasDuplicates.put(atI, false);
            charsWithoutDuplicates.add(atI);
        } else if(charactersAndIfHasDuplicates.containsKey(atI)) {
              charactersAndIfHasDuplicates.put(atI, true);
              charsWithoutDuplicates.remove(Character.valueOf(atI));
        }
        System.out.println("Char at i = " + atI);
    }
    if(charsWithoutDuplicates.size() > 0) {
        System.out.println("Returns " + charsWithoutDuplicates.get(0));
        return charactersAndIfHasDuplicates.get(0);
    } else {
        return '_';
    }  
}  */

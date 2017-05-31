/**
*Reverse the order of words in a given string sentence. You can assume that sentence does not have any leading, 
*trailing or repeating spaces.
*
*Example
*
*For sentence = "Man bites dog", the output should be
*reverseSentence(sentence) = "dog bites Man".
*
**/


String reverseSentence(String sentence) {
    String[] split = sentence.split(" ");
    String res = "";

    for(int i = split.length - 1; i >= 0; i--) {
        res += (split[i] + " ");
        
    }
 return res.trim();
}

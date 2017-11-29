function checkPalindrome(inputString) {
    console.log(inputString);
    const n = inputString.length;
    console.log('n = ' + n);
    for(let i=0, j=n-1; i<=j; i++, j--) {
           console.log('i = ' +i);   
           console.log('charAt(i) ' + i + ' ' + inputString.charAt(i));
          console.log('charAt(j) ' + j + ' ' + inputString.charAt(j));
         if(inputString.charAt(i) !== inputString.charAt(j)) {
             console.log('false');
            return false;
         }
      }
     console.log('true');
    return true;
}

function checkPalindrome2(inputString) {
    console.log(inputString == inputString.split('').reverse().join(''));
}

checkPalindrome('aabaa');
checkPalindrome2('aabaa');


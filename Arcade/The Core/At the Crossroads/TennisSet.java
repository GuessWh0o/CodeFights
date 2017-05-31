/*


In tennis, a set is finished when one of the players wins 6 games and the other one wins less than 5, or, if both players win at least 5 games, until one of the players win 7 games.

Determine if it is possible for a tennis set to be finished with the score score1 : score2.

Example

For score1 = 3 and score2 = 6, the output should be
tennisSet(score1, score2) = true;
For score1 = 8 and score2 = 5, the output should be
tennisSet(score1, score2) = false;
For score1 = 6 and score2 = 5, the output should be
tennisSet(score1, score2) = false.


*/




boolean tennisSet(int score1, int score2) {
    int small, large;
    
    if( score1 < score2) {
        small = score1;
        large = score2;
    } else {
        small = score2;
        large = score1;
    }
    return small != large && 
         ((small < 5 && large == 6) || 
          (small >= 5 && large == 7));
}
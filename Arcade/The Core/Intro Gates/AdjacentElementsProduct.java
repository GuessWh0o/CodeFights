int adjacentElementsProduct(int[] inputArray) {
    
    int biggestProduct = Integer.MIN_VALUE;
         
   for(int i = 0, j = 1; i < inputArray.length - 1; i++, j++){
        int prod = inputArray[i] * inputArray[j];
        if(biggestProduct < prod){
            biggestProduct = prod;
        }
    }
    return biggestProduct;
}
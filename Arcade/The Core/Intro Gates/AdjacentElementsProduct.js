const adjacentElementsProduct = arr => {
    console.log(Math.max(...arr.slice(1).map((x, i) => [x*arr[i]])))
}
  
const arr = [3, 6, -2, -5, 7, 3];
adjacentElementsProduct(arr);
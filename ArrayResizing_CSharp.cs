using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
 
namespace Array_Count
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] array = new int[5] {1, 2, 3, 4, 5}; //Inital array. Size 5
            int counter = 0; //Counter for 1st for
            int res_count = 0; //Counter for 2nd for
 
            for (int i = 0; i < array.Length; i++ )
            {
                counter++;
            }
            Console.WriteLine("Before resizing array has: "+ counter +" elements");
 
            Array.Resize<int>(ref array, 9); //Array.Resize(ref array, array.Length + 2);
                                             //Resised array to 9 digits
            for(int j = 0; j < array.Length; j++)
            {
                res_count++;
            }
            Console.WriteLine("After resizing: "+ res_count +" elements");
            Console.ReadKey();
 
        }
    }
}
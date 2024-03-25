/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binarysearch;
import java.util.*;
/**
 *
 * @author USER
 */
public class BinarySearch {

    public static void main(String[] args) {
        
        // this is the basic (code) way to search for arrays in java
        //int[] arr = {10, 20, 30, 40, 50};
//int key = 40;
//int result = Arrays.binarySearch(arr, key);
//System.out.println(result);
int[] a = {10, 20, 30, 40, 50};
System.out.println(binarySearch(a, 50));
System.out.println(Arrays.binarySearch(a, 10));

int [] array = {637,746,906,9509};
Arrays.sort(array);
System.out.println("sorted array is : " + array);

    }
    private static int binarySearch(int[] numbers, int numberToFind){
    int low = 0;
    int high = numbers.length-1;
    while ( low<= high){
    int middlePosition = (low + high)/2;
      int middleNumber =  numbers[middlePosition];
      
      if (numberToFind == middleNumber){
      return middlePosition;
      }
      if (numberToFind < middleNumber ){
      high = middlePosition - 1;
          
      }else{
       low = middlePosition + 1;
      }
      
      
      
    }
    return -1;
    }
}

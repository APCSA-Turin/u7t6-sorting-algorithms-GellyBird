package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int tempNum = 0;
        int tempVal = 0;
        int totalLoop = 0;
       for (int i = 1; i < elements.length; i++) {
        tempNum = i;
        tempVal = elements[i];
        while (tempNum > 0) {
             if (elements[tempNum - 1] > tempVal) {
                elements[tempNum] = elements[tempNum - 1];
                elements[tempNum - 1] = tempVal;
                tempNum -= 1;
             } else if (elements[tempNum - 1] < tempVal) {
                tempNum = 0;
                break;
             } else if (elements[tempNum - 1] == tempVal) {
                tempNum -= 1;
             }
             totalLoop++;
        }
       }
       System.out.println(totalLoop);
        return elements;
    }

    public static int[] selectionSort(int[] elements) {
        int totalLoop = 0;
        for (int i = 0; i < elements.length; i ++) {
         for (int j = i + 1; j < elements.length; j ++) {
            totalLoop ++;
             if (elements[j] < elements[i]) {
                 int temp = elements[i];
                 elements[i] = elements[j];
                 elements[j] = temp;
             }
         }
        }
        System.out.println(totalLoop);
        return elements;
     }
 

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int tempNum = 0;
        String tempVal = "";
        int totalLoop = 0;
       for (int i = 1; i < words.size(); i++) {
        tempNum = i;
        tempVal = words.get(i);
        while (tempNum > 0) {
            totalLoop ++;
             if (words.get(tempNum - 1).compareTo(tempVal) > 0) {
                words.set(tempNum, words.get(tempNum - 1));
                words.set(tempNum - 1, tempVal);
                tempNum -= 1;
             } else if (words.get(tempNum - 1).compareTo(tempVal) < 0) {
                tempNum = 0;
                break;
             } else if (words.get(tempNum - 1).compareTo(tempVal) == 0) {
                tempNum -= 1;
             }
        }
    }
        System.out.println(totalLoop);
        return words;
    }

    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        int totalLoop = 0;
        for (int i = 0; i < words.size(); i ++) {
            for (int j = i; j < words.size(); j ++) {
               totalLoop++;
                if (words.get(j).compareTo(words.get(i)) < 0 ) {
                    String temp = words.get(i);
                    words.set(i, words.get(j));
                    words.set(j, temp);
                }
            }
           }
           System.out.println(totalLoop);
        return words;
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }


}
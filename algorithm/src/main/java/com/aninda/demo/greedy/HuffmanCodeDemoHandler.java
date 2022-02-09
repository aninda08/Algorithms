package com.aninda.demo.greedy;

import java.util.Arrays;

import com.aninda.greedy.Huffman;

public class HuffmanCodeDemoHandler {
    public static void huffmanCodeDemo() {
        
        try {
            char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
            int[] charFreq = { 5, 9, 12, 13, 16, 45 };

            System.out.println("Characters for huffman code::" + Arrays.toString(charArray));
            System.out.println("Characters frequency::" + Arrays.toString(charFreq));

            Huffman huffman = new Huffman(charArray, charFreq);

            huffman.printCode();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

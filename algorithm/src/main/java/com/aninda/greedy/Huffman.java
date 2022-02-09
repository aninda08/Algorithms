package com.aninda.greedy;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Huffman {
    class HuffmanNode {
        int data;
        char c;

        HuffmanNode left;
        HuffmanNode right;
    }

    class HuffmanNodeComparator implements Comparator<HuffmanNode> {

        @Override
        public int compare(HuffmanNode x, HuffmanNode y) {
            return x.data - y.data;
        }
        
    }

    char[] charArray;
    int[] charFreq;
    HuffmanNode root = null;

    
    public Huffman(char[] charArray, int[] charFreq) {
        this.charArray = charArray;
        this.charFreq = charFreq;
        int n = this.charArray.length;

        PriorityQueue<HuffmanNode> queue = new PriorityQueue<>(n, new HuffmanNodeComparator());

        for (int i = 0; i < n; i++) {
            HuffmanNode node = new HuffmanNode();
            node.data = this.charFreq[i];
            node.c = this.charArray[i];
            node.left = null;
            node.right = null;

            queue.add(node);
        }

        while (queue.size() > 1) {
            HuffmanNode x = queue.peek();
            queue.poll();

            HuffmanNode y = queue.peek();
            queue.poll();

            HuffmanNode f = new HuffmanNode();
            f.data = x.data + y.data;
            f.c = '-';
            f.left = x;
            f.right = y;

            queue.add(f);
        }

        this.root = queue.peek();
    }

    public void printCode() {
        if(this.root == null)
            System.out.println("Please provide char array and their frequency array");
        
        printCode(this.root, "");
    }
    
    public void printCode(HuffmanNode root, String code) {
        if (root.left == null && root.right == null && Character.isLetter(root.c)) {
            System.out.println(root.c + ":" + code);
            return;
        }

        printCode(root.left,code + "0");
        printCode(root.right,code + "1");
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        String[] RANKS = {"first", "second", "third", "fourth"};

        int[] count_of = new int[4];

        for(int k = 0; k < 100; k++) {

            int i = (int) (Math.random() * RANKS.length);
            count_of[i] += 1;
        }

        System.out.println(RANKS[0] + " " + count_of[0] + '\n' + RANKS[1] + " " + count_of[1] + '\n' +
                            RANKS[2] + " " + count_of[2] + '\n' + RANKS[3] + " " + count_of[3] + '\n');
    }

}

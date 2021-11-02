package com.revature;

import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Input Player 1's move:");
        String p1 = myInput.nextLine();
        System.out.println("Input Player 2's move:");
        String p2 = myInput.nextLine();
        System.out.println(JavaProblems.playRPS(p1,p2));
        System.out.println("Input a sentence to pigLatinize:");
        String sentence = myInput.nextLine();
        System.out.println(JavaProblems.pigLatinize(sentence));
    }
}

class JavaProblems {
    public static String playRPS(String p1, String p2) {
        String winner = "No one";
        System.out.println(p1 + " vs " + p2);
        if (p1.equals(p2)) {
            return "TIE";
        }
        if (p1.equals("rock")) {
            if (p2.equals("paper")) {
                winner = "Player 2";
            }
            if (p2.equals("scissors")) {
                winner = "Player 1";
            }
        } else if (p1.equals("paper")) {
            if (p2.equals("rock")) {
                winner = "Player 1";
            }
            if (p2.equals("scissors")) {
                winner = "Player 2";
            }
        } else if (p1.equals("scissors")) {
            if (p2.equals("rock")) {
                winner = "Player 2";
            }
            if (p2.equals("paper")) {
                winner = "Player 1";
            }
        }
        return winner + " wins";
    }

    public static String pigLatinize(String sentence) {
        String[] split = sentence.split(" ");
        char punctuation = split[split.length - 1].charAt(split[split.length - 1].length() - 1);
        if ((int) punctuation < 65) {
            split[split.length - 1] = split[split.length - 1].substring(0, split[split.length - 1].length() - 1);
        } else {
            punctuation = Character.MIN_VALUE;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            char initial = Character.toLowerCase(split[i].charAt(0));
            if (initial == 'a' || initial == 'e' || initial == 'i' || initial == 'o' || initial == 'u') {
                split[i] = split[i] + "way";
            } else {
                split[i] = split[i].substring(1) + initial + "ay";
            }
            if (i == split.length - 1) {
                builder.append(split[i] + punctuation);
            }else if(i == 0){
                builder.append(split[i].substring(0,1).toUpperCase()+split[i].substring(1)+ " ");
            }
            else {
                builder.append(split[i] + " ");
            }
        }
        return builder.toString();
    }
}
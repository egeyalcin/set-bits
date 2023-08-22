package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(eliminateUnsetBits("101010101010101010101010101010101010101010101010101010101010101010"));
    }

    public static long eliminateUnsetBits(String number) {
        char[] charArray = number.replaceAll("0", "").toCharArray();
        long total = 0;
        for(int i = charArray.length - 1; i >= 0;i--) {
            total+=(Character.getNumericValue(charArray[i]) * Math.pow(2,i));
        }
        return total;
    }
}
package com.incedo.verizon.string;

public class CountOccurenceOfParticularCharacterInString {


        public static void main(String[] args) {
                String str="AnandBikashKumarMishra";
                str=str.toLowerCase();
                char[] charArray = str.toCharArray();
                int occurrence = 0;
                char toFind='i';
                for (int i = 0; i < charArray.length; i++) {
                    if (toFind == charArray[i]) {
                        occurrence++;
                    }
                }
                System.out.println("Character "+toFind+" present " +occurrence+ " times");
            }
        }




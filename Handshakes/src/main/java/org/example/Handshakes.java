package org.example;

public class Handshakes {
    public static void main(String[] args) {
        int members = 15;
        System.out.println("количество рукопожатий на мерроприятии " + handshake(members));
   }


    public static int handshake(int members){
        final int handshakes = members * (members - 1) / 2;
        return handshakes;



    }
}
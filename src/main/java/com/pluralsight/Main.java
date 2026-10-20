package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the score string: ");
        String scoreString = scanner.nextLine();
       // String scoreString = "Home:Visitor|30:30";

        String[] tokens = scoreString.split("\\|");
        String namesPart = tokens[0];
        String scoresPart = tokens[1];

        String[] names = namesPart.split(":");
        String homeTeamName = names[0];
        String visitorTeamName = names[1];

        String[] scores = scoresPart.split(":");

        int homeTeamScore = Integer.parseInt(scores[0]) ;
        int visitorTeamScore = Integer.parseInt(scores[1]);


        if( homeTeamScore == visitorTeamScore){
            System.out.println("It's a tie!");
        } else if ( homeTeamScore > visitorTeamScore){
            System.out.println(homeTeamName + " wins!");
        } else if ( visitorTeamScore > homeTeamScore ) {
            System.out.println( visitorTeamName + " wins!");
        }


    }
}

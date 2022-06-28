/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Bosak
 */
public class TriviaNight {
    public static void main(String[] args) {
        //Ask user a series of multiple=choice questions (3 minimum) determine
        //wether or not this is the correct answer
        //Keep a running tally of the number of correct answers, display count at
        //the end of the game
        //BONUS: Include output for each question that tellse the user whether or not the
        //answer was correct along with their current score and number of questions remaining
        
        // 1) Declare variables
        String stringUserAnswer;
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int questionCount = 3;
        
        // 2) Display question to user with multiple choice answers
        // 3) Capture user input and determine wether the answer is correct
        // 4) Add +1 to tally count if correct
        // 5) If answer is correct display tally
        // 6) After each question display number of questions remaining
        System.out.println("It's Lord of the Rings Trivia Night!!! One does not simply 'walk into' trivia  night. Pay your dues peasants!");
        System.out.println("Here we go!!! Answers are case sensitive, please answer in capital letters!");
        
        System.out.println("How many Rings of Power were created?");
        System.out.println("1) 9");
        System.out.println("2) 17");
        System.out.println("3) 11");
        System.out.println("4) 20");
        
        stringUserAnswer = sc.nextLine();
        int userAnswer = Integer.parseInt(stringUserAnswer);
        
        if(userAnswer == 4 ){
            count++;
            questionCount--;
            System.out.println("Correct, your score is now: " + count);
            System.out.println("There are " + questionCount +" questions left");
        }
        
        System.out.println("How old did Bilbo turn during his 'unexpected party'?");
        System.out.println("1) 77");
        System.out.println("2) 85");
        System.out.println("3) 102");
        System.out.println("4) 117");
        
        stringUserAnswer = sc.nextLine();
        
        if(userAnswer == 4 ){
            count++;
            questionCount--;
            System.out.println("Correct, your score is now: " + count);
            System.out.println("There are " + questionCount +" questions left");
        }
        
        System.out.println("Who wields the secret fire of anor?");
        System.out.println("1) Aragorn heir of Isildur");
        System.out.println("2) Gandalf the Gray");
        System.out.println("3) Saruman the White");
        System.out.println("4) Radhaghast the Brown");
        
         stringUserAnswer = sc.nextLine();
        
        if(userAnswer == 2 ){
            count++;
            questionCount--;
            System.out.println("Correct, your score is now: " + count);
        }
        // 7) Display correct answer count at the end of the program
        switch (count) {
            case 0:
                System.out.println(count + "! A for effort! Not really, you're better than this.");
                break;
            case 1:
                System.out.println(count + "! With your wits you can go toe-to-toe with 'A fool of a Took'!");
                break;
            case 2:
                System.out.println(count + "! your intelligence is highly regarded amongst the elves");
                break;
            case 3:
                System.out.println(count + "! The wisdom of the Istari is within in you.");
                break;
        }
    }
}

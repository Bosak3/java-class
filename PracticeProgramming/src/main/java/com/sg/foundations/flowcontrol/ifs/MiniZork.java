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
public class MiniZork {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("You are standing in an open field, to the west is a white house");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("To the East there is an old barn, it is dark inside and the door is halfwawy open.");
        System.out.println("Go to the house? Open the mailbox? Open the barn door? Close the barn door?");
        
        String action = userInput.nextLine();
        
        if (action.equals("open the mailbox")){
               System.out.println("You open the mailbox.");
               System.out.println("It's really dark in there.");
               System.out.println("Look inside or stick your hand in? ");
               action = userInput.nextLine();
               
               if (action.equals("look inside")){
                   System.out.println("You peer inside the mailbox.");
                   System.out.println("It's really very dark. So .. so very dark.");
                   System.out.println("Run away or keep looking? ");
                   action = userInput.nextLine();
                   
                   if (action.equals("keep looking")){
                       System.out.println("Turns out, hangin out around dark places ins't a good idea.");
                       System.out.println("You've been eaten by a grue.");
                   }else if (action.equals("run away")){
                       System.out.println("You run away screaming across the fields - looking very foolish.");
                       System.out.println("But ultimately alive. Wise choice indeed thinks Kruppe.");
                   }
               }else if (action.equals("stick your hand in")){
                   System.out.println("You feel something smooth and hard, in the shape of an oval");
                   System.out.println("As your hand makes contact a faint blue light begins to pulsate from the small object ");
                   System.out.println("You feel warmth trickling through your fingers into the rest of your body");
                   System.out.println("For some reason you get the sensation you now have control over an immense magical power");
                   System.out.println("Use these powers wisely!");
                   
               }
                       
        }else if (action.equals("go to the house")){
            System.out.println("You see eyes peering from behind a half shuttered window");
            System.out.println("The eyes watch unblinking, drawing you in towards the window.");
            System.out.println("Climb up to the window? Throw a rock at the window?");
            action = userInput.nextLine();
            
            if (action.equals("climb up to the window")){
                System.out.println("There is no one there, though the shutter is fully open now");
                System.out.println("You make your way through the window into the upper story of the house");
                System.out.println("The room is dusty and dimly lit, the only source of light coming from outside. You move through the room and open the door to the hallway.");
                System.out.println("The slow creaking of wood fills the hall. You see a rocking chair at the end, moving of its own accord");
                System.out.println("Investigate the chair? Leave through the window?");
                action = userInput.nextLine();
                
                if(action.equals("investigate the chair")){
                    System.out.println("Making your way towards the chair you see the gleam of eyes appear in the dark opening of the adjacent door.");
                    System.out.println("As you approach the chair, the rocking crescendos then is suddenly still. Your gaze travels from the chair to the door. ");
                    System.out.println("A pale face with white eyes and small black pupils peers out at you, a smile on its face.");
                    System.out.println("You feel panick rising in you, unable to move. The door slowly swings open. The face receeding into the darkness.");
                    System.out.println("Calming your nerves you decide it's time to leave. You make your way down the hall and through the window in the room, ");
                    System.out.print("running through the fields and not looking back as you do. Unblinking eyes watch as you go.");
                }else if(action.equals("leave through the window")){
                    System.out.println("Unnerved you make your back out the window and sprint towards the fields away from the house.");
                    System.out.println("A pair of eyes following from above.");
                }
            }else if(action.equals("throw a rock at the window")){
                System.out.println("The rock sails through the window, and you hear the sound of glass crashing to floor");
                System.out.println("You turn and run to the field, hoping no one saw you misbehavin.");
            }
            
            
            
        }else if (action.equals("open the barn door")){
            System.out.println("You approach the barn, as you open the door you hear crying.");
            System.out.println("Listening to the cry, you are uncertain of what it belongs too.");
            System.out.println("Find the source of the cry? Nope outta there?");
            action = userInput.nextLine();
            
            if(action.equals("find the source of the cry")){
                System.out.println("You follow the cry, bringing you to the back of the barn. The silhouette of a dark figure is huddled in the corner to the right of you.");
                System.out.println("As you approach the figure the crying abrubptly stops. A guttural moaning begins to undulate from the dark figure.");
                System.out.println("Taking an involuntary step back from the unnatural sound, you feel the weight of unseen eyes fixated on you.");
                System.out.println("A shrill scream sounds behind you, a sharp pain blooms in the back of your head.... darkness.");
            }else if(action.equals("nope outta there")){
                System.out.println("The cry makes your skin crawl, and feeling a sense of overwhelming dread you decide to turn around and quickly exit the barn.");
                System.out.println("As you begin to close the barn door, an blood covered sinewy hand grabs your arm and pulls you back in.");
            }
        }else if (action.equals("close the barn door")){
            System.out.println("As you approach you hear a soft eery crying come from inside the barn");
            System.out.println("You feel you skin begin to crawl and quickly slam the door shut.");
            System.out.println("You run like the dickens back to the field, out of breath and done with adventures for the day.");
        }
    }
}

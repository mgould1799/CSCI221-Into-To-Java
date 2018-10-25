import java.util.Scanner;
/**
 * Write a description of class GameBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameBoard
{
   int [][] board;
   static int whereAtRow;
   static int whereAtCol;
   public  GameBoard()
   {
       board= new int[3][3];
    }
   
    public static void whereToMove(){
        if(whereAtCol==0)
            System.out.println("You may only move forward or to the right");
        else if(whereAtRow==1)
            System.out.println("You may move forward, left, or right");
        else
            System.out.println("You may move left or forward");
    }
    public static void move(String input)
    {
        
        if(input.equals("forward")&&whereAtRow!=2)
        {
            whereAtRow++;
        }
        else if(input.equals("right")&&whereAtCol!=2)
        {
            whereAtCol++;
        }
        else if(input.equals("left")&&whereAtCol!=0)
        {
            whereAtCol++;
        }
        
    }
    public static void start(String input)
    {
        if(input.equals("left"))
        {
            whereAtRow=0;
            whereAtCol=0;
        }
        else if(input.equals("middle"))
        {
            whereAtRow=0;
            whereAtCol=1;
        }
        else if(input.equals("right"))
        {
            whereAtRow=0;
            whereAtCol=2;
        }
     }
     public static void statementForRooms()
     {
         Scanner keyboard=new Scanner(System.in);
         int response=0;
         if(whereAtRow==0&&whereAtCol==0)
         {
             System.out.println("You have just entered the chamber. You look around and notice that only two doors are available.");
             System.out.println("Treasure is in one corner of the room as well as a monster. What will you do?");
             System.out.println("1. Try to run and escape");
             System.out.println("2. Attack and get the treasure");
             System.out.println("3. Try to grab the treasure and escape");
             System.out.println("Enter your action: ");
             response=keyboard.nextInt();
             if (response==1)
             {
                 System.out.println("You run and manage to escape");
                }
             else if(response==2)
             {
                 double randomNum=Math.random()*1;
                 if(randomNum<.5){
                    System.out.println("You died");
                   
                }
                  else
                    System.out.println("You killed the monster, and you get to move on.");
                }
             else
             {
                  double randomNum=Math.random()*1;
                 if(randomNum<.5){
                    System.out.println("You died");
                    
                }
                  else
                    System.out.println("You mangaged to get the treasure, and you get to move on.");
                }
                
            }
            else if(whereAtRow==0&&whereAtCol==1)
         {
             System.out.println("You have just entered the chamber. You look around and notice that only three doors are available.");
             System.out.println("A figure is in the room. What will you do?");
             System.out.println("1. Move on to the next room");
             System.out.println("2. Attack");
             System.out.println("3. Talk to the figure");
             System.out.println("Enter your action: ");
             response=keyboard.nextInt();
             if (response==1)
             {
                 System.out.println("You ignore the figure and move on to the next room");
                }
             else if(response==2)
             {
                 double randomNum=Math.random()*1;
                 if(randomNum<.5)
                    System.out.println("You died because the figure attacked you back");
                  else
                    System.out.println("You killed the mysterious figure, and you get to move on. However, you will never find out his information.");
                   
                }
             else
             {
                  System.out.println("The man tells you that this is a dangerous adventure you are on and wishes you luck.");
                  System.out.println("You get to move on to the next room.");
                }
            }
            else if(whereAtRow==0&&whereAtCol==2)
         {
             System.out.println("You have just entered the chamber. You look around and notice that only two doors are available.");
             System.out.println("Nothing appears to be really in the room. What will you do?");
             System.out.println("1. Move on to the next room");
             System.out.println("2. Look around");
             System.out.println("Enter your action: ");
             response=keyboard.nextInt();
             if (response==1)
             {
                 System.out.println("Move forward");
                }
             
             else
             {
                  System.out.println("You look around and see nothing interesting as thought before. You move on to your next room.");
                }
             
            }
         else if(whereAtRow==1&&whereAtCol==0)
         {
            }
         else if(whereAtRow==1&&whereAtCol==1)
         {
            }
         else if(whereAtRow==1&&whereAtCol==2)
         {
            }
         else if(whereAtRow==2&&whereAtCol==0)
         {
            }
         else if(whereAtRow==2&&whereAtCol==1)
         {
            }
         else if(whereAtRow==2&&whereAtCol==2)
         {
            }
            
            }
      public static void play()
      {
          Scanner keyboard=new Scanner(System.in);
          GameBoard board= new GameBoard();
          System.out.println("Would you like to start in the left, right, or middle?");
          String response = keyboard.next();
          start(response);
          boolean run=false;
          while(run!=true){
              if((whereAtRow==3 || whereAtCol==3))
                run=true;
              statementForRooms();
              whereToMove();
              System.out.println("Which way shall you travel next?");
              String move=keyboard.next();
              move(move);
              statementForRooms();
              
          
        }
        }    
      public static void main(String[] args)
      {
          play();
          
        }
     }
   


import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("!!! WELCOME TO NUMBER GUESSING GAME !!!");
    System.out.println("GAME RULES ARE GIVEN BELOW:");
    System.out.println("1.YOU NEED TO GUESS A RANDOM NUMBER");
    System.out.println("2.YOU HAVE 5 CHANCES");
    System.out.println("3.FOR EACH CORRECT GUESS YOU WILL BE GIVEN 10 POINTS");
    System.out.println("3.IF YOU HAVE GUESSED THE NUMBER CORRECTLY THEN YOU WILL ADVANCE TO NEXT LEVEL");
    System.out.println("YOU NEED TO ENTER A NUMBER BETWEEN 1 TO 200");
    System.out.println("YOU HAVE 5 LEVELS");
    Random rand=new Random();
    int chances=5;
    int level=1;
    int score=0;
    int flag=0;
    System.out.println("LET'S BEGIN THE GAME");
    for(int i=1;i<=5;i++)
      {
         flag=0;
        int random_num=rand.nextInt(200)+1;
        System.out.println();
        System.out.println("LEVEL:"+i);
        int x=1;
        for(int j=1;j<=chances;j++)
          {
            System.out.println("CHANCE:"+ x++ +"\n");
            int num1=in.nextInt();
            if(num1>random_num)
              System.out.println("HINT:ENTER A SMALLER NUMBER");
            else if(num1<random_num)
              System.out.println("HINT:ENTER A LARGER NUMBER");
            else
            {
              if(num1==random_num)
              {
                score+=10;
                System.out.println("YOU GUESSED CORRECTLY !!!! KEEP GOING");
                if(i!=5)
                {
                  System.out.println("CONGRATS..!! YOU HAVE ADVANCED TO "+(i+1)+" LEVEL");
                }
                else{
                  System.out.println("YOU HAVE COMPLETED ALL THE LEVELS..!!!");
                  System.out.println("CONGRATS ON WINNING THE GAME...!!!!");
                }
                flag=1;
                break;
              }
            }
          }
        if(flag==0)
        {
          System.out.println("YOU LOST THE GAME :(");
          System.out.println("TRY PLAYING FROM THE BEGINNING");
          break;
        }
      }
    System.out.println("\n YOUR SCORE IS:"+score);
    System.out.println("THANKS FOR PLAYING THUS GAME..!!");
  }
}
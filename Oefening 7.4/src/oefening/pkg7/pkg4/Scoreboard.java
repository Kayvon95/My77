package oefening.pkg7.pkg4;

public class Scoreboard {
    private Teller score1, score2;
    
    public Scoreboard(){
       score1 = new Teller();
       score2 = new Teller();
    }
       public void verhoogScore1(){
           score1.verhoog();
       }
       public void verlaagScore1(){
           score1.verlaag();
       }
       public void verhoogScore2(){
           score2.verhoog();
       }
       public void verlaagScore2(){
           score2.verlaag();
       }
    
       public void print(){
           System.out.println("De score is: " + score1.getWaarde() + " - " + score2.getWaarde() + "." );
       } 
    
    
    
    }


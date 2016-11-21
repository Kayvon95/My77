package oefening77;

import java.util.ArrayList;


public class Student {
    private String naam;
    private String geboorteDatum;
//    private Tentamenresultaat tentamenResultaat;
    private ArrayList<Tentamenresultaat> lijst;
    
    public Student(String naam, String geboorteDatum){
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
        
        this.lijst = new ArrayList<>();
    }
    
        public void voegToe(Tentamenresultaat tentamenresultaat){
            lijst.add(tentamenresultaat);
    }
       
        public void printResult(){
            for(Tentamenresultaat x: lijst){
                System.out.println(x);
            }
        }
    
 //   public String toString(){
   //     return String.format( "Naam: %-20s Geboortedatum: %-20s", naam, geboorteDatum);    
    //}


}


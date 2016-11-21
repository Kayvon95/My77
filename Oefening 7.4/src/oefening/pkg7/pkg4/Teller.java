package oefening.pkg7.pkg4;

public class Teller {
    private int waarde;
    
    public void verhoog(){
        waarde++;
    }
    
    public void verlaag(){
        waarde--;
    }
    
    public void setWaarde(int waarde){
        this.waarde =  waarde;
    }
    
    public int getWaarde(){
        return waarde;
    }
}

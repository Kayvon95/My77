package oefening77;


public class Tentamenresultaat {
    private String vak;
    private Double cijfer;
    private String datum;
    
    public Tentamenresultaat(String vak, Double cijfer, String datum){
        this.vak = vak;
        this.cijfer = cijfer;
        this.datum = datum;
    }
    
    public double getCijfer(){
        this.cijfer = cijfer;
        return cijfer;
    }
    
    public String toString(){
        return String.format( "  Vak: %-40s  Cijfer: %4.1f  Datum: %-12s" , vak, cijfer, datum );
    }
   
}

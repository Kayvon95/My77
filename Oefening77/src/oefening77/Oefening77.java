
package oefening77;

public class Oefening77 {

    public static void main(String[] args) {
       
        Administratie administratie = new Administratie();
        
        administratie.voegToe(new Student("Kayvon Rahimi, ", "20-05-1995"));
        administratie.addResult(0, new Tentamenresultaat("Engels", 9.2, "10-10-2016"));
        administratie.addResult(0, new Tentamenresultaat("Niet engels", 9.2, "01-10-2016"));

        administratie.voegToe(new Student("Kay2 Rahimi, ", "20-05-1996"));
        administratie.addResult(1, new Tentamenresultaat("Engels", 9.2, "10-10-2016"));
        administratie.addResult(1, new Tentamenresultaat("Niet engels", 6.2, "01-10-2016"));
    
    System.out.println("Overzicht studenten:");
    administratie.printStudenten();
    }
    
//GITwijziging    
}

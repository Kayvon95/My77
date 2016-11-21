package oefening77;

import java.util.ArrayList;

public class Administratie {
    private ArrayList<Student> lijst;
    
    public Administratie(){
    lijst = new ArrayList<Student>();
 }
    
    public void voegToe(Student student){
        lijst.add(student);
    }
    
    public Student getStudent(int i){
        return lijst.get(i);
    }
    
    public void addResult(int i, Tentamenresultaat x){
        lijst.get(i).voegToe(x);
    }
    
    public void printStudenten(){
        
        for(Student student: lijst){
            System.out.println(student);
            student.printResult();
            System.out.println();
        };
    }
}



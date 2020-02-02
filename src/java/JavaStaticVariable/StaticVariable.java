
package JavaStaticVariable;

public class StaticVariable {
    
    String institute = "Wan";
    int rollno;
    String name;
    

    public StaticVariable(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    
    void display(){
        System.out.println(name + " " + institute + " " + rollno );
    }
    public static void main(String[] args) {
        
        StaticVariable sv1 = new StaticVariable(1, "Sornolota IT");
        StaticVariable sv2 = new StaticVariable(2, "Portfolio");
        
        sv1.display();
        sv2.display();
    }
}

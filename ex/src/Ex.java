
public class Ex {
    static int a;
    Ex(int b) {
        a=b;
    }
    
    void display() {
        //Ex e1 = new Ex();
        //System.out.println(a);
    }
    public static void main(String[] args) {
       Ex e = new Ex(1);
        System.out.println(a);
        //e.display();
    }
    
}

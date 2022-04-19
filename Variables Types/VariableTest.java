public class VariableTest { 
    int a=10;
    static int b= 20;
    
    public static void main(String[] args) {
        VariableTest vs = new VariableTest();
        System.out.println(vs.a);
        System.out.println(vs.b);

        vs.a = 100;
        vs.b=200;
        System.out.println(vs.a);
        System.out.println(vs.b);

        VariableTest vs1 = new VariableTest();
        System.out.println(vs1.a);
        System.out.println(vs1.b);
        vs1.b = 2000;

        VariableTest vs2 = new VariableTest();
        System.out.println(vs2.a);
        System.out.println(vs2.b);

        
    }
    
}

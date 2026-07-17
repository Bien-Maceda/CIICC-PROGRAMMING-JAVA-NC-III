package chapter1;

public class Instance {
    Instance(){
        code = 0;
    }
    int code =1;
    {
        System.out.println(code);
    }
    public static void main(String[] args) {
        Instance ini = new Instance();
        
        System.out.println(ini.code);
        {   
            // int b = 1;
            System.out.println("feathers");
        }
        // System.out.println(b);
    }
    
    {
        System.out.println("Snowy");
        code = 214234234;
        System.out.println(code);
    }
    
}
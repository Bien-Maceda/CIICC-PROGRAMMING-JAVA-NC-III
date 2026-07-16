package chapter1;

public class InstanceLesson {
    InstanceLesson(){
        code = 0;
    }
    int code =1;
    {
        System.out.println(code);
    }
    public static void main(String[] args) {
        InstanceLesson ini = new InstanceLesson();
        
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
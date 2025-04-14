import java.util.StringTokenizer;
public class stringss1 {
    public static void main(String[] args) {
        StringBuffer greeting = new StringBuffer("Hello, World!");
        System.out.println(greeting);
        greeting.append(" java");
        System.out.println(greeting);
        greeting.insert(7 , "Java ");
        System.out.println(greeting);
        greeting.delete(7, 11);
        System.out.println(greeting);
        greeting.deleteCharAt(7);
        System.out.println(greeting);
        greeting.reverse();
        System.out.println(greeting);
        greeting.append(" java");
        System.out.println(greeting);
        greeting.replace(4,6,"Java");
        System.out.println(greeting);



        //string tokenizer
        StringTokenizer st = new StringTokenizer("methodist college of engineering and technology");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
 
 
 
         
        }    
          

}
}

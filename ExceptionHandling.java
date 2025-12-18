public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int n1=20;
            int n2=0;
            System.out.println(n1/n2);
        }
        catch(ArithmeticException e){
e.printStackTrace();

        }
        finally{
            System.out.println("finally executed successfully");
        }
    }
}

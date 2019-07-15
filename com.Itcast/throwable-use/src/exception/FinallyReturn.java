package exception;

public class FinallyReturn {

    public static void main(String[] args) {
        System.out.println(getA());
//        System.out.println("good");
    }

    public static int getA(){
        int a = 10;
        try{
            return a;
        }catch (Exception e){
            System.out.println(e);
        }finally {
            a = 100;
            return a;
        }
    }

}

public class Outer4Final {

    public void methodOuter(){
        int num = 10; // effective and final, potentially with "final" posix
//        num = 20;

        class MyInner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }


}

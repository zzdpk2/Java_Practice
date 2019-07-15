package exception.other;

public class Fu {

    public void show01() throws NullPointerException, ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04(){}


}

class Zi extends Fu{

    public void show01() throws NullPointerException, ClassCastException{}

    public void show02() throws ArrayIndexOutOfBoundsException {}

    public void show03(){}

    public void show04(){
        try {
            throw new Exception("Compiling Error!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
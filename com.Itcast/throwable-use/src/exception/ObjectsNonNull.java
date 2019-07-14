package exception;

import java.util.Objects;

public class ObjectsNonNull {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object obj){

//        if(obj == null) throw new NullPointerException("obj is null");
//        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj, "obj is null");
    }
}

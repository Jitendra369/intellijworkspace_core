package generic.secondexample;

public class MyGenericClass<T> {

    T object;

    MyGenericClass(T object){
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void displayObjectDetails(){
        System.out.println("type of object "+ object.getClass().getName());
    }
}

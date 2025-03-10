package Generics;

public interface Demo3<T> {

    void area(T r);

    T getRadius();
}

class InnerDemo3 implements Demo3<Double>{
    private Double r;
    @Override
    public void area(Double r) {
        this.r = r;
    }
    @Override
    public Double getRadius() {
        return r;
    }

    // @Override
    // public void area(Object r) {
    //     this.r = r;
    // }

    // @Override
    // public Object getRadius() {
    //     return null;
    // }    
}

class GenericDemo3<T> implements Demo3<T> {

    private T r;

    @Override
    public void area(T r) {
        this.r = r;
    }

    @Override
    public T getRadius() {
        return r;
    }
}
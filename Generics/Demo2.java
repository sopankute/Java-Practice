package Generics;

public class Demo2<K, V> {

    private K key;

    private V value;


    public Demo2(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

}

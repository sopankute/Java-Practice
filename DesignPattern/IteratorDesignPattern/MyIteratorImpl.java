package IteratorDesignPattern;

import java.util.List;

public class MyIteratorImpl implements MyIterator {

    private List<User> userList;
    private int length;
    private int position=0;

    public MyIteratorImpl(List<User> list) {
        this.userList = list;
        this.length = list.size();
    }

    @Override
    public boolean hasNext() {
        return position < length;
    }

    @Override
    public Object next() {
        User user = userList.get(position);
        position++;
        return user;
    }
}

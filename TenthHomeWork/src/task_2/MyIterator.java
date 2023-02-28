package task_2;

import collection.CollectionImpl;

import java.util.Iterator;

public class MyIterator implements Iterator {
    private CollectionImpl collection;
    int index = 0;

    public MyIterator(CollectionImpl collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.size() ;
    }

    @Override
    public Object next() {
        return collection.get(index++);
    }

}


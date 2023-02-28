package task_2;

import collection.CollectionImpl;

import java.util.Iterator;

public class Run {
    public static void main(String[] args) {
        CollectionImpl collection = new CollectionImpl(5);
        System.out.println("Начальный массив: " + collection);
        collection.add("Меня зовут Женя");
        collection.add("Я студент");
        collection.add("12345");
        collection.add("12345");
        collection.add("12345");
        collection.add("ggg");
        collection.add("ggg");
        System.out.println("------------------------------");
        MyIterator iterator = new MyIterator(collection);

        while(iterator.hasNext()){
            String i = (String) iterator.next();
            System.out.println(i);
        }
        System.out.println("-----------------------");
        System.out.println(DeleteDuplicates.removeDuplicates(collection));
    }
}

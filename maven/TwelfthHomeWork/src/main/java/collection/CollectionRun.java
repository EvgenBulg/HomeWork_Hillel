package collection;

public class CollectionRun {
    public static void main(String[] args) {
        CollectionImpl collection = new CollectionImpl(5);
        System.out.println("Начальный массив: " + collection);
        collection.add(null);
        collection.add("Меня зовут Женя");
        collection.add("Я студент");
        collection.add("12345");
        collection.add("ggg");
        System.out.println(collection);
        collection.delete("123авс");
        System.out.println(collection);
        collection.delete("12345");
        System.out.println(collection);
        collection.add("99999");
        System.out.println(collection);
        collection.add(10,"привет");
        System.out.println(collection);
        collection.add(2,"кря-кря");
        System.out.println(collection);
        collection.add(2,"777");
        System.out.println(collection);
        collection.delete("кря-кря");
        System.out.println(collection);

        System.out.println("Элемент под индексом 2: " + collection.get(2));
        System.out.println("Элемент под индексом 5: " + collection.get(5));
        System.out.println("Элемент под индексом 7: " + collection.get(7));
        System.out.println("Элемент под индексом 10: " + collection.get(10));

        collection.contain("кря");
        collection.contain("при");
        collection.contain("Прив");
        collection.contain("Я студент");

        System.out.println("-----------------------------------------");
        CollectionImpl collection2 = new CollectionImpl(new String[]{"1", "2", "3", "4", "5", "6"});
        System.out.println(collection.equals(collection2));
        System.out.println("-----------------------------------------");
        CollectionImpl collection3 = new CollectionImpl(new String[]{"Меня зовут Женя", "Я студент", "777", "ggg", "99999", "привет"});
        System.out.println(collection.equals(collection3));
        System.out.println("-----------------------------------------");
        CollectionImpl collection4 = new CollectionImpl(new String[]{"Меня зовут ЕГОР", "Я НЕ студент", "777", "ggg", "99999", "привет"});
        System.out.println(collection.equals(collection4));
        System.out.println("-----------------------------------------");

        collection.delete("Меня зовут Женя");
        System.out.println(collection);

        System.out.println("-----------------------------------------");
        CollectionImpl collection5 = new CollectionImpl(new String[]{"Я студент", "777", "ggg", "99999", "привет"});
        System.out.println(collection.equals(collection5));
        System.out.println("-----------------------------------------");

        collection.size();

        collection.clear();
        System.out.println(collection);

        collection.size();
    }
}

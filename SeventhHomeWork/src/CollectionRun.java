import java.util.Arrays;

public class CollectionRun {
    public static void main(String[] args) {
        CollectionServiceImpl collectionService = new CollectionServiceImpl(5);
        System.out.println("Начальный массив: " + collectionService);
        collectionService.add("111");
        collectionService.add("222");
        collectionService.add("333");
        collectionService.add("ggg");
        System.out.println(collectionService);

        collectionService.add("aaa");
        System.out.println(collectionService);

        collectionService.add("hhh");
        System.out.println(collectionService);

        collectionService.delete("333");
        System.out.println(collectionService);

        collectionService.delete(2);
        System.out.println(collectionService);

        collectionService.add("ttt");
        System.out.println(collectionService);

        collectionService.add(3, "PPP");
        System.out.println(collectionService);

        collectionService.add(15, "KKK");
        System.out.println(collectionService);

        collectionService.add(15, "YYY");
        System.out.println(collectionService);

        collectionService.add("rrr");
        System.out.println(collectionService);

        collectionService.delete("PPP");
        System.out.println(collectionService);

        collectionService.delete(3);
        System.out.println(collectionService);

        collectionService.get(8);
        collectionService.get(2);
        collectionService.get(13);






    }
}

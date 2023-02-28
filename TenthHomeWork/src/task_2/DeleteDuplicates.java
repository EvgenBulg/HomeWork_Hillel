package task_2;

import collection.CollectionImpl;
import java.util.HashSet;

public class DeleteDuplicates {
    public static HashSet removeDuplicates(CollectionImpl collection) {
        HashSet <String> hashSet = new HashSet<String>();
        for (int i = 0; i < collection.size(); i++) {
            hashSet.add(collection.get(i));
        }
        return hashSet;
    }
}

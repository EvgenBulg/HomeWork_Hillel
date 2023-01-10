public interface Collection {
    //Add element to next empty position in array.
    boolean add(String o);

    //Add element by index in array.
    //if the index is greater of arrays' size or index is greater of amount of filled cells plus one
    //then we add element to next empty position in array.
    boolean add(int index, String o);

    //Delete element by value.
    //Deletion is performed if an element with that value exists in the array and only one element is remove.
    boolean delete (String o);

    //Return and show an element by index.
    String get(int index);

    //Check if a substring contains in a string.
    boolean contain(String o);

    //Check if two collections (all elements) are equal or not.
    boolean equals (Collection str);

    //Remove all elements from a collection.
    boolean clear();

    //Return the number of elements added to the collection.
    int size();
}

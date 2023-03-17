package collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionImplTest {

    @Test
    void add() {
        CollectionImpl collection = new CollectionImpl(2);

        Assertions.assertFalse(collection.add(null));
        Assertions.assertNull(collection.get(0));
        Assertions.assertEquals(0, collection.size());

        Assertions.assertTrue(collection.add("asd123"));
        Assertions.assertNotNull(collection.get(0));
        Assertions.assertEquals(1, collection.size());
        Assertions.assertEquals("asd123", collection.get(0));

        Assertions.assertTrue(collection.add("qwe"));
        Assertions.assertTrue(collection.add("asd"));
        Assertions.assertTrue(collection.add("zxc"));
        Assertions.assertEquals(4, collection.size());
        Assertions.assertEquals("zxc", collection.get(3));
        Assertions.assertEquals(null, collection.get(5));
    }

    @Test
    void testAdd() {
        CollectionImpl collection = new CollectionImpl(5);

        Assertions.assertFalse(collection.add(3, null));
        Assertions.assertFalse(collection.add(7, null));
        Assertions.assertFalse(collection.add(-5, "asd"));
        Assertions.assertNull(collection.get(0));
        Assertions.assertEquals(0, collection.size());

        Assertions.assertTrue(collection.add(3, "aaa"));
        Assertions.assertNotNull(collection.get(0));
        Assertions.assertEquals(1, collection.size());
        Assertions.assertEquals("aaa", collection.get(0));

        Assertions.assertTrue(collection.add(3, "bbb"));
        Assertions.assertNotNull(collection.get(0));
        Assertions.assertNotNull(collection.get(1));
        Assertions.assertEquals(2, collection.size());
        Assertions.assertEquals("bbb", collection.get(1));

        Assertions.assertTrue(collection.add(7, "ccc"));
        Assertions.assertEquals(3, collection.size());
        Assertions.assertEquals("ccc", collection.get(2));

        Assertions.assertTrue(collection.add(1, "qwe"));
        Assertions.assertEquals(4, collection.size());
        Assertions.assertEquals("qwe", collection.get(1));
    }

    @Test
    void delete() {
        CollectionImpl collection = new CollectionImpl(new String[]{"qwe", "rrr", "zxc", "ppp"});
        Assertions.assertTrue(collection.delete("xxx"));
        Assertions.assertEquals(4, collection.size());

        Assertions.assertTrue(collection.delete("zxc"));
        Assertions.assertEquals(3, collection.size());
        Assertions.assertNull(collection.get(3));

        Assertions.assertTrue(collection.delete("zxc"));
        Assertions.assertEquals(3, collection.size());
        Assertions.assertNull(collection.get(3));
    }



    @ParameterizedTest
    @ValueSource( ints = {0,1,2,3,4})
    void get(int index) {
        String[] str = new String[]{"0", "1", "2", "3", "4"};
        CollectionImpl collection = new CollectionImpl(str);

        Assertions.assertEquals(str[index], collection.get(index));
    }

    //other way
    @Test
    void get(){
        CollectionImpl collection = new CollectionImpl(new String[]{"a", "b", "c", "d", "e"});
        Assertions.assertEquals("a", collection.get(0));
        Assertions.assertEquals("b", collection.get(1));
        Assertions.assertEquals("c", collection.get(2));
        Assertions.assertEquals("d", collection.get(3));
        Assertions.assertEquals("e", collection.get(4));
        Assertions.assertNull(collection.get(5));

        Assertions.assertNotEquals("c", collection.get(0));
        Assertions.assertNotEquals("123", collection.get(4));
        Assertions.assertNotEquals("123", collection.get(4));
        Assertions.assertNotEquals("a", collection.get(10));

        collection.add(2, "qwe");
        Assertions.assertEquals("a", collection.get(0));
        Assertions.assertEquals("b", collection.get(1));
        Assertions.assertEquals("qwe", collection.get(2));
        Assertions.assertEquals("c", collection.get(3));
        Assertions.assertEquals("d", collection.get(4));
        Assertions.assertEquals("e", collection.get(5));
        Assertions.assertNull(collection.get(6));

        collection.delete("b");
        Assertions.assertEquals("a", collection.get(0));
        Assertions.assertEquals("qwe", collection.get(1));
        Assertions.assertEquals("c", collection.get(2));
        Assertions.assertEquals("d", collection.get(3));
        Assertions.assertEquals("e", collection.get(4));
        Assertions.assertNull(collection.get(5));
    }

    @Test
    void contain() {
        CollectionImpl collection = new CollectionImpl(new String[]{"asd123", "привет", "пока", "12345", "qwe"});
        Assertions.assertTrue(collection.contain("при"));
        Assertions.assertTrue(collection.contain("asd123"));
        Assertions.assertTrue(collection.contain("ок"));
        Assertions.assertTrue(collection.contain("12345"));
        Assertions.assertTrue(collection.contain("qwe"));

        Assertions.assertFalse(collection.contain("ПОка"));
        Assertions.assertFalse(collection.contain("vvgaacssacs"));
        Assertions.assertFalse(collection.contain("    asd123"));
    }

    @Test
    void testEquals() {
        CollectionImpl collection1 = new CollectionImpl(new String[]{"asd123", "привет", "пока", "12345", "qwe"});
        CollectionImpl collection2 = new CollectionImpl(new String[]{"asd123", "привет", "пока", "12345", "qwe"});
        CollectionImpl collection3 = new CollectionImpl(new String[]{"qwe", "rty", "asd", "zxc", "qwe"});

        Assertions.assertTrue(collection1.equals(collection2));
        Assertions.assertTrue(collection2.equals(collection1));

        Assertions.assertFalse(collection1.equals(collection3));
        Assertions.assertFalse(collection2.equals(collection3));

        Assertions.assertFalse(collection3.equals(collection1));
        Assertions.assertFalse(collection3.equals(collection2));
    }

    @Test
    void clear() {
        CollectionImpl collection = new CollectionImpl(new String[]{"asd123", "привет", "пока", "12345", "qwe"});
        Assertions.assertNotNull(collection.size());
        Assertions.assertTrue(collection.clear());
        //Assertions.assertNull(collection.size());
        Assertions.assertEquals(0, collection.size());
        Assertions.assertNotEquals(5, collection.size());

    }

    @Test
    void size() {
        CollectionImpl collection = new CollectionImpl(new String[]{"asd123", "привет", "пока"});
        Assertions.assertEquals(3, collection.size());

        collection.add("123");
        collection.add("234");
        collection.add("345");
        Assertions.assertNotEquals(3, collection.size());
        Assertions.assertEquals(6, collection.size());

        collection.delete("123");
        Assertions.assertEquals(5, collection.size());
        Assertions.assertNotEquals(6, collection.size());

        collection.clear();
        Assertions.assertEquals(0, collection.size());
        Assertions.assertNotEquals(5, collection.size());
    }

}
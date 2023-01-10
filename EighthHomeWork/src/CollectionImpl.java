import java.util.Arrays;

public class CollectionImpl implements Collection{
    private String[] array;
    private int size = 0;

//first way
    public CollectionImpl(int capacity){
        this.array = new String[capacity];
    }
//second way
    public CollectionImpl(String[] array) {
        this.array = array;
        this.size = array.length;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Collection: " + Arrays.toString(array) +
                ",  size = " + size + ";\n";
    }


    @Override
    public boolean add(String o) {
        if(o==null){
            return false;
        }

        if(size==array.length){
            increaseArray();
        }
        System.out.println("Вы добавили элемент '" + o + "'. ");
        array[size++] = o;
        return true;
    }

    @Override
    public boolean add(int index, String o) {
        if (index < 0 || o == null){
            return false;
        }
        if (size == array.length){
            increaseArray();
        }
        if(index>=size){
            System.out.println("Вы добавили элемент '" + o + "'. Т.к. index (" + index + ") >= кол-ва элементов (size) || index > емкости массива, элемент добавл. на след. пустую позицию.");
            array[size++] = o;
        } else {
            int counter = array.length-1;
            while (counter>index){
                array[counter] = array[counter-1];
                counter--;
            }
            System.out.println("Вы добавили элемент '" + o + "' на позицию с индексом " + index);
            array[index] = o;
            size++;
        }
        return true;
    }

    @Override
    public boolean delete(String o) {
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if(o.equals(array[i])){
                array[i]=null;
                for (int j = i; j < array.length-1; j++) {
                    array[j] = array[j+1];
                }
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("Вы удалили элемент со значением '" + o + "'.\n");
            array[array.length-1]=null;
            size--;
        }
        else{
            System.out.println("Элемент со значением '" + o + "' отсутствует в коллекции. Операция по удалению НЕ выполнена.\n");
        }
        return true;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= array.length) {
            return null;
        }
        //System.out.print("\nЭлемент с индексом " + index + " = " + array[index]);
        return array[index];
    }

    @Override
    public boolean contain(String o) {
        for (int i = 0; i < size; i++) {
            String arrayToString = array[i];
            boolean flag = false;

            for (int j = 0; j <= arrayToString.length() - o.length(); j++){
                int count = 0;
                for (int k = 0; k < o.length(); k++) {
                    if (arrayToString.charAt(k + j) != o.charAt(k)) {
                        break;
                    }
                    else{
                        count++;
                    }

                    if(count==o.length()){
                        flag=true;
                    }
                }
            }
        if(flag){
            System.out.println("\nПодстрока '" + o + "' содержится в array[" + i + "] = " + arrayToString);
            }
        }

        return true;
    }

    @Override
    public boolean equals(Collection str) {
        int count = 0;
        if(str.size()==size){
            for (int i = 0; i < size; i++) {
                if (array[i].equals(str.get(i))){
                    count++;
                }
            }
            if(count==size){
                System.out.println(toString() + "IS equals\n" + str.toString());
                return true;
            }
            else{
                System.out.println(toString() + "IS NOT equals\n" + str.toString());
                return false;
            }
        }
        else
        {
            System.out.println(toString() + "IS NOT equals\n" + str.toString());
            return false;
        }

    }

    @Override
    public boolean clear() {
        for (int i = 0; i < array.length; i++) {
            array[i]=null;
        }
        size=0;
        System.out.println("\nКоллекция очищена.");
        return true;
    }

    @Override
    public int size() {
        System.out.print("Количество добавленных элементов (size) = " + size + "\n");
        return size;
    }

    //увеличить массив на 60%
    public String[] increaseArray (){
        String[] temp = new String[(int)(array.length*(1.6))];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
        return array;
    }
}

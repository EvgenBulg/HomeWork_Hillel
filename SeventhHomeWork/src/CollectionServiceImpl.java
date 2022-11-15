import java.util.Arrays;
import java.util.Objects;

public class CollectionServiceImpl implements Collection{
    private String[] array;
    private int count = 0;

    public CollectionServiceImpl(int capacity) {
        this.array = new String[capacity];
        //this.capacity = capacity;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "\narray = " + Arrays.toString(array) + ", count=" + count + '}';
    }

    @Override
    public boolean add(int index, String value) {
        if(index<0){
            return false;
        }

        System.out.println("\nВы добавили элемент '" + value + "' на " + index + " позицию.");

        if(count==array.length) {
            increaseArray();
        }
        while (array.length<=index){
            increaseArray();
        }

        int size = array.length-1;
        while (size>index){
        array[size] = array[size-1];
        size--;
        }

        array[index] = value;
        count++;
        return true;
    }

    @Override
    public boolean add(String value) {
        System.out.println("\nВы добавили элемент '" + value + "'. ");
        if(count==array.length){
            increaseArray();
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null){
                array[i] = value;
                count++;
                break;
            }
        }
        return true;
    }

    @Override
    public boolean delete(int index) {
        if(index>=count || index<0){
            System.out.println("\nОШИБКА УДАЛЕНИЯ! (Т.к. индекс = " + index + "). Эл. с таким индексом и так = null");
            return false;
        }
        else{
            System.out.println("\nВы удалили элемент за индексом " + index + ".");

            if(array[index] != null){
                for (int i = index; i < array.length-1; i++) {
                    array[i] = array[i+1];
                }
                array[array.length-1]=null;
                count--;
            }
        }
        return true;
    }

    @Override
    public boolean delete(String value) {
        boolean flag = false;
        for (int i = 0; i < array.length; i++)
            if (Objects.equals(array[i],value)) {
                //array[i]=null;
                for (int j = i; j < array.length-1; j++) {
                    array[j] = array[j+1];
                }
                flag = true;
                break;
            }
        if(flag){
            System.out.println("\nВы удалили элемент со значением '" + value + "'.");
            array[array.length-1]=null;
            count--;
        }
        return true;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= array.length) {
            return null;
        }
        System.out.print("\nЭлемент с индексом " + index + " = " + array[index]);
        return array[index];

    }


    public String[] increaseArray(){
        String[] temp = new String[array.length*2];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
        return array;
    }
}

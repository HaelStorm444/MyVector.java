import java.util.Arrays;
import java.util.Objects;
public class MyVector<E> extends MyAbstractList<E> implements MyList<E>{
    E[] array;
    int size, increment;

    @SuppressWarnings("unchecked")
    public MyVector() {
        array = (E[]) new Object[10];
        size = 0;
        increment = 0;
    }
    @SuppressWarnings("unchecked")
    public MyVector(int initialCap) {
        array = (E[]) new Object[initialCap];
        size = 0;
        increment = 5;
    }
    @SuppressWarnings("unchecked")
    public MyVector(int initialCap, int incrementCap){
        array = (E[])new Object[initialCap];
        size = 0;
        increment = incrementCap;

    }



    public int getCapacity() {
        return array.length;


    }

    public int getIncrement() {
        return increment;


    }

    @Override
    public boolean add(E data) {
      return add(size(),data);
    }

    @Override
    public boolean add(int index, E data) throws IndexOutOfBoundsException {

            for (int i = size() - 1; i >= index; i--) {
                array[i + 1] = array[i];
            }
                array[index] = data;
                size+=1;
        return true;
    }


    @Override
    public void clear() {
     //  int cap = getCapacity();
     //   array = (E[])new Object[cap];
      //  size = 0;
        for (int i = 0; i < size; i++){
            array[i] = null;
        }
        size = 0;

    }




    @Override
    public Object get(int index) {
         return array[index];
    }



    public String toString(){
        String strArray = "[";
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                strArray += array[i] + "]";
            } else {
                strArray += array[i] + ", ";
            }
        }
        return strArray;

    }




    public boolean isEmpty() {

            return size == 0;

    }


    public int size() {
        return super.size;
    }

    @Override
    public E remove(int index) {
        E data = array[index];
        for (int i = index; i < size() - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size() - 1] = null;
        size-=1;

        return data;
    }


    @Override
    public void trimToSize() {
             if(size < getCapacity()){
                 array = Arrays.copyOf(array,size);
             }

         }

        }



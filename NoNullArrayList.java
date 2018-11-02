import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }


  public NoNullArrayList(int StartingCapacity){
    super(StartingCapacity);
  }


  public boolean add(E element){
    E[] arr = new E[arr.length + 1];
    ArrPlus[arr.length - 1] = element;
    return true;
  }


  public E set(int index, E element){
    oldEl = arr[index]
    if(index > arr.length){
      throw new IndexOutOfBoundException;
    }
    arr[index] = element;
    System.out.println(oldEl);
    }
  }
}

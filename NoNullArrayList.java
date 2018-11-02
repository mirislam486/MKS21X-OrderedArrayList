import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }


  public NoNullArrayList(int StarttingCapacity){
    super(StarttingCapacity);
  }


  public boolean add(E element){
    E[] arr = new E[arr.length + 1];
    ArrPlus[arr.length - 1] = element;
    return true;
  }
}

package GenericsInJava;

public class CustomArrayList<T> {

    // Other than Primitive type data types , We have to Use " Object " to replace " T " .
    Object[] data ;

    public static final int default_size = 10 ;

    public static int size ;

    CustomArrayList(){

        data = new Object[default_size];

        size = 0 ;
    }

    protected void add(int value ){

        if(isFull()){
            resize();
        }

        data[size++] = value;
    }

    protected T get(int index ){

        T remove = (T)data[index];

        return remove ;
    }

    protected boolean isFull(){

        if(size == data.length){
            return true ;
        }
        return false ;
    }

    protected void resize(){

        Object[] new_data = new Object[data.length*2];

        for(int i = 0 ; i < data.length ; i++){
            new_data[i] = data[i];
        }

        data = new_data ;

    }

    protected T remove(){

        T value = (T)data[size];

        size--;

        return value ;
    }

    public static void main(String[] args) {

        CustomArrayList<Integer> list = new CustomArrayList<>();

        for(int i = 0 ; i < 10  ; i++){
            list.add(i);
        }

        System.out.println(list.get(0));
    }
}

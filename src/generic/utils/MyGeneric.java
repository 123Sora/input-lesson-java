package generic.utils;

public class MyGeneric<T> {
    private T message ;
    public MyGeneric(){

    }
    public MyGeneric(T message){
        this.message = message;
    }
    public void setMessage(T message){
        this.message= message;
    }
    public String getType(){
        return this.message.getClass().getSimpleName();
    }


}

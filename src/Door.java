public class Door {

    public boolean isOpened;
    public boolean isCar;

    public Door(){
        isCar = false;
        isOpened = false;
    }

    public void open(){
        isOpened = true;
    }

    public void setCar(){
        isCar = true;
    }


}

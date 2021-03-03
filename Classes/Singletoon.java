package Classes;

public class Singletoon {
    private static Singletoon instance = null;

    public static Singletoon getInstance(){
        if(instance == null) instance = new Singletoon();

        return instance;
    }

    private int x = 0;

    private Singletoon(){

    }

    public void incX() {this.x++;}
    public int getX() {return this.x;}

}

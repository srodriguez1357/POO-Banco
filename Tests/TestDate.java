package Tests;
import Classes.Date;
public class TestDate {
    public static void main(String[] args) {
        Date o1 = new Date();

        Date o2 = new Date(31, 12, 2016,2);

        Date o3 = Date.clone(o1);

        Date o4 = new Date(o1.getDay(), o2.getMonth(), o3.getYear(),1 );

        Date o5 = new Date();
        o5.next(o2);

        o3.setMonth(4);

        System.out.println(o1.equals(o3));
        System.out.println(o1.equals(o5));

        Date[] dates = {o1, o2, o3, o4, o5};

        for(Date i:dates){
            for(int j = 0; j <= 2; j++){
                i.setFormat(j);
                System.out.println(i.toString());
            }

        }
    }
}

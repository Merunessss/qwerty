package Exceptions;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionExamples {

    public static void main(String[] args) {

    ExceptionExamples exp = new ExceptionExamples();
int[] arr={1,3,5};
//int i=0;
//if(i>=0& i<arr.length){
try {


    try {
        String str = null;
        //System.out.println(str.toString());
        int r = 3 / 0;
        //Connection  qwe= DriverManager.getConnection("sas");
        System.out.println("ewwewewe");
    } catch (NullPointerException e) {
        System.out.println("Лопухи, проверьте null!");
        System.exit(1);
    } catch (Exception r) {
        System.out.println("Перехват ");
        //  int r=3/1;
        //Connection  qwe= DriverManager.getConnection("sas");
        System.out.println("ewwewewe");
    } finally {
        System.out.println("finally1");
    }

}catch (ArithmeticException r){
    System.out.println("divide by zerro");
    r.printStackTrace();
}
finally {
    System.out.println("finally2");
}
//}


        //exp.one();

          //  exp.two();
        //throw  new Exception();

    }

    int brb = 0;
void two() throws Exception {
 //  int q=5/0;
    throw  new Exception();
}
    void one() {
        brb++;
        System.out.println(brb);
        //one();

        try {
            System.out.println("ddffdf");
            System.out.println("ddffdf");
            System.out.println("ddffdf");

            System.out.println("ddffdf");
            Connection  qwe= DriverManager.getConnection("sas");
            System.out.println("ddffdf");
            System.out.println("ddffdf");
            Connection  qwe1= DriverManager.getConnection("sas");
throw  new MyExeption("wdefrg","ssaasas");

        } catch (SQLException e) {
            e.printStackTrace();
        }catch (MyExeption e){

        }catch (Exception r){

        }
finally {

            {
                //throw new Exception();

            }
        }

    }


}

class MyExeption extends  Throwable{
  String nameVinovnika;

    public  MyExeption(String message, String nameVinovnika) {
        super(message);
        this.nameVinovnika = nameVinovnika;
    }
}

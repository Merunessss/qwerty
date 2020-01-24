package Lambda;

import com.sun.istack.internal.NotNull;

public class LambdaTEST {

    public static void main(String[] args) {
      MyFun qwe= (String s)->{
          System.out.println(s);
          return s.length();
      } ;
      qwe.one("Nikita");

    }



}

package Lambda;

public interface MyFun {

    int one(String par1);
    default  int metod(){
        System.out.println("efdfdfd");
        return 0;
    }

}

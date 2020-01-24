package Lambda;

public class MyAlgoritm implements AlgoritmFun<Integer> {
    @Override
    public Integer function(Integer element) {
        return 5*element+34;
    }

}
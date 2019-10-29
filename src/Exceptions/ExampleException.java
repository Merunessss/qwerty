package Exceptions;

public class ExampleException {

    public static void main(String[] args) {
//        User user= null;
//        int  age=-57;
//        try {
//            user = new User("Vasa",age);
//        } catch (UserException e) {
//            try {
//                user=new User("Vasa",age*(-1));
//            } catch (UserException ex) {
//               // ex.printStackTrace();
//            }
//           // e.printStackTrace();
//        }
//        System.out.println(user);
    }

}

/*
оздайте метод который проверяет имейл есть ли он в черном список имейлов, если входит то создавать иксепшн и не создавать
пользователя.

почитать посмотреть эксепшн
 */
class User {

    String name;
    int age;
    String email;

    public User(String name, int age, String email) throws UserException {
        this.name = name;
        this.age = age;
        this.email = email;

        if (age < 1) {
            System.out.println("Lopuh");
            throw new UserException();
        }
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class UserException extends Exception {


}
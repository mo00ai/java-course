package chapter2.capsulation;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("ahun");

        //게터
        String name = person.getName();
        System.out.println(name);

        //세터
        person.setName("jorong");
        String name2 = person.getName();
        System.out.println(name2);


    }
}

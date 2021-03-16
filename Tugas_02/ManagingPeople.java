package Tugas_02;

public class ManagingPeople {

    public static void main(String[] args) {

        Person1 p1 = new Person1("Sirojudin ", 37);

        Person1 p2 = new Person1("Gading", 15);

        if(p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {
            System.out.println(p1.getName() + "is NOT the same age as " + p2.getName());
        }
    }
}

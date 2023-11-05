package Phone;

public class PhoneDemo {
    public static void main(String[] args) {
        MyPhone phone1 = new MyPhone("89144153412","Apple",5.2);
        MyPhone phone2 = new MyPhone("89977741412","Samsung",7.7);
        MyPhone phone3 = new MyPhone("89098774224","Honor",8.1);

        phone1.setModel("Apple");
        phone1.setNumber("89144153412");
        phone1.setWeight(5.2);

        System.out.println(phone1.getNumber());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getWeight());
        System.out.println();

        System.out.println(phone2.getNumber());
        System.out.println(phone2.getModel());
        System.out.println(phone2.getWeight());
        System.out.println();

        System.out.println(phone3.getNumber());
        System.out.println(phone3.getModel());
        System.out.println(phone3.getWeight());
        System.out.println();

        phone1.receiveCall("Mom");
        phone2.receiveCall("Dad");
        phone3.receiveCall("Bro","12345678");

    }
}

package hw4;

public class MClass {
    public static void main(String[] args) {
        Date date = new Date(1980, 9, 2);
        Persons person1 = new Persons("Петров Василий Иванович", date);
        Date registrarion = new Date(2024,4,24);
        Card card = new Card(person1,registrarion);
        System.out.println(card);
    }

}

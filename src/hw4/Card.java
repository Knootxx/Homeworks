package hw4;

public class Card {

    private Persons personsOwner;
    private Date registration;
    private Date expiredDate;

    public Card(Persons owner, Date registration) {
        this.personsOwner = owner;
        this.registration = registration;
        int newYear = registration.getYear() + 2;
        int newMonth = registration.getMonth();
        int newDay = registration.getDay();
        this.expiredDate = new Date(newYear, newMonth, newDay);

    }


    public Persons getPersonsOwner() {
        return personsOwner;
    }

    public Date getRegistration() {
        return registration;
    }


    public Date getExpiredDate() {
        return expiredDate;
    }

    @Override
    public String toString() {
        return "Владелец " + getPersonsOwner() + " Дата регистрации " + getRegistration() + " Дата истечения " + getExpiredDate();
    }
}

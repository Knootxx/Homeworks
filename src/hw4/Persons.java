package hw4;

public class Persons {



    private String fio;
    private Date born;



    public Persons(String fio, Date born) {
        this.fio = fio;
        this.born = born;

    }
    public String getFio(){
        return fio;
    }
    public Date getBorn(){
        return born;
    }
    @Override
    public String toString() {
        String personvalue = fio + " Дата рождения : " + born;
        return personvalue;
    }
}

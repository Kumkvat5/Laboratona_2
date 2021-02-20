import javax.jws.soap.SOAPBinding;
import java.util.Comparator;

// *Створіть просту  ієрархію спадкування, яка відповідає сутностям Користувач
// * (властивості- логін,пароль,емейл,телефон) та Покупець (рахунок, адреса доставки),
// * Продавець (№ підрозділу, дата прийняття на роботу, загальна сума торгових бонусів).
// * Продемонструйте перевантаження конструкторів та методів, перевизначення методів, особливості роботи
// * конструкторів при спадкуванні.
// *


public class User implements Comparator<User> {
    private String login;
    private String email;
    private String password;
    private String phoneNumber;

    public String getLogin(){return login;}
    public String getEmail(){return email;}

    User(String login,String email,String password,String phoneNumber){
        this.login=login;
        this.email=email;
        this.password=password;
        this.phoneNumber=phoneNumber;
    }

    User(String email,String login){
        this.email=email;
        this.login=login;
    }

    public void giveMoney(double amount){}
    public void printUSer(){
        System.out.println("Login: "+login+"\nE-mail: "+email+"\nPassword: "+password+"\nPhone number: "+phoneNumber);
    }

    @Override
    public int compare(User o1, User o2) {

        return o1.getLogin().compareTo(o2.getLogin());
    }


    @Override
    public String toString(){
        return "E-mail:"+ email+"\t\tLogin: "+login;
    }
}


class Customer extends User{
    private double bill;
    private String deliveryAddress;
    Customer(double bill,String deliveryAddress, String login, String email, String password, String phoneNumber) {
        super(login, email, password, phoneNumber);
        this.bill=bill;
        this.deliveryAddress=deliveryAddress;
    }
    @Override
    public void giveMoney(double amount){
        System.out.println("You gave away: "+amount+"$");
    }

    public void printCustomer(){
        System.out.println("Bill: "+bill+"\nDelivery address: "+deliveryAddress);
    }


}
class Seller extends User{
    private int subdivisions;
    private String workData;
    private int bonusSummary;
    Seller(int subdivisions,String workData, int bonusSummary, String login, String email, String password, String phoneNumber) {
        super(login, email, password, phoneNumber);
        this.subdivisions=subdivisions;
        this.workData=workData;
        this.bonusSummary = bonusSummary;
    }
    static int bonusSummaryFunc(int bonus1,int bonus2){
        int summary=bonus1+bonus2;
        System.out.println("Amount of bonuses: "+summary);
        return summary;
    }
    static void bonusSummaryFunc(String competition, int bonus1,int bonus2){
        int summary=bonus1+bonus2;
        System.out.println("Name of competition: "+competition+"\t\tAmount of bonuses: "+summary);
    }
    public  void printSeller(){
        System.out.println("Subdivisions: "+subdivisions+"\nBonus summary: "+bonusSummary);
    }
}

/*
*Створіть просту  ієрархію спадкування, яка відповідає сутностям
* Товар (властивості - назва, виробник, дата виготовлення, ціна) та
* Продукти харчування (термін придатності, харчова група (молочні, м'ясні, бакалея та інше)),
* РадіоЕлектроніка (вид електроніки, гарантійний термін). Продемонструйте перевантаження
* конструкторів та методів, перевизначення методів, особливості роботи конструкторів при
* спадкуванні.
* */

public class Product {
    private String name;
    private String manufacturer;
    private String dateMan;
    private double price;
    Product(){}
    Product(String name,String manufacturer,String dateMan,double price){
        this.name=name;
        this.manufacturer=manufacturer;
        this.dateMan =dateMan;
        this.price=price;
    }
    Product(String name,String manufacturer){
        this.name=name;
        this.manufacturer=manufacturer;
    }
    static void summaryPrises(double price1,double price2){
        double summary=price1+price2;
        System.out.println("Summary of prises: "+summary);
    }
    static void summaryPrises(String name,double price1,double price2){
        double summary=price1+price2;
        System.out.println("Name of product - "+name+"\t\tSummary of prises: "+summary);
    }
    @Override
    public String toString(){
        return "Name : "+name+"\nManufacturer: "+manufacturer+"\nDate manufacturer: "+ dateMan+"\nPrice: "+price;
    }

}


class  Food extends Product{
    private String expirationDate;
    private String foodGroup;
    Food(String expirationDate, String foodGroup,String name,String manufacturer,String dateMan,double price) {
        super(name, manufacturer, dateMan, price);
        this.expirationDate=expirationDate;
        this.foodGroup=foodGroup;
    }
    Food(String expirationDate,String foodGroup){
        this.expirationDate=expirationDate;
        this.foodGroup=foodGroup;
    }
}

class Radioelectronics extends Product{
    private String typeELec;
    private String warranty;

    Radioelectronics(String typeELec,String warranty,String name,String manufacturer,String dateMan,double price) {
        super(name, manufacturer, dateMan,price);
        this.typeELec=typeELec;
        this.warranty=warranty;
    }

    @Override
    public String toString(){
        return "Type of electronics: "+typeELec+"\nWarranty: "+warranty;
    }
}




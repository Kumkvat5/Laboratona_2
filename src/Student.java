/*
*Продемонструйте у коді генерацію свого виключення AgeStudentException у конструкторі класу
* Student при спробі створити об'єкт зі значенням віку помилковим.
* */


public class Student {
    int age;
    String name;
    int group;
    Student(String name,int age,int group) throws AgeStudentException {
        this.name=name;
        if (age<0) {
            throw new AgeStudentException();
        }
        this.age=age;
        this.group=group;
    }
    static void namesOfStudents (String[] names) {

        for (int i=0;i<=names.length;i++)
            System.out.println(names[i]);
    }

    static int getFactorial (int num) throws Exception{

        int result=1;
        try{
            if(num<1) throw new Exception("The number is less than 1");

            for(int i=1; i<=num;i++){

                result*=i;
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
            result=num;
        }
        finally {
            System.out.println("\"Finally\" block triggered");
        }
        return result;
    }

    @Override
    public String toString(){
        return "Name: "+name+"\nAge: "+age+"\nGroup: "+group;
    }

}

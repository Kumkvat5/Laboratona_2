import java.util.*;
import java.util.function.Function;

public class Program{

    public static void main(String[] args) throws Exception, AgeStudentException {
        User user1=new User("Lilya123","asenkolilia1@gmail.com","qwiugerier","+380995136944");
        User user2=new User("asenko@gmail.com","Lilya123");
        User user3=new User("kovalenko0000000000@gmail.com","Koval887");
        User user4=new User("uhfogishfoishf@gmail.com","Kla");
        user1.printUSer();

        System.out.println("___________");
        Customer customer=new Customer(234.5,"Mykolaiv 23d","Lilya123","asenkolilia1@gmail.com","qwiugerier","+380995136944");
        customer.printCustomer();
        customer.giveMoney(645.5);
        System.out.println("___________");


        Seller seller=new Seller(53,"June 2",546,"Lilya123","asenkolilia1@gmail.com","qwiugerier","+380995136944");
        seller.printSeller();

        Seller.bonusSummaryFunc(364,575);
        Seller.bonusSummaryFunc("Black lives matter",47,22);


        ArrayList<User> list=new ArrayList<User>();
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(new User("Nifoddsrgew@gmail.com","Ola"));
        list.add(new User("dhiufwoef@gmail.com","Nikita123"));



        System.out.println("___________");
        Comparator<User> comparator= Comparator.comparing(user->user.getEmail().length());


        Collections.sort(list,comparator);

        for (User user:list) {
            System.out.println(user);
        }
        System.out.println("___________");
        Comparator<User> comparator1=Comparator.comparing(user -> user.getLogin().charAt(2));
        Collections.sort(list,comparator1);
        for(User user:list){
            System.out.println(user);
        }
        System.out.println("___________");


        Function<User, Integer> getCount = new Function<User, Integer>() {

            private Set<Character> set = new HashSet<>(Arrays.asList('e', 'u', 'i', 'o', 'a'));

            @Override
            public Integer apply(User user) {
                int count = 0;
                for (int i = 0; i < user.getEmail().length(); i++)
                    count += set.contains(user.getEmail().charAt(i)) ? 1 : 0;

                return count;
            }
        };
        Comparator<User> comparator2=(user5,user6)->Integer.compare(getCount.apply(user5), getCount.apply(user6));
        Collections.sort(list,comparator2);
        for(User user:list){
            System.out.println(user);
        }
        System.out.println("___________");

                            /*______________PRODUCT____________*/
        Product product=new Product("Cheese228","Linux567","12.04.2009",1400.50);
        Product product1=new Product("Lola","Ytue");
        Product.summaryPrises(145.7,234.98);
        Product.summaryPrises("Shoes",8439,565);

        Food food=new Food("1 month","milk");
                             /*______________STUDENT____________*/

        try {
            Student student=new Student("Lilya",-18,201);
            System.out.println(student);
        }
        catch (AgeStudentException ex){
            System.out.println("Invalid age");
        }

        /*
        * Продемонструйте у коді  2 способа  обробки виключних ситуацій у методі
        * (з try-catch и  throws), а також особливості використання блока finally.
        * У якості обробляємо виключення оберіть будь яке =checked= виключення.
        * */
//1
        try {
            String[] names={"Lilya","Kolya","Masha"};
            Student.namesOfStudents(names);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
//2
        try {

            System.out.println(Student.getFactorial(-4));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }



    }
}
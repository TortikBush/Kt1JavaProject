
import java.util.ArrayList;

public class FillingOutSheets {

   static ArrayList<Person> PersonList= new ArrayList<>();
public void Information(){
    PersonList.add(new Person(1,"Зуева Екатерина Мехайловна","zueva12",880055535,"22020002300903",335,125553233.34));
    PersonList.add(new Person(2,"Ларион Ларин Ларионович","larin3000",123456,"23332123332123",310,423345456.91));
    PersonList.add(new Person(3,"Петров Иван Ильич","ivanushka15",12345678,"23332134434123",330,99999.33));
}


    static ArrayList<Product> ProductList=new ArrayList<>();
public void Prices(){
    ProductList.add(new Product(1,"Apple 15 pro max",123345.99));
    ProductList.add(new Product(2,"Samsung A53",50000.60));
    ProductList.add(new Product(3,"Poco C40",7900));
}

   public static ArrayList<Basket> BascetList=new ArrayList<>();

   public static ArrayList<Payment>PaymentList=new ArrayList<>();

   public static ArrayList<Account>AccountList=new ArrayList<>();

   public static ArrayList<Invoice>InvoiceList = new ArrayList<>();

}

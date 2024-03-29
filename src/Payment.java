import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Scanner;

public class Payment implements Document  {
    public int ID;
    public  String NumberCard;
    public static String login;
    LocalDateTime Datetime ;


public Payment(int id,String numberCard,String Login,LocalDateTime datetime){
    this.ID=id;
    this.NumberCard=numberCard;
    login=Login;
    this.Datetime=datetime;
}


 public static void ProofPayment(){
     int idcontrol = 0;
     Scanner scanner = new Scanner(System.in);
     for(int i=0;i<FillingOutSheets.PersonList.size();i++){

         if(Objects.equals(login, FillingOutSheets.PersonList.get(i).Login)){

             System.out.println("Хотите списать с этой карты " + FillingOutSheets.PersonList.get(i).CardNumber);
             String Enter=scanner.nextLine();

             if (Enter.equals("да")){
                 if(FillingOutSheets.PersonList.get(i).Balance>Account.PriceCal()){
                     FillingOutSheets.PersonList.get(i).Balance-=Account.PriceCal();
                     System.out.println("Оплата прошла");
                     System.out.println("На вашем балансе " + FillingOutSheets.PersonList.get(i).Balance);
                     idcontrol = idcontrol+1;
                     System.out.println("Введите адрес доставки ") ;
                     String address = scanner.nextLine();
                     FillingOutSheets.PaymentList.add(new Payment(idcontrol, FillingOutSheets.PersonList.get(i).CardNumber, login, LocalDateTime.now()));
                     FillingOutSheets.InvoiceList.add(new Invoice(idcontrol,idcontrol,LocalDateTime.now(),login,address));
                     System.out.println("Вы хотите заказать еще товар?");
                     String check = scanner.nextLine();
                     if(check.equals("да")){
                         Main.ProductSelection();
                     }
                     else {
                         Main.proverkaPovtoreniya=1;
                     }




                 }
                 else {
                     System.out.println("Недостаточно средств, необходимо пополнить баланс");
                     System.exit(0);
                 }
             }
         }

     }
    }

    @Override
    public int getId() {
        return ID;
    }

    @Override
    public void setId(int id) {

    }

    @Override
    public void displayInfo() {
        for(int i = 0; i< FillingOutSheets.PaymentList.size(); i++) {
            System.out.println("ID " + FillingOutSheets.PaymentList.get(i).ID + " Карта " + FillingOutSheets.PaymentList.get(i).NumberCard + " Время " + FillingOutSheets.PaymentList.get(i).Datetime);
        }
    }
}

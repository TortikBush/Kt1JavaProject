
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main  {
    public static FillingOutSheets FOS = new FillingOutSheets();
    public static void main(String[] args) {
        FOS.Information();
        System.out.println();
        FOS.Prices();
        SingIn();
        ProductSelection();
        while (proverkaPovtoreniya==0) {
            idcontroleAccount++;
            System.out.println(Account.PriceCal());
            FillingOutSheets.AccountList.add(new Account(Main.idcontroleAccount, Payment.login,Account.PriceCal()));
            Basket.SelectBasket();
            Payment.ProofPayment();
        }

    }
    static int idcontroleAccount=0;
    static int proverkaPovtoreniya = 0;

    public static void SingIn() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввидите логин ");
        String log = scanner.nextLine();

        System.out.println("Ввидите пароль");
        int pass = scanner.nextInt();

        for (int i = 1; i <= FillingOutSheets.PersonList.size(); i++) {
            if ((Objects.equals(FillingOutSheets.PersonList.get(i-1).Login, log)) && (FillingOutSheets.PersonList.get(i-1).Password == pass)) {
                System.out.println("Вы вошли в систему");
                Payment.login = log;

                break;
            } else if (FillingOutSheets.PersonList.size()== i) {
                System.out.println("Такого пользователя нет");
            }
        }

    }

    public static void SelectProduct() {

        for(int i = 0; i< FillingOutSheets.ProductList.size(); i++) {
            System.out.println("номер "+ FillingOutSheets.ProductList.get(i).Id + " телефон " + FillingOutSheets.ProductList.get(i).Phone + " цена "+ FillingOutSheets.ProductList.get(i).Price);
        }
    }

    public static void ProductSelection() {
        int idcontrol = 0;
        int proverka = 0;
        while (proverka == 0) {
            idcontrol = idcontrol + 1;
            SelectProduct();
            System.out.println("Ввидите номер продукта");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    FillingOutSheets.BascetList.add(new Basket(idcontrol, FOS.ProductList.getFirst().Phone, FOS.ProductList.getFirst().Price));
                   proverka=Qvation();
                    break;
                case 2:
                    FillingOutSheets.BascetList.add(new Basket(idcontrol, FOS.ProductList.get(1).Phone, FOS.ProductList.get(1).Price));
                    proverka=Qvation();
                    break;
                case 3:
                    FillingOutSheets.BascetList.add(new Basket(idcontrol, FOS.ProductList.get(2).Phone, FOS.ProductList.get(2).Price));
                    proverka=Qvation();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
        public static int Qvation(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Хотите добавить товар?");
            String Enter=scanner.nextLine();
            if (Objects.equals(Enter, "да")){
                return 0;
            }
            else {
              return 1;
            }
        }
}
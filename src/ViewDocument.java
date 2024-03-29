import java.util.ArrayList;
import java.util.Scanner;



public class ViewDocument  {
    public static void DisplayOpros(){
        System.out.println("Вы хотите вывести накладные?");
        Scanner scanner = new Scanner(System.in);
        String check = scanner.nextLine();
        if (check.equals("Да") || check.equals("да")){
            System.out.println("Введите номер наакладной");
            int num = scanner.nextInt();
            doc.add(FillingOutSheets.InvoiceList.get(num-1));
            displayAllDocuments(doc);
        }
    }
    public static void displayAllDocuments(ArrayList<Document> documents) {
        for (Document doc : documents) {
            doc.displayInfo();
        }
    }

    public static ArrayList<Document> doc = new ArrayList<>();
}

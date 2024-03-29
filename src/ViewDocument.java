import java.util.ArrayList;

public class ViewDocument  {
    public static void displayAllDocuments(ArrayList<Document> documents) {
        for (Document doc : documents) {
            doc.displayInfo();
        }
    }

}

import java.time.LocalDateTime;

public class Invoice implements Document{
     int id;
     int invoiceNumber;
     LocalDateTime invoiceDateTime;
     String clientName;
     String address;

    public Invoice(int id, int invoiceNumber, LocalDateTime invoiceDateTime, String clientName, String address) {
        this.id = id;
        this.invoiceNumber = invoiceNumber;
        this.invoiceDateTime = invoiceDateTime;
        this.clientName = clientName;
        this.address = address;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {

    }

    @Override
    public void displayInfo() {
        for(int i = 0; i< FillingOutSheets.InvoiceList.size(); i++) {
            System.out.println("ID " + FillingOutSheets.InvoiceList.get(i).id + " номер счета " + FillingOutSheets.InvoiceList.get(i).invoiceNumber + " время " + FillingOutSheets.InvoiceList.get(i).invoiceNumber+ " имя клиента "+FillingOutSheets.InvoiceList.get(i).clientName+ " адрес "+FillingOutSheets.InvoiceList.get(i).address);
        }
    }
}

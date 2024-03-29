import java.util.Date;
import java.util.Locale;


public class Basket implements Document {
    int ID;
    String Merchandise;
    double Cost;

    public Basket(int id,String merchandise,double cost){
        this.ID=id;
        this.Merchandise=merchandise;
        this.Cost=cost;
    }

    public static void SelectBasket(){
        for(int i = 0; i< FillingOutSheets.BascetList.size(); i++) {
            System.out.println("товар "+ FillingOutSheets.BascetList.get(i).ID + " телефон " + FillingOutSheets.BascetList.get(i).Merchandise+ " цена "+ FillingOutSheets.BascetList.get(i).Cost);
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
        for(int i = 0; i< FillingOutSheets.BascetList.size(); i++) {
            System.out.println("товар "+ FillingOutSheets.BascetList.get(i).ID + " телефон " + FillingOutSheets.BascetList.get(i).Merchandise+ " цена "+ FillingOutSheets.BascetList.get(i).Cost);
        }
    }
}

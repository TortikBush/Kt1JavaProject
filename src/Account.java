import java.time.LocalDateTime;

public class Account implements Document {
    int id;
    String person;
    double amount;

    public Account(int id, String Login, double amount){
        this.id=id;
        this.person=Login;
        this.amount=amount;
    }

    public static double PriceCal(){
        double cop=0;
        for(int i=0;i<FillingOutSheets.BascetList.size();i++){
            cop+=FillingOutSheets.BascetList.get(i).Cost;
        }

        return cop;
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
        for(int i = 0; i< FillingOutSheets.AccountList.size(); i++) {
            System.out.println("ID "+ FillingOutSheets.AccountList.get(i).id + " покупатель " + FillingOutSheets.AccountList.get(i).person+ " количество "+ FillingOutSheets.AccountList.get(i).amount);
}
    }
}

package sarah.cursomaratonajava.introducao;

public class ConditionalStructures {
    public static void main(String[] args) {
        int age = 20;
        boolean isAuthorizedBuyBeverages = age >= 18;
        if (isAuthorizedBuyBeverages){
            System.out.println("Authorized to buy alcoholic beverages.");
        } //else
        if (!isAuthorizedBuyBeverages){
            System.out.println("Not authorized to buy alcoholic beverages.");
        }

    }
}

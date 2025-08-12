package Objects.Task25;

public class ATM {
    private int banknote20;
    private int banknote50;
    private int banknote100;

    public int getBanknote20() {
        return banknote20;
    }


    public int getBanknote50() {
        return banknote50;
    }


    public int getBanknote100() {
        return banknote100;
    }


    public ATM(int banknote20, int banknote50, int banknote100){
        this.banknote20=banknote20;
        this.banknote50=banknote50;
        this.banknote100=banknote100;
    }

    public int sumCash() {
        int sum = (20 * banknote20) + (50 * banknote50) + (100 * banknote100);
        return sum;
    }

    public void AddBanknote(int banknote20, int banknote50, int banknote100) {
        this.banknote20 += banknote20;
        this.banknote50 += banknote50;
        this.banknote100 += banknote100;
    }

    public void printBalance(){
        System.out.println("Сумма в банкомате : " + "\n" + sumCash() + " рублей");
        System.out.println("\nкупюр наминалом 20: " + this.getBanknote20() + "\nкупюр номиналом 50: "+ this.getBanknote50()+ "\nкупюр номиналом 100: "+ this.getBanknote100());
    }
    public void withdrawMoney(int sum){
        if (sumCash() < sum){
            System.out.println("Денег в банкомате не хватает");
            return;
        }
        else if (){

        }
    }
}

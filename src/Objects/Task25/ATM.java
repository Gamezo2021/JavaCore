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
    public boolean withdrawMoney(int outSum){
        int count100 = 0;
        int count50 = 0;
        int count20 = 0;
        int outBanknote20 = this.banknote20;
        int outBanknote50 = this.banknote50;
        int outBanknote100 = this.banknote100;
        if (sumCash() < outSum){
            System.out.println("Денег в банкомате не хватает");
            return false;
        }
        for (count100 = 0 ; outSum - 100 >= 0 && outBanknote100 > 0; count100++){
            outBanknote100--;
            outSum = outSum - 100;
        }for (count50 = 0; outSum - 50 >= 0 &&outBanknote50 > 0; count50++){
            outBanknote50--;
            outSum = outSum - 50;
        }for (count20 = 0; outSum - 20 >= 0 &&outBanknote20 > 0; count20++){
            outBanknote20 --;
            outSum = outSum - 20;
        }
        if (outSum>0){
            System.out.println("В банкомате не хватает купюр для снятия наличных");
            return false;
        }
        this.banknote100 = outBanknote100;
        this.banknote50 = outBanknote50;
        this.banknote20 = outBanknote20;
        System.out.println("Деньги сняты следующими купюрами : " + "номиналом 100 рублей - " + count100 + ", номиналом 50 рублей - " + count50 + ", номиналом 20 рублей - " + count20);

        return true;
    }
}

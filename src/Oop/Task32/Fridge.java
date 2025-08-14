package Oop.Task32;

public class Fridge extends HouseholdAppliances {
    String model;
    int price;
    boolean haveFreezer;

    public Fridge(int noiseLevel, int energoConsumption, String manufacturer, String model, int price, boolean haveFreezer) {
        super(noiseLevel, energoConsumption, manufacturer);
        this.model = model;
        this.price = price;
        this.haveFreezer = haveFreezer;
    }

    @Override
    public void printInfo() {
        System.out.println("Информация по холодильнику " + "\n Модель " + model + "\n Цена " + price + "\n Производитель " + getManufacturer() + "\n Энергопотребление " + getEnergoConsumption() + "\n Уровень шума " + getNoiseLevel()
         + "\n Наличие морозилки " + haveFreezer);
    }
}

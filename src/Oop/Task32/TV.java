package Oop.Task32;

public class TV extends HouseholdAppliances implements Appliances {
    String model;
    int price;

    public TV(int noiseLevel, int energoConsumption, String manufacturer, String model, int price) {
        super(noiseLevel, energoConsumption, manufacturer);
        this.model = model;
        this.price = price;
    }

    @Override
    public void printInfo() {
        System.out.println("\n Информация по телевизору " +  "\n Модель " + model + "\n Цена " + price + "\n Производитель " + getManufacturer() + "\n Энергопотребление " + getEnergoConsumption() + "\n Уровень шума " + getNoiseLevel());
    }
}

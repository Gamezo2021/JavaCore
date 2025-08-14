package Oop.Task32;

abstract class HouseholdAppliances implements Appliances {
    private int noiseLevel;
    private int energoConsumption;
    private String manufacturer;
    boolean work;

    public int getNoiseLevel() {
        return noiseLevel;
    }

    public int getEnergoConsumption() {
        return energoConsumption;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isWork() {
        return work;
    }

    public HouseholdAppliances(int noiseLevel, int energoConsumption, String manufacturer) {
        this.noiseLevel = noiseLevel;
        this.energoConsumption = energoConsumption;
        this.manufacturer = manufacturer;

    }

    @Override
    public void turnOn() {
        work = true;
        System.out.println("Прибор работает");
    }

    @Override
    public void turnOff() {
        work = false;
        System.out.println("Прибор выключен");

    }

    public void printInfo() {
    }
}

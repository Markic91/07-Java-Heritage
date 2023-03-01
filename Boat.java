public class Boat extends Vehicle {

  public Boat(String brand, int kilometers) {
    super(brand, kilometers);
  }

@Override
  public String doStuff() {
    return "Je suis " + getBrand() + " je fais glou glou et j'ai " + getKilometers() + " kilometres au compteur sa race !!";
  }
}
public class Car extends Vehicle {

  public Car(String brand, int kilometers) {
    super(brand, kilometers);
  }

  @Override
  public String doStuff() {
    return "Je suis " + getBrand() + " je fais vroum vroum et j'ai " + getKilometers() + " kilometres au compteur sa race !!";
  }
}
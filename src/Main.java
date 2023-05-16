// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 90; // вес в кг
        int height = 180; // рост в см
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
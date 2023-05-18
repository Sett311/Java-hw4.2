public class BmiService {
    public double calculate (int weight, int height) {
        double h = (double) height / 100;
        return weight / h / h;
    }
}

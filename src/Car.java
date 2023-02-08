public class Car implements AutoCloseable {
    public void close() {
        System.out.println("Машина жабылып жатат");
    }
}

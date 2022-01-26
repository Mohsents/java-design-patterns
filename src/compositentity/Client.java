package compositentity;

public class Client {
    private final CompositeEntity compositeEntity = new CompositeEntity();

    public void setData(String data1, String data2) {
        compositeEntity.setData(data1, data2);
    }

    public void printData() {
        for (String data : compositeEntity.getData()) {
            System.out.println("Data: " + data);
        }
    }
}

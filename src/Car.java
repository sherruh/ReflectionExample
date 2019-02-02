public class Car {
    private String model;
    private String mark;
    private int vinCode;

    public Car(String model, String mark, int vinCode) {
        this.model = model;
        this.mark = mark;
        this.vinCode = vinCode;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getVinCode() {
        return vinCode;
    }

    public void setVinCode(int vinCode) {
        this.vinCode = vinCode;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", vinCode=" + vinCode +
                '}';
    }
}

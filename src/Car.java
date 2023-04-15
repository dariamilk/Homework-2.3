public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void service() {
        System.out.println("Обслуживаем " + super.getModelName());
        for (int i = 0; i < super.getWheelsCount(); i++) {
            super.updateTyre();
        }
        checkEngine();
    }
}

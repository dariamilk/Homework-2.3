public class ServiceStation {

    public void checkAll (Serviceable[] serviceables) {
        for (Serviceable serviceable : serviceables) {
            serviceable.service();
        }
    }
}
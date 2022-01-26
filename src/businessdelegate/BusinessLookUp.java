package businessdelegate;

public class BusinessLookUp {
    public BusinessService getBusinessService(Service service) {
        if (service.equals(Service.EJB)) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}

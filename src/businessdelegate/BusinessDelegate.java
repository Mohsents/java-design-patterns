package businessdelegate;

public class BusinessDelegate {
    private final BusinessLookUp businessLookUp = new BusinessLookUp();
    private Service service;

    public void setServiceType(Service service) {
        this.service = service;
    }

    public void doTask() {
        BusinessService businessService = businessLookUp.getBusinessService(service);
        businessService.doProcessing();
    }
}

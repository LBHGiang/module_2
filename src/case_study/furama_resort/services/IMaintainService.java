package case_study.furama_resort.services;

public interface IMaintainService{

    public void displayList();
    public void addNewObject(String serviceId);
    public void displayMaintainingFacilities();
    public void completeMaintenance(String serviceId);
    public void checkMaintain(String serviceId);
}

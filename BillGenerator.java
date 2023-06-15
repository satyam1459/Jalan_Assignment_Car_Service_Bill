package CarServiceApp;

public class BillGenerator {
    private CarServiceStation serviceStation;

    public BillGenerator(CarServiceStation serviceStation) {
        this.serviceStation = serviceStation;
    }

    public void generateBill(String carType, String[] serviceCodes) {
        System.out.println("Type of Car: " + carType);
        System.out.println("Service Codes: " + String.join(", ", serviceCodes));

        int totalBill = 0;

        for (String serviceCode : serviceCodes) {
            int servicePrice = serviceStation.getServicePrice(serviceCode, carType);
            System.out.println("Charges for " + serviceCode + " - ₹ " + servicePrice);
            totalBill += servicePrice;
        }

        System.out.println("Total Bill - ₹ " + totalBill);

        if (totalBill > 10000) {
            System.out.println("Complimentary cleaning provided.");
        }
    }
}

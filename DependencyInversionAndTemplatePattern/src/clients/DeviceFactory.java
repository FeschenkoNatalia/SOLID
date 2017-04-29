package clients;

import processes.GeneralManufacturingProcess;
import processes.LaptopManufacturingProcess;
import processes.SmartphoneManufacturingProcess;

/**
 * Created by themzdht on 29.04.2017.
 */
public class DeviceFactory {
    public static void main(String[] args) {
        GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess("Iphone process");
        manufacturer.launchProcess();

        manufacturer = new LaptopManufacturingProcess("Asus process");
        manufacturer.launchProcess();
    }
}

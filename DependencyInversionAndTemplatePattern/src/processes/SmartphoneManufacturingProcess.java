package processes;

/**
 * Created by themzdht on 29.04.2017.
 */
public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {

    public SmartphoneManufacturingProcess(String processName) {
        super(processName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("assembled smartphone");
    }

    @Override
    protected void testDevice() {
        System.out.println("tested smartphone");
    }

    @Override
    protected void packageDevice() {
        System.out.println("packaged smartphone");
    }

    @Override
    protected void storeDevice() {
        System.out.println("stored smartphone");
    }
}

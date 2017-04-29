package processes;

/**
 * Created by themzdht on 29.04.2017.
 */
public abstract class GeneralManufacturingProcess {
    protected String processName;

    public GeneralManufacturingProcess(String processName) {
        this.processName = processName;
    }

    protected abstract void assembleDevice();
    protected abstract void testDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();

    // template method
    public void launchProcess(){

        if(processName != null && !processName.isEmpty()){

            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();

        } else{
            System.out.println("no process name was specified");
        }

    }
}

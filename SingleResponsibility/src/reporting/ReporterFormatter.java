package reporting;

/**
 * Created by themzdht on 28.04.2017.
 */
public class ReporterFormatter {

    private String formattedOutput;

    public ReporterFormatter(Object object, FormatType formatType) {
        switch (formatType){
            case CSV:
                formattedOutput = convertObjectToCSV(object);
                break;
            case XML:
                formattedOutput = convertObjectToXML(object);
                break;
            default:
                    break;
        }
    }

    protected String convertObjectToXML(Object object) {
        return "XML : <title>"+object.toString()+"</title>";
    }

    protected String convertObjectToCSV(Object object) {
        return "CSV : ... "+object.toString()+"...";
    }

    protected String getFormattedValue() {
        return formattedOutput;
    }
}

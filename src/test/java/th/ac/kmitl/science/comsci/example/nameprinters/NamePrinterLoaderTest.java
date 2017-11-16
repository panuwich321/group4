package th.ac.kmitl.science.comsci.example.nameprinters;

import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class NamePrinterLoaderTest {

    private Set<Class<? extends NamePrinter>> createSetOfNamePrinters() {
        Set<Class<? extends NamePrinter>> mockNamePrinterClasses = new HashSet<>();

        mockNamePrinterClasses.add(NamePrinter.class);
        mockNamePrinterClasses.add(NameWithIdPrinter.class);
        mockNamePrinterClasses.add(BaseNamePrinter.class);
        mockNamePrinterClasses.add(BaseNameWithIdPrinter.class);
        mockNamePrinterClasses.add(ChayapolNamePrinter.class);
        mockNamePrinterClasses.add(BearNamePrinter.class);

        return mockNamePrinterClasses;
    }

    private NamePrinterLoader setupMockNamePrinterLoader() {
        NamePrinterLoader namePrinterLoader = NamePrinterLoader.getInstance();
        namePrinterLoader.setAllNamePrinterClasses(createSetOfNamePrinters());
        namePrinterLoader.reload();
        return namePrinterLoader;
    }

    @Test
    public void setAllNamePrinterClasses(){
        Set<Class<? extends NamePrinter>> namePrinterClasses = createSetOfNamePrinters();
        NamePrinterLoader.getInstance().setAllNamePrinterClasses(namePrinterClasses);
        assertEquals(namePrinterClasses, NamePrinterLoader.getInstance().getAllNamePrinterClasses());
    }

    @Test
    public void getNamePrinters() {
        NamePrinterLoader namePrinterLoader = setupMockNamePrinterLoader();

        assertEquals(2, namePrinterLoader.count());
    }
}
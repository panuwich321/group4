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
        mockNamePrinterClasses.add(NamePrinterBase.class);
        mockNamePrinterClasses.add(ChayapolNamePrinter.class);

        return mockNamePrinterClasses;
    }

    private NamePrinterLoader setupMockNamePrinterLoader() {
        NamePrinterLoader namePrinterLoader = NamePrinterLoader.getInstance();
        namePrinterLoader.setAllNamePrinterClasses(createSetOfNamePrinters());
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
        int namePrinterCount = 0;
        NamePrinterLoader namePrinterLoader = setupMockNamePrinterLoader();

        for(NamePrinter namePrinter : namePrinterLoader)
            namePrinterCount++;

        assertEquals(1, namePrinterCount);
    }

    @Test
    public void printAllNames() {
        StringWriter resultStringWriter = new StringWriter();
        PrintWriter resultPrintWriter = new PrintWriter(resultStringWriter);
        setupMockNamePrinterLoader().printAllNames(resultPrintWriter);

        StringWriter mockStringWriter = new StringWriter();
        PrintWriter mockPrintWriter = new PrintWriter(mockStringWriter);
        new ChayapolNamePrinter().print(mockPrintWriter);

        assertEquals (mockStringWriter.toString(), resultStringWriter.toString());
    }

}
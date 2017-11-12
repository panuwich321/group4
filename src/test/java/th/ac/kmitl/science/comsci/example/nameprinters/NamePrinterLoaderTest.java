package th.ac.kmitl.science.comsci.example.nameprinters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NamePrinterLoaderTest {
    @Test
    public void getNamePrinters() {
        int namePrinterCount = 0;

        for(NamePrinter namePrinter : NamePrinterLoader.getInstance())
            namePrinterCount++;

        assertEquals(namePrinterCount > 0, true);
    }

}
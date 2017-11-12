package th.ac.kmitl.science.comsci.example.nameprinters;

import java.io.PrintWriter;

public abstract class NamePrinterBase implements NamePrinter {

    private final String listItemTagPattern = "<li>%s</li>";

    public void print(PrintWriter writer) {
        writer.println(listItemTagPattern.replace("%s", this.getName()));
    }

}

package th.ac.kmitl.science.comsci.example.nameprinters;

import java.io.PrintWriter;

public abstract class NamePrinterBase implements NamePrinter {
    private String liTagPattern = "<li>%s</li>";

    public void print(PrintWriter writer) {
        writer.println(String.format(liTagPattern, this.getName()));
    }

}

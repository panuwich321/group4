package th.ac.kmitl.science.comsci.example.nameprinters;

import th.ac.kmitl.science.comsci.example.utils.Printable;

import java.io.PrintWriter;

public abstract class BaseNamePrinter implements NamePrinter {

    protected final String listItemTagTemplate = "<li>%s</li>";

    public abstract String getName();

    public void print(PrintWriter writer) {
        writer.println(listItemTagTemplate.replace("%s", this.getName()));
    }

}

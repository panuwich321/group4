package th.ac.kmitl.science.comsci.example.nameprinters;

import java.io.PrintWriter;

public abstract class BaseNameWithIdPrinter extends BaseNamePrinter implements NameWithIdPrinter {

    public abstract String getId();

    public void print(PrintWriter writer) {
        writer.println(listItemTagTemplate.replace("%s", this.getId() + " " + this.getName()));
    }
    
}

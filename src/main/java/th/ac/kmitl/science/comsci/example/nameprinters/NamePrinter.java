package th.ac.kmitl.science.comsci.example.nameprinters;

import th.ac.kmitl.science.comsci.example.utils.Printable;

import java.io.PrintWriter;

public interface NamePrinter extends Printable {

    String getName();

    void print(PrintWriter writer);
}

package th.ac.kmitl.science.comsci.example.nameprinters;

import org.reflections.Reflections;

import javax.print.attribute.standard.MediaSize;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class NamePrinterLoader implements Iterable<NamePrinter> {

    private static NamePrinterLoader instance;
    private static Reflections reflections;
    private final String packageIdentifier;
    private List<NamePrinter> namePrinters;
    private Set<Class<? extends NamePrinter>> allNamePrinterClasses;

    private NamePrinterLoader() {
        packageIdentifier = getClass().getPackage().getName();
        reflections = new Reflections(packageIdentifier);
        setAllNamePrinterClasses(reflections.getSubTypesOf(NamePrinter.class));
        namePrinters = getAllNamePrinters();
    }

    public static NamePrinterLoader getInstance() {
        if (instance == null)
            instance = new NamePrinterLoader();

        return instance;
    }

    private void reload() {
        namePrinters = getAllNamePrinters();
    }

    @Override
    public Iterator<NamePrinter> iterator() {
        return namePrinters.iterator();
    }

    private List<NamePrinter> getAllNamePrinters() {
        List<NamePrinter> namePrinters = new ArrayList<>();
        Set<Class<? extends NamePrinter>> allNamePrinterClasses = getAllNamePrinterClasses();

        for (Class<? extends NamePrinter> namePrinterClass : allNamePrinterClasses) {
            if (isInstantiable(namePrinterClass)) {
                Object namePrinterObj;
                try {
                    namePrinterObj = namePrinterClass.newInstance();
                    namePrinters.add((NamePrinter) namePrinterObj);
                } catch (InstantiationException e) {
                    continue;
                } catch (IllegalAccessException e) {
                    continue;
                }
            }
        }

        return namePrinters;
    }

    private boolean isInstantiable(Class<? extends NamePrinter> namePrinterClass) {

        return
                NamePrinter.class.isAssignableFrom(namePrinterClass)
                        && !namePrinterClass.isInterface()
                        && !Modifier.isAbstract(namePrinterClass.getModifiers());
    }

    public void printAllNames(PrintWriter writer) {
        for (NamePrinter namePrinter : this)
            namePrinter.print(writer);
    }

    public Set<Class<? extends NamePrinter>> getAllNamePrinterClasses() {
        return allNamePrinterClasses;
    }

    public void setAllNamePrinterClasses(Set<Class<? extends NamePrinter>> allNamePrinterClasses) {
        this.allNamePrinterClasses = allNamePrinterClasses;
        reload();
    }
}

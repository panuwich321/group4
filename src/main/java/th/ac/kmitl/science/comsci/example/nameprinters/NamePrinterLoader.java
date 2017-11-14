package th.ac.kmitl.science.comsci.example.nameprinters;

import org.reflections.Reflections;

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
        reload();
    }

    public static NamePrinterLoader getInstance() {
        if (instance == null)
            instance = new NamePrinterLoader();

        return instance;
    }

    public void reload() {
        namePrinters = getAvailableNamePrinters();
    }

    public void restoreDefault() {
        setAllNamePrinterClasses(reflections.getSubTypesOf(NamePrinter.class));
        reload();
    }

    public int count(){
        return namePrinters.size();
    }

    @Override
    public Iterator<NamePrinter> iterator() {
        return namePrinters.iterator();
    }

    private List<NamePrinter> getAvailableNamePrinters() {
        List<NamePrinter> namePrinters = new ArrayList<>();
        Set<Class<? extends NamePrinter>> allNamePrinterClasses = getAllNamePrinterClasses();

        for (Class<? extends NamePrinter> namePrinterClass : allNamePrinterClasses) {
            if (isInstantiable(namePrinterClass)) {
                Object namePrinterObj;
                try {
                    namePrinterObj = namePrinterClass.newInstance();
                    namePrinters.add((NamePrinter) namePrinterObj);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } finally {
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
        for (NamePrinter printable : this)
            printable.print(writer);
    }

    public Set<Class<? extends NamePrinter>> getAllNamePrinterClasses() {
        return allNamePrinterClasses;
    }

    public void setAllNamePrinterClasses(Set<Class<? extends NamePrinter>> allNamePrinterClasses) {
        this.allNamePrinterClasses = allNamePrinterClasses;
    }
}

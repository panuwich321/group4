package th.ac.kmitl.science.comsci.example.nameprinters;

import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class NamePrinterLoader implements Iterable<NamePrinter> {

    //Singleton implementation
    private static NamePrinterLoader instance;
    private final String packageIdentifier;
    private List<NamePrinter> namePrinters;
    private NamePrinterLoader() {
        packageIdentifier = getClass().getPackage().getName();

        try {
            namePrinters = getAllNamePrinters();
        } catch (Exception e) {
            e.printStackTrace();
            namePrinters = null;
        }
    }

    public static NamePrinterLoader getInstance() {
        if (instance == null)
            instance = new NamePrinterLoader();

        return instance;
    }

    @Override
    public Iterator<NamePrinter> iterator() {
        return namePrinters.iterator();
    }

    private List<NamePrinter> getAllNamePrinters() throws Exception {
        List<NamePrinter> namePrinters = new ArrayList<>();
        Reflections reflections = new Reflections(packageIdentifier);
        Set<Class<? extends NamePrinter>> allClasses = reflections.getSubTypesOf(NamePrinter.class);

        for (Class classFound : allClasses) {
            if (NamePrinter.class.isAssignableFrom(classFound)
                    && !classFound.isInterface()
                    && !Modifier.isAbstract(classFound.getModifiers())) {
                Object namePrinterObj = classFound.newInstance();
                namePrinters.add((NamePrinter) namePrinterObj);
            }
        }

        return namePrinters;
    }
}

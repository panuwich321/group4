package th.ac.kmitl.science.comsci.example.nameprinters;

import java.io.PrintWriter;

public class EarlyNamePrinter implements NamePrinter {
    @Override
    public String getName() {
    return
            "<li>Bearchitect</li>\n" +
            "<li>58050237 Chayapol Limanon</li>\n" +
            "<li>57050294 Pichavarit Panyokaew</li>\n" +
            "<li>58050276 Thanathat Surakhup</li>\n" +
            "<li>58050309 Pasthiyakan Kaewpitak</li>\n" +
            "<li>58050355 Panuwich Laoudom</li>\n" +
            "<li>57050269 Patipon Taweechat</li>\n" +
            "<li>57050279 Piyapon Suntikan</li>\n" +
            "<li>57050356 Apiwoot Narunatwattana</li>\n" +
            "<li>57050252 Nontakhon kerdmongkol</li>";
    }

    @Override
    public void print(PrintWriter writer) {
        writer.print(getName());
    }
}

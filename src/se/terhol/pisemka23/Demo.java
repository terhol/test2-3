package se.terhol.pisemka23;

/**
 * Write a description of class Demonstration here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demo {
    public static void main(String[] args) throws Exception {

        ICircuit c1 = new Circuit(2, 1500);

        ElectricDevice e1 = new ElectricDevice("A1", 1000);
        ElectricDevice e2 = new ElectricDevice("A2", 200);
        ElectricDevice e3 = new ElectricDevice("A3", 1200);

        System.out.print("Pri spravnem reseni system nespadne s vyjimkou, ");
        System.out.println("ani nevypise \"CHYBA...\"");

        c1.getBreaker().switchAndTest();

        c1.connect(e1);
        c1.connect(e2);

        try {
            c1.connect(e3);
            System.out.println("CHYBA: vic zarizeni nez zasuvek");
        } catch (ElectricDevicesException ex) {
        }

        try {
            c1.connect(e2);
            System.out.println("CHYBA: opakovane zapojeni stejneho zarizeni");
        } catch (IllegalArgumentException ex) {
        }

        c1.disconnect(e2);
        try {
            c1.disconnect(e2);
            System.out.println("CHYBA: opojovani nepripojeneho zarizeni");
        } catch (IllegalArgumentException ex) {
        }

        c1.connect(e3);
        e1.switchOn();
        c1.getBreaker().switchAndTest();

        e3.switchOn();
        try {
            c1.getBreaker().switchAndTest();
            System.out.println("CHYBA: zapnuti tohoto zarizeni melo zpusobit pretizeni");
        } catch (ElectricDevicesException ex) {
        }

        c1.disconnect(e3);
        c1.getBreaker().switchAndTest();
        try {
            c1.connect(e3);
            System.out.println("CHYBA: pripojeni zapnuteho zarizeni melo zpusobit pretizeni");
        } catch (OverloadedException ex) {
        }
    }
}

package hu.petrik.matrixoop;

public class Main {

    public static void main(String[] args) {
        Matrix m = new Matrix();
        System.out.println("Négyzetes-e: " + m.negyzetesE());
        System.out.println(m.getOszlopokSzama() + " oszlop");
        System.out.println(m.getSorokSzama() + " sor");
        System.out.println(m);
        System.out.println(m.elemekOsszege());
        System.out.println(m.hanyPozitiv());
        System.out.println(m.legNagyobb());
        System.out.println(m.elsoPozitiv());
        System.out.println(m.sorOsszeg(0));
    }
}

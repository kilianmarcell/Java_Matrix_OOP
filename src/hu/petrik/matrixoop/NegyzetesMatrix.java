package hu.petrik.matrixoop;

public class NegyzetesMatrix extends Matrix {

    public NegyzetesMatrix(int sorOszlop) {
        super(sorOszlop, sorOszlop);
    }

    public NegyzetesMatrix() {
        this((int)(Math.random() * 10) + 5);
        feltolt();
    }

    public int foatloOsszege() {
        int osszeg = 0;
        for (int i = 0; i < this.matrix.length; i++) {
            osszeg += matrix[i][i];
        }
        return osszeg;
    }

    public int mellekatloOsszege() {
        int osszeg = 0;
        for (int i = 0; i < matrix.length; i++) {
            osszeg += matrix[matrix.length-i][i];
        }
        return osszeg;
    }
}

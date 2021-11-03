package hu.petrik.matrixoop;

import java.util.Arrays;

public class Matrix {

    private int sorokSzama;
    private int oszlopokSzama;
    private int[][] matrix;

    public Matrix(int sorokSzama, int oszlopokSzama, int[][] matrix) {
        this.sorokSzama = sorokSzama;
        this.oszlopokSzama = oszlopokSzama;
        this.matrix = matrix;
    }

    public Matrix() {
        this.sorokSzama = (int)(Math.random() * 11) + 5;
        this.oszlopokSzama = (int)(Math.random() * 11) + 5;
        this.matrix = new int[this.sorokSzama][this.oszlopokSzama];

        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                this.matrix[i][j] = (int)(Math.random() * 90) + 10;
            }
        }
    }

    public int getSorokSzama() {
        return sorokSzama;
    }

    public int getOszlopokSzama() {
        return oszlopokSzama;
    }

    public long elemekOsszege() {
        long osszeg = 0;
        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                osszeg += matrix[i][j];
            }
        }
        return osszeg;
    }

    public long hanyPozitiv() {
        long darab = 0;
        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                if (matrix[i][j] > 0) {
                    darab++;
                }
            }
        }
        return darab;
    }

    public long legNagyobb() {
        long max = 0;
        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public String elsoPozitiv() {
        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                if (matrix[i][j] > 0) {
                    return (i + 1) + ". sor és " + (j + 1) + ". oszlop";
                }
            }
        }
        return "";
    }

    public long sorOsszeg(int sor) {
        long osszeg = 0;
        for (int i = 0; i < this.oszlopokSzama; i++) {
            osszeg += matrix[sor][i];
        }
        return osszeg;
    }

    public boolean negyzetesE() {
        //if (matrix.length == matrix[0].length) {
        //    return true;
        //} else {
        //    return false;
        //}

        return this.sorokSzama == this.oszlopokSzama;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                s += matrix[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }
}

/*
 * Decompiled with CFR.
 */
public class ma {
    public static final int awF = 1;
    public static final int awG = 2;
    public static final int awH = 3;
    public static final int awI = 4;
    public int afj;
    public String awJ;
    public int awK;

    public final boolean qm() {
        switch (this.afj) {
            case 1: {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        switch (this.afj) {
            case 1: {
                return "Account " + this.awJ;
            }
            case 2: {
                return "Account Online " + this.awJ;
            }
            case 3: {
                return "Character Name " + this.awJ;
            }
            case 4: {
                return "Character ID " + this.awK;
            }
        }
        return "Unknown KeyType " + this.afj;
    }
}


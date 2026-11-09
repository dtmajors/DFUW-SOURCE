/*
 * Decompiled with CFR.
 */
public class lml
extends lmi {
    private int PC = 0;

    public lml() {
        super(0);
    }

    public int getValue() {
        return this.PC;
    }

    public String toString() {
        return Integer.toString(this.getValue());
    }
}


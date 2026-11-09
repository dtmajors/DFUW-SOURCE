/*
 * Decompiled with CFR.
 */
public class cro
extends crs {
    public String[] eYA = new String[1];
    public int[] eYB = new int[1];

    @Override
    public void b(kwf kwf2) {
        this.eYA = kwf2.eYA;
        this.eYB = kwf2.eYB;
    }

    @Override
    public Object clone() {
        cro cro2 = (cro)super.clone();
        cro2.eYA = (String[])this.eYA.clone();
        cro2.eYB = (int[])this.eYB.clone();
        return cro2;
    }
}


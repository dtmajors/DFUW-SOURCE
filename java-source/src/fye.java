/*
 * Decompiled with CFR.
 */
public class fye
extends fyb {
    private String ejK = null;
    private String ejL = null;
    private boolean ejM = false;
    private boolean ejN = false;

    public String getClassName() {
        return this.ejK;
    }

    public String aHK() {
        return this.ejL;
    }

    public boolean aHL() {
        return this.ejM;
    }

    public boolean aHM() {
        return this.ejN;
    }

    public void l(amf amf2) {
        if (amf2 == null) {
            return;
        }
        this.ejK = amf2.getClass().getName();
        this.ejL = amf2.toString();
        this.ejM = amf2 instanceof btk;
        this.ejN = amf2 instanceof bto;
    }

    fye() {
        super(28930);
    }
}


/*
 * Decompiled with CFR.
 */
import javax.swing.JCheckBox;

class kzl {
    public JCheckBox qok = null;
    public boolean iNr = false;

    public boolean isIgnore() {
        return this.iNr;
    }

    public void xX(boolean bl) {
        this.iNr = bl;
        if (this.qok != null) {
            this.qok.setSelected(!bl);
        }
    }
}


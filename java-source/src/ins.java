/*
 * Decompiled with CFR.
 */
public class ins {
    private bsh mne;
    private lgw mnf;
    private int mng = -1;

    public ins(bsh bsh2) {
        this.mne = bsh2;
    }

    public int dhj() {
        return this.mng;
    }

    public void Rv(int n) {
        this.mng = n;
    }

    public int dhk() {
        ej[] ejArray = this.mne.arJ();
        if (ejArray != null) {
            for (int i = 0; i < ejArray.length; ++i) {
                if (ejArray[i].getType() != 11280) continue;
                return ((ew)ejArray[i]).fQ();
            }
        }
        return -1;
    }

    public String dhl() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("item;");
        stringBuilder.append("name=");
        stringBuilder.append(this.dhm().getName());
        stringBuilder.append(";");
        stringBuilder.append("guid=");
        stringBuilder.append(this.dhn());
        stringBuilder.append(";");
        stringBuilder.append("count=");
        stringBuilder.append(0);
        stringBuilder.append(";");
        stringBuilder.append("icon=");
        stringBuilder.append("texture/dds/" + this.dhm().enm());
        stringBuilder.append(";");
        return stringBuilder.toString();
    }

    public lgw dhm() {
        if (this.mnf == null) {
            this.mnf = (lgw)lea.enW().acv(this.mne.az());
        }
        return this.mnf;
    }

    public String dhn() {
        return this.mne.getGUID().enz();
    }

    public final bsh dho() {
        return this.mne;
    }

    public final void U(bsh bsh2) {
        this.mne = bsh2;
    }
}


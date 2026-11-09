/*
 * Decompiled with CFR.
 */
import java.util.List;

public class hcj {
    public final hck jFL;
    private final String aFo;
    private final String jFM;
    public final lhu dzN;
    public final hdv jFN;
    public final lgs jFO;
    public final lgs jFP;
    public final hnb jFE;
    public final lcq dMT;
    public final int als;
    public final List<String> dFm;

    public int cbY() {
        return this.jFM.length();
    }

    public String getText() {
        return this.aFo;
    }

    public String cbZ() {
        return this.jFM;
    }

    public hcj(hck hck2, String string, String string2, List<String> list, lhu lhu2, hdv hdv2, lgs lgs2, lgs lgs3, hnb hnb2, lcq lcq2, int n) {
        this.jFL = hck2;
        this.aFo = string2;
        this.jFM = string;
        this.dFm = list;
        this.jFN = hdv2;
        this.dzN = lhu2 == null && this.jFN != null ? this.jFN.atw() : lhu2;
        this.jFO = lgs2;
        this.jFP = lgs3;
        this.jFE = hnb2;
        this.dMT = lcq2;
        this.als = n;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Type=" + (this.jFL == null ? "null" : this.jFL));
        stringBuilder.append(", ");
        stringBuilder.append("Text=" + (this.aFo == null ? "null" : this.aFo));
        stringBuilder.append(", ");
        stringBuilder.append("Token=" + (this.jFM == null ? "null" : this.jFM));
        stringBuilder.append(", ");
        stringBuilder.append("Texture=" + (this.dzN == null ? "null" : this.dzN));
        stringBuilder.append(", ");
        stringBuilder.append("GuiItemClass=" + (this.jFN == null ? "null" : this.jFN));
        stringBuilder.append(", ");
        stringBuilder.append("DisplayRect=" + (this.jFO == null ? "null" : this.jFO));
        stringBuilder.append(", ");
        stringBuilder.append("HitTestRect=" + (this.jFP == null ? "null" : this.jFP));
        stringBuilder.append(", ");
        stringBuilder.append("Font=" + (this.jFE == null ? "null" : this.jFE));
        stringBuilder.append(", ");
        stringBuilder.append("Color=" + (this.dMT == null ? "null" : this.dMT));
        stringBuilder.append(", ");
        stringBuilder.append("CharIndex=" + this.als);
        stringBuilder.append(", ");
        stringBuilder.append("Attributes=");
        if (this.dFm == null) {
            stringBuilder.append("null");
        } else {
            for (String string : this.dFm) {
                stringBuilder.append("[" + string + "] ");
            }
        }
        return stringBuilder.toString();
    }
}


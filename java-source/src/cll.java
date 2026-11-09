/*
 * Decompiled with CFR.
 */
import java.util.List;

public class cll {
    private int ResourceType;
    private int eIX = -1;
    private String byk;
    private List<Integer> eIY = lcn.emv();

    public void ry(int n) {
        this.eIY.add(n);
    }

    public final int az() {
        return this.ResourceType;
    }

    public final void l(int n) {
        this.ResourceType = n;
    }

    public final int aSe() {
        return this.eIX;
    }

    public final void rz(int n) {
        this.eIX = n;
    }

    public final String getAttachPointName() {
        return this.byk;
    }

    public final void setAttachPointName(String string) {
        this.byk = string;
    }

    public final List<Integer> aSf() {
        return this.eIY;
    }

    public final void aw(List<Integer> list) {
        this.eIY = list;
    }
}


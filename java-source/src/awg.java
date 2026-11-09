/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;

public class awg {
    private ArrayList<awf> crx = new ArrayList();

    public void a(awf awf2) {
        this.crx.add(awf2);
    }

    public String toString() {
        return "SFChatFilterMatchList[" + this.crx.size() + " elements]";
    }

    public boolean c(awi awi2) {
        for (int i = 0; i < this.crx.size(); ++i) {
            if (this.crx.get(i).c(awi2)) continue;
            return false;
        }
        return true;
    }
}


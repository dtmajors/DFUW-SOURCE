/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Map;

public class lkj
implements Cloneable {
    private int rqF;
    private String[] rqG;
    private String Name = "No Name";
    private String Filename = "";
    private String gc = "";
    private Map rqH;
    private String pnB;

    public int etC() {
        return this.rqF;
    }

    public void ada(int n) {
        this.rqF = n;
    }

    public String[] etD() {
        return this.rqG;
    }

    public void U(String[] stringArray) {
        this.rqG = stringArray;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
    }

    public String bsl() {
        return this.Filename;
    }

    public void cd(String string) {
        this.Filename = string;
    }

    public final String etE() {
        return this.gc;
    }

    public final void y(String string) {
        this.gc = string;
    }

    public final Map etF() {
        return this.rqH;
    }

    public final void aj(Map map) {
        this.rqH = map;
    }

    public final Object clone() {
        lkj lkj2 = (lkj)super.clone();
        lkj2.rqH = this.ai(this.rqH);
        lkj2.rqG = (String[])this.rqG.clone();
        return lkj2;
    }

    private Map ai(Map map) {
        Map map2 = lcn.emw();
        Object object = null;
        for (Map.Entry entry : map.entrySet()) {
            object = ((ArrayList)entry.getValue()).clone();
            map2.put(entry.getKey(), object);
        }
        return map2;
    }

    public String getDirectory() {
        return this.pnB;
    }

    public void setDirectory(String string) {
        this.pnB = string;
    }
}


/*
 * Decompiled with CFR.
 */
public abstract class hyj
implements Comparable<hyj> {
    private String lob;

    public hyj(String string) {
        this.lob = string;
    }

    public String getText() {
        return this.lob;
    }

    public abstract void cDS();

    public int a(hyj hyj2) {
        return hyj2 != null ? this.lob.compareTo(hyj2.lob) : 1;
    }

    public boolean cDT() {
        return false;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((hyj)object);
    }
}


/*
 * Decompiled with CFR.
 */
public class mgq
implements Comparable {
    private int adk;
    private String aGy;
    private boolean DvV;

    public boolean eyP() {
        return this.DvV;
    }

    public void yU(boolean bl) {
        this.DvV = bl;
    }

    public int getIndex() {
        return this.adk;
    }

    public void setIndex(int n) {
        this.adk = n;
    }

    public String getType() {
        return this.aGy;
    }

    public void setType(String string) {
        this.aGy = string;
    }

    public int compareTo(Object object) {
        assert (object instanceof mgq);
        mgq mgq2 = (mgq)object;
        if (this.adk < mgq2.adk) {
            return -1;
        }
        if (this.adk > mgq2.adk) {
            return 1;
        }
        return 0;
    }
}


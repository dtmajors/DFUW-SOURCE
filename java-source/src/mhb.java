/*
 * Decompiled with CFR.
 */
public class mhb
implements Comparable {
    private String Filename;
    private int DwA = 0;

    public mhb(String string, int n) {
        this.Filename = string;
        this.DwA = n;
    }

    public String bsl() {
        return this.Filename;
    }

    public void cd(String string) {
        this.Filename = string;
    }

    public int eyW() {
        return this.DwA;
    }

    public void aei(int n) {
        this.DwA = n;
    }

    public int compareTo(Object object) {
        assert (object instanceof mhb);
        mhb mhb2 = (mhb)object;
        if (this.DwA < mhb2.DwA) {
            return -1;
        }
        if (this.DwA > mhb2.DwA) {
            return 1;
        }
        return 0;
    }
}


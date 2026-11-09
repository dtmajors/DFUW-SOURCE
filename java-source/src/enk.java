/*
 * Decompiled with CFR.
 */
public class enk
extends emr
implements dxu {
    private int aqs = -1;
    private String add = null;
    private int aDP = 0;
    private int aDQ = 0;
    private int ew = azl.cEK.ordinal();

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public String iV() {
        return this.add;
    }

    public void cD(String string) {
        this.add = string;
    }

    public int aap() {
        return this.aDP;
    }

    public int aaq() {
        return this.aDQ;
    }

    public void cd(int n, int n2) {
        this.aDP = n;
        this.aDQ = n2;
    }

    public azl bJz() {
        return azl.getValueByOrdinal(this.ew);
    }

    public void a(azl azl2) {
        this.ew = azl2 == null ? azl.cEK.ordinal() : azl2.ordinal();
    }

    enk() {
        super(13877);
    }
}


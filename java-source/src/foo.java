/*
 * Decompiled with CFR.
 */
public class foo
extends fob {
    public static final int iSf = 1;
    public static final int iSg = 2;
    public static final int iSh = 3;
    private boolean dwG = true;
    private boolean aef = false;
    private int ObjectType = -1;
    private int aqs = -1;
    private int blu = -1;
    private int iSi = -1;
    private ldv Rs = null;
    private String aee = null;

    foo() {
        super(11526);
    }

    @Override
    public boolean isServerObject() {
        return this.dwG;
    }

    @Override
    public void setServerObject(boolean bl) {
        this.dwG = bl;
    }

    public boolean md() {
        return this.aef;
    }

    public void R(boolean bl) {
        this.aef = bl;
    }

    public int getObjectType() {
        return this.ObjectType;
    }

    public void setObjectType(int n) {
        this.ObjectType = n;
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public int Bz() {
        return this.blu;
    }

    public void fn(int n) {
        this.blu = n;
    }

    public int bQE() {
        return this.iSi;
    }

    public void Hd(int n) {
        this.iSi = n;
    }

    public ldv oq() {
        return this.Rs;
    }

    public void hC(ldv ldv2) {
        this.Rs = ldv2;
    }

    public String getDirectoryName() {
        return this.aee;
    }

    public void setDirectoryName(String string) {
        this.aee = string;
    }
}


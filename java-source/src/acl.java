/*
 * Decompiled with CFR.
 */
public class acl {
    private int ID = -1;
    private int Type = -1;
    private ldv aCE = null;
    private int ayN = 0;

    public int getID() {
        return this.ID;
    }

    public int getType() {
        return this.Type;
    }

    public ldv sV() {
        return this.aCE;
    }

    public int qO() {
        return this.ayN;
    }

    public acl(int n, int n2, ldv ldv2) {
        this.ID = n;
        this.Type = n2;
        this.aCE = ldv2;
    }

    public boolean yQ() {
        ++this.ayN;
        return this.ayN == 1;
    }

    public boolean yR() {
        --this.ayN;
        return this.ayN <= 0;
    }

    public boolean a(gdx gdx2) {
        return this.Type == gdx2.xc();
    }

    public boolean a(gea gea2) {
        return this.ID == gea2.bUc();
    }
}


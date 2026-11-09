/*
 * Decompiled with CFR.
 */
public class bdb {
    private int cZn = bdh.cZS.ordinal();
    private int ResourceType = -1;
    private String cZo = null;
    private long cZp = -1L;
    private long cZq = -1L;
    private int cZr = 0;
    private int cZs = 0;

    public bdh alJ() {
        return bdh.getValueByOrdinal(this.cZn);
    }

    public void a(bdh bdh2) {
        this.cZn = bdh2 == null ? this.cZn : bdh2.ordinal();
    }

    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    public String alK() {
        return this.cZo;
    }

    public void fp(String string) {
        this.cZo = string;
    }

    public long alL() {
        return this.cZp;
    }

    public void G(long l) {
        this.cZp = l;
    }

    public long alM() {
        return this.cZq;
    }

    public void H(long l) {
        this.cZq = l;
    }

    public int alN() {
        return this.cZr;
    }

    public void ki(int n) {
        this.cZr = n;
    }

    public int alO() {
        return this.cZs;
    }

    public void kj(int n) {
        this.cZs = n;
    }

    public boolean alP() {
        if (this.cZn > 0 && this.alJ() == bdh.cZS) {
            return false;
        }
        if (this.ResourceType >= 0 && !lea.enW().contains(this.ResourceType)) {
            return false;
        }
        if (this.cZp >= 0L && this.cZp > System.currentTimeMillis()) {
            return false;
        }
        if (this.cZq >= 0L && this.cZq > System.currentTimeMillis()) {
            return false;
        }
        if (this.cZp >= 0L && this.cZq >= 0L && this.cZp >= this.cZq) {
            return false;
        }
        return this.cZr == 0 || this.cZs == 0 || this.cZr < this.cZs;
    }

    public boolean b(bda bda2) {
        return bda2 != null;
    }
}


/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 */
public class fv {
    private int hB = 0;
    private ldv Sy;
    private String bc;
    private ldv Tr;
    private ldv Ts;
    private ldv Tt;
    private ldv Tu;
    private int ResourceType;
    private ljq Position;
    private lgl Rotation;
    private boolean Tv;
    private hc SC;

    public fv() {
    }

    public fv(ha ha2, ldv ldv2) {
        this.Tt = ha2.getGUID().bFk();
        this.SC = ha2.jT();
        this.Sy = ldv2;
        this.Tu = new ldv(this.Sy.ib(), this.Tt.enw(), 0);
        this.Tr = ha2.getGUID();
        this.Ts = ha2.hm();
        this.ResourceType = ha2.jp();
        this.Position = ha2.jo();
        this.Rotation = new lgl();
        this.bc = ha2.iU();
    }

    public ldv hk() {
        return this.Sy;
    }

    public void ae(ldv ldv2) {
        this.Sy = ldv2;
    }

    public String hl() {
        return this.bc;
    }

    public void d(String string) {
        this.bc = string;
    }

    public ldv gO() {
        return this.Tr;
    }

    public void af(ldv ldv2) {
        this.Tr = ldv2;
    }

    public ldv hm() {
        return this.Ts;
    }

    public void ag(ldv ldv2) {
        this.Ts = ldv2;
    }

    public ldv hn() {
        return this.Tt;
    }

    public void ah(ldv ldv2) {
        this.Tt = ldv2;
    }

    public ldv ho() {
        return this.Tu;
    }

    public void ai(ldv ldv2) {
        this.Tu = ldv2;
    }

    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public boolean hp() {
        return this.Tv;
    }

    public void E(boolean bl) {
        this.Tv = bl;
    }

    public hc hf() {
        return this.SC;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFClientObject: CharacterName=");
        stringBuilder.append(this.bc);
        stringBuilder.append(" AccessLevel=");
        stringBuilder.append((Object)this.SC);
        stringBuilder.append(" AccountID=");
        stringBuilder.append(this.hB);
        stringBuilder.append(" PersistentSessionObjectGUID=");
        stringBuilder.append(this.Tr);
        stringBuilder.append(" SessionObjectGUID=");
        stringBuilder.append(this.Ts);
        stringBuilder.append("\n  ServerOSGUID=");
        stringBuilder.append(this.Tt);
        stringBuilder.append(" ClientOSGUID=");
        stringBuilder.append(this.Tu);
        stringBuilder.append(" ResourceType=");
        stringBuilder.append(this.ResourceType);
        stringBuilder.append("\n Position=");
        stringBuilder.append(this.Position);
        stringBuilder.append(" Rotation=");
        stringBuilder.append(this.Rotation);
        return stringBuilder.toString();
    }

    public int aN() {
        return this.hB;
    }

    public void v(int n) {
        this.hB = n;
    }

    public void a(hc hc2) {
        this.SC = hc2;
    }
}


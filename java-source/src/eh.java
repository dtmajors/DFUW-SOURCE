/*
 * Decompiled with CFR.
 */
public class eh
implements Cloneable,
Comparable {
    public static final int tq = 0;
    public static final int tr = 1;
    private int ts = 0;
    private String Name;
    private String tt;
    private ljq tu;
    private ljq my;

    public void a(ljq ljq2, lgl lgl2, ljq ljq3, lgl lgl3) {
        if (ljq2 == null || lgl2 == null || ljq3 == null || lgl3 == null) {
            assert (false);
            return;
        }
        ljq ljq4 = this.fb();
        lgl lgl4 = new lgl(this.getRotation());
        ljq ljq5 = new ljq(ljq2);
        lgl lgl5 = new lgl(lgl2);
        ljq5.es(lgl5.eq(ljq4));
        lgl5.Y(lgl4);
        ljq3.ex(ljq5);
        lgl3.X(lgl5);
    }

    public int fa() {
        return this.ts;
    }

    public void ac(int n2) {
        this.ts = n2;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
    }

    public String getFrameName() {
        return this.tt;
    }

    public void setFrameName(String string) {
        this.tt = string;
    }

    public ljq fb() {
        return this.tu;
    }

    public void K(ljq ljq2) {
        this.tu = ljq2;
    }

    public ljq getRotation() {
        return this.my;
    }

    public lgl fc() {
        return new lgl(this.my);
    }

    public void setRotation(ljq ljq2) {
        this.my = ljq2;
    }

    public final Object clone() {
        eh eh2 = (eh)super.clone();
        eh2.setRotation(this.my.esF());
        eh2.K(this.tu.esF());
        return eh2;
    }

    public int compareTo(Object object) {
        if (!(object instanceof eh)) {
            throw new ClassCastException();
        }
        return this.Name.compareTo(((eh)object).getName());
    }

    public eh fd() {
        eh eh2 = new eh();
        eh2.setName(this.Name);
        eh2.setFrameName(this.tt);
        eh2.K(new ljq(this.tu));
        eh2.setRotation(new ljq(this.my));
        return eh2;
    }

    public String toString() {
        return "SFAttachPoint: Name='" + this.Name + "' FrameName='" + this.tt + "' Translation=" + this.tu + " Rotation=" + this.my;
    }
}


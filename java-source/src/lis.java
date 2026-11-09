/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 *  lcy
 */
public class lis
extends lip {
    private final ljq iKQ;

    protected lis() {
        this.iKQ = null;
    }

    public lis(ljq ljq2) {
        this.iKQ = ljq2;
    }

    @Override
    public String esy() {
        lej lej2 = lcw.ec((ljq)this.iKQ);
        String string = null;
        if (lej2.getX() < 0) {
            string = "W";
            lej2.RH(-lej2.getX());
        } else {
            string = lej2.getX() > 0 ? "E" : "";
        }
        int n = lej2.getX() / 60;
        int n2 = lej2.getX() % 60;
        String string2 = null;
        if (lej2.getY() < 0) {
            string2 = "N";
            lej2.RI(-lej2.getY());
        } else {
            string2 = lej2.getY() > 0 ? "S" : "";
        }
        int n3 = lej2.getY() / 60;
        int n4 = lej2.getY() % 60;
        lip lip2 = lcy.rbf.a(new lja(n), new lja(n2), new ljg(string), new lja(n3), new lja(n4), new ljg(string2));
        return lip2.esy();
    }

    public boolean a(lis lis2) {
        return this.iKQ.equals(lis2.iKQ);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof lis) {
            return this.a((lis)object);
        }
        return super.equals(object);
    }

    public final int b(lis lis2) {
        int n = (int)(this.iKQ.x - lis2.iKQ.x);
        if (n != 0) {
            return n;
        }
        n = (int)(this.iKQ.rlV - lis2.iKQ.rlV);
        if (n != 0) {
            return n;
        }
        n = (int)(this.iKQ.y - lis2.iKQ.y);
        return n;
    }

    @Override
    protected int j(lip lip2) {
        if (lip2 instanceof lis) {
            return this.b((lis)lip2);
        }
        return this.esy().compareTo(lip2.esy());
    }
}


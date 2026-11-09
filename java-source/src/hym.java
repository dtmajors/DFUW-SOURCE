/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hvj
 */
import java.util.ArrayList;
import java.util.Map;

public class hym
extends hyi {
    private ArrayList<hyj> loc;
    public Map<String, hyj> lod = lcn.emw();
    private hyj loe;

    public hym(int n, int n2, ArrayList<hyj> arrayList, jlf<hyk> jlf2) {
        super(n, n2, arrayList != null ? new a(arrayList, jlf2) : null);
        ((a)this.cDN()).loh = this;
        this.loc = arrayList;
        this.cDX();
    }

    public hym(int n, int n2, ArrayList<hyj> arrayList) {
        this(n, n2, arrayList, null);
        this.loc = arrayList;
        this.cDX();
    }

    protected hym(int n, int n2) {
        super(n, n2, null);
    }

    protected void c(ArrayList<hyj> arrayList) {
        this.a(new a(arrayList, null));
        ((a)this.cDN()).loh = this;
        this.loc = arrayList;
        this.cDX();
    }

    protected void b(int n, int n2, int n3, String string) {
        if (string != null && !string.isEmpty()) {
            String[] stringArray = string.split(";");
            hyj hyj2 = this.lod.get(string = stringArray[0]);
            if (hyj2 != this.loe) {
                if (this.loe != null) {
                    this.c(this.loe);
                }
                this.loe = hyj2;
                if (this.loe != null) {
                    this.b(this.loe);
                }
            }
        } else if (this.loe != null) {
            this.c(this.loe);
            this.loe = null;
        }
    }

    protected void v(int n, int n2, int n3) {
        if (this.loe != null) {
            this.c(this.loe);
            this.loe = null;
        }
    }

    protected void b(hyj hyj2) {
    }

    protected void c(hyj hyj2) {
    }

    @Override
    protected void cDO() {
        for (int i = 0; i < this.loc.size(); ++i) {
            hyj hyj2 = this.loc.get(i);
            if (!hyj2.cDT()) continue;
            this.a("setSubMenuCommand", new Object[]{i});
        }
    }

    private void cDX() {
        this.lod.clear();
        for (hyj hyj2 : this.loc) {
            this.lod.put(hyj2.getText(), hyj2);
        }
    }

    static /* synthetic */ hvj cDY() {
        return hym.cxP();
    }
}


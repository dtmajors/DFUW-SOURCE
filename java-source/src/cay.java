/*
 * Decompiled with CFR.
 */
import java.util.List;

public class cay
extends caj {
    private cak.g ein = cak.g.ehi;
    private String FileName = null;
    private List<bzv> eio = null;

    public final cak.g aHc() {
        return this.ein;
    }

    public final void a(cak.g g2) {
        assert (g2 != null);
        this.ein = g2;
    }

    public final String getFileName() {
        return this.FileName;
    }

    public final void setFileName(String string) {
        assert (string != null);
        this.FileName = string;
    }

    public final List<bzv> aHe() {
        return this.eio;
    }

    public final boolean a(cax cax2) {
        assert (cax2 != null);
        if (cax2.aFZ() != this.aFZ()) {
            return false;
        }
        if (cax2.aHc().getValue() != this.ein.getValue()) {
            return false;
        }
        return cax2.getFileName().equalsIgnoreCase(this.FileName);
    }

    public final boolean a(cay cay2) {
        assert (cay2 != null);
        if (cay2.aFZ() != this.aFZ()) {
            return false;
        }
        if (cay2.aHc().getValue() != this.ein.getValue()) {
            return false;
        }
        return cay2.getFileName().equalsIgnoreCase(this.FileName);
    }

    public final boolean aHf() {
        if (this.eio == null) {
            return false;
        }
        int n = this.eio.size();
        for (int i2 = 0; i2 < n; ++i2) {
            bzv bzv2 = this.eio.get(i2);
            if (bzv2.aFE()) continue;
            return true;
        }
        return false;
    }

    public final cay aHg() {
        int n;
        cay cay2 = new cay();
        cay2.eA(this.aFZ());
        cay2.a(this.ein);
        cay2.setFileName(this.FileName);
        cah[] cahArray = new cah[this.aGa().length];
        int n2 = cahArray.length;
        for (n = 0; n < n2; ++n) {
            cahArray[n] = this.aGa()[n].aFX();
        }
        cay2.a(cahArray);
        if (this.eio != null) {
            n2 = this.eio.size();
            for (n = 0; n < n2; ++n) {
                bzv bzv2 = this.eio.get(n);
                cay2.b(bzv2.aFF());
            }
        }
        return cay2;
    }

    @Override
    public final boolean equals(Object object) {
        assert (this.ein != null);
        assert (this.FileName != null);
        if (object instanceof cay) {
            cay cay2 = (cay)object;
            if (!super.equals(cay2)) {
                return false;
            }
            if (this.ein != cay2.aHc()) {
                return false;
            }
            return this.FileName.equalsIgnoreCase(cay2.getFileName());
        }
        assert (false);
        return false;
    }

    @Override
    public final void reset() {
        super.reset();
        this.ein = cak.g.ehi;
        this.FileName = null;
        this.eio = null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" PriorityLevel=");
        stringBuilder.append((Object)this.ein);
        stringBuilder.append(" FileName='");
        stringBuilder.append(this.FileName);
        stringBuilder.append("' AttachedMeshNodesCount=");
        if (this.eio == null) {
            stringBuilder.append("0");
        } else {
            stringBuilder.append(this.eio.size());
        }
        return stringBuilder.toString();
    }

    public final void b(bzv bzv2) {
        if (bzv2 == null) {
            return;
        }
        if (this.eio == null) {
            this.eio = lcn.abH(1);
        }
        this.eio.add(bzv2);
    }

    public final cak.a aHh() {
        if (this.eio == null) {
            return null;
        }
        cak.a a2 = null;
        int n = this.eio.size();
        for (int i2 = 0; i2 < n; ++i2) {
            bzv bzv2 = this.eio.get(i2);
            if (a2 == null) {
                a2 = bzv2.aFC();
                continue;
            }
            if (a2.getValue() >= bzv2.aFC().getValue()) continue;
            a2 = bzv2.aFC();
        }
        return a2;
    }

    public final void aHi() {
        if (this.eio != null) {
            this.eio.clear();
        }
    }

    public final void c(bzv bzv2) {
        if (bzv2 == null) {
            return;
        }
        if (this.eio == null) {
            return;
        }
        if (this.eio.remove(bzv2) && this.eio.isEmpty()) {
            this.eio = null;
        }
    }
}


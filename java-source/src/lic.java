/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class lic {
    private final List<lib> rog = new ArrayList<lib>();
    public final lbh kAz;
    private final lbn jEL = new lbn(this){
        final /* synthetic */ lic roh;
        {
            this.roh = lic2;
        }

        public final void W() {
            lib lib2;
            double d2;
            double d3 = this.roh.kAz.emb();
            while (lic.a(this.roh).size() != 0 && !((d2 = (lib2 = lic.b(this.roh)).esf()) >= d3)) {
                lib2.esh();
                if (!lib2.isStarted() || !(lib2.esf() <= d2)) continue;
                lib2.stop();
            }
        }
    };
    private boolean jLT;

    public lic(lbh lbh2) {
        this.kAz = lbh2;
        this.jLT = true;
    }

    public void dispose() {
        assert (this.jLT);
        assert (this.rog.size() == 0);
        this.jLT = false;
    }

    public final void b(lib lib2) {
        assert (this.jLT);
        assert (!this.rog.contains(lib2));
        if (this.rog.isEmpty()) {
            this.kAz.eme().a(true, this.jEL);
        }
        this.rog.add(lib2);
    }

    public final void c(lib lib2) {
        assert (this.jLT);
        assert (this.rog.contains(lib2));
        this.rog.remove(lib2);
        if (this.rog.isEmpty()) {
            this.kAz.eme().a(false, this.jEL);
        }
    }

    private lib esi() {
        lib lib2 = null;
        for (int i = 0; i < this.rog.size(); ++i) {
            lib lib3 = this.rog.get(i);
            if (lib2 != null && !(lib3.esf() < lib2.esf())) continue;
            lib2 = lib3;
        }
        return lib2;
    }

    static /* synthetic */ List a(lic lic2) {
        return lic2.rog;
    }

    static /* synthetic */ lib b(lic lic2) {
        return lic2.esi();
    }
}


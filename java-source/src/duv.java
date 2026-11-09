/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  lcw
 */
import java.util.List;

public class duv {
    private boolean Initialized = false;
    private dqk gPc = null;
    private List<duq> hfm = null;
    private List<dut> hfl = null;
    private List<dux> hfn = null;

    public duv(dqk dqk2) {
        this.gPc = dqk2;
    }

    public void cleanUp() {
        this.Initialized = false;
        this.hfm = null;
        this.hfl = null;
        this.hfn = null;
    }

    public void initialize() {
        assert (!this.Initialized);
        if (!lcw.enf() || lcw.emZ() || !this.gPc.isServerObject()) {
            // empty if block
        }
        if (!this.gPc.isServerObject()) {
            Object object;
            int n;
            int n2;
            if (this.hfn != null) {
                n2 = this.hfn.size();
                for (n = 0; n < n2; ++n) {
                    object = this.hfn.get(n);
                    this.gPc.m(((dux)object).aFZ(), ((dux)object).bBt());
                }
            }
            if (this.hfm != null) {
                n2 = this.hfm.size();
                for (n = 0; n < n2; ++n) {
                    object = this.hfm.get(n);
                    dur dur2 = ((duq)object).bBm();
                    this.gPc.a(dur2.aFZ(), dur2.aFO(), ((duq)object).aFP()[0]);
                }
            }
            if (this.hfl != null) {
                n2 = this.hfl.size();
                for (n = 0; n < n2; ++n) {
                    object = this.hfl.get(n);
                    this.gPc.a(((dut)object).aFZ(), ((dut)object).aHa(), ((dut)object).aGZ(), ((dut)object).aFO());
                    if (((dut)object).aFV() == null) continue;
                    this.gPc.a(((dut)object).aFZ(), ((dut)object).aFO(), ((dut)object).aFV());
                }
            }
        }
        this.Initialized = true;
    }

    public void a(duq duq2) {
        if (duq2 == null) {
            return;
        }
        if (this.hfm == null) {
            this.hfm = lcn.abH(2);
        }
        dur dur2 = duq2.bBm();
        int n = this.a(dur2);
        duq duq3 = null;
        if (n >= 0) {
            duq3 = this.hfm.remove(n);
        }
        this.hfm.add(duq2);
        if (this.gPc.isServerObject()) {
            if (duq3 == null) {
                // empty if block
            }
        } else {
            if (!this.Initialized) {
                return;
            }
            this.gPc.a(dur2.aFZ(), dur2.aFO(), duq2.aFP()[0]);
        }
    }

    public void b(dut dut2) {
        if (dut2 == null) {
            return;
        }
        assert (dut2.aFZ() >= 0);
        assert (dut2.aFO() >= 0);
        if (this.hfl == null) {
            this.hfl = lcn.abH(2);
        }
        int n = this.ca(dut2.aFZ(), dut2.aFO());
        dut dut3 = null;
        if (n >= 0) {
            dut3 = this.hfl.remove(n);
        }
        this.hfl.add(dut2);
        if (this.gPc.isServerObject()) {
            if (dut3 == null) {
                // empty if block
            }
        } else {
            if (!this.Initialized) {
                return;
            }
            this.gPc.a(dut2.aFZ(), dut2.aHa(), dut2.aGZ(), dut2.aFO());
            if (dut2.aFV() != null) {
                this.gPc.a(dut2.aFZ(), dut2.aFO(), dut2.aFV());
            }
        }
    }

    public void a(dux dux2) {
        if (dux2 == null) {
            return;
        }
        if (this.hfn == null) {
            this.hfn = lcn.abH(4);
        }
        int n = this.Cy(dux2.aFZ());
        dux dux3 = null;
        if (n >= 0) {
            dux3 = this.hfn.remove(n);
        }
        this.hfn.add(dux2);
        if (this.gPc.isServerObject()) {
            if (dux3 == null) {
                // empty if block
            }
        } else {
            if (!this.Initialized) {
                return;
            }
            this.gPc.m(dux2.aFZ(), dux2.bBt());
        }
    }

    public void c(dut dut2) {
        if (dut2 == null) {
            return;
        }
        assert (dut2.aFZ() >= 0);
        assert (dut2.aFO() >= 0);
        int n = this.ca(dut2.aFZ(), dut2.aFO());
        if (n < 0) {
            return;
        }
        dut dut3 = this.hfl.remove(n);
        if (!this.gPc.isServerObject()) {
            // empty if block
        }
    }

    public void b(int n, int n2, dus dus2) {
        if (n < 0) {
            return;
        }
        if (n2 < 0) {
            return;
        }
        if (dus2 == null) {
            return;
        }
        int n3 = this.ca(n, n2);
        if (n3 < 0) {
            return;
        }
        dut dut2 = this.hfl.get(n3);
        if (dut2.aFV() == null) {
            dut2.a(dus2);
        } else {
            if ((dus2.aul() & 1) > 0) {
                dut2.aFV().f(dus2.bBn());
            }
            if ((dus2.aul() & 2) > 0) {
                dut2.aFV().g(dus2.bBo());
            }
            if ((dus2.aul() & 4) > 0) {
                dut2.aFV().setPower(dus2.getPower());
            }
        }
        if (!this.gPc.isServerObject()) {
            this.gPc.a(dut2.aFZ(), dut2.aFO(), dut2.aFV());
        }
    }

    private int a(dur dur2) {
        assert (this.hfm != null);
        assert (dur2 != null);
        int n = this.hfm.size();
        for (int i = 0; i < n; ++i) {
            duq duq2 = this.hfm.get(i);
            if (!duq2.bBm().equals(dur2)) continue;
            return i;
        }
        return -1;
    }

    private int ca(int n, int n2) {
        assert (this.hfl != null);
        assert (n >= 0);
        assert (n2 >= 0);
        int n3 = this.hfl.size();
        for (int i = 0; i < n3; ++i) {
            dut dut2 = this.hfl.get(i);
            if (dut2.aFZ() != n) continue;
            if (dut2.aGZ()) {
                return i;
            }
            if (dut2.aFO() != n2) continue;
            return i;
        }
        return -1;
    }

    private int Cy(int n) {
        assert (this.hfn != null);
        assert (n >= 0);
        int n2 = this.hfn.size();
        for (int i = 0; i < n2; ++i) {
            dux dux2 = this.hfn.get(i);
            if (dux2.aFZ() != n) continue;
            return i;
        }
        return -1;
    }
}


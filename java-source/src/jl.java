/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public abstract class jl
extends btk
implements bto {
    protected TreeMap<String, jm> alb = lcn.emG();
    private Set<Class<? extends jk>> alc = lcn.emx();
    private Map<Class<? extends jk>, jk> ald = lcn.emw();
    private Set<jj> ale = lcn.emx();

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void doTick(ldz ldz2) {
    }

    protected void a(Class<? extends jk> clazz) {
        this.alc.add(clazz);
    }

    public void nZ() {
        this.alb.clear();
        for (Class<? extends jk> clazz : this.alc) {
            try {
                jk jk2 = clazz.newInstance();
                jk2.a(this);
            }
            catch (Throwable throwable) {
                lfn.b(5, "SFConsoleCommandManager", "doRegistration(): Error constructing " + clazz.getName() + " instance:" + throwable.getMessage());
                assert (false);
            }
        }
    }

    protected final void a(String string, hc hc2, mhs[] mhsArray, boolean bl, ldv ldv2, lox lox2) {
        assert (string.toLowerCase().equals(string));
        assert (hc2 != null);
        assert (ldv2 != null);
        jm jm2 = this.alb.get(string);
        if (jm2 != null) {
            lfn.b(5, "SFConsoleCommandManager", "registerCommand(): Command '" + string + "' already registered by '" + jm2.oa() + "' - Ignoring registration by '" + ldv2 + "'");
            assert (false);
            return;
        }
        if (hc2 == hc.aaz) {
            if (string.startsWith("gm_")) {
                lfn.b(5, "SFConsoleCommandManager", "registerCommand: Command '" + string + "' has PLAYER access level, but starts with gm_");
                assert (false);
            }
            if (string.startsWith("adm_")) {
                lfn.b(5, "SFConsoleCommandManager", "registerCommand: Command '" + string + "' has PLAYER access level, but starts with adm_");
                assert (false);
            }
        } else if (hc2 == hc.aaP) {
            if (!string.startsWith("adm_")) {
                lfn.b(5, "SFConsoleCommandManager", "registerCommand: Command '" + string + "' has ADMIN access level, but doesn't start with adm_");
                assert (false);
            }
        } else if (!string.startsWith("gm_")) {
            lfn.b(5, "SFConsoleCommandManager", "registerCommand: Command '" + string + "' has a GM access level, but doesn't start with gm_");
            assert (false);
        }
        jm2 = new jm(string, hc2, mhsArray, bl, ldv2, lox2);
        this.alb.put(string, jm2);
        this.a(jm2);
    }

    final void a(String string, hc hc2, mhs[] mhsArray, boolean bl, Class<? extends jk> clazz, lox lox2) {
        assert (string.toLowerCase().equals(string));
        assert (hc2 != null);
        assert (clazz != null);
        jm jm2 = this.alb.get(string);
        if (jm2 != null) {
            lfn.b(5, "SFConsoleCommandManager", "registerCommand(): Command '" + string + "' already registered by '" + jm2.oa() + "' - Ignoring registration by '" + clazz.getName() + "'");
            assert (false);
            return;
        }
        if (hc2 == hc.aaz) {
            if (string.startsWith("gm_")) {
                lfn.b(5, "SFConsoleCommandManager", "registerCommand: Command '" + string + "' has PLAYER access level, but starts with gm_");
                assert (false);
            }
            if (string.startsWith("adm_")) {
                lfn.b(5, "SFConsoleCommandManager", "registerCommand: Command '" + string + "' has PLAYER access level, but starts with adm_");
                assert (false);
            }
        } else if (hc2 == hc.aaP) {
            if (!string.startsWith("adm_")) {
                lfn.b(5, "SFConsoleCommandManager", "registerCommand: Command '" + string + "' has ADMIN access level, but doesn't start with adm_");
                assert (false);
            }
        } else if (!string.startsWith("gm_")) {
            lfn.b(5, "SFConsoleCommandManager", "registerCommand: Command '" + string + "' has a GM access level, but doesn't start with gm_");
            assert (false);
        }
        jm2 = new jm(string, hc2, mhsArray, bl, clazz, lox2);
        this.alb.put(string, jm2);
        this.a(jm2);
    }

    protected abstract void a(jm var1);

    protected abstract hc hf();

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 29699: {
                this.a((ewq)dxq2);
                return;
            }
        }
        super.receiveMessage(dxq2);
    }

    private void a(ewq ewq2) {
        assert (ewq2.akV.toLowerCase().equals(ewq2.akV));
        jm jm2 = this.alb.get(ewq2.akV);
        if (jm2 == null) {
            this.a(ewq2.aVk(), ewq2.aO(), lqd.rXd.bD(ewq2.akV), true, true);
            return;
        }
        if (jm2.SC.ordinal() > this.hf().ordinal()) {
            this.a(ewq2.aVk(), ewq2.aO(), lqd.rXf.bD(ewq2.akV), true, true);
            return;
        }
        mhk[] mhkArray = ewq2.akW;
        if (mhkArray == null) {
            mhkArray = mhk.DwX;
        }
        if (mhkArray.length > jm2.alf.length) {
            this.a(ewq2.aVk(), ewq2.aO(), lqd.rXg.bD(ewq2.akV), true, true);
            return;
        }
        if (!(mhkArray.length >= jm2.alf.length || jm2.alg && mhkArray.length + 1 == jm2.alf.length)) {
            this.a(ewq2.aVk(), ewq2.aO(), lqd.rXg.bD(ewq2.akV), true, true);
            return;
        }
        for (int j = 0; j < jm2.alf.length; ++j) {
            if (j >= mhkArray.length || mhkArray[j].eyY() == jm2.alf[j]) continue;
            this.a(ewq2.aVk(), ewq2.aO(), lqd.rXi.bD(new Object[]{ewq2.akV, mhkArray[j].toString(), jm2.alf[j]}), true, true);
            return;
        }
        if (jm2.alj != null) {
            ewq2.on(jm2.alj);
            this.MessageDelegator.E(ewq2);
        } else {
            jk jk2 = this.b(jm2);
            if (jk2 == null) {
                this.a(ewq2.aVk(), ewq2.aO(), lqd.rXe.bD(ewq2.akV), true, true);
                return;
            }
            jj jj2 = new jj(this, ewq2.aVk(), ewq2.aO(), ewq2.akV, ewq2.akW, ewq2.akX);
            this.ale.add(jj2);
            jk2.a(jj2);
        }
    }

    protected void a(int n, ldv ldv2, loz loz2, boolean bl, boolean bl2) {
        ews ews2 = (ews)this.MessageDelegator.h(29700, this.getGUID(), ldv2);
        ews2.iEy = loz2;
        ews2.aMu = bl2;
        ews2.iEz = bl;
        this.MessageDelegator.E(ews2);
    }

    void a(jj jj2, loz loz2, boolean bl, boolean bl2) {
        assert (this.ale.contains(jj2));
        this.a(jj2.getTag(), jj2.nS(), loz2, bl, bl2);
    }

    void a(jj jj2, loz loz2, boolean bl) {
        if (!this.ale.remove(jj2)) {
            lfn.b(5, "SFConsoleCommandManager", "commandCompleted: Command " + jj2 + " already completed");
            assert (false);
            return;
        }
        this.a(jj2.getTag(), jj2.nS(), loz2, bl, true);
    }

    void c(jj jj2) {
        if (!this.ale.remove(jj2)) {
            lfn.b(5, "SFConsoleCommandManager", "commandCompleted: Command " + jj2 + " already completed");
            assert (false);
            return;
        }
        this.a(jj2.getTag(), jj2.nS(), lqd.rXn.bD(jj2.akV), false, true);
    }

    private jk b(jm jm2) {
        jk jk2 = this.ald.get(jm2.ali);
        if (jk2 != null) {
            return jk2;
        }
        try {
            jk2 = jm2.ali.newInstance();
        }
        catch (Throwable throwable) {
            lfn.b(5, "SFConsoleCommandManager", "getHandler: Could not create " + jm2.ali.getName() + " instance: " + throwable.getMessage());
            return null;
        }
        jk2.setGUID(this.MessageDelegator.bzv());
        this.ald.put(jm2.ali, jk2);
        this.MessageDelegator.a(jk2);
        return jk2;
    }

    public jm bd(String string) {
        return this.alb.get(string);
    }
}


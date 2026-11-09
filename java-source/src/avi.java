/*
 * Decompiled with CFR.
 */
public class avi
extends aul {
    private static final String TC = "SFChatProxyForPlayerRoleManager";
    private boolean Initialized = false;
    private ldv Tr = null;
    private ldv ckI = null;

    public avi() {
        super(new amd(avi.class, aul.cdc, TC, new cqi[0], null));
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2321: {
                this.a((egk)dxq2);
                break;
            }
            case 30982: {
                this.a((ggk)dxq2);
                break;
            }
            case 30980: {
                this.a((ggm)dxq2);
                break;
            }
            case 30978: {
                this.a((ggq)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(ggk ggk2) {
        int[] nArray = ggk2.jgv;
        boolean[] blArray = ggk2.jgH;
        if (nArray != null && blArray != null && blArray.length == nArray.length) {
            for (int i = 0; i < nArray.length; ++i) {
                int n = nArray[i];
                ckk ckk2 = lea.epw().ro(n);
            }
        }
    }

    private void a(ggm ggm2) {
        int n = ggm2.getResult();
        switch (n) {
            case 5: {
                this.h(mcq.uxm.bD(new Object[0]));
                break;
            }
            case 2: {
                this.h(mcq.uxn.bD(new Object[0]));
                break;
            }
            case 1: {
                this.h(mcq.uxo.bD(new Object[0]));
                break;
            }
            case 0: {
                this.h(mcq.uxp.bD(new Object[0]));
                break;
            }
            case 4: {
                this.h(mcq.uxq.bD(new Object[0]));
                break;
            }
            case 3: {
                this.h(mcq.uxr.bD(new Object[0]));
            }
        }
    }

    private void a(ggq ggq2) {
        int n = ggq2.bUS();
        switch (n) {
            case 6: {
                this.h(mcq.uxs.bD(new Object[0]));
                break;
            }
            case 2: {
                this.h(mcq.uxt.bD(new Object[0]));
                break;
            }
            case 5: {
                this.h(mcq.uxu.bD(new Object[0]));
                break;
            }
            case 4: {
                this.h(mcq.uxv.bD(new Object[0]));
                break;
            }
            case 0: {
                this.h(mcq.uxw.bD(new Object[0]));
                break;
            }
            case 1: {
                this.h(mcq.uxx.bD(new Object[0]));
                break;
            }
            case 3: {
                this.h(mcq.uxy.bD(new Object[0]));
            }
        }
    }

    @Override
    protected final void b(int n, Object[] objectArray, String string) {
        if (this.Tr == null) {
            return;
        }
        a a2 = a.values()[n];
        switch (a2) {
            case ckM: {
                this.aQ(objectArray);
                break;
            }
            case ckK: {
                this.aP(objectArray);
                break;
            }
            case ckL: {
                this.aR(objectArray);
                break;
            }
            default: {
                super.b(n, objectArray, string);
            }
        }
    }

    @Override
    protected final void FG() {
        assert (this.Initialized);
        this.We();
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaP, a.ckM, new ljk("enable a specific player role,specialization,booster"), new egg[]{new egg("role_name", egg.a.ipq, false, new ljk("Role name")), new egg("specialization_name", egg.a.ipq, false, new ljk("Specialization name")), new egg("booster_name", egg.a.ipq, true, new ljk("Booster name"))});
        this.a(hc.aaP, a.ckL, new ljk("buy a specific player booster"), new egg[]{new egg("booster_name", egg.a.ipq, false, new ljk("Booster name"))});
        this.a(hc.aaP, a.ckK, new ljk("gets information related to boosters"), new egg[]{new egg("booster_name", egg.a.ipq, true, new ljk("Booster name"))});
    }

    private void a(hc hc2, a a2, lip lip2, egg[] eggArray) {
        this.a(hc2, a2.ordinal(), a2.name().toLowerCase(), lip2, eggArray);
    }

    private void a(egk egk2) {
        if (egk2.Tr == null) {
            return;
        }
        this.Tr = egk2.Tr;
        this.ckI = egk2.cdD;
    }

    private void aP(Object[] objectArray) {
        String string = objectArray != null && objectArray.length > 0 && objectArray[0] != null ? objectArray[0].toString() : null;
        ggj ggj2 = (ggj)this.MessageDelegator.h(30981, this.getGUID(), this.Tr);
        if (string != null) {
            ckn ckn2 = lea.epw();
            ckk ckk2 = ckn2.hz(string);
            if (ckk2 == null) {
                this.h(mcq.uxz.bD(string));
                return;
            }
            ggj2.aGg = ckk2.getID();
        }
        this.MessageDelegator.F(ggj2);
    }

    private void aQ(Object[] objectArray) {
        Object object;
        String string = objectArray[0].toString();
        String string2 = objectArray[1].toString();
        String string3 = objectArray.length == 3 && objectArray[2] != null ? objectArray[2].toString() : null;
        cjx cjx2 = lea.epx().hu(string);
        if (cjx2 == null) {
            this.h(mcq.uxA.bD(string));
            return;
        }
        cke cke2 = cke.getValueByName(string2);
        if (cke2 == null) {
            this.h(mcq.uxB.bD(string2));
            return;
        }
        ckd ckd2 = cjx2.qQ(cke2.aOK());
        if (ckd2 == null) {
            return;
        }
        int n = -1;
        int n2 = -1;
        if (string3 != null && !string3.isEmpty() && string3 != null) {
            object = lea.epw();
            ckk ckk2 = ((ckn)object).hz(string3);
            if (ckk2 == null) {
                this.h(mcq.uxz.bD(string3));
                return;
            }
            n2 = ckk2.getIndex();
            n = ckk2.aQS().ordinal();
        }
        object = (ggp)this.MessageDelegator.h(30977, this.getGUID(), this.Tr);
        ((ggp)object).rc(cjx2.getIndex());
        ((ggp)object).Jr(ckd2.getIndex());
        ((ggp)object).Jn(n);
        ((ggp)object).Jo(n2);
        this.MessageDelegator.F((dxq)object);
    }

    private void aR(Object[] objectArray) {
        Object object;
        int n = -1;
        int n2 = -1;
        String string = objectArray[0].toString();
        if (string != null) {
            object = lea.epw();
            ckk ckk2 = ((ckn)object).hz(string);
            if (ckk2 == null) {
                this.h(mcq.uxz.bD(string));
                return;
            }
            n = ckk2.getIndex();
            n2 = ckk2.aQS().ordinal();
        }
        object = (ggl)this.MessageDelegator.h(30979, this.getGUID(), this.Tr);
        ((ggl)object).Jn(n2);
        ((ggl)object).Jo(n);
        this.MessageDelegator.F((dxq)object);
    }
}


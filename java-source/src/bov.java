/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class bov
extends btk {
    private Map<ldv, bpg> dyv = lcn.emw();
    private Map<ldv, bpg> dyw = lcn.emw();
    private Map<Integer, bph> dyx = lcn.emw();
    private Map<Integer, bpf> dyy = lcn.emw();

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        super.receiveMessage(dxq2);
    }

    public boolean a(ldv ldv2, ldv ldv3, int[] nArray, List<int[]> list) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        if (this.dyw.containsKey(ldv2)) {
            return false;
        }
        bpg bpg2 = new bpg();
        bpg2.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(bpg2);
        bpg2.c(ldv2, ldv3, nArray, list);
        this.dyw.put(ldv2, bpg2);
        return true;
    }

    public boolean b(ldv ldv2, ldv ldv3, int[] nArray, List<int[]> list) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        if (this.dyv.containsKey(ldv2)) {
            return false;
        }
        bpg bpg2 = new bpg();
        bpg2.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(bpg2);
        bpg2.c(ldv2, ldv3, nArray, list);
        this.dyv.put(ldv2, bpg2);
        return true;
    }

    public void a(ldv ldv2, ldv ldv3, int n, bph bph2) {
        assert (ldv2 != null);
        if (ldv3 == null) {
            // empty if block
        }
        if (bph2 == null) {
            bph2 = new bph();
        }
        bph2.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(bph2);
        bph2.G(ldv2, ldv3);
        this.dyx.put(n, bph2);
    }

    public void a(String string, int n, ldv ldv2, boolean bl2, boolean bl3) {
        assert (string != null);
        bpf bpf2 = new bpf();
        bpf2.iy(ldv2);
        bpf2.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(bpf2);
        bpf2.a(string, bl2, bl3);
        this.dyy.put(n, bpf2);
    }

    public boolean is(ldv ldv2) {
        bpg bpg2 = this.dyv.get(ldv2);
        if (bpg2 == null) {
            return true;
        }
        return bpg2.atl();
    }

    public boolean it(ldv ldv2) {
        bpg bpg2 = this.dyv.get(ldv2);
        if (bpg2 == null) {
            return true;
        }
        return bpg2.atk();
    }

    public bpg iu(ldv ldv2) {
        bpg bpg2 = this.dyv.remove(ldv2);
        if (bpg2 != null) {
            this.MessageDelegator.hd(bpg2.getGUID());
        }
        return bpg2;
    }

    public boolean iv(ldv ldv2) {
        bpg bpg2 = this.dyw.get(ldv2);
        if (bpg2 == null) {
            return true;
        }
        return bpg2.atl();
    }

    public boolean iw(ldv ldv2) {
        bpg bpg2 = this.dyw.get(ldv2);
        if (bpg2 == null) {
            return true;
        }
        return bpg2.atk();
    }

    public bpg ix(ldv ldv2) {
        bpg bpg2 = this.dyw.remove(ldv2);
        if (bpg2 != null) {
            this.MessageDelegator.hd(bpg2.getGUID());
        }
        return bpg2;
    }

    public boolean lz(int n) {
        bpe bpe2 = this.dyy.get(n);
        if (bpe2 == null) {
            return true;
        }
        return bpe2.atl();
    }

    public boolean lA(int n) {
        bpe bpe2 = this.dyy.get(n);
        if (bpe2 == null) {
            return true;
        }
        return bpe2.atk();
    }

    public bpe lB(int n) {
        bpe bpe2 = this.dyy.get(n);
        if (bpe2 != null) {
            this.MessageDelegator.hd(bpe2.getGUID());
        }
        return bpe2;
    }

    public boolean lC(int n) {
        bph bph2 = this.dyx.get(n);
        if (bph2 == null) {
            return true;
        }
        return bph2.atl();
    }

    public boolean lD(int n) {
        bph bph2 = this.dyx.get(n);
        if (bph2 == null) {
            return true;
        }
        return bph2.atk();
    }

    public bph lE(int n) {
        bph bph2 = this.dyx.remove(n);
        if (bph2 != null) {
            this.MessageDelegator.hd(bph2.getGUID());
        }
        return bph2;
    }
}


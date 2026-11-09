/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class dee
extends btk {
    private Map<Integer, ded> gff = lcn.emw();

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 26118: {
                this.a((gkl)dxq2);
                break;
            }
            case 26122: {
                this.a((gkj)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gkj gkj2) {
        gkk gkk2 = (gkk)this.MessageDelegator.h(26123, this.getGUID(), gkj2.aO());
        this.MessageDelegator.b(gkj2, gkk2);
        ded ded2 = this.gff.get(gkj2.gfd);
        if (ded2 == null) {
            ded2 = new ded();
            ded2.zO(gkj2.gfd);
            this.gff.put(ded2.bkx(), ded2);
        }
        gkk2.jjV = ded2.bkz();
        this.MessageDelegator.F(gkk2);
    }

    private void a(gkl gkl2) {
        gkm gkm2 = (gkm)this.MessageDelegator.h(26119, this.getGUID(), gkl2.aO());
        this.MessageDelegator.b(gkl2, gkm2);
        assert (gkl2.gfd > 0);
        ded ded2 = this.gff.get(gkl2.gfd);
        if (ded2 == null) {
            ded2 = new ded();
            ded2.zO(gkl2.gfd);
            this.gff.put(ded2.bkx(), ded2);
        }
        ded2.zN(gkl2.jjU);
        gkm2.jjV = ded2.bkz();
        gkm2.jjX = false;
        if (ded2.bkw()) {
            gkm2.jjX = true;
            gkm2.jjV = ded2.bky();
        }
        this.MessageDelegator.F(gkm2);
    }

    public void a(oy oy2) {
        if (oy2.aGu == null) {
            return;
        }
        for (oz oz2 : oy2.aGu) {
            int n2 = lea.enW().getType(oz2.ResourceName);
            if (n2 <= 0) continue;
            ded ded2 = this.gff.get(n2);
            if (ded2 == null) {
                ded2 = new ded();
                ded2.zO(n2);
                this.gff.put(n2, ded2);
            }
            ded2.gi(oz2.aGv);
        }
    }

    public oy bkA() {
        oy oy2 = new oy();
        oy2.aGu = lcn.abH(this.gff.size());
        for (ded ded2 : this.gff.values()) {
            String string = lea.enW().getName(ded2.bkx());
            if (string == null) continue;
            oz oz2 = new oz();
            oz2.ResourceName = string;
            oz2.aGv = ded2.bkz();
            oy2.aGu.add(oz2);
        }
        return oy2;
    }
}


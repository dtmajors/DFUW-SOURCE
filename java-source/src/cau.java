/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  car
 *  cug
 */
public class cau
extends car {
    private bzt eik = null;
    int eil = -1;

    public final void cleanUp() {
        super.cleanUp();
        if (this.ehJ != null) {
            this.MessageDelegator.hd(this.ehJ.getGUID());
        }
        if (this.eik != null) {
            this.MessageDelegator.hd(this.eik.getGUID());
        }
    }

    protected final void aGv() {
        assert (this.Initialized);
        assert (!this.ehE);
        assert (this.ehB != null);
        this.ehE = true;
        if (cug.vY((int)this.aGu())) {
            caz caz2;
            this.ehC = lea.ack(this.aGu());
            if (this.ehC == null) {
                return;
            }
            this.ehJ = new cal();
            this.ehJ.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.ehJ);
            String string = cug.uP((int)this.aGu());
            this.ehK = ei.ao(string);
            int n = this.aGu();
            boolean bl = ResourceTree.isDescendant(n, cug.fgJ);
            if (bl && (caz2 = lea.epm().get(this.aGs())) != null) {
                fvy fvy2;
                this.eik = new bzt();
                this.eik.setGUID(this.MessageDelegator.bzv());
                this.eik.b((bvf)this.ehB.aAG());
                this.eik.a(this);
                this.eik.oj(n);
                this.MessageDelegator.a(this.eik);
                for (int i2 = 0; i2 < caz2.aHj().size(); ++i2) {
                    fvy2 = (fvx)this.MessageDelegator.h(20737, this.GUID, this.eik.getGUID());
                    int n2 = caz2.aHj().get(i2);
                    if (ResourceTree.isDescendant(n2, cug.fjk)) {
                        fvy2.ija = 1;
                    }
                    if (ResourceTree.isDescendant(n2, cug.fkO)) {
                        fvy2.ija = 3;
                    }
                    if (ResourceTree.isDescendant(n2, cug.fiL)) {
                        fvy2.ija = 5;
                    }
                    fvy2.ResourceType = n2;
                    this.eik.receiveMessage(fvy2);
                }
                fwa fwa2 = (fwa)this.MessageDelegator.h(20738, this.GUID, this.eik.getGUID());
                fwa2.dMT = caz2.aGp();
                fwa2.ija = 1;
                this.eik.receiveMessage(fwa2);
                if (this.eik != null) {
                    fvy2 = (fwa)this.MessageDelegator.h(20738, this.GUID, this.eik.getGUID());
                    ((fwa)fvy2).dMT = caz2.aGq();
                    ((fwa)fvy2).ija = 2;
                    this.eik.receiveMessage(fvy2);
                }
            }
            this.aGF();
            if (bl) {
                this.aGB();
            }
        }
    }

    protected int aGu() {
        if (this.eil == -1) {
            int n = super.aGu();
            if (n == cug.fih) {
                n = cug.fhP;
            } else if (n == cug.fii) {
                n = cug.fhO;
            } else if (n == cug.fil) {
                n = cug.fhT;
            } else if (n == cug.fim) {
                n = cug.fhS;
            } else if (n == cug.fir) {
                n = cug.fhX;
            } else if (n == cug.fis) {
                n = cug.fhW;
            } else if (n == cug.fin) {
                n = cug.fhV;
            } else if (n == cug.fio) {
                n = cug.fhU;
            } else if (n == cug.fij) {
                n = cug.fhR;
            } else if (n == cug.fik) {
                n = cug.fhQ;
            } else if (n == cug.fip) {
                n = cug.fhZ;
            } else if (n == cug.fiq) {
                n = cug.fhY;
            }
            this.eil = n;
        }
        return this.eil;
    }

    protected final void ot(int n) {
    }
}


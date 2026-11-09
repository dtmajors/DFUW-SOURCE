/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  hzo
 *  lcw
 */
import java.util.ArrayList;

public class hzg
extends hzk
implements hvx {
    int ksh = 0;

    public hzg() {
        super("RadialMenuAssignment", "RadialMenuAssignment.swf");
        this.OQ(jnz.nGk);
        this.a(hyb.lmC);
    }

    public void initialize() {
        super.initialize();
        hso.cxK().cxP().cyZ().a((hvx)this);
    }

    public void cleanUp() {
        super.cleanUp();
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null) {
            hso.cxK().cxP().cyZ().b((hvx)this);
        }
    }

    public void cBa() {
        super.cBa();
        int n = 0;
        cjx cjx2 = hso.cxK().cxP().cyZ().ki();
        if (cjx2 != null) {
            n = cjx2.getIndex();
        }
        this.a("setCurrentRole", new Object[]{n});
        this.roleButtonClicked(n);
    }

    public void cEc() {
    }

    @llk
    public void roleButtonClicked(int n) {
        hzo hzo2 = hzg.cyJ();
        int[] nArray = new int[]{cxd.fJK, cxd.fJL, cxd.fJM, cxd.fJN, cxd.fJO};
        hzo2.cHG().iB(nArray[n]);
        hzo2.cHG().cQJ();
        this.ksh = n;
        hzo2.cHX().b(n, 0, 0, false);
        hzo2.cHY().b(n, 0, 1, false);
        ArrayList<cjx> arrayList = lcn.emv();
        arrayList.addAll(lea.epx().aQE());
        if (lcw.aQH()) {
            this.a("setCustomRoleEnabled", new Object[0]);
        }
        this.a("setSelectedRole", new Object[]{n, lvm.sXc.bD(((cjx)arrayList.get(n)).getIndex()).exA()});
    }

    @Override
    public void a(bsh bsh2, cxc cxc2) {
    }

    @Override
    public void czV() {
    }

    @Override
    public void q(ej ej2) {
        if (ej2.getType() == 11552) {
            String string = ((ff)ej2).getStringValue();
            int n = lea.epx().hu(string).getIndex();
            this.roleButtonClicked(n);
            this.a("setCurrentRole", new Object[]{n});
        }
    }

    public final int getSelectedIndex() {
        return this.ksh;
    }
}


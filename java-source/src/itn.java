/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class itn
extends ipx
implements iua {
    private boolean lMW = false;
    private ipf lMX;
    private ipx lWE;
    private iox myV;
    private List<itn> myW = lcn.emv();
    private itn myX;
    private ipx lXy;
    private boolean lCf = false;
    private boolean myY = false;
    private int myZ = 16;

    public itn() {
        this.a(irl.dnr());
        this.lWE = ipx.l(new ipf[0]);
        this.W(this.lWE);
        this.lXy = ipx.a(0, 1, new ipf[0]);
        this.lWE.W(this.lXy);
    }

    @Override
    public boolean getSelected() {
        return this.lMW;
    }

    @Override
    public void setSelected(boolean bl) {
        if (bl == this.lMW) {
            return;
        }
        this.lMW = bl;
        iul.b(this, bl);
        this.cVa();
    }

    public ipf dqP() {
        return this.lMX;
    }

    public void am(ipf ipf2) {
        if (ipf2 == this.lMX) {
            return;
        }
        if (this.lMX != null) {
            this.lMX.removeFromParent();
        }
        this.lMX = ipf2;
        if (this.lMX != null) {
            this.lMX.rg(false);
            this.lMX.setVisible(false);
            this.c(this.lMX, 0);
        }
    }

    public ipx dmO() {
        return this.lWE;
    }

    public iox dqQ() {
        return this.myV;
    }

    public void a(iox iox2) {
        if (iox2 == this.myV) {
            return;
        }
        if (this.myV != null) {
            this.myV.djJ().removeFromParent();
        }
        this.myV = iox2;
        if (this.myV != null) {
            this.myV.setVisible(!this.myW.isEmpty());
            this.lWE.c(ipx.d(this.myV), 1);
        }
    }

    public itn dqR() {
        return this.myX;
    }

    public List<itn> dqS() {
        return Collections.unmodifiableList(this.myW);
    }

    public itn SW(int n) {
        return this.myW.get(n);
    }

    public int dqT() {
        return this.myW.size();
    }

    public void a(itn itn2, int n) {
        if (itn2 == null || itn2.myX != null || this.a(itn2)) {
            assert (false);
            return;
        }
        itn2.myX = this;
        this.myW.add(n, itn2);
        iul iul2 = this.dqU();
        if (iul2 != null) {
            itn itn3 = n > 0 ? this.myW.get(n - 1).drf() : this;
            int n2 = iul2.b(itn3);
            itn2.a(iul2, n2 + 1);
        }
        if (this.myV != null) {
            this.myV.setVisible(true);
            this.pack();
        }
    }

    public iul dqU() {
        for (iph iph2 = this.djJ(); iph2 != null; iph2 = iph2.djJ()) {
            if (!(iph2 instanceof iul)) continue;
            return (iul)iph2;
        }
        return null;
    }

    private boolean a(itn itn2) {
        itn itn3 = this.myX;
        while (itn3 != null) {
            if (itn3 == itn2) {
                return true;
            }
            itn3 = itn3.myX;
        }
        return false;
    }

    public void b(itn itn2) {
        this.a(itn2, this.myW.size());
    }

    public void c(itn itn2) {
        if (itn2 == null || itn2.myX != this) {
            assert (false);
            return;
        }
        itn2.myX = null;
        this.myW.remove(itn2);
        iul iul2 = this.dqU();
        if (iul2 != null) {
            itn2.a(iul2);
        }
        if (this.myV != null) {
            this.myV.setVisible(!this.myW.isEmpty());
        }
    }

    public void dqV() {
        if (this.myX != null) {
            this.myX.c(this);
        }
    }

    public boolean dqW() {
        return this.lCf;
    }

    public void setExpanded(boolean bl) {
        iul iul2;
        if (bl == this.lCf) {
            return;
        }
        this.lCf = bl;
        if (this.myV != null) {
            this.myV.hX(bl);
        }
        if ((iul2 = this.dqU()) != null) {
            for (itn itn2 : this.myW) {
                itn2.drg();
            }
        }
    }

    public void dqX() {
        if (this.myX != null) {
            this.myX.dqX();
            this.myX.setExpanded(true);
        }
    }

    public void sx(boolean bl) {
        this.setExpanded(bl);
        if (this.myW != null) {
            for (itn itn2 : this.myW) {
                itn2.sx(bl);
            }
        }
    }

    public void dqY() {
        this.sx(true);
    }

    public void dqZ() {
        this.sx(false);
    }

    public int cNu() {
        int n = 0;
        itn itn2 = this.myX;
        while (itn2 != null) {
            ++n;
            itn2 = itn2.myX;
        }
        return n;
    }

    public int cXH() {
        iqu iqu2 = (iqu)this.lXy.djQ();
        return iqu2 != null ? iqu2.getWidth() : 0;
    }

    public void QT(int n) {
        this.lXy.a(new iqu(n, 1));
    }

    public iug dqL() {
        return (iug)this.dqU();
    }

    public boolean dra() {
        return this.myY;
    }

    public void sy(boolean bl) {
        this.myY = bl;
    }

    public iph drb() {
        return null;
    }

    public int drc() {
        return this.myZ;
    }

    public void SX(int n) {
        if (n == this.myZ) {
            return;
        }
        this.myZ = n;
        this.pack();
    }

    public ist drd() {
        return null;
    }

    public itb dgM() {
        return null;
    }

    public void b(Comparator<itn> comparator) {
        if (this.myW.isEmpty()) {
            return;
        }
        Collections.sort(this.myW, comparator);
        iug iug2 = this.dqL();
        if (iug2 != null) {
            this.b(iug2, iug2.b(this) + 1, this.drf());
        }
    }

    public String getText() {
        return "";
    }

    public void sort() {
        this.b(new inp());
    }

    public boolean dez() {
        isk isk2 = new isk(this, this.djE(), this.drd(), this.dgM()){
            final /* synthetic */ itn mza;
            {
                this.mza = itn2;
                super(ioa2, isw2, itb2);
            }

            public void rl(String string) {
                this.mza.qB(string);
            }
        };
        isk2.addTo(this.djE().getMessageDelegator());
        return true;
    }

    public void cVa() {
    }

    public void dre() {
    }

    @Override
    public void cND() {
        if (this.lMX != null) {
            this.lMX.setVisible(this.dkb());
        }
    }

    @Override
    public boolean du(int n, int n2) {
        if (super.du(n, n2)) {
            return true;
        }
        if (this.myY) {
            this.setExpanded(!this.dqW());
        }
        return false;
    }

    @Override
    public hyn dd(int n, int n2) {
        hyn hyn2 = super.dd(n, n2);
        if (hyn2 != null) {
            return hyn2;
        }
        String string = this.getText();
        return string != null && !string.isEmpty() ? iae.oJ(string) : null;
    }

    @Override
    public hyn dz(int n, int n2) {
        hym hym2;
        ArrayList<hyj> arrayList = new ArrayList<hyj>();
        this.d(arrayList);
        if (!arrayList.isEmpty()) {
            this.djE();
            int n3 = ioa.cxP().bpb();
            this.djE();
            hym2 = new hym(n3, ioa.cxP().bpc(), arrayList);
        } else {
            hym2 = null;
        }
        return hym2;
    }

    public void d(ArrayList<hyj> arrayList) {
    }

    public void qB(String string) {
    }

    @Override
    public void cPk() {
        super.cPk();
        this.QT(this.cNu() * this.myZ - (this.myV != null && this.myV.djL() ? this.myV.getWidth() : 0));
    }

    private int a(iul iul2, int n) {
        iul2.b(this, n);
        for (itn itn2 : this.myW) {
            n = itn2.a(iul2, n + 1);
        }
        this.drh();
        this.pack();
        return n;
    }

    private void a(iul iul2) {
        for (itn itn2 : this.myW) {
            itn2.a(iul2);
        }
        iul2.d(this);
    }

    private itn drf() {
        return !this.myW.isEmpty() ? this.myW.get(this.myW.size() - 1).drf() : this;
    }

    private void drg() {
        this.drh();
        for (itn itn2 : this.myW) {
            itn2.drg();
        }
    }

    private void drh() {
        this.setVisible(this.myX == null || this.myX.lCf && this.myX.djL());
    }

    private int a(iug iug2, int n, itn itn2) {
        iug2.a((iua)this, n);
        n = this.b(iug2, n + 1, itn2);
        return n >= 0 ? (this != itn2 ? n : -1) : -1;
    }

    private int b(iug iug2, int n, itn itn2) {
        for (itn itn3 : this.myW) {
            n = itn3.a(iug2, n, itn2);
            if (n != -1) continue;
            return -1;
        }
        return n;
    }
}


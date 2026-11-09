/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class inn
extends izm {
    private imr mkM;
    private Map<ilx, ino> mmL = lcn.emw();

    public inn(imr imr2) {
        this.a(iun.mAi);
        this.mkM = imr2;
        this.c(imr2.dem());
        ilw.ddy().miD.c((jlf<ilx>)new jlr<inn, ilx>(this, this){
            final /* synthetic */ inn mmM;
            {
                this.mmM = inn2;
                super(inn3);
            }

            public void b(inn inn2, ilx ilx2) {
                inn.a(inn2, ilx2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((inn)object, (ilx)object2);
            }
        });
        ilw.ddy().miB.a((jlg<ilq, ilx>)new jls<inn, ilq, ilx>(this, this){
            final /* synthetic */ inn mmM;
            {
                this.mmM = inn2;
                super(inn3);
            }

            public void c(inn inn2, ilq ilq2, ilx ilx2) {
                inn.a(inn2, ilq2, ilx2);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.c((inn)object, (ilq)object2, (ilx)object3);
            }
        });
        ilw.ddy().miC.a((jlg<ilq, ilx>)new jls<inn, ilq, ilx>(this, this){
            final /* synthetic */ inn mmM;
            {
                this.mmM = inn2;
                super(inn3);
            }

            public void c(inn inn2, ilq ilq2, ilx ilx2) {
                inn.b(inn2, ilq2, ilx2);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.c((inn)object, (ilq)object2, (ilx)object3);
            }
        });
        this.mkM.mkr.b(new jlq<inn>(this, this){
            final /* synthetic */ inn mmM;
            {
                this.mmM = inn2;
                super(inn3);
            }

            public void b(inn inn2) {
                inn.a(inn2);
            }

            public /* synthetic */ void R(Object object) {
                this.b((inn)object);
            }
        });
        this.deU();
    }

    @Override
    public void cXg() {
        List<iua> list = this.drp();
        if (list != null && !list.isEmpty()) {
            ino ino2 = (ino)list.get(0);
            this.mkM.a(ino2.dhf());
        }
    }

    @Override
    public hyn dz(int n, int n2) {
        hyn hyn2 = super.dz(n, n2);
        if (hyn2 != null) {
            return hyn2;
        }
        List<iua> list = this.drp();
        if (list != null && !list.isEmpty()) {
            ino ino2 = (ino)list.get(0);
            ArrayList<ims> arrayList = lcn.emv();
            arrayList.add(ino2);
            return ilm.bi(arrayList);
        }
        return null;
    }

    private void c(ilq ilq2) {
        ino ino2 = this.d(ilq2);
        this.c(ino2);
        List<ilx> list = ilq2.getChildren();
        for (ilx ilx2 : list) {
            this.a(ino2, ilx2);
        }
        ino2.drd().a(isf.mwO, 14);
        ino2.setExpanded(true);
    }

    private void a(itn itn2, ilx ilx2) {
        if (ilx2 instanceof ilq) {
            ilq ilq2 = (ilq)ilx2;
            ino ino2 = this.d(ilq2);
            itn2.b(ino2);
            List<ilx> list = ilq2.getChildren();
            for (ilx ilx3 : list) {
                this.a(ino2, ilx3);
            }
            itn2.sort();
        }
    }

    private ino d(ilq ilq2) {
        ino ino2 = new ino(ilq2);
        this.mmL.put(ilq2, ino2);
        this.r(ilq2);
        return ino2;
    }

    private ino r(ilx ilx2) {
        ino ino2 = this.mmL.get(ilx2);
        if (ino2 != null) {
            boolean bl;
            boolean bl2 = bl = !lhn.equal(ino2.getText().toLowerCase(), ilx2.ddF().exA().toLowerCase());
            if (bl) {
                ino2.drd().o(ilx2.ddF());
                return (ino)ino2.dqR();
            }
        }
        return null;
    }

    private void q(ilx ilx2) {
        ino ino2 = this.r(ilx2);
        if (ino2 != null) {
            ino2.sort();
        }
    }

    private void b(ilq ilq2, ilx ilx2) {
        itn itn2;
        if (ilx2 instanceof ilq && (itn2 = (itn)this.mmL.get(ilq2)) != null) {
            ilq ilq3 = (ilq)ilx2;
            itn2.b(this.d(ilq3));
            List<ilx> list = ((ilq)ilx2).getChildren();
            for (ilx ilx3 : list) {
                this.b(ilq3, ilx3);
            }
            itn2.sort();
        }
    }

    private void c(ilq ilq2, ilx ilx2) {
        itn itn2;
        if (ilx2 instanceof ilq && (itn2 = (itn)this.mmL.remove(ilx2)) != null) {
            ilq ilq3 = (ilq)ilx2;
            List<ilx> list = ((ilq)ilx2).getChildren();
            for (ilx ilx3 : list) {
                this.c(ilq3, ilx3);
            }
            itn2.dqV();
        }
    }

    private void deU() {
        itn itn2;
        ilq ilq2 = this.mkM.der();
        if (ilq2 != null && (itn2 = (itn)this.mmL.get(ilq2)) != null) {
            itn2.dqX();
            this.e(itn2);
            this.drW();
            itn2.setSelected(true);
        }
    }

    static /* synthetic */ void a(inn inn2, ilx ilx2) {
        inn2.q(ilx2);
    }

    static /* synthetic */ void a(inn inn2, ilq ilq2, ilx ilx2) {
        inn2.b(ilq2, ilx2);
    }

    static /* synthetic */ void b(inn inn2, ilq ilq2, ilx ilx2) {
        inn2.c(ilq2, ilx2);
    }

    static /* synthetic */ void a(inn inn2) {
        inn2.deU();
    }
}


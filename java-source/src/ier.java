/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import spenefett.hid.gui.serialization.dto.SFGUIElementListDTO;
import spenefett.hid.gui.serialization.dto.SFGUIFolderDTO;
import spenefett.hid.gui.serialization.dto.SFGUIFolderListDTO;

public class ier
extends hzk
implements bto,
hwg {
    protected List<ieq> lOp = lcn.emv();
    protected Map<Integer, ieq> lOq = lcn.emw();
    protected int lOr = 0;
    protected int lOs;
    SFGUIFolderListDTO lOt = new SFGUIFolderListDTO();
    private boolean ljJ = false;
    protected float lOu = 0.0f;
    protected float lOv = 0.0f;
    protected boolean lOw = false;

    protected ier(String string, String string2) {
        super(string, string2);
    }

    public void initialize() {
        super.initialize();
    }

    protected void cBa() {
        super.cBa();
        this.ljJ = true;
        SFGUIElementListDTO sFGUIElementListDTO = new SFGUIElementListDTO();
        for (ieq ieq2 : this.lOp) {
            sFGUIElementListDTO.list.add(ieq2.cBj());
        }
        this.a("insert", new Object[]{0, sFGUIElementListDTO});
        this.a("updateFolders", new Object[]{this.lOt});
    }

    protected void cEk() {
        SFGUIElementListDTO sFGUIElementListDTO = new SFGUIElementListDTO();
        for (ieq ieq2 : this.lOp) {
            sFGUIElementListDTO.list.add(ieq2.cBj());
        }
        this.a("update", new Object[]{sFGUIElementListDTO});
    }

    public void a(ieq ieq2, int n) {
        this.lOq.put(ieq2.getID(), ieq2);
        if (n > this.lOp.size()) {
            n = this.lOp.size();
        }
        this.lOp.add(n, ieq2);
        if (this.ljJ) {
            SFGUIElementListDTO sFGUIElementListDTO = new SFGUIElementListDTO();
            sFGUIElementListDTO.list.add(ieq2.cBj());
            this.a("insert", new Object[]{n, sFGUIElementListDTO});
        }
    }

    public void Qg(int n) {
        ieq ieq2 = this.lOp.get(n);
        this.lOq.remove(ieq2.getID());
        this.lOp.remove(n);
        this.a("remove", new Object[]{n, 1});
    }

    public void a(ieq ieq2) {
        SFGUIElementListDTO sFGUIElementListDTO = new SFGUIElementListDTO();
        sFGUIElementListDTO.list.add(ieq2.cBj());
        this.a("update", new Object[]{sFGUIElementListDTO});
    }

    public void b(ieq ieq2, int n) {
        this.a("updateIndicators", new Object[]{ieq2.getID(), n});
    }

    public void a(ieq ieq2, float f) {
        this.a("updateProgress", new Object[]{ieq2.getID(), Float.valueOf(f)});
    }

    public void c(ieq ieq2, int n) {
        this.a("updateState", new Object[]{ieq2.getID(), n});
    }

    public void a(ieq ieq2, float f, float f2, float f3) {
        this.a("updateLocalTransform", new Object[]{ieq2.getID(), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)});
    }

    public void cQn() {
        SFGUIElementListDTO sFGUIElementListDTO = new SFGUIElementListDTO();
        for (ieq ieq2 : this.lOp) {
            sFGUIElementListDTO.list.add(ieq2.cBj());
        }
        this.a("update", new Object[]{sFGUIElementListDTO});
        this.a("updateFolders", new Object[]{this.lOt});
    }

    protected void clearState() {
        SFGUIElementListDTO sFGUIElementListDTO = new SFGUIElementListDTO();
        for (ieq ieq2 : this.lOp) {
            sFGUIElementListDTO.list.add(ieq2.cBj());
        }
        this.a("remove", new Object[]{0, sFGUIElementListDTO.list.size()});
        this.lOt.list.clear();
        this.a("updateFolders", new Object[]{this.lOt});
        this.lOp.clear();
        this.lOq.clear();
        this.lOr = 0;
        this.lOs = 0;
    }

    protected void b(ieq ieq2) {
    }

    protected void c(ieq ieq2) {
    }

    @Override
    protected boolean og(String string) {
        if (this.lOw) {
            return false;
        }
        hwl hwl2 = new hwl(string);
        ieq ieq2 = this.lOq.get(hwl2.cck);
        if (ieq2 == null) {
            return false;
        }
        if (!ieq2.cQk()) {
            return false;
        }
        if (ieq2.cQm() != null && ieq2.cQm() instanceof hwv) {
            hwv hwv2 = (hwv)ieq2.cQm();
            return hwv2.cCr() != ldy.a.FOLDER;
        }
        return true;
    }

    @Override
    protected ifg of(String string) {
        Object object;
        if (this.lOw) {
            return null;
        }
        hwl hwl2 = new hwl(string);
        ieq ieq2 = this.lOq.get(hwl2.cck);
        if (ieq2 == null) {
            return null;
        }
        if (ieq2.cQm() != null && ieq2.cQm() instanceof hwv && (object = (hwv)ieq2.cQm()).cCr() == ldy.a.FOLDER) {
            return null;
        }
        object = new ifh(ieq2.cQm(), hwl2.lir, hwl2.lis);
        return object;
    }

    protected boolean cEm() {
        return true;
    }

    protected void h(int n, int n2, String string) {
        if (this.lOw) {
            return;
        }
        this.pX(string);
    }

    protected void i(int n, int n2, String string) {
        if (this.lOw) {
            return;
        }
        if (string == null) {
            return;
        }
        hwl hwl2 = new hwl(string);
        ieq ieq2 = this.lOq.get(hwl2.cck);
        if (ieq2 != null && ieq2.cQk()) {
            this.c(ieq2);
        } else {
            this.pX(string);
        }
    }

    protected void pX(String string) {
        if (string == null) {
            return;
        }
        String[] stringArray = string.split(";");
        if (stringArray.length < 2) {
            return;
        }
        if (!stringArray[0].equals("folder")) {
            return;
        }
        int n = Integer.valueOf(stringArray[1]);
        int n2 = 0;
        for (n2 = 0; n2 < this.lOt.list.size() && this.lOt.list.get((int)n2).id != n; ++n2) {
        }
        while (this.lOt.list.size() - 1 > n2) {
            this.Qh(this.lOt.list.get((int)(this.lOt.list.size() - 1)).id);
            this.lOt.list.remove(this.lOt.list.size() - 1);
        }
        this.a("updateFolders", new Object[]{this.lOt});
        this.lOs = n;
        this.Qi(n);
    }

    protected void Qh(int n) {
    }

    protected void Qi(int n) {
    }

    protected int P(String string, String string2) {
        ++this.lOr;
        SFGUIFolderDTO sFGUIFolderDTO = new SFGUIFolderDTO();
        sFGUIFolderDTO.id = this.lOr;
        sFGUIFolderDTO.name = string;
        sFGUIFolderDTO.titleName = string2;
        this.lOt.list.add(sFGUIFolderDTO);
        this.a("updateFolders", new Object[]{this.lOt});
        this.lOs = this.lOr;
        return this.lOr;
    }

    protected int pY(String string) {
        return this.P(string, string);
    }

    public int c(hwm hwm2) {
        for (int j = 0; j < this.lOp.size(); ++j) {
            ieq ieq2 = this.lOp.get(j);
            if (ieq2.cQm() != hwm2) continue;
            return j;
        }
        return -1;
    }

    public ieq d(hwm hwm2) {
        int n = this.c(hwm2);
        return n >= 0 ? this.lOp.get(n) : null;
    }

    protected hwm Qj(int n) {
        for (int j = 0; j < this.lOp.size(); ++j) {
            ieq ieq2 = this.lOp.get(j);
            if (ieq2.getID() != n) continue;
            return ieq2.cQm();
        }
        return null;
    }

    protected void cQo() {
        while (this.lOp.size() > 0) {
            this.Qg(0);
        }
    }

    protected int E(bsh bsh2) {
        if (bsh2 == null || this.lOp == null) {
            return -1;
        }
        for (int j = 0; j < this.lOp.size(); ++j) {
            hwo hwo2;
            hwm hwm2;
            ieq ieq2 = this.lOp.get(j);
            if (ieq2 == null || !((hwm2 = ieq2.cQm()) instanceof hwo) || (hwo2 = (hwo)hwm2).cBu() == null || !ldv.au(hwo2.cBu().getGUID(), bsh2.getGUID())) continue;
            return j;
        }
        return -1;
    }

    @Override
    protected void f(hzk hzk2, ifg ifg2) {
    }

    @Override
    protected void g(hzk hzk2, ifg ifg2) {
    }

    @Override
    public void b(brt brt2, int n) {
        assert (false);
    }

    public void Qk(int n) {
        float f = -4000.0f;
        if (n == 0) {
            f = 4000.0f;
        }
        this.lOu = f;
        if (this.lOv * this.lOu < 0.0f) {
            this.lOv = 0.0f;
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.lOu == 0.0f) {
            this.lOu = -this.lOv * 7.0f;
        }
        this.lOv = (float)((double)this.lOv + (double)this.lOu * ldz2.qwh);
        float f = 1000.0f;
        if (this.lOv > f) {
            this.lOv = f;
        } else if (this.lOv < -f) {
            this.lOv = -f;
        }
        if (this.lOv != 0.0f) {
            this.a("scrollContainer", new Object[]{(double)this.lOv * ldz2.qwh});
        }
        this.lOu = 0.0f;
    }

    public hwo Ql(int n) {
        for (ieq ieq2 : this.lOp) {
            hwo hwo2;
            bsh bsh2;
            hwm hwm2 = ieq2.cQm();
            if (!(hwm2 instanceof hwo) || (bsh2 = (hwo2 = (hwo)hwm2).cBu()) == null || bsh2.az() != n) continue;
            return (hwo)hwm2;
        }
        return null;
    }

    public hwo rw(ldv ldv2) {
        for (ieq ieq2 : this.lOp) {
            hwo hwo2;
            bsh bsh2;
            hwm hwm2 = ieq2.cQm();
            if (!(hwm2 instanceof hwo) || (bsh2 = (hwo2 = (hwo)hwm2).cBu()) == null || !bsh2.getGUID().equals(ldv2)) continue;
            return (hwo)hwm2;
        }
        return null;
    }

    public hwv Qm(int n) {
        for (ieq ieq2 : this.lOp) {
            hwv hwv2;
            bsj bsj2;
            hwm hwm2 = ieq2.cQm();
            if (!(hwm2 instanceof hwv) || (bsj2 = (hwv2 = (hwv)hwm2).cCs()) == null || hwv2.awK().getType() != n) continue;
            return (hwv)hwm2;
        }
        return null;
    }

    protected boolean cFu() {
        if (this.lOt.list.size() > 1) {
            int n = this.lOt.list.get((int)(this.lOt.list.size() - 2)).id;
            this.pX("folder;" + n);
            return true;
        }
        return false;
    }
}


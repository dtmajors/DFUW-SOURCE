/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.Map;

public class ilj
extends ijh
implements hvx {
    public static final String mhF = "use_prompt_background";
    private static final String mhG = "use_prompt_text_background";
    private static final String mhH = "use_prompt_icon_mouse_left";
    private static final String mhI = "use_prompt_icon_mouse_middle";
    private static final String mhJ = "use_prompt_icon_mouse_right";
    private static final String mhK = "use_prompt_icon_pickaxe";
    private static final String mhL = "use_prompt_icon_skinner";
    private static final String mhM = "use_prompt_icon_woodaxe";
    private static final String mhN = "use_prompt_icon_sickle";
    private static final String mhO = "use_prompt_icon_key";
    private static final String mhP = "_unavailable";
    private static final String mhQ = "_available";
    public static final String mhR = "use_prompt_icon_gears";
    private static Map<Integer, String> mhS = null;
    private ipb lLM = null;
    private ipb mhT = null;
    private ipb mhU = null;
    private ipb mhV = null;
    private ipb mhW = null;
    private ist mhX = null;
    private ist mhY = null;
    private ipg<Boolean> mhZ;
    private ipg<Boolean> mia;
    private hvr mib = null;

    public ilj() {
        super("UsePrompt");
        this.a(new a(this, null));
        this.mhT = new ipb(mhG);
        this.mhT.a((iqz)null);
        this.W(this.mhT);
        this.lLM = new ipb(mhF);
        this.lLM.a((iqz)null);
        this.W(ipx.c(new ipf[]{ipx.d(this.lLM)}));
        this.mhW = new ipb(mhR);
        this.mhW.a((iqz)null);
        this.W(ipx.c(new ipf[]{ipx.d(this.mhW)}));
        this.mhU = new ipb();
        this.mhU.a((iqz)null);
        this.W(ipx.c(new ipf[]{ipx.d(this.mhU)}));
        this.mhX = new ist("F");
        this.mhX.b(isf.mwO);
        this.mhX.zY(this.ddb());
        this.mhX.Rk(12685656);
        this.W(this.mhX);
        this.mhY = new ist("key");
        this.mhY.b(isf.mwO);
        this.mhY.zY(this.ddc());
        this.mhY.Rk(0xCFCFCF);
        this.W(this.mhY);
        this.mhV = new ipb();
        this.mhV.a((iqz)null);
        this.W(ipx.c(new ipf[]{ipx.d(this.mhV)}));
        this.dda();
        hso.cxK().cxP().cyZ().a((hvx)this);
        this.mhZ = new ipg<Boolean>(this, (ipf)this, "SUP", hsu.ldg, true){
            final /* synthetic */ ilj mic;
            {
                this.mic = ilj2;
                super(ipf2, string, hsu2, bl);
            }

            public Boolean dQ(int n, int n2) {
                return Boolean.TRUE;
            }

            public void dak() {
                this.mic.setVisible((Boolean)this.get());
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dQ(n, n2);
            }
        };
        this.mia = new ipg<Boolean>(this, (ipf)this, "SB", hsu.ldg, true){
            final /* synthetic */ ilj mic;
            {
                this.mic = ilj2;
                super(ipf2, string, hsu2, bl);
            }

            public Boolean dQ(int n, int n2) {
                return Boolean.TRUE;
            }

            public void dak() {
                this.mic.b(iie.cZe().cZf());
            }

            public /* synthetic */ Object dR(int n, int n2) {
                return this.dQ(n, n2);
            }
        };
        iiw.mbY.c((jlf<Boolean>)new jlr<ilj, Boolean>(this, this){
            final /* synthetic */ ilj mic;
            {
                this.mic = ilj2;
                super(ilj3);
            }

            public void a(ilj ilj2, Boolean bl) {
                if (bl.booleanValue()) {
                    this.mic.setVisible(false);
                } else {
                    this.mic.b(iie.cZe().cZf());
                }
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((ilj)object, (Boolean)object2);
            }
        });
        this.setVisible(false);
        this.hz(0.0f);
    }

    public boolean dcV() {
        return this.mhZ.get();
    }

    public void qN(boolean bl) {
        this.mhZ.set(bl);
    }

    public boolean dcW() {
        return this.mia.get();
    }

    public void qO(boolean bl) {
        this.mia.set(bl);
    }

    private void dcX() {
        this.qw(jjd.a(hso.cxK().cxR().dMc().l((jmq)jmq.nzu).iNW));
    }

    private void dcY() {
        this.qw(jjd.a(hso.cxK().cxR().dMc().l((jmq)jmq.nzz).iNW));
    }

    private void qw(String string) {
        if (string == null || string.isEmpty() || lhn.equal(string, "---")) {
            return;
        }
        lfn.print("USE PROMPT : BINDING = " + string);
        if (string.toLowerCase().startsWith("button")) {
            int n = 0;
            try {
                n = Integer.parseInt("" + string.charAt(string.length() - 1));
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
            this.Rl(n);
        } else {
            this.j(string.charAt(0));
            if (string.length() > 1) {
                this.qx(string.substring(1));
            }
        }
    }

    private void j(char c2) {
        this.mhX.setText("" + c2);
        this.mhX.zY(this.ddb());
        this.mhX.setVisible(true);
    }

    private void qx(String string) {
        this.mhY.setText(string);
        this.mhY.zY(this.ddc());
        this.mhY.setVisible(true);
        this.mhT.setVisible(true);
    }

    private void Rl(int n) {
        String string = null;
        switch (n) {
            case 0: {
                string = mhH;
                break;
            }
            case 1: {
                string = mhJ;
                break;
            }
            case 2: {
                string = mhI;
                break;
            }
            default: {
                return;
            }
        }
        switch (this.daD()) {
            case mcL: {
                ipc.c(this.djE().loi, string, 64, 64);
                break;
            }
            case mcM: {
                ipc.c(this.djE().loi, string, 72, 72);
                break;
            }
            case mcN: {
                ipc.c(this.djE().loi, string, 80, 80);
            }
        }
        this.mhV.qP(string);
        this.mhV.setVisible(true);
    }

    private void y(String string, boolean bl) {
        String string2 = string + (bl ? mhQ : mhP);
        switch (this.daD()) {
            case mcL: {
                ipc.c(this.djE().loi, string2, 64, 64);
                break;
            }
            case mcM: {
                ipc.c(this.djE().loi, string2, 72, 72);
                break;
            }
            case mcN: {
                ipc.c(this.djE().loi, string2, 80, 80);
            }
        }
        this.mhU.qP(string2);
        this.mhU.setVisible(true);
    }

    private void dcZ() {
        this.mhW.setVisible(true);
    }

    private int Rm(int n) {
        if (lea.enW().isDescendant(n, cug.fqF) || lea.enW().isDescendant(n, cug.frq) || lea.enW().isDescendant(n, cug.fpt)) {
            return cug.fvJ;
        }
        if (lea.enW().isDescendant(n, cug.fqG) || lea.enW().isDescendant(n, cug.fpu) || lea.enW().isDescendant(n, cug.fpv) || lea.enW().isDescendant(n, cug.fpw) || lea.enW().isDescendant(n, cug.fpx)) {
            return cug.fvn;
        }
        if (lea.enW().isDescendant(n, cug.fqH) || lea.enW().isDescendant(n, cug.frr) || lea.enW().isDescendant(n, cug.fpy)) {
            return cug.fvy;
        }
        if (lea.enW().isDescendant(n, cug.fgF) || lea.enW().isDescendant(n, cug.fqE)) {
            return cug.fvU;
        }
        if (lea.enW().isDescendant(n, cug.fjJ)) {
            return cug.fke;
        }
        return -1;
    }

    private boolean Rn(int n) {
        if (hso.cxK() == null || hso.cxK().cxP() == null || hso.cxK().cxP().cyZ() == null) {
            return false;
        }
        bsh bsh2 = hso.cxK().cxP().cyZ().cAc();
        if (bsh2 == null) {
            return false;
        }
        if (!lea.enW().isDescendant(bsh2.az(), n)) {
            return false;
        }
        return hso.cxK().cxP().cyZ().cAe();
    }

    private boolean Ro(int n) {
        if (hso.cxK() == null || hso.cxK().cxP() == null || hso.cxK().cxP().cza() == null) {
            return false;
        }
        return hso.cxK().cxP().cza().OJ(n) > 0;
    }

    private void dda() {
        switch (this.daD()) {
            case mcL: {
                this.lLM.setSize(64, 64);
                this.mhW.setSize(64, 64);
                this.mhU.setSize(64, 64);
                this.mhV.setSize(64, 64);
                this.mhT.setSize(99, 28);
                break;
            }
            default: {
                this.lLM.setSize(72, 72);
                this.mhW.setSize(72, 72);
                this.mhU.setSize(72, 72);
                this.mhV.setSize(72, 72);
                this.mhT.setSize(112, 31);
                break;
            }
            case mcN: {
                this.lLM.setSize(80, 80);
                this.mhW.setSize(80, 80);
                this.mhU.setSize(80, 80);
                this.mhV.setSize(80, 80);
                this.mhT.setSize(125, 34);
            }
        }
        this.setSize(200, 80);
    }

    private int ddb() {
        switch (this.daD()) {
            case mcL: {
                return this.mhU.djL() ? 16 : 22;
            }
            default: {
                return this.mhU.djL() ? 19 : 25;
            }
            case mcN: 
        }
        return this.mhU.djL() ? 22 : 28;
    }

    private int ddc() {
        switch (this.daD()) {
            case mcL: {
                return 16;
            }
            default: {
                return 19;
            }
            case mcN: 
        }
        return 22;
    }

    private boolean a(int n, iii iii2) {
        if (lea.enW().isDescendant(n, cug.fqX)) {
            return false;
        }
        if (lea.enW().isDescendant(n, cug.fpl)) {
            return false;
        }
        if (n == cug.fpn) {
            return false;
        }
        if (lea.enW().isDescendant(n, cug.fnC)) {
            return false;
        }
        if (lea.enW().isDescendant(n, cug.fnB) && lea.enW().getName(n).endsWith("Base")) {
            return false;
        }
        if (cug.wi((int)n)) {
            return true;
        }
        if (lea.enW().isDescendant(n, cug.fnI)) {
            return true;
        }
        if (lea.enW().isDescendant(n, cug.fpp)) {
            return true;
        }
        if (iii2 == iii.lZI || iii2 == iii.lZX) {
            return true;
        }
        if (iii2 == iii.lZY) {
            return true;
        }
        if (cug.vE((int)n)) {
            return true;
        }
        if (n == cug.fnG) {
            return true;
        }
        if (lea.enW().isDescendant(n, cug.fqP)) {
            return true;
        }
        if (cug.wf((int)n)) {
            return true;
        }
        if (lea.enW().isDescendant(n, cug.fia)) {
            return true;
        }
        if (lea.enW().isDescendant(n, cug.fnc)) {
            return true;
        }
        return lea.enW().isDescendant(n, cug.fqz) && lea.enW().getName(n).toLowerCase().startsWith("r_exploration");
    }

    private boolean Rp(int n) {
        if (lea.enW().isDescendant(n, cug.fjJ)) {
            return false;
        }
        if (cug.ww((int)n)) {
            return true;
        }
        if (lea.enW().isDescendant(n, cug.fgx)) {
            return true;
        }
        if (lea.enW().isDescendant(n, cug.fqX)) {
            return true;
        }
        return lea.enW().isDescendant(n, cug.fpl);
    }

    @Override
    public void d(iif iif2) {
        this.lLM.setVisible(false);
        this.mhU.setVisible(false);
        this.mhW.setVisible(false);
        this.mhV.setVisible(false);
        this.mhX.setVisible(false);
        this.mhY.setVisible(false);
        this.mhT.setVisible(false);
    }

    @Override
    public void c(iif iif2) {
        int n;
        if (!this.mhZ.get().booleanValue()) {
            return;
        }
        if (!((jpx)this.dax().getMessageDelegator().bzx().bzt().d(lcr.qBQ)).d(iif2.lYz, iif2.lYy)) {
            if (this.getAlpha() > 0.0f) {
                this.ddd();
            }
            return;
        }
        this.lLM.setVisible(false);
        this.mhU.setVisible(false);
        this.mhW.setVisible(false);
        this.mhV.setVisible(false);
        this.mhX.setVisible(false);
        this.mhY.setVisible(false);
        this.mhT.setVisible(false);
        this.dde();
        if (this.a(iif2.lYy, iif2.lYw)) {
            super.c(iif2);
            if (this.mia.get().booleanValue()) {
                this.dcX();
            } else {
                this.dcZ();
            }
            this.lLM.setVisible(true);
            this.dda();
        } else if (lea.enW().isDescendant(iif2.lYy, cug.fjJ)) {
            int n2 = this.Rm(iif2.lYy);
            if (n2 >= 0) {
                super.c(iif2);
                if (cug.uC((int)iif2.lYy)) {
                    this.y(mhS.get(n2), this.Ro(cug.uN((int)iif2.lYy)));
                }
                if (this.mia.get().booleanValue()) {
                    this.dcX();
                } else if (!this.mhU.djL()) {
                    this.dcZ();
                }
                this.lLM.setVisible(true);
                this.dda();
            }
        } else if ((cug.ww((int)iif2.lYy) || lea.enW().isDescendant(iif2.lYy, cug.fgx) || lea.enW().isDescendant(iif2.lYy, cug.fqX) || lea.enW().isDescendant(iif2.lYy, cug.fpl)) && (n = this.Rm(iif2.lYy)) >= 0) {
            super.c(iif2);
            this.y(mhS.get(n), this.Rn(n));
            if (this.mia.get().booleanValue()) {
                this.dcY();
            }
            this.lLM.setVisible(true);
            this.dda();
        }
    }

    @Override
    public Integer dO(int n, int n2) {
        return (int)((float)n * 0.6f);
    }

    @Override
    public Integer dP(int n, int n2) {
        return (int)((float)n2 * 0.6f);
    }

    @Override
    public ijc cZY() {
        return new ilk();
    }

    @Override
    public void dah() {
        super.dah();
        ilk ilk2 = (ilk)this.daw();
        ilk2.qN(this.dcV());
        ilk2.qO(this.dcW());
        ilk2.kI(this.daE());
        ilk2.a(this.daD());
    }

    @Override
    public void dai() {
        super.dai();
        ilk ilk2 = (ilk)this.daw();
        this.qN(ilk2.dcV());
        this.qO(ilk2.dcW());
        this.kI(ilk2.daE());
        this.a(ilk2.daD());
        this.dda();
        this.cPk();
        this.b(iie.cZe().cZf());
    }

    @Override
    public void daa() {
        if (this.lLM != null) {
            this.lLM.hz(this.daE());
        }
        if (this.mhT != null) {
            this.mhT.hz(this.daE());
        }
    }

    @Override
    public void a(bsh bsh2, cxc cxc2) {
    }

    @Override
    public void czV() {
        if (iie.cZe().cZf() != null && iie.cZe().cZf().lYw != iii.lZu) {
            this.c(iie.cZe().cZf());
        }
    }

    @Override
    public void q(ej ej2) {
    }

    private void ddd() {
        if (this.mib != null) {
            return;
        }
        this.mib = new ioe(this, this, this.daE(), 0.0f, 0.5){
            final /* synthetic */ ilj mic;
            {
                this.mic = ilj2;
                super(ipf2, f, f2, d2);
            }

            public void hz(float f) {
                this.moH.hz(f);
            }

            public void aA(ldz ldz2) {
                this.moH.setVisible(false);
            }
        };
        hso.cxK().cxP().czy().a(this.mib);
    }

    private void dde() {
        if (this.mib != null) {
            hso.cxK().cxP().czy().b(this.mib);
            this.mib = null;
        }
    }

    static /* synthetic */ ist a(ilj ilj2) {
        return ilj2.mhX;
    }

    static /* synthetic */ ipb b(ilj ilj2) {
        return ilj2.mhU;
    }

    static /* synthetic */ ist c(ilj ilj2) {
        return ilj2.mhY;
    }

    static /* synthetic */ ipb d(ilj ilj2) {
        return ilj2.mhT;
    }

    static {
        mhS = lcn.emw();
        mhS.put(cug.fke, mhO);
        mhS.put(cug.fvn, mhK);
        mhS.put(cug.fvU, mhL);
        mhS.put(cug.fvJ, mhN);
        mhS.put(cug.fvy, mhM);
    }
}


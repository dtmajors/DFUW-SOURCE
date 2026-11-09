/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class jqx {
    protected static final joi nHy = joi.nHV;
    public final lbh kAz;
    private final lha<dxq, dxq> jAj;
    private final lha<jrq, jrd> nHH;
    private final Map<ldv, jqj> nTk = new HashMap<ldv, jqj>();
    private final Map<jpf, jpb> nTl = new HashMap<jpf, jpb>();
    private final ldl nTm = new ldl();
    private final List<jqj> nTn = new ArrayList<jqj>();
    public final Collection<jqj> nTo = Collections.unmodifiableCollection(this.nTn);
    public final Collection<jqk> nTp = lin.a(this.nTo, jqk.class);
    public final jqm nTq;
    public final jqn nTr;
    public final jql nTs;
    public final jqo nTt;
    private final lbi<jrt> nTu = new lbi<jrt>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ jqx nTG;
        {
            this.nTG = jqx2;
        }

        public final void a(jrt jrt2) {
            if (jrt2.getErrorCode() != 0) {
                if (!$assertionsDisabled) {
                    throw new AssertionError();
                }
                return;
            }
            int n = jrt2.dRx();
            if ((n & 0x40) != 0) {
                jqx.a(this.nTG, jrt2.dRO());
            }
            if ((n & 1) != 0) {
                jqx.b(this.nTG, jrt2.dRI());
            }
            if ((n & 2) != 0) {
                jqx.c(this.nTG, jrt2.dRJ());
            }
            if ((n & 8) != 0) {
                jqx.d(this.nTG, jrt2.dRK());
            }
            if ((n & 0x20) != 0) {
                jqx.e(this.nTG, jrt2.dRN());
            }
            if ((n & 0x10) != 0) {
                jqx.f(this.nTG, jrt2.dRL());
            }
            if ((n & 4) != 0) {
                jqx.g(this.nTG, jrt2.dRM());
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((jrt)object);
        }

        static {
            $assertionsDisabled = !jqx.class.desiredAssertionStatus();
        }
    };
    private final lbi<jri> nTv = new lbi<jri>(this){
        final /* synthetic */ jqx nTG;
        {
            this.nTG = jqx2;
        }

        public final void b(jri jri2) {
            jqj jqj2 = (jqj)jqx.a(this.nTG).get(jri2.dRs());
            if (jri2.getErrorCode() != 0) {
                if (jri2.getErrorCode() == -2147024726) {
                    return;
                }
                int n = 5;
                if (jri2.getErrorCode() == -2147024891) {
                    n = 4;
                }
                return;
            }
            jqx.b((jqx)this.nTG).rnh.m(jqz.r(jqx.b((jqx)this.nTG).rng, jri2.dRs()));
            jqj2.dRe();
        }

        public /* synthetic */ void m(Object object) {
            this.b((jri)object);
        }
    };
    private final lbi<jrk> nTw = new lbi<jrk>(this){
        final /* synthetic */ jqx nTG;
        {
            this.nTG = jqx2;
        }

        public final void b(jrk jrk2) {
            jqj jqj2 = (jqj)jqx.a(this.nTG).get(jrk2.dRs());
            if (jrk2.getErrorCode() != 0) {
                if (jrk2.getErrorCode() == -2147024884) {
                    return;
                }
                return;
            }
            jqj2.dRf();
        }

        public /* synthetic */ void m(Object object) {
            this.b((jrk)object);
        }
    };
    private final lbi<jrs> nTx = new lbi<jrs>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ jqx nTG;
        {
            this.nTG = jqx2;
        }

        public final void b(jrs jrs2) {
            jqj jqj2 = (jqj)jqx.a(this.nTG).get(jrs2.dRs());
            if (jrs2.getErrorCode() != 0) {
                if (!$assertionsDisabled) {
                    throw new AssertionError();
                }
                return;
            }
            jqj2.e(jrs2.dRv(), jrs2.dRw(), jrs2.dRu());
        }

        public /* synthetic */ void m(Object object) {
            this.b((jrs)object);
        }

        static {
            $assertionsDisabled = !jqx.class.desiredAssertionStatus();
        }
    };
    private final lbi<jro> nTy = new lbi<jro>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ jqx nTG;
        {
            this.nTG = jqx2;
        }

        public final void b(jro jro2) {
            jqj jqj2 = (jqj)jqx.a(this.nTG).get(jro2.dRs());
            if (jro2.getErrorCode() != 0) {
                if (!$assertionsDisabled) {
                    throw new AssertionError();
                }
                return;
            }
            if (!$assertionsDisabled && jqj2 == null) {
                throw new AssertionError(jro2.dRs());
            }
            int n = jro2.dRE();
            switch (n) {
                case 2: {
                    jqx.a(this.nTG, true);
                    jqj2.aj(jro2.dRw(), n);
                    break;
                }
                case 0: 
                case 1: 
                case 3: {
                    jqj2.aj(jro2.dRw(), n);
                    break;
                }
                case 4: 
                case 5: 
                case 6: {
                    if (!$assertionsDisabled) {
                        throw new AssertionError();
                    }
                    break;
                }
                case 7: {
                    if (!$assertionsDisabled) {
                        throw new AssertionError();
                    }
                    break;
                }
            }
        }

        public /* synthetic */ void m(Object object) {
            this.b((jro)object);
        }

        static {
            $assertionsDisabled = !jqx.class.desiredAssertionStatus();
        }
    };
    private final lbi<jrm> nTz = new lbi<jrm>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ jqx nTG;
        {
            this.nTG = jqx2;
        }

        public final void b(jrm jrm2) {
            jqj jqj2 = (jqj)jqx.a(this.nTG).get(jrm2.dRs());
            if (jrm2.getErrorCode() != 0) {
                if (!$assertionsDisabled) {
                    throw new AssertionError();
                }
                return;
            }
            if (!$assertionsDisabled && jqj2 == null) {
                throw new AssertionError(jrm2.dRs());
            }
            if (!$assertionsDisabled && !(jqj2 instanceof jqk)) {
                throw new AssertionError();
            }
            int n = jrm2.dRE();
            switch (n) {
                case 0: 
                case 1: 
                case 2: 
                case 3: {
                    if (!$assertionsDisabled) {
                        throw new AssertionError();
                    }
                    break;
                }
                case 4: 
                case 5: 
                case 6: {
                    ((jqk)jqj2).J(jrm2.dRz(), jrm2.getValue(), jrm2.dRF(), jrm2.dRA());
                    break;
                }
                case 7: {
                    if (!$assertionsDisabled) {
                        throw new AssertionError();
                    }
                    break;
                }
            }
        }

        public /* synthetic */ void m(Object object) {
            this.b((jrm)object);
        }

        static {
            $assertionsDisabled = !jqx.class.desiredAssertionStatus();
        }
    };
    private final lbi<jrn> nTA = new lbi<jrn>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ jqx nTG;
        {
            this.nTG = jqx2;
        }

        public final void b(jrn jrn2) {
            jqj jqj2 = (jqj)jqx.a(this.nTG).get(jrn2.dRs());
            if (jrn2.getErrorCode() != 0) {
                if (!$assertionsDisabled) {
                    throw new AssertionError();
                }
                return;
            }
            if (jqj2 == null) {
                lfn.b(5, "SFInputSystem.MessageHandlerInputEventMessageResponse.new IConsumer<SFInputEventMessageInputResponse>() {...}", "consume: Device is null - ignoring " + jrn2);
                return;
            }
            if (!$assertionsDisabled && jqj2 == null) {
                throw new AssertionError(jrn2.dRs());
            }
            if (!$assertionsDisabled && !(jqj2 instanceof jqo)) {
                throw new AssertionError();
            }
            int n = jrn2.dRE();
            switch (n) {
                case 0: 
                case 1: 
                case 2: 
                case 3: {
                    if (!$assertionsDisabled) {
                        throw new AssertionError();
                    }
                    break;
                }
                case 4: 
                case 5: 
                case 6: {
                    if (!$assertionsDisabled) {
                        throw new AssertionError();
                    }
                    break;
                }
                case 7: {
                    ((jqo)jqj2).b(jrn2.dRC(), jrn2.dRD(), jrn2.dRB(), jrn2.getX(), jrn2.getY(), jrn2.dRF());
                    break;
                }
            }
        }

        public /* synthetic */ void m(Object object) {
            this.b((jrn)object);
        }

        static {
            $assertionsDisabled = !jqx.class.desiredAssertionStatus();
        }
    };
    private final lbi<fjj> nTB = new lbi<fjj>(this){
        final /* synthetic */ jqx nTG;
        {
            this.nTG = jqx2;
        }

        public void a(fjj fjj2) {
            ldv ldv2 = fjj2.aO();
            jqx.c((jqx)this.nTG).rnh.m(fjk.a(jqx.c((jqx)this.nTG).rng, ldv2, jqx.d(this.nTG), jqx.e(this.nTG), jqx.f(this.nTG), jqx.g(this.nTG), jqx.h(this.nTG), jqx.i(this.nTG), jqx.j(this.nTG)));
        }

        public /* synthetic */ void m(Object object) {
            this.a((fjj)object);
        }
    };
    private final lbi<jpk> kuT = new lbi<jpk>(this){
        final /* synthetic */ jqx nTG;
        {
            this.nTG = jqx2;
        }

        public void a(jpk jpk2) {
            if (jqx.k(this.nTG) != null) {
                jqx.k(this.nTG).m(jpk2);
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((jpk)object);
        }
    };
    private final lbi<jpp> lbL = new lbi<jpp>(this){
        final /* synthetic */ jqx nTG;
        {
            this.nTG = jqx2;
        }

        public void b(jpp jpp2) {
            if (jqx.l(this.nTG) != null) {
                jqx.l(this.nTG).m(jpp2);
            }
        }

        public /* synthetic */ void m(Object object) {
            this.b((jpp)object);
        }
    };
    public final jpj jWW = new jpj(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ jqx nTG;
        {
            this.nTG = jqx2;
        }

        public jpi tb(String string) {
            if (!$assertionsDisabled && !jqx.m(this.nTG)) {
                throw new AssertionError();
            }
            jqk jqk2 = this.nTG.tf(string);
            if (jqk2 == null) {
                return null;
            }
            return jqk2;
        }

        public jpi dPp() {
            return this.nTG.nTq;
        }

        public jpi dPq() {
            return this.nTG.nTr;
        }

        public jpi dPr() {
            return this.nTG.nTs;
        }

        public jpf ta(String string) {
            if (!$assertionsDisabled && !jqx.m(this.nTG)) {
                throw new AssertionError();
            }
            String string2 = null;
            int n = string.indexOf(58);
            if (n != -1) {
                string2 = string.substring(0, n);
                string = string.substring(n + 1);
            } else {
                for (jqj jqj2 : jqx.n(this.nTG)) {
                    jqk jqk2;
                    if (!(jqj2 instanceof jqk) || (jqk2 = (jqk)jqj2).ta(string) == null) continue;
                    string2 = jqk2.Name;
                    break;
                }
                if (string2 == null) {
                    return null;
                }
            }
            jqk jqk3 = this.nTG.tf(string2);
            if (jqk3 == null) {
                return null;
            }
            return jqk3.ta(string);
        }

        public jpf a(jpb jpb2) {
            jqm jqm2 = this.nTG.nTq;
            if (jqm2 == null) {
                return null;
            }
            return jqm2.ta(jpb2.Name);
        }

        public jpb b(jpf jpf2) {
            return (jpb)((Object)jqx.o(this.nTG).get(jpf2));
        }

        static {
            $assertionsDisabled = !jqx.class.desiredAssertionStatus();
        }
    };
    private boolean jLT;
    private lbi<jpk> nTC;
    private lbi<jpp> nTD;
    private int iNI;
    private int iNJ;
    private int iNK;
    private int iNL;
    private int iNM;
    private int iNN;
    private int nTE;
    private boolean nTF;

    public final void b(double d2, double d3, int n) {
        this.nTr.chi();
        if (this.nTF) {
            this.nTF = false;
            this.nTm.enp();
        }
    }

    public jqx(lbh lbh2, lha<dxq, dxq> lha2, lha<jrq, jrd> lha3, a[] aArray) {
        this.kAz = lbh2;
        this.jAj = lha2;
        this.nHH = lha3;
        this.nHH.rex.a(true, jrt.class, this.nTu);
        this.nHH.rex.a(true, jri.class, this.nTv);
        this.nHH.rex.a(true, jrk.class, this.nTw);
        this.nHH.rex.a(true, jrs.class, this.nTx);
        this.nHH.rex.a(true, jrm.class, this.nTz);
        this.nHH.rex.a(true, jrn.class, this.nTA);
        this.nHH.rex.a(true, jro.class, this.nTy);
        this.jAj.rex.a(true, fjj.class, this.nTB);
        Object object = jrh.m(this.nHH.rng);
        ((jrh)object).VP(127);
        this.nHH.rnh.m(object);
        object = new HashMap();
        jqm jqm2 = null;
        jqn jqn2 = null;
        jql jql2 = null;
        jqo jqo2 = null;
        for (a a2 : aArray) {
            jod jod2 = a2.nTH;
            String string = this.VK(jod2.getType());
            Object object2 = (Integer)object.get(string);
            if (object2 == null) {
                object.put(string, new Integer(1));
            } else {
                object2 = new Integer((Integer)object2 + 1);
                string = string + object2;
            }
            object2 = null;
            switch (jod2.getType()) {
                case 255: {
                    if (jqo2 != null) break;
                    jqo2 = new jqo(this, jod2.getGUID(), this.lbL);
                    object2 = jqo2;
                    break;
                }
                case 18: {
                    if (jqn2 != null) break;
                    jqn2 = new jqn(this.kAz, this, jod2.getGUID(), this.kuT, string, jod2.getName(), jod2.getProductName(), jod2.dOA(), jod2.dOz(), jod2.getType(), a2.nTI);
                    object2 = jqn2;
                    break;
                }
                case 19: {
                    if (jqm2 != null) break;
                    jqm2 = new jqm(this, jod2.getGUID(), this.kuT, string, jod2.getName(), jod2.getProductName(), jod2.dOA(), jod2.dOz(), jod2.getType(), a2.nTI);
                    object2 = jqm2;
                    break;
                }
                case 20: {
                    if (jql2 != null) break;
                    jql2 = new jql(this, jod2.getGUID(), this.kuT, string, jod2.getName(), jod2.getProductName(), jod2.dOA(), jod2.dOz(), jod2.getType(), a2.nTI);
                    object2 = jql2;
                    break;
                }
            }
            if (object2 == null) {
                object2 = new jqk(this, jod2.getGUID(), this.kuT, string, jod2.getName(), jod2.getProductName(), jod2.dOA(), jod2.dOz(), jod2.getType(), a2.nTI);
            }
            assert (this.nTk.get(jod2.getGUID()) == null);
            this.nTk.put(jod2.getGUID(), (jqj)object2);
            this.nTn.add((jqj)object2);
            this.ti(jod2.getGUID());
        }
        this.nTq = jqm2;
        this.nTr = jqn2;
        this.nTs = jql2;
        this.nTt = jqo2;
        this.jLT = true;
        if (this.nTq != null) {
            for (jpb jpb2 : jpb.ListOfValue) {
                jpf jpf2 = this.nTq.ta(jpb2.Name);
                assert (!this.nTl.containsKey(jpf2));
                this.nTl.put(jpf2, jpb2);
            }
        }
    }

    public final void dispose() {
        assert (this.jLT);
        for (jqj jqj2 : this.nTk.values()) {
            jqj2.dispose();
        }
        this.nTk.clear();
        this.jLT = false;
    }

    public final lbl<lbn> dRq() {
        return this.nTm;
    }

    public boolean isInitialized() {
        return this.jLT;
    }

    public final void a(ldv ldv2, boolean bl, int[] nArray) {
        assert (this.jLT);
        assert (nArray != null);
        jqy jqy2 = jqy.i(this.nHH.rng);
        jqy2.setBufferSize(4096);
        jqy2.tj(ldv2);
        jqy2.aH(nArray);
        jqy2.uG(bl);
        jqy2.uH(true);
        this.nHH.rnh.m(jqy2);
    }

    public final void th(ldv ldv2) {
        assert (this.jLT);
        jra jra2 = jra.j(this.nHH.rng);
        jra2.tj(ldv2);
        this.nHH.rnh.m(jra2);
    }

    public final void b(boolean bl, lbi<jpk> lbi2) {
        assert (this.jLT);
        if (bl) {
            assert (this.nTC == null);
            this.nTC = lbi2;
        } else {
            assert (this.nTC == lbi2);
            this.nTC = null;
        }
    }

    public final void c(boolean bl, lbi<jpp> lbi2) {
        assert (this.jLT);
        if (bl) {
            assert (this.nTD == null);
            this.nTD = lbi2;
        } else {
            assert (this.nTD == lbi2);
            this.nTD = null;
        }
    }

    public final jqk tf(String string) {
        assert (this.jLT);
        for (jqj jqj2 : this.nTn) {
            jqk jqk2;
            if (!(jqj2 instanceof jqk) || !(jqk2 = (jqk)jqj2).getName().equals(string)) continue;
            return jqk2;
        }
        return null;
    }

    public final void d(jrj jrj2) {
        jqj jqj2 = this.nTk.get(jrj2.dRs());
        if (jrj2.getErrorCode() != 0) {
            return;
        }
        if (jrj2.dRy().length == 0) {
            return;
        }
        this.a((jqk)jqj2, jrj2.dRy());
    }

    private final void a(jqk jqk2, joe[] joeArray) {
        for (int i = 0; i < joeArray.length; ++i) {
            jqp jqp2 = jqk2.nSh.get(i);
            if (!(jqp2 instanceof jqr)) continue;
            jqr jqr2 = (jqr)jqp2;
            int n = joeArray[i].dOH();
            if (n == 0) continue;
            jqr2.Vt(n);
        }
    }

    private String VK(int n) {
        switch (n) {
            case 17: {
                return "Device";
            }
            case 18: {
                return "Mouse";
            }
            case 19: {
                return "Keyboard";
            }
            case 20: {
                return "Joystick";
            }
            case 21: {
                return "Gamepad";
            }
            case 22: {
                return "Driving";
            }
            case 23: {
                return "Flight";
            }
            case 24: {
                return "FirstPerson";
            }
            case 25: {
                return "DeviceCtrl";
            }
            case 26: {
                return "ScreenPointer";
            }
            case 27: {
                return "Remote";
            }
            case 28: {
                return "Supplemental";
            }
        }
        return "Unknown_" + n;
    }

    private String VL(int n) {
        switch (n) {
            case 0: {
                return "Unknown";
            }
            case 1: {
                return "X Axis";
            }
            case 2: {
                return "Y Axis";
            }
            case 3: {
                return "Z Axis";
            }
            case 4: {
                return "RX Axis";
            }
            case 5: {
                return "RY Axis";
            }
            case 6: {
                return "RZ Axis";
            }
            case 7: {
                return "Slider";
            }
            case 8: {
                return "Button";
            }
            case 9: {
                return "Key";
            }
            case 10: {
                return "Pov";
            }
        }
        return "Unknown_" + n;
    }

    private String J(int n, String string) {
        return String.format("%" + n + "s", string);
    }

    private String fI(int n, int n2) {
        return String.format("%" + n + "s", Integer.toString(n2));
    }

    private void ti(ldv ldv2) {
        jrg jrg2 = jrg.l(this.nHH.rng);
        jrg2.tj(ldv2);
        jrg2.VN(255);
        jrg2.VO(0);
        jrg2.sy(ldv.rfe);
        this.nHH.rnh.m(jrg2);
    }

    static /* synthetic */ int a(jqx jqx2, int n) {
        jqx2.nTE = n;
        return jqx2.nTE;
    }

    static /* synthetic */ int b(jqx jqx2, int n) {
        jqx2.iNI = n;
        return jqx2.iNI;
    }

    static /* synthetic */ int c(jqx jqx2, int n) {
        jqx2.iNJ = n;
        return jqx2.iNJ;
    }

    static /* synthetic */ int d(jqx jqx2, int n) {
        jqx2.iNL = n;
        return jqx2.iNL;
    }

    static /* synthetic */ int e(jqx jqx2, int n) {
        jqx2.iNN = n;
        return jqx2.iNN;
    }

    static /* synthetic */ int f(jqx jqx2, int n) {
        jqx2.iNM = n;
        return jqx2.iNM;
    }

    static /* synthetic */ int g(jqx jqx2, int n) {
        jqx2.iNK = n;
        return jqx2.iNK;
    }

    static /* synthetic */ Map a(jqx jqx2) {
        return jqx2.nTk;
    }

    static /* synthetic */ lha b(jqx jqx2) {
        return jqx2.nHH;
    }

    static /* synthetic */ boolean a(jqx jqx2, boolean bl) {
        jqx2.nTF = bl;
        return jqx2.nTF;
    }

    static /* synthetic */ lha c(jqx jqx2) {
        return jqx2.jAj;
    }

    static /* synthetic */ int d(jqx jqx2) {
        return jqx2.iNI;
    }

    static /* synthetic */ int e(jqx jqx2) {
        return jqx2.iNJ;
    }

    static /* synthetic */ int f(jqx jqx2) {
        return jqx2.iNK;
    }

    static /* synthetic */ int g(jqx jqx2) {
        return jqx2.iNL;
    }

    static /* synthetic */ int h(jqx jqx2) {
        return jqx2.iNM;
    }

    static /* synthetic */ int i(jqx jqx2) {
        return jqx2.iNN;
    }

    static /* synthetic */ int j(jqx jqx2) {
        return jqx2.nTE;
    }

    static /* synthetic */ lbi k(jqx jqx2) {
        return jqx2.nTC;
    }

    static /* synthetic */ lbi l(jqx jqx2) {
        return jqx2.nTD;
    }

    static /* synthetic */ boolean m(jqx jqx2) {
        return jqx2.jLT;
    }

    static /* synthetic */ List n(jqx jqx2) {
        return jqx2.nTn;
    }

    static /* synthetic */ Map o(jqx jqx2) {
        return jqx2.nTl;
    }
}


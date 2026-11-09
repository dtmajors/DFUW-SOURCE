/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 *  lcy
 */
import java.io.File;

public class aut
extends aul {
    public static final String ceQ = ".dfscript";
    private static final int ceR = 0;
    private static final int ceS = 1;
    private static final int ceT = 2;
    private static final int ceU = 3;
    private static final int ceV = 4;
    protected static final int cdu = 5;
    private static final cqi[] bui = new cqi[0];
    public static final amd ceW = new amd(aut.class, aul.cdc, "ChatProxyChatInterpreter", bui, null);
    private static final egg[] ceX = new egg[]{new egg("command", egg.a.ipq, true, lcy.qTf)};
    private static final egg[] ceY = new egg[]{new egg("filename", egg.a.ipq, false, lcy.qTj)};
    private static final egg[] ceZ = new egg[]{new egg("text", egg.a.ipr, false, lcy.qTk)};
    private final lbi<fok> cfa = new lbi<fok>(this){
        final /* synthetic */ aut cfb;
        {
            this.cfb = aut2;
        }

        public void a(fok fok2) {
            String string = fok2.bsl();
            String[] stringArray = fok2.iRT;
            switch (fok2.iRU) {
                case iRV: {
                    break;
                }
                case iRW: {
                    this.cfb.h(maf.ExecuteFileFailedFileNotFound.bD(string));
                    return;
                }
                case iRX: {
                    this.cfb.h(maf.ExecuteFileFailedErrorReadingFile.bD(string));
                    return;
                }
            }
            for (int i = 0; i < stringArray.length; ++i) {
                String string2 = stringArray[i].trim();
                if (string2.length() == 0 || string2.charAt(0) == '#') continue;
                String string3 = string + "(" + (i + 1) + ")";
                this.cfb.q(string2, string3);
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((fok)object);
        }
    };
    private boolean Initialized;

    public aut() {
        super(ceW);
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.cc(true);
    }

    @Override
    protected final void FG() {
        assert (this.Initialized);
        this.cc(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected final void b(int n, Object[] objectArray, String string) {
        switch (n) {
            case 1: {
                if (objectArray.length == 0) {
                    this.ee("");
                } else {
                    if (objectArray.length != 1) {
                        assert (false);
                        return;
                    }
                    this.ee((String)objectArray[0]);
                }
                return;
            }
            case 0: {
                if (objectArray.length != 1) {
                    assert (false);
                    return;
                }
                this.ec((String)objectArray[0]);
                return;
            }
            case 2: {
                this.Wh();
                return;
            }
            case 3: {
                this.Wi();
                return;
            }
            case 4: {
                if (objectArray.length != 1) {
                    assert (false);
                    return;
                }
                this.ed((String)objectArray[0]);
                return;
            }
        }
        super.b(n, objectArray, string);
    }

    private void ec(String string) {
        int n = string.lastIndexOf(File.pathSeparatorChar);
        if (n == -1) {
            n = 0;
        }
        if ((n = string.indexOf(46, n)) == -1) {
            string = string + ceQ;
        }
        foj foj2 = (foj)this.e(11536, lcr.qzt);
        foj2.cd("gamelogic_scripts/" + string);
        this.a(foj2);
    }

    private void Wh() {
        assert (this.Initialized);
        egu egu2 = (egu)this.MessageDelegator.h(2310, this.GUID, lcw.qOS ? lcr.qDy : lcr.qCM);
        this.MessageDelegator.F(egu2);
    }

    private void Wi() {
        assert (this.Initialized);
        loi.exd().shutdown();
    }

    private void ed(String string) {
        lfn.b(5, "/log>", string);
    }

    public void q(String string, String string2) {
        assert (this.Initialized);
        egq egq2 = (egq)this.e(2308, lcr.qCL);
        egq2.dbA = string2;
        egq2.ipE = string;
        this.a(egq2);
    }

    private void ee(String string) {
        assert (this.Initialized);
        egn egn2 = (egn)this.e(2337, lcr.qCL);
        egn2.ipt = string;
        this.a(egn2);
    }

    private void cc(boolean bl) {
        this.cdh.rex.a(bl, fok.class, this.cfa);
        if (bl) {
            this.a(hc.aaz, 1, "help", lcy.qTa, ceX);
            this.a(hc.aaz, 0, "exec", lcy.qTg, ceY);
            this.a(hc.aaz, 2, "clear", lcy.qTi, cdd);
            this.a(hc.aaz, 3, "quit", lcy.qTd, cdd);
            this.a(hc.aaz, 4, "log", lcy.qTh, ceZ);
        } else {
            this.We();
        }
    }
}


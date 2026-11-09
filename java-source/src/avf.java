/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.List;

public class avf
extends aul {
    private static List<String> cjO = lcn.emv();

    public avf() {
        super(buj);
        cjO.add("idle");
        cjO.add("lowest");
        cjO.add("low");
        cjO.add("normal");
        cjO.add("high");
        cjO.add("highest");
        cjO.add("timecritical");
    }

    private void a(hc hc2, a a2, String string, b ... bArray) {
        egg[] eggArray;
        String string2 = "mw_" + a2.toString().toLowerCase();
        egg[] eggArray2 = eggArray = bArray == null ? null : new egg[bArray.length];
        if (bArray != null) {
            for (int i = 0; i < bArray.length; ++i) {
                eggArray[i] = new egg(bArray[i].Name, bArray[i].cke, bArray[i].bZR, new ljk(bArray[i].ckf));
            }
        }
        this.a(hc2, a2.ordinal(), string2, new ljk(string), eggArray);
    }

    @Override
    protected final void FF() {
        super.FF();
        this.a(hc.aaP, a.cjQ, "sets the minimum log level to process entries for", new b(this, "level", egg.a.ipq, "a log level, numeric or d(ebug), v(erbose), i(nfo), n(otice), w(arning), e(rror)"));
        this.a(hc.aaP, a.cjR, "sets the proxy debug level", new b(this, "level", egg.a.ipq, "a proxy debug level, none/field/class"));
        this.a(hc.aaP, a.cjS, "toggles proxy assert on error", new b(this, "enabled", egg.a.ipq, "whether to enable assertions on proxy errors"));
        this.a(hc.aaP, a.cjT, "sets the required access level for game log in", new b(this, "level", egg.a.ipq, "player, gm, gm15 or admin"));
        this.a(hc.aaP, a.cjU, "disconnects all non-admin clients", new b(this, "reason", egg.a.ipq, "reason for disconnect, shown to user"));
        this.a(hc.aaP, a.cjV, "Lists all open files to log", new b[0]);
        this.a(hc.aaP, a.cjW, "Write memory statistics to log", new b[0]);
        this.a(hc.aaP, a.cjX, "Set time source", new b(this, "source", egg.a.ipq, "Time source name: mmtimer, perfcounter, systemtime, median"));
        this.a(hc.aaP, a.cjY, "Set time drift rate", new b(this, "mspersec", egg.a.ipn, "Max ms per second to drift clock"));
        this.a(hc.aaP, a.cjZ, "Set file loader thread priority", new b(this, "priority", egg.a.ipq, "idle, lowest, low, normal, high, highest, timecritical"));
        this.a(hc.aaP, a.cka, "Set main thread priority", new b(this, "priority", egg.a.ipq, "idle, lowest, low, normal, high, highest, timecritical"));
        this.a(hc.aaP, a.ckb, "Start Utils", new b[0]);
        this.a(hc.aaP, a.ckc, "Stop Utils", new b[0]);
    }

    @Override
    protected final void FG() {
        this.We();
        super.FG();
    }

    @Override
    protected final void b(int n, Object[] objectArray, String string) {
        switch (a.values()[n]) {
            case cjQ: {
                this.eh((String)objectArray[0]);
                return;
            }
            case cjR: {
                this.ei((String)objectArray[0]);
                return;
            }
            case cjS: {
                this.a((Boolean)objectArray[0]);
                return;
            }
            case cjT: {
                this.ej((String)objectArray[0]);
                return;
            }
            case cjU: {
                this.ek((String)objectArray[0]);
                return;
            }
            case cjV: {
                this.WF();
                return;
            }
            case cjW: {
                this.WG();
                return;
            }
            case cjX: {
                this.el((String)objectArray[0]);
                return;
            }
            case cjY: {
                this.a((lei)objectArray[0]);
                return;
            }
            case cjZ: {
                this.em((String)objectArray[0]);
                return;
            }
            case cka: {
                this.en((String)objectArray[0]);
                return;
            }
            case ckb: {
                this.WH();
                return;
            }
            case ckc: {
                this.WI();
                return;
            }
        }
        super.b(n, objectArray, string);
    }

    void eh(String string) {
        int n = -1;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        if (n < 0 && !string.isEmpty()) {
            switch (string.charAt(0)) {
                case 'd': {
                    n = 0;
                    break;
                }
                case 'v': {
                    n = 1;
                    break;
                }
                case 'i': {
                    n = 2;
                    break;
                }
                case 'n': {
                    n = 3;
                    break;
                }
                case 'w': {
                    n = 4;
                    break;
                }
                case 'e': {
                    n = 5;
                }
            }
        }
        if (n < 0) {
            this.h(lzo.tXg.bD(string));
        } else {
            kdh kdh2 = (kdh)this.MessageDelegator.i(283, this.getGUID(), lcr.qCz);
            kdh2.gOd = 1;
            kdh2.pgZ = n;
            this.MessageDelegator.b(kdh2);
            switch (n) {
                case 0: {
                    string = "debug";
                    break;
                }
                case 1: {
                    string = "verbose";
                    break;
                }
                case 2: {
                    string = "info";
                    break;
                }
                case 3: {
                    string = "notice";
                    break;
                }
                case 4: {
                    string = "warning";
                    break;
                }
                case 5: {
                    string = "error";
                    break;
                }
                default: {
                    string = "" + n;
                }
            }
            this.h(lzo.tXh.bD(string));
        }
    }

    void ei(String string) {
        kdh kdh2 = (kdh)this.MessageDelegator.i(283, this.getGUID(), lcr.qCz);
        kdh2.gOd = 2;
        if (string.equals("none")) {
            kdh2.pgZ = 0;
        } else if (string.equals("class")) {
            kdh2.pgZ = 1;
        } else if (string.equals("field")) {
            kdh2.pgZ = 2;
        } else {
            this.h(lzo.tXi.bD(string));
            return;
        }
        this.MessageDelegator.b(kdh2);
        this.h(lzo.tXj.bD(string));
    }

    void a(Boolean bl) {
        kdh kdh2 = (kdh)this.MessageDelegator.i(283, this.getGUID(), lcr.qCz);
        kdh2.gOd = 3;
        kdh2.pgY = bl;
        this.MessageDelegator.b(kdh2);
        this.h(bl != false ? lzo.tXk.bD(new Object[0]) : lzo.tXl.bD(new Object[0]));
    }

    void ej(String string) {
        kdh kdh2 = (kdh)this.MessageDelegator.i(283, this.getGUID(), lcr.qCz);
        kdh2.gOd = 4;
        kdh2.pha = string;
        this.MessageDelegator.b(kdh2);
    }

    void ek(String string) {
        kdh kdh2 = (kdh)this.MessageDelegator.i(283, this.getGUID(), lcr.qCz);
        kdh2.gOd = 5;
        kdh2.pha = string;
        this.MessageDelegator.b(kdh2);
    }

    void WF() {
        kdh kdh2 = (kdh)this.MessageDelegator.i(283, this.getGUID(), lcr.qCz);
        kdh2.gOd = 6;
        this.MessageDelegator.b(kdh2);
    }

    void WG() {
        kdh kdh2 = (kdh)this.MessageDelegator.i(283, this.getGUID(), lcr.qCz);
        kdh2.gOd = 7;
        this.MessageDelegator.b(kdh2);
    }

    void el(String string) {
        kdh kdh2 = (kdh)this.MessageDelegator.i(283, this.getGUID(), lcr.qCz);
        kdh2.gOd = 8;
        kdh2.pha = string;
        this.MessageDelegator.b(kdh2);
    }

    void a(lei lei2) {
        kdh kdh2 = (kdh)this.MessageDelegator.i(283, this.getGUID(), lcr.qCz);
        kdh2.gOd = 9;
        kdh2.pgZ = lei2.intValue();
        this.MessageDelegator.b(kdh2);
    }

    void em(String string) {
        int n = cjO.indexOf(string);
        if (n < 0) {
            this.h(lzo.tXf.bD(string));
            return;
        }
        kdh kdh2 = (kdh)this.MessageDelegator.i(283, this.getGUID(), lcr.qCz);
        kdh2.gOd = 10;
        kdh2.pgZ = n;
        this.MessageDelegator.b(kdh2);
    }

    void WH() {
        kdh kdh2 = (kdh)this.MessageDelegator.i(283, this.getGUID(), lcr.qCz);
        kdh2.gOd = 11;
        kdh2.ioP = 1;
        this.MessageDelegator.b(kdh2);
    }

    void WI() {
        kdh kdh2 = (kdh)this.MessageDelegator.i(283, this.getGUID(), lcr.qCz);
        kdh2.gOd = 12;
        kdh2.ioP = 1;
        this.MessageDelegator.b(kdh2);
    }

    void en(String string) {
        int n = cjO.indexOf(string);
        if (n < 0) {
            this.h(lzo.tXf.bD(string));
            return;
        }
        kdh kdh2 = (kdh)this.MessageDelegator.i(283, this.getGUID(), lcr.qCz);
        kdh2.gOd = 13;
        kdh2.pgZ = n;
        this.MessageDelegator.b(kdh2);
    }

    private void a(kdi kdi2) {
        if (kdi2.pha != null) {
            this.h(lzo.tXm.bD(kdi2.pha));
        } else {
            this.h(lzo.tXn.bD(kdi2.iOz, kdi2.gOd));
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 284: {
                this.a((kdi)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }
}


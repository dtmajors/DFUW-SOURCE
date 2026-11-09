/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bus
extends btk {
    private Map<ldv, String> acG = lcn.emw();
    private Map<ldv, String> dOP = lcn.emw();
    private Map<ldv, String> dOQ = lcn.emw();
    private Map<ldv, String> dOR = lcn.emw();
    private Map<ldv, String> dOS = lcn.emw();
    private Map<ldv, String> dOT = lcn.emw();

    private void a(gks gks2) {
        ldv[] ldvArray = gks2.bFJ();
        String[] stringArray = gks2.bFK();
        boolean[] blArray = gks2.bFL();
        if (ldvArray == null || ldvArray.length == 0 || stringArray == null || stringArray.length == 0 || blArray == null || blArray.length == 0 || ldvArray.length != stringArray.length || stringArray.length != blArray.length) {
            assert (false);
            return;
        }
        int n = gks2.bVI();
        block7: for (int i = 0; i < ldvArray.length; ++i) {
            ldv ldv2 = ldvArray[i];
            String string = stringArray[i];
            boolean bl2 = blArray[i];
            switch (n) {
                case 0: {
                    if (bl2) {
                        this.dOP.put(ldv2, string);
                        continue block7;
                    }
                    this.dOQ.put(ldv2, string);
                    continue block7;
                }
                case 3: {
                    this.acG.put(ldv2, string);
                    continue block7;
                }
                case 1: {
                    this.dOR.put(ldv2, string);
                    continue block7;
                }
                case 2: {
                    this.dOS.put(ldv2, string);
                    continue block7;
                }
                case 4: 
                case 5: {
                    this.dOT.put(ldv2, string);
                }
            }
        }
        gks2.on(lcr.acL);
        gks2.f(this.GUID);
    }

    private void b(gkr gkr2) {
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 31490: {
                this.a((gks)dxq2);
                break;
            }
            case 31489: {
                this.b((gkr)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}


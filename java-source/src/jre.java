/*
 * Decompiled with CFR.
 */
public class jre
extends lgu {
    public jrd VM(int n) {
        jrd jrd2 = null;
        switch (n) {
            case 5: {
                jrd2 = new jqy();
                break;
            }
            case 4: {
                jrd2 = new jqz();
                break;
            }
            case 6: {
                jrd2 = new jra();
                break;
            }
            case 3: {
                jrd2 = new jrc();
                break;
            }
            case 2: {
                jrd2 = new jrg();
                break;
            }
            case 1: {
                jrd2 = new jrh();
                break;
            }
            default: {
                lfn.b(5, this.getClass().getName(), "createInputRequest() : Unknown InputRequestType [" + n + "] !");
                assert (false);
                return null;
            }
        }
        ldv ldv2 = this.erH();
        jrd2.qP(ldv2);
        return jrd2;
    }
}


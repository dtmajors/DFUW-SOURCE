/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class idx {
    private static final Map<iee, idv> lLv = lcn.emw();

    public static idv pW(boolean bl) {
        return idx.a(bl ? iee.lMw : iee.lMv);
    }

    public static idv a(iee iee2) {
        idv idv2 = lLv.get((Object)iee2);
        if (idv2 == null) {
            switch (iee2) {
                case lMu: {
                    idv2 = new idn();
                    break;
                }
                case lMv: {
                    idv2 = new idg();
                    break;
                }
                case lMw: {
                    idv2 = new idr();
                    break;
                }
                case lMx: {
                    idv2 = new idi();
                    break;
                }
                case lMy: {
                    idv2 = new idh();
                    break;
                }
                case lMz: {
                    idv2 = new idj();
                    break;
                }
                case lMA: {
                    idv2 = new idp();
                    break;
                }
                case lMB: {
                    idv2 = new ido();
                    break;
                }
                case lMC: {
                    idv2 = new ids();
                    break;
                }
                case lMD: {
                    idv2 = new idt();
                    break;
                }
                case lME: {
                    idv2 = new idq();
                    break;
                }
                case lMF: {
                    idv2 = new idk();
                    break;
                }
                case lMG: {
                    idv2 = new idm();
                    break;
                }
                case lMH: {
                    idv2 = new idl();
                }
            }
            if (idv2 != null && idv2 instanceof btk) {
                dxr dxr2 = hso.cxK().getMessageDelegator();
                ((btk)((Object)idv2)).setGUID(dxr2.bzv());
                dxr2.a((btk)((Object)idv2));
                lLv.put(iee2, idv2);
            }
        }
        return idv2;
    }
}


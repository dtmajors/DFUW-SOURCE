/*
 * Decompiled with CFR.
 */
public class kjx
extends khd {
    protected ldv pFO = null;
    protected boolean dsK = false;

    kjx() {
        this.Jv(1792);
    }

    public ldv ebK() {
        return this.pFO;
    }

    public void tD(ldv ldv2) {
        this.pFO = ldv2;
    }

    public boolean bUm() {
        return this.dsK;
    }

    public void lQ(boolean bl) {
        this.dsK = bl;
    }

    @Override
    public String Xn(int n) {
        switch (n) {
            case 1793: {
                return "SFFOGREQUEST";
            }
            case 1794: {
                return "SFGLOBALLINEARFOGREQUEST";
            }
            case 1795: {
                return "SFGLOBALPHYSICSENVIRONMENTREQUEST";
            }
            case 1796: {
                return "SFGLOBALRENDEROBJECTREQUEST";
            }
            case 1798: {
                return "SFENVIRONMENT_GLOBAL_ATMOSPHERE_REQUEST";
            }
            case 1799: {
                return "SFENVIRONMENT_GLOBAL_HEMISPHERE_REQUEST";
            }
            case 1800: {
                return "SFENVIRONMENT_GLOBAL_PLANET_REQUEST";
            }
            case 1801: {
                return "SFENVIRONMENT_GLOBAL_SUN_REQUEST";
            }
            case 1802: {
                return "SFENVIRONMENT_GLOBAL_WIND_REQUEST";
            }
            case 1804: {
                return "SFENVIRONMENT_GLOBAL_HAZE_REQUEST";
            }
            case 1805: {
                return "SFENVIRONMENT_GLOBAL_ENVIRONMENTMAP_REQUEST";
            }
        }
        assert (false) : n;
        return super.Xn(n);
    }
}


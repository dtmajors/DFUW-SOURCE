/*
 * Decompiled with CFR.
 */
class dtf {
    public int aqs = -1;
    public int hcg = 0;
    public ldv ec = null;
    public ldv hch = null;
    public boolean hci = false;

    public boolean og(ldv ldv2) {
        assert (this.hch != null);
        assert (ldv2 != null);
        return this.hch.equals(ldv2);
    }

    public boolean equals(Object object) {
        if (object instanceof dtf) {
            dtf dtf2 = (dtf)object;
            if (this.ec.equals(dtf2.ec) && this.hch.equals(dtf2.hch)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFObjectStatusObserver: RequestingObjectGUID=");
        stringBuilder.append(this.ec);
        stringBuilder.append(" ObservationType=");
        stringBuilder.append(this.hcg);
        stringBuilder.append(" ObjectToObserveGUID=");
        stringBuilder.append(this.hch);
        return stringBuilder.toString();
    }
}


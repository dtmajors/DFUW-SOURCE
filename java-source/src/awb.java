/*
 * Decompiled with CFR.
 */
public class awb {
    public final awe crd;
    public final awd cre;
    public final awl crf;
    public final String crg;
    private Object crh;
    public final boolean cri;

    public String toString() {
        return "SFChatFilterActionItem[Type=" + (Object)((Object)this.cre) + ", Attribute=" + (this.crf == null ? "null" : this.crf) + ", Parameter=" + (this.crh == null ? "null" : this.crh) + "]";
    }

    public awb(awe awe2, awd awd2, awm awm2) {
        this.crd = awe2;
        this.cre = awd2;
        this.crf = awm2 == null ? null : this.crd.a(awm2);
        this.crg = null;
        this.cri = this.validate();
    }

    public awb(awe awe2, awd awd2, awm awm2, String string) {
        this.crd = awe2;
        this.cre = awd2;
        this.crf = awm2 == null ? null : this.crd.a(awm2);
        this.crg = string;
        this.cri = this.validate();
    }

    public awb(awe awe2, String string) {
        this.crd = awe2;
        this.cre = awd.CallTable;
        this.crf = null;
        this.crg = string;
        this.cri = this.validate();
    }

    public aws a(awi awi2) {
        switch (this.cre) {
            case AddValue: {
                if (awi2.b((awm)this.crf.crC).crA.crE) break;
                ((awp)awi2.b(this.crf.crC)).eB(this.crg);
                break;
            }
            case SetValue: {
                if (awi2.b((awm)this.crf.crC).crA.crE) break;
                awi2.b(this.crf.crC).set(this.crh);
                break;
            }
            case ClearValue: {
                if (awi2.b((awm)this.crf.crC).crA.crE) break;
                awi2.b(this.crf.crC).set(null);
                break;
            }
            case RemoveValue: {
                if (awi2.b((awm)this.crf.crC).crA.crE) break;
                ((awp)awi2.b(this.crf.crC)).eC(this.crg);
                break;
            }
            case ReplaceText: {
                if (awi2.b((awm)this.crf.crC).crA.crE) break;
                ((awo)awi2.b(this.crf.crC)).eA(this.crg);
                break;
            }
            case CallTable: {
                return this.crd.c(awi2, this.crg);
            }
        }
        return aws.Continue;
    }

    private boolean validate() {
        if (this.cre == null) {
            return false;
        }
        if (this.crd == null) {
            return false;
        }
        switch (this.cre) {
            case AddValue: {
                if (this.crf == null) {
                    return false;
                }
                if (this.crg == null) {
                    return false;
                }
                if (this.crf.crD == awq.crM) break;
                return false;
            }
            case SetValue: {
                if (this.crf == null) {
                    return false;
                }
                if (this.crg != null) break;
                return false;
            }
            case ReplaceText: {
                if (this.crf == null) {
                    return false;
                }
                if (this.crg != null) break;
                return false;
            }
            case ClearValue: {
                if (this.crf == null) {
                    return false;
                }
                if (this.crg == null) break;
                return false;
            }
            case RemoveValue: {
                if (this.crf == null) {
                    return false;
                }
                if (this.crg != null) {
                    return false;
                }
                if (this.crf.crD == awq.crM) break;
                return false;
            }
            case CallTable: {
                if (this.crf != null) {
                    return false;
                }
                if (this.crg != null) break;
                return false;
            }
        }
        if (this.crf != null && this.crg != null) {
            switch (this.crf.crD) {
                case crL: {
                    if (this.crg.equalsIgnoreCase("true") || this.crg.equalsIgnoreCase("yes")) {
                        this.crh = Boolean.TRUE;
                        break;
                    }
                    if (this.crg.equalsIgnoreCase("false") || this.crg.equalsIgnoreCase("no")) {
                        this.crh = Boolean.FALSE;
                        break;
                    }
                    return false;
                }
                case crK: {
                    try {
                        int n = Integer.parseInt(this.crg);
                        this.crh = new Integer(n);
                        break;
                    }
                    catch (NumberFormatException numberFormatException) {
                        return false;
                    }
                }
                default: {
                    this.crh = this.crg;
                    break;
                }
            }
        } else {
            this.crh = null;
        }
        return true;
    }
}


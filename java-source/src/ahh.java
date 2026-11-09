/*
 * Decompiled with CFR.
 */
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ahh
extends aia {
    private int ResourceType = -1;
    private int asi = 0;
    private List<agz> biI = lcn.abH(5);

    public ahh() {
        super(3);
        this.bls = ahu.c.bmB;
    }

    public ahh(int n) {
        super(n);
        this.bls = ahu.c.bmB;
    }

    public final void l(int n) {
        this.ResourceType = n;
    }

    public final void do(int n) {
        this.asi = n;
    }

    public final boolean a(ej ej2, int n) {
        if (ej2 == null) {
            lfn.b(5, "SFPhysicalObjectStateObject", "addAttribute() Attribute is null.");
            return false;
        }
        afw afw2 = (afw)this.fw(ej2.getType());
        if (afw2 != null) {
            afw2.h(ej2);
            afw2.J(2, this.nN());
            this.a(ej2.getType(), (Integer)n);
            if (this.SW.i(this.getGUID(), afw2.AJ())) {
                this.SW.a(this, afw2.AJ());
            } else {
                lfn.b(5, "SFPhysicalObjectStateObject", "addAttribute() Could not find eventpropertytimer for attribute '" + afw2.An().getName() + "'");
                assert (false);
            }
            return true;
        }
        afw2 = new afw();
        afw2.eS(ej2.getType());
        afw2.h(ej2);
        afw2.J(1, this.nN());
        this.a(afw2);
        this.a(ej2.getType(), (Integer)n);
        return true;
    }

    private boolean b(ej ej2, int n) {
        if (ej2 == null) {
            lfn.b(5, "SFPhysicalObjectStateObject", "removeAttribute() Attribute is null.");
            return false;
        }
        afw afw2 = (afw)this.fw(ej2.getType());
        if (afw2 == null) {
            lfn.b(5, "SFPhysicalObjectStateObject", "removeAttribute() Attribute '" + ej2.getName() + "' was not found.");
            return false;
        }
        afw2.J(4, this.nN());
        this.a(ej2.getType(), (Integer)n);
        this.SW.b(this, ej2.getType());
        return true;
    }

    private boolean c(ej ej2, int n) {
        if (ej2 == null) {
            lfn.b(5, "SFPhysicalObjectStateObject", "updateAttribute() Attribute is null.");
            return false;
        }
        afw afw2 = (afw)this.fw(ej2.getType());
        if (afw2 == null) {
            lfn.b(5, "SFPhysicalObjectStateObject", "updateAttribute() Attribute '" + ej2.getName() + "' was not found.");
            return false;
        }
        if (!afw2.i(ej2)) {
            return false;
        }
        afw2.h(ej2);
        afw2.J(8, this.nN());
        this.a(ej2.getType(), (Integer)n);
        return true;
    }

    private boolean a(alu alu2, int n) {
        assert (alu2 != null);
        agz agz2 = this.g(alu2);
        if (agz2 != null) {
            lfn.b(5, "SFPhysicalObjectStateObject", "addModifierInfo() A property for the modifierinfo already exists.");
            lfn.b(5, "SFPhysicalObjectStateObject", "addModifierInfo() " + alu2);
            return false;
        }
        agz2 = new agz();
        agz2.eS(this.BK());
        agz2.f(alu2);
        agz2.J(1, this.nN());
        this.a(agz2);
        this.a(agz2.AK(), (Integer)n);
        this.biI.add(agz2);
        return true;
    }

    private agz g(alu alu2) {
        int n = this.biI.size();
        for (int i = 0; i < n; ++i) {
            agz agz2 = this.biI.get(i);
            if (!agz2.Bh().equals(alu2)) continue;
            return agz2;
        }
        return null;
    }

    private boolean b(alu alu2, int n) {
        assert (alu2 != null);
        agz agz2 = this.g(alu2);
        if (agz2 == null) {
            lfn.b(5, "SFPhysicalObjectStateObject", "removeModifierInfo() The property for the modifierinfo was not found.");
            return false;
        }
        agz2.J(4, this.nN());
        this.a(agz2.AK(), (Integer)n);
        this.SW.b(this, agz2.AJ());
        return true;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 1: {
                return "ResourceType";
            }
            case 2: {
                return "Quantity";
            }
        }
        return super.eB(n);
    }

    @Override
    public void a(gym gym2, int n) {
        int n2;
        int n3;
        boolean bl;
        Object[] objectArray;
        int[] nArray;
        if (gym2.bEz() != 12045) {
            lfn.b(5, "SFPhysicalObjectStateObject", "handleUpdateMessage() Invalid UpdateMessage received: " + gym2.getClass().getName());
            return;
        }
        gyt gyt2 = (gyt)gym2;
        boolean bl2 = false;
        if ((gyt2.ija & 1) > 0) {
            if (gyt2.asi < 0) {
                lfn.b(5, "SFPhysicalObjectStateObject", "handleUpdateMessage() Quantity is invalid.");
                return;
            }
            this.asi = gyt2.asi;
            this.L(2, n);
            bl2 = true;
        }
        if ((gyt2.ija & 8) > 0) {
            this.ResourceType = gyt2.ResourceType;
            this.L(1, n);
            bl2 = true;
        }
        if ((gyt2.ija & 2) > 0) {
            nArray = gyt2.dhI;
            objectArray = gyt2.DR;
            if (nArray == null) {
                lfn.b(5, "SFPhysicalObjectStateObject", "handleUpdateMessage() EventTypes array is null.");
                return;
            }
            if (objectArray == null) {
                lfn.b(5, "SFPhysicalObjectStateObject", "handleUpdateMessage() Attributes array is null.");
                return;
            }
            bl = false;
            n3 = nArray.length;
            for (n2 = 0; n2 < n3; ++n2) {
                bl = false;
                switch (nArray[n2]) {
                    case 1: {
                        bl = this.a((ej)objectArray[n2], n);
                        break;
                    }
                    case 2: {
                        bl = this.c((ej)objectArray[n2], n);
                        break;
                    }
                    case 3: {
                        bl = this.b((ej)objectArray[n2], n);
                        break;
                    }
                    default: {
                        lfn.b(5, "SFPhysicalObjectStateObject", "handleUpdateMessage() Invalid EventType provided at index " + n2);
                        lfn.b(5, "SFPhysicalObjectStateObject", "handleUpdateMessage() EventType=" + nArray[n2] + " Attribute='" + ((ej)objectArray[n2]).getName() + "'");
                    }
                }
                if (!bl) continue;
                bl2 = true;
            }
        }
        if ((gyt2.ija & 4) > 0) {
            nArray = gyt2.dhI;
            objectArray = gyt2.jvh;
            if (nArray == null) {
                lfn.b(5, "SFPhysicalObjectStateObject", "handleUpdateMessage() EventTypes array is null.");
                return;
            }
            if (objectArray == null) {
                lfn.b(5, "SFPhysicalObjectStateObject", "handleUpdateMessage() ModifierInfos array is null.");
                return;
            }
            bl = false;
            n3 = nArray.length;
            for (n2 = 0; n2 < n3; ++n2) {
                switch (nArray[n2]) {
                    case 4: {
                        bl = this.a((alu)objectArray[n2], n);
                        break;
                    }
                    case 5: {
                        bl = this.b((alu)objectArray[n2], n);
                        break;
                    }
                    default: {
                        lfn.b(5, "SFPhysicalObjectStateObject", "handleUpdateMessage() Invalid EventType provided at index " + n2);
                        lfn.b(5, "SFPhysicalObjectStateObject", "handleUpdateMessage() EventType=" + nArray[n2] + " " + objectArray[n2]);
                    }
                }
                if (!bl) continue;
                bl2 = true;
            }
        }
        if (bl2) {
            this.BE();
        }
    }

    @Override
    public void eE(int n) {
        agj agj2 = this.fw(n);
        if (agj2 == null) {
            lfn.b(5, "SFPhysicalObjectStateObject", "notifyEventPropertyTimerTimedOut() Invalid PropertyID provided: " + n);
            return;
        }
        if (agj2 instanceof afw) {
            afw afw2 = (afw)agj2;
            this.b(afw2);
            this.d(afw2.AK());
        } else if (agj2 instanceof agz) {
            agz agz2 = (agz)agj2;
            this.b(agz2);
            this.d(agz2.AK());
            boolean bl = this.biI.remove(agz2);
            if (!bl) {
                lfn.b(5, "SFPhysicalObjectStateObject", "notifyEventPropertyTimerTimedOut() ModifierInfoEventProperty not found.");
                lfn.b(5, "SFPhysicalObjectStateObject", "notifyEventPropertyTimerTimedOut() " + agz2);
            }
        } else {
            this.b(agj2);
            this.d(agj2.AK());
            lfn.b(5, "SFPhysicalObjectStateObject", "notifyEventPropertyTimerTimedOut() Unknown eventproperty removed: " + agj2.getClass().getName());
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" ResourceType='");
        stringBuilder.append(lea.enW().getName(this.ResourceType));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 1: {
                uh uh2 = new uh();
                uh2.Uo = n;
                uh2.PC = this.ResourceType;
                return uh2;
            }
            case 2: {
                uh uh3 = new uh();
                uh3.Uo = n;
                uh3.PC = this.asi;
                return uh3;
            }
        }
        return super.G(n, n2);
    }

    public int az() {
        return this.ResourceType;
    }
}


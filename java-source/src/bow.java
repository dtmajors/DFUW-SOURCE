/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class bow
extends btk {
    public bok a(dty dty2, ldv ldv2, ldv ldv3, boolean bl2) {
        ArrayList<bop> arrayList = lcn.emv();
        List<due> list = dty2.bAF();
        for (int i = 0; i < list.size(); ++i) {
            due due2 = list.get(i);
            bop bop2 = this.b(due2);
            assert (bop2 != null);
            bop2.lr(i);
            arrayList.add(bop2);
        }
        bok bok2 = new bok();
        bok2.ie(this.MessageDelegator.bzv());
        bok2.lo(0);
        bok2.dx(bl2);
        bok2.aj(arrayList);
        bok2.ig(ldv2);
        bok2.if(ldv3);
        bok2.fT(dty2.Name);
        bok2.dv(dty2.RestartIfCancelled);
        bok2.dw(dty2.RestartIfFailed);
        bok2.a(dty2.HighScoreRecording, dty2.bAF());
        return bok2;
    }

    private bop b(due due2) {
        bop bop2 = null;
        switch (due2.Type) {
            case hdR: {
                bor bor2 = new bor();
                bop2 = bor2;
                break;
            }
            case hdO: {
                bom bom2 = new bom();
                bom2.a(due2.TargetedResources);
                bop2 = bom2;
                break;
            }
            case hdQ: {
                boo boo2 = new boo();
                boo2.b(due2.TargetedResources);
                boo2.dB(due2.asP());
                bop2 = boo2;
                break;
            }
            case hdS: {
                bos bos2 = new bos();
                bos2.lx(due2.ata());
                bos2.ly(due2.bAT());
                bos2.dB(due2.asP());
                bop2 = bos2;
                break;
            }
            case hdP: {
                bon bon2 = new bon();
                bon2.b(due2.TargetedResources);
                bop2 = bon2;
                break;
            }
            case hdN: {
                bol bol2 = new bol();
                bol2.b(due2.TargetedResources);
                bop2 = bol2;
                break;
            }
            default: {
                assert (false);
                return null;
            }
        }
        bop2.dC(false);
        bop2.dD(due2.SurvivalMode);
        bop2.fT(due2.Name);
        if (due2.NonAliveTarget) {
            bop2.dF(true);
            int n = lea.enW().getType(due2.QuestEndNpcName);
            if (n == -1) {
                assert (false);
                return null;
            }
            bop2.ii(new ldv(0, 0, n));
        }
        return bop2;
    }

    public boolean a(bok bok2, bpe bpe2, int n) {
        assert (bok2 != null);
        ldv ldv2 = bpe2.atn();
        bop bop2 = bok2.lp(n);
        if (bop2 == null) {
            assert (false) : "SFQuestDefinitionConverter convertToQuest() Could not get the quest in question. Number: " + n + "NumSubQuests: " + bok2.asv();
            return false;
        }
        assert (bop2.asR() == n);
        assert (dud.isValidOrdinal(bop2.asH()));
        dud dud2 = dud.getValueByOrdinal(bop2.asH());
        switch (dud2) {
            case hdN: {
                if (bop2 instanceof bol) break;
                return false;
            }
            case hdO: {
                if (bop2 instanceof bom) break;
                return false;
            }
            case hdP: {
                if (bop2 instanceof bon) break;
                return false;
            }
            case hdQ: {
                if (bop2 instanceof boo) break;
                return false;
            }
            case hdR: {
                if (bop2 instanceof bor) break;
                return false;
            }
            case hdS: {
                if (bop2 instanceof bos) break;
                return false;
            }
            default: {
                assert (false) : "Unhandled Quest Type [" + dud2.name() + "]";
                return false;
            }
        }
        if (!bop2.asV()) {
            bop2.ii(ldv2);
        }
        return true;
    }
}


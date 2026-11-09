/*
 * Decompiled with CFR.
 */
public class lpr
extends lpq {
    private static final lpr rTM = new lpr();
    @lok(value="Balance Request")
    @lpl(value="Defines the transaction for requesting the clan's clan-points values, without making any changes")
    public static final lox rTN = rTM.BC("BalanceRequest");
    @lok(value="Starting Balance")
    @lpl(value="Defines the transaction for applying the clan's starting clan-points value")
    public static final lox rTO = rTM.BC("StartingBalance");
    @lok(value="Assigned By Game Master Or Admin")
    @lpl(value="Defines the transaction resulting from a GM/Admin command")
    public static final lox rTP = rTM.BC("AssignedByGameMasterOrAdmin");
    @lok(value="Earned By Clan Member")
    @lpl(value="Defines the transaction for a clan member earning clan-points for the clan")
    public static final lox rTQ = rTM.BC("EarnedByClanMember");
    @lok(value="Spent On Conquest")
    @lpl(value="Defines the transaction for the clan spending their clan-points on a conquest challenge")
    public static final lox rTR = rTM.BC("SpentOnConquest");
    @lok(value="Spent On Mercenary Contract")
    @lpl(value="Defines the transaction for the clan spending their clan-points on a mercenary contact")
    public static final lox rTS = rTM.BC("SpentOnMercenaryContract");
    @lok(value="Earned By Conquest Victory")
    @lpl(value="Defines the transaction for the clan earning their clan-points from a conquest victory")
    public static final lox rTT = rTM.BC("EarnedByConquestVictory");
    @lok(value="Spent On Conquest Protection")
    @lpl(value="Defines the transaction for the clan sepending their clan-points on protecting a holding from conquest")
    public static final lox rTU = rTM.BC("SpentOnConquestProtection");
    @lok(value="Spent On Perk Activation")
    @lpl(value="Defines the transaction for the clan spending their clan-points on activating a perk")
    public static final lox rTV = rTM.BC("SpentOnPerkActivation");

    protected lpr(String string) {
        super("ClanPointsTransactionTypes." + string);
    }

    private lpr() {
        super("ClanPointsTransactionTypes");
    }
}


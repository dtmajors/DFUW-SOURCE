/*
 * Decompiled with CFR.
 */
public class mbd
extends mai {
    private static final mbd uig = new mbd();
    @lok(value="Unknown Result")
    @lpl(value="Displayed when a clan kill-on-sight operation results in 'UnknownResult'")
    public static final lox uhn = uig.BC("UnknownResult");
    @lok(value="Error In Processing")
    @lpl(value="Displayed when a clan kill-on-sight operation results in 'ErrorInProcessing'")
    public static final lox uho = uig.BC("ErrorInProcessing");
    @lok(value="Player is a Clan Member")
    @lpl(value="Displayed when a clan kill-on-sight operation results in 'TargetPlayerClanMember'")
    public static final lox uih = uig.BC("TargetPlayerClanMember");
    @lok(value="Player On Kill-On-Sight List")
    @lpl(value="Displayed when a clan kill-on-sight operation results in 'TargetPlayerOnKillOnSightList'")
    public static final lox uii = uig.BC("TargetPlayerOnKillOnSightList");
    @lok(value="Player Not On Kill-On-Sight List")
    @lpl(value="Displayed when a clan kill-on-sight operation results in 'TargetPlayerNotOnKillOnSightList'")
    public static final lox uij = uig.BC("TargetPlayerNotOnKillOnSightList");
    @lok(value="Kill-On-Sight List Full")
    @lpl(value="Displayed when a clan kill-on-sight operation results in 'KillOnSightListFull'")
    public static final lox uik = uig.BC("KillOnSightListFull");
    @lok(value="Permission Denied")
    @lpl(value="Displayed when a clan kill-on-sight operation results in 'RequestingPlayerPermissionDenied'")
    public static final lox udD = uig.BC("RequestingPlayerPermissionDenied");
    @lok(value="Requesting Player Not Clan Member")
    @lpl(value="Displayed when a clan kill-on-sight operation results in 'RequestingPlayerNotClanMember'")
    public static final lox ubl = uig.BC("RequestingPlayerNotClanMember");
    @lok(value="Value Already Set")
    @lpl(value="Displayed when a clan kill-on-sight operation results in 'ValueAlreadySet'")
    public static final lox uhp = uig.BC("ValueAlreadySet");
    @lok(value="Player Added To Kill-On-Sight List")
    @lpl(value="Displayed when a clan kill-on-sight operation results in 'TargetPlayerAddedToKillOnSightList'")
    public static final lox uil = uig.BC("TargetPlayerAddedToKillOnSightList");
    @lok(value="Player Removed From Kill-On-Sight List")
    @lpl(value="Displayed when a clan kill-on-sight operation results in 'TargetPlayerRemovedFromKillOnSightList'")
    public static final lox uim = uig.BC("TargetPlayerRemovedFromKillOnSightList");
    @lok(value="Guard Tower Policy Changed")
    @lpl(value="Displayed when a clan kill-on-sight operation results in 'GuardTowerPolicyChanged'")
    public static final lox uin = uig.BC("GuardTowerPolicyChanged");
    @lok(value="Clan Does Not Own Holding")
    @lpl(value="Displayed when a clan kill-on-sight operation results in 'ClanDoesNotOwnHolding'")
    public static final lox uaB = uig.BC("ClanDoesNotOwnHolding");
    @lok(value="Operation Successful")
    @lpl(value="Displayed when a clan kill-on-sight operation results in 'OperationSuccessful'")
    public static final lox uex = uig.BC("OperationSuccessful");
    @lok(value="Clan Does Not Own Any Holdings")
    @lpl(value="Displayed when a clan kill-on-sight operation results in 'ClanDoesNotOwnAnyHoldings'")
    public static final lox uio = uig.BC("ClanDoesNotOwnAnyHoldings");

    protected mbd(String string) {
        super("KillOnSightOperationResults." + string);
    }

    private mbd() {
        super("KillOnSightOperationResults");
    }
}


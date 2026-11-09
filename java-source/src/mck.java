/*
 * Decompiled with CFR.
 */
public class mck
extends lzh {
    private static final mck uvw = new mck();
    @lok(value="Request failed. Reason : Invalid type")
    @lpl(value="Displayed when a player selects to buy/activate/update an not existing perk")
    public static final lox uvx = uvw.BC("InvalidType");
    @lok(value="Request failed. Reason : Invalid state")
    @lpl(value="Displayed when a player selects to buy/activate/update while its state is invalid")
    public static final lox uvy = uvw.BC("InvalidState");
    @lok(value="You do not have enough $(Gold.NameSingular) to buy $(Perk.Name)")
    @lpl(value="Displayed when a player fails to buy a perk because does not have enough gold")
    public static final lox uvz = uvw.a("NotEnoughGoldBuy", mck.Bl("Gold"), mck.Bt("Perk"));
    @lok(value="You do not have enough prowess to buy $(Perk.Name)")
    @lpl(value="Displayed when a player fails to buy a perk because does not have enough prowess")
    public static final lox uvA = uvw.a("NotEnoughProwessBuy", mck.Bt("Perk"));
    @lok(value="You do not have enough $(Gold.NameSingular) to activate $(Perk.Name)")
    @lpl(value="Displayed when a player fails to activate a perk because does not have enough gold")
    public static final lox uvB = uvw.a("NotEnoughGoldActivate", mck.Bl("Gold"), mck.Bt("Perk"));
    @lok(value="You do not have enough prowess to activate $(Perk.Name)")
    @lpl(value="Displayed when a player fails to activate a perk because does not have enough prowess")
    public static final lox uvC = uvw.a("NotEnoughProwessActivate", mck.Bt("Perk"));
    @lok(value="You do not have enough $(Gold.NameSingular) to upgrade $(Perk.Name)")
    @lpl(value="Displayed when a player fails to upgrade a perk because does not have enough gold")
    public static final lox uvD = uvw.a("NotEnoughGoldUpgrade", mck.Bl("Gold"), mck.Bt("Perk"));
    @lok(value="You do not have enough prowess to upgrade $(Perk.Name)")
    @lpl(value="Displayed when a player fails to upgrade a perk because does not have enough prowess")
    public static final lox uvE = uvw.a("NotEnoughProwessUpgrade", mck.Bt("Perk"));
    @lok(value="You already own $(Perk.Name)")
    @lpl(value="Displayed when a player fails to buy a perk because already poses it")
    public static final lox uvF = uvw.a("AlreadyOwn", mck.Bt("Perk"));
    @lok(value="You do not own $(Perk.Name)")
    @lpl(value="Displayed when a player tries to perform an operation on a perk which does not own")
    public static final lox uvG = uvw.a("DoNotOwn", mck.Bt("Perk"));
    @lok(value="$(Perk.Name) is already maxed out")
    @lpl(value="Displayed when a player tries to upgrade a perk which is already in the higher tier")
    public static final lox uvH = uvw.a("MaxedOut", mck.Bt("Perk"));
    @lok(value="You have successfully bought $(Perk.Name)")
    @lpl(value="Displayed when a player buys a perk")
    public static final lox uvI = uvw.a("SuccessfullBuy", mck.Bt("Perk"));
    @lok(value="You have successfully activated $(Perk.Name)")
    @lpl(value="Displayed when a player activates a perk")
    public static final lox uvJ = uvw.a("SuccessfullActivate", mck.Bt("Perk"));
    @lok(value="You have successfully upgraded $(Perk.Name)")
    @lpl(value="Displayed when a player upgrades a perk")
    public static final lox uvK = uvw.a("SuccessfullUpgrade", mck.Bt("Perk"));
    @lok(value="You can not activate $(Perk.Name) because you have already $(NumOfActives) active perks.")
    @lpl(value="Displayed when a player tries to activate a perk while he has already the maximum allowed actives")
    public static final lox uvL = uvw.a("MaxActives", mck.Bt("Perk"), mck.Bh("NumOfActives"));
    @lok(value="You can not activate $(Perk.Name) because you have already $(NumOfActives) active perks from Group $(Group).")
    @lpl(value="Displayed when a player tries to activate a perk while he has already the maximum allowed actives")
    public static final lox uvM = uvw.a("MaxActivesGroup", mck.Bt("Perk"), mck.Bh("NumOfActives"), mck.b("Group", cic.class));
    @lok(value="You are now affected by $(Perk.Name) activated from $(Holding) by $(PlayerName) of your clan.")
    @lpl(value="Displayed to all other online clan members when a clan member activates one of the clan perks. ")
    @lpk(value="audio_2D_notify_ClanPerks_activated")
    public static final lox uvN = uvw.a("ClanPerkActivated", mck.Bt("Perk"), mck.Bp("Holding"), mck.Bk("PlayerName"));
    @lok(value="$(Perk.Name) activated from $(Holding), has expired and you are no longer affected by its bonuses.")
    @lpl(value="Displayed to all online clan members when a clan perk expires. ")
    @lpk(value="audio_2D_notify_ClanPerks_deactivated")
    public static final lox uvO = uvw.a("ClanPerkExpired", mck.Bt("Perk"), mck.Bp("Holding"));
    @lok(value="$(Perk.Name) will expire in $(Time).\u201d")
    @lpl(value="Displayed to all online clan members when a clan perk is ready to expire 5/2/1 minutes before expiration. ")
    @lpk(value="audio_2D_notify_ClanPerks_updated")
    public static final lox uvP = uvw.a("ClanPerkExpirationWarning", mck.Bt("Perk"), mck.Bi("Time"));
    @lok(value="You are no longer affected by $(Perk.Name) and its bonuses because $(Holding) has been lost.")
    @lpl(value="Displayed to all online clan members when a holding is lost and there are active perks from this holding. ")
    @lpk(value="audio_2D_notify_ClanPerks_deactivated")
    public static final lox uvQ = uvw.a("ClanPerkDeactivatedCityLost", mck.Bp("Holding"), mck.Bt("Perk"));

    protected mck(String string) {
        super("Perks." + string);
    }

    private mck() {
        super("Perks");
    }
}


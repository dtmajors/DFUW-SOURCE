/*
 * Decompiled with CFR.
 */
public class mcr
extends lzh {
    private static final mcr uxD = new mcr();
    @lok(value="$(Resource.NameSingular) has expired.")
    @lpl(value="Displayed to a player when a selentine item has expired")
    public static final lox uxE = uxD.a("SelentineItemExpired", mcr.Bl("Resource"));
    @lok(value="You need $(Quantity) $(Resource.Name$(Quantity.Plurality)) to buy $(SelentineItem.NameSingular)")
    @lpl(value="Displayed to a player when a premium item has expired")
    public static final lox uxF = uxD.a("NotEnoughSelentineGoldToBuyItem", mcr.Bl("Resource"), mcr.Bh("Quantity"), mcr.Bl("SelentineItem"));
    @lok(value="You do not have enough selentine gold to complete the requested transaction.")
    @lpl(value="Displayed to the player if he doesnt have enough selentine gold to complete the requested transaction")
    public static final lox tBm = uxD.BC("NotEnoughSelentine");
    @lok(value="You have to be ganked by someone to purchace $(Resource.NameSingular)")
    @lpl(value="Displayed to the player if he tries to purchase Scroll Of Vengeance without being ganked")
    public static final lox uxG = uxD.a("CannotPurchaseScrollOfVengeance", mcr.Bl("Resource"));
    @lok(value="Selentine cash transaction failed. Please try again.")
    @lpl(value="Displayed to the player if an unexpected error occurs while performing a selentine cash transaction.")
    public static final lox sWD = uxD.BC("InternalError");
    @lok(value="$(Skill.NameSingular) cooldown has been reset succesfully.")
    @lpl(value="Displayed to the player when the cooldown of one of the recall skills has been reset.")
    public static final lox uxH = uxD.a("RecallResetSuccessfull", mcr.Bm("Skill"));
    @lok(value="$(Resource.NameSingular) was bought succesfully.")
    @lpl(value="Displayed to the player when he successfully buys a selentine item.")
    public static final lox uxI = uxD.a("BuyItemSuccessfull", mcr.Bl("Resource"));
    @lok(value="$(Resource.NameSingular) is now $(Value).")
    @lol(value="ONLY FOR INTERNAL TESTING")
    public static final lox uxJ = uxD.a("AutoItemToggled", mcr.Bl("Resource"), mcr.Bk("Value"));
    @lok(value="$(Skill.NameSingular) was interrupted. No selentine gold was spent.")
    @lpl(value="Displayed to the player when the recall skill whose cooldown is reduced , has been interrupted.")
    public static final lox uxK = uxD.a("SkillInterrupted", mcr.Bm("Skill"));
    @lok(value="The role change cool down time has been succesfully reset.")
    @lpl(value="Displayed to the player when the role cool down is succesfully reset.")
    public static final lox uxL = uxD.BC("RoleCoolDownReset");
    @lok(value="$(NumProwessPoints) Prowess Points were succesfully reset.")
    @lpl(value="Displayed to the player when the reset prowess points items was activated succesfully.")
    public static final lox uxM = uxD.a("ResetPoints", mcr.Bh("NumProwessPoints"));
    @lok(value="You do not have any Prowess Points to reset.")
    @lpl(value="Displayed to the player when there are no prowess points that can be reset.")
    public static final lox uxN = uxD.BC("NoProwessToReset");
    @lok(value="Player went offline. Tracking will stop now.")
    @lpl(value="Displayed to the player when the tracked player through scroll of vengeance goes offline.")
    public static final lox tBz = uxD.BC("ScrollOfVengeancePlayerOffline");
    @lok(value="You are less than $(MinDistance) meters away from your target. Tracking will stop now.")
    @lpl(value="Displayed to the player when the tracked player through scroll of vengeance goes offline.")
    public static final lox uxO = uxD.a("ScrollOfVengeanceTargetFound", mcr.Bh("MinDistance"));
    @lok(value="No valid teleport position was found at the moment. Please try again later.")
    @lpl(value="Displayed to the player when no valid teleport position could be found when he used the scroll of vengeance to teleport.")
    public static final lox uxP = uxD.BC("ScrollOfVengeanceNoTeleportPosition");
    @lok(value="Your list for $(Resource.NameSingular) is full. To add your killer to the list you need to delete one name from the list. Do you want to show $(Resource.NameSingular)?")
    @lpl(value="Displayed to the player when he is ganked and all the scroll of vengeance list is full.")
    public static final lox uxQ = uxD.a("ScrollOfVengeanceListFull", mcr.Bl("Resource"));
    @lok(value="Can not teleport to player because he went offline.")
    @lpl(value="Displayed to the player when he tries to use the scroll of vengeance to teleport to a player but in the meantime the player goes offline.")
    public static final lox uxR = uxD.BC("ScrollOfVengeancePlayerWentOffline");
    @lok(value="Can not teleport to player because he entered a protected area.")
    @lpl(value="Displayed to the player when he tries to use the scroll of vengeance to teleport to a player but in the meantime the player went into a protected area.")
    public static final lox uxS = uxD.BC("ScrollOfVengeancePlayerWentProtected");
    @lok(value="Can not teleport to player because he is in a dungeon.")
    @lpl(value="Displayed to the player when he tries to use the scroll of vengeance to teleport to a player that is in a dungenon without a valid spawn position.")
    public static final lox uxT = uxD.BC("ScrollOfVengeancePlayerInDungeon");
    @lok(value="You have to wait $(X) minutes before you can use $(Resource.NameSingular) again.")
    @lpl(value="Displayed to the player when he tries to use the scroll of vengeance while it is in cool down.")
    public static final lox uxU = uxD.a("ScrollOfVengeanceCoolDown", mcr.Bh("X"), mcr.Bl("Resource"));
    @lok(value="You need $(X) $(CostResource.Name$(X.Plurality)) in your backpack to be able to teleport.")
    @lpl(value="Displayed to the player when he tries to use the scroll of vengeance without having enough gold in his backpack.")
    public static final lox uxV = uxD.a("ScrollOfVengeanceNotEnoughGold", mcr.Bh("X"), mcr.Bl("CostResource"));
    @lok(value="$(Resource.NameSingular)")
    @lpl(value="Title window for name change window.")
    public static final lox uxW = uxD.a("NameChangeWindowTitle", mcr.Bl("Resource"));
    @lok(value="You can not change your name so soon.")
    @lpl(value="Displayed to the player when tries to change the character name to soon.")
    public static final lox uxX = uxD.BC("NameChangeOnCoolDown");
    @lok(value="Request failed, please try again later.")
    @lpl(value="Displayed to the player when the character renaming fails because of an internal error.")
    public static final lox uxY = uxD.BC("NameChangeInternalError");
    @lok(value="Selected name is reserved.")
    @lpl(value="Displayed to the player when the selected name is reserved.")
    public static final lox uxZ = uxD.BC("NameChangeNameReserved");
    @lok(value="You have already sent a rename request.")
    @lpl(value="Displayed to the player when the role cool down is succesfully reset.")
    public static final lox uya = uxD.BC("NameChangePendingRequest");
    @lok(value="You do not have enough selentine gold to change your name.")
    @lpl(value="Displayed to the player when the role cool down is succesfully reset.")
    public static final lox uyb = uxD.BC("NameChangeNotEnoughSelentine");
    @lok(value="Your name has successfully changed.")
    @lpl(value="Displayed to the player when the role cool down is succesfully reset.")
    public static final lox uyc = uxD.BC("NameChangeSuccessfull");
    @lok(value="Selected name is not allowed.")
    @lpl(value="Displayed to the player when the selected name is not allowed.")
    public static final lox uyd = uxD.BC("NameChangeNameNotAllowed");
    @lok(value="$(RemainingTime) left to use $(Item.NameSingular) again")
    @lpl(value="Displayed to the player when tries to buy a name change item while is on cooldown.")
    public static final lox tBE = uxD.a("NameChangeItemOnCooldown", mcr.Bi("RemainingTime"), mcr.Bl("Item"));
    @lok(value="You must wait $(RemainingCooldown) before you can use $(Item.NameSingular) again!!!")
    @lpl(value="Displayed to the player when tries to use a clan name change item while it's on cooldown")
    public static final lox uye = uxD.a("ClanNameChangeItemOnCooldown", mcr.Bi("RemainingCooldown"), mcr.Bl("Item"));
    @lok(value="You must be the leader of a clan to use $(Item.NameSingular)!")
    @lpl(value="Displayed to a player when they try to use a clan name change item and they are not the leader of a clan")
    public static final lox uyf = uxD.a("ClanNameChangePlayerNotClanLeader", mcr.Bl("Item"));
    @lok(value="You can have only 1 Premium type active each time!$(PremiumItemName.NameSingular) is active.")
    @lpl(value="Displayed to the player when tries to activate a premium item while another one mutually exclusive is active.")
    public static final lox uyg = uxD.a("OtherPremiumItemActive", mcr.Bl("PremiumItemName"));
    @lok(value="Auto loot state : $(AutoLootStateName)")
    @lpk(value="se_pe_attribute_up")
    @lpl(value="Displayed to the player when enables/changes the auto loot active state to an active premium item.")
    public static final lox uyh = uxD.a("AutoLootItemStateEnabled", mcr.b("AutoLootStateName", ep.b.class));
    @lok(value="$(quantity) selentine gold was added to your account.")
    @lpl(value="Displayed to the player when he uses selentine coin item that drops from chaos chest.")
    public static final lox uyi = uxD.a("FoundSelentineGold", mcr.Bh("quantity"));
    @lok(value="Item has already been activated.")
    @lpl(value="Displayed to the player when he tries to activate a selentine item that has already been activated.")
    public static final lox uyj = uxD.BC("ItemAlreadyActivated");
    @lok(value="You can only activate the $(Item.NameSingular) in a protected area.")
    @lpl(value="Displayed to the player when he tries to activate the race change item in a non-protected area.")
    public static final lox uyk = uxD.a("RaceChangeOnlyProtectedArea", mcr.Bl("Item"));
    @lok(value="You can only activate the $(Item.NameSingular) if you are standing.")
    @lpl(value="Displayed to the player when he tries to activate the race change item while not standing.")
    public static final lox uyl = uxD.a("RaceChangeOnlyStanding", mcr.Bl("Item"));
    @lok(value="You can not activate the $(Item.NameSingular) if a container is open.")
    @lpl(value="Displayed to the player when he tries to activate the race change item while not standing.")
    public static final lox uym = uxD.a("RaceChangeNotContainerOpen", mcr.Bl("Item"));
    @lok(value="You can not activate the $(Item.NameSingular) while in a duel.")
    @lpl(value="Displayed to the player when he tries to activate the race change item while not standing.")
    public static final lox uyn = uxD.a("RaceChangeDuel", mcr.Bl("Item"));
    @lok(value="You can not activate the $(Item.NameSingular) while in a party.")
    @lpl(value="Displayed to the player when he tries to activate the race change item while not standing.")
    public static final lox uyo = uxD.a("RaceChangeParty", mcr.Bl("Item"));
    @lok(value="You can not activate the $(Item.NameSingular) while there are pending requests from other players.")
    @lpl(value="Displayed to the player when he tries to activate the race change item while not standing.")
    public static final lox uyp = uxD.a("RaceChangeRequests", mcr.Bl("Item"));
    @lok(value="$(Item.NameSingular) activated.")
    @lpl(value="Displayed to the player when he successfully activates an unlockable.")
    public static final lox uyq = uxD.a("UnlockableActivated", mcr.Bl("Item"));

    protected mcr(String string) {
        super("Selentine." + string);
    }

    private mcr() {
        super("Selentine");
    }
}


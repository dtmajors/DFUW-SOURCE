/*
 * Decompiled with CFR.
 */
public class lxg
extends lxf {
    private static final lxg tpb = new lxg();
    @lok(value="Previous")
    @lol(value="This text is not used and will be removed")
    public static final lox tpc = tpb.BC("ButtonPreviousPage");
    @lok(value="Next")
    @lol(value="This text is not used and will be removed")
    public static final lox tpd = tpb.BC("ButtonNextPage");
    @lok(value="Page $(Page) of 10, $(Weight)/$(MaxWeight) kg")
    @lol(value="This text is not used and will be removed")
    public static final lox tpe = tpb.a("StatusText", lxg.Bh("Page"), lxg.ah("Weight", 1), lxg.ah("MaxWeight", 0));
    @lok(value="$(Item.Name$(Quantity.Plurality))")
    @lpl(value="This text is displayed under the item icons in the player inventory windows.")
    public static final lox tpf = tpb.a("ItemName", lxg.Bh("Quantity"), lxg.Bl("Item"));
    @lok(value="Bank")
    @lpl(value="This text is displayed as a title in the bank inventory window.")
    public static final lox tpg = tpb.BC("BankTitle");
    @lok(value="Backpack")
    @lpl(value="This text is displayed as a title in the backpack inventory window.")
    public static final lox tph = tpb.BC("BackpackTitle");
    @lok(value="Loot")
    @lpl(value="This text is displayed as a title in the monster looting window.")
    public static final lox tpi = tpb.BC("LootTitle");
    @lok(value="Clan Vault 1")
    @lpl(value="This text is displayed as a title in the clan vault inventory window.")
    public static final lox tpj = tpb.BC("ClanVaultTitle");
    @lok(value="Clan Vault 2")
    @lpl(value="This text is displayed as a title in the clan vault inventory window.")
    public static final lox tpk = tpb.BC("ClanVaultTitle2");
    @lok(value="Clan Vault 3")
    @lpl(value="This text is displayed as a title in the clan vault inventory window.")
    public static final lox tpl = tpb.BC("ClanVaultTitle3");
    @lok(value="House Bank")
    @lpl(value="This text is displayed as a title in the player house bank inventory window.")
    public static final lox tpm = tpb.BC("PlayerHouseBankTitle");
    @lok(value="Personal Strongbox")
    @lpl(value="This text is displayed as a title in the player personal strongbox inventory window.")
    public static final lox tpn = tpb.BC("PersonalStrongBoxTitle");
    @lok(value="Party Strongbox")
    @lpl(value="This text is displayed as a title in the party strongbox inventory window.")
    public static final lox tpo = tpb.BC("PartyStrongBoxTitle");
    @lok(value="Clan Strongbox")
    @lpl(value="This text is displayed as a title in the clan strongbox inventory window.")
    public static final lox tpp = tpb.BC("ClanStrongBoxTitle");
    @lok(value="GM Strongbox")
    @lpl(value="This text is displayed as a title in the gm strongbox inventory window.")
    public static final lox tpq = tpb.BC("GMStrongBoxTitle");
    @lok(value="GM Chest")
    @lpl(value="This text is displayed as a title in the gm chest inventory window.")
    public static final lox tpr = tpb.BC("GMChestTitle");
    @lok(value="Personal Naval Strongbox")
    @lpl(value="This text is displayed as a title in the player ship strongbox inventory window.")
    public static final lox tps = tpb.BC("PersonalShipStrongBoxTitle");
    @lok(value="Clan Naval Strongbox")
    @lpl(value="This text is displayed as a title in the clan ship strongbox inventory window.")
    public static final lox tpt = tpb.BC("ClanShipStrongBoxTitle");
    @lok(value="Strongbox")
    @lpl(value="This text is displayed as a title in the strongbox of a ship after the ship is sunk.")
    public static final lox tpu = tpb.BC("ShipFloatingStrongBoxTitle");
    @lok(value="Fish Barrel")
    @lpl(value="This text is displayed as a title in the fish box of a fishing ship.")
    public static final lox tpv = tpb.BC("ShipFishBoxTitle");
    @lok(value="Dredgery Crate")
    @lpl(value="This text is displayed as a title in the sea scraper treasure box of a fishing ship.")
    public static final lox tpw = tpb.BC("ShipTreasureBarrelTitle");
    @lok(value="Organization Bar")
    @lpl(value="This text as the title of the organization bar that helps organizing the player backpack.")
    public static final lox tpx = tpb.BC("OrganizationBar");
    @lok(value="Other")
    @lpl(value="This text as the title of the trading window of the other player.")
    public static final lox tpy = tpb.BC("InventoryTradingOther");
    @lok(value="Own")
    @lpl(value="This text as the title of the trading window of the current player.")
    public static final lox tpz = tpb.BC("InventoryTradingOwn");
    @lok(value="$(CurrentWeight) / $(MaxWeight) Kg")
    @lpl(value="Displays the current and maximum weight of a weight-limited inventory")
    public static final lox tpA = tpb.a("InventoryWeight", lxg.ah("CurrentWeight", 1), lxg.ah("MaxWeight", 1));
    @lok(value="Close")
    @lpl(value="Text for folder when a bag is open from the organization bar.")
    public static final lox tpB = tpb.BC("Close");
    @lok(value="You do not have enough dyes to dye all the items in the bag. Do you want to continue?")
    @lpl(value="This text is displayed to warn the user that there are not enough dyes to dye all the items in a bag.")
    public static final lox tpC = tpb.BC("DyesNotEnough");
    @lok(value="$(Weight) Kg")
    @lpl(value="Displays the weight of an item")
    public static final lox tog = tpb.a("Weight", lxg.ah("Weight", 1));
    @lok(value="$(Speed) m/s")
    @lpl(value="Displays the speed of a mount figurine item")
    public static final lox tpD = tpb.a("Speed", lxg.ah("Speed", 1));

    protected lxg(String string) {
        super("Container." + string);
    }

    private lxg() {
        super("Container");
    }
}


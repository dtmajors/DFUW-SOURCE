/*
 * Decompiled with CFR.
 */
public class mcd
extends mbx {
    private static final mcd urN = new mcd();
    @lok(value="An error occurred while processing your house upgrade request... please wait a moment and try again")
    @lpl(value="Displayed to a player when they attempt to deploy an upgrade to their house, but a non-specific error occurs")
    public static final lox rXy = urN.BC("GenericError");
    @lok(value="Could not get the required upgrade item from your backpack")
    @lpl(value="Displayed to a player when they attempt to deploy an upgrade to their house, but the upgrade item could not be found in the player's inventory")
    public static final lox urO = urN.BC("BuildableObjectNotFound");
    @lok(value="Your house already contains an upgrade of this type")
    @lpl(value="Displayed to a player when they attempt to deploy an upgrade to their house, but the same upgrade is already deployed in the house")
    public static final lox urP = urN.BC("UpgradeAlreadyExists");
    @lok(value="Your house does not support this type of upgrade")
    @lpl(value="Displayed to a player when they attempt to deploy an upgrade to their house, but the type of the upgrade is not available for the player's house type")
    public static final lox urQ = urN.BC("UpgradeNotAvailableForHouseType");
    @lok(value="You are not the owner of the house")
    @lpl(value="Displayed to a player when they attempt to deploy an upgrade to their house, but the player does not own the house")
    public static final lox urR = urN.BC("PlayerDoesNotOwnHouse");
    @lok(value="You don't have the required upgrades installed in order to be able to add this extension to your house")
    @lpl(value="Displayed to a player when they attempt to deploy an upgrade to their house, but prerequisite upgrades do not exist in the player's house")
    public static final lox urS = urN.BC("PrerequisitesNotSatisfied");
    @lok(value="Upgrade request cancelled")
    @lpl(value="Displayed to a player when they attempt to deploy an upgrade to their house, but the player declines the replacement of an existing upgrade with the new upgrade")
    public static final lox urT = urN.BC("PlayerDeclindedUpgradeReplacement");
    @lok(value="Your house is already in the process of being upgraded... please wait a moment and try again")
    @lpl(value="Displayed to a player when they attempt to deploy an upgrade to their house, but the house is already processing another upgrade request")
    public static final lox urU = urN.BC("HouseLockedForUpgrade");
    @lok(value="Congratulations! You successfully installed an upgrade in your house!")
    @lpl(value="Displayed to a player when they attempt to deploy an upgrade to their house, and the upgrade is successfully deployed")
    @lpk(value="se_pe_skillup")
    public static final lox scW = urN.BC("Success");

    protected mcd(String string) {
        super("UpgradeResults." + string);
    }

    private mcd() {
        super("UpgradeResults");
    }
}


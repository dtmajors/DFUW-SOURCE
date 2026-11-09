/*
 * Decompiled with CFR.
 */
public class mcc
extends mbx {
    private static final mcc urF = new mcc();
    @lok(value="The player already owns a house")
    @lpl(value="Displayed to a player when they try to transfer ownership of their house to another player, but the other player already owns another house")
    public static final lox uoA = urF.BC("PlayerAlreadyOwnsAHouse");
    @lok(value="The house transfer failed to be completed")
    @lpl(value="Displayed to a player when they try to transfer ownership of their house to another player, but the transfer failed to be completed")
    public static final lox urG = urF.BC("CouldNotTransferHouse");
    @lok(value="The owner of the house is incorrect")
    @lpl(value="Displayed to a player when they try to transfer ownership of their house to another player, but the ownership checks fail")
    public static final lox urH = urF.BC("IncorrectHouseOwner");
    @lok(value="You cannot transfer ownership of your house to the player since they are using a trial account")
    @lpl(value="Displayed to a player when they try to transfer ownership of their house to another player, but the other player is using a trial account")
    public static final lox urI = urF.BC("PlayerIsUsingATrialAccount");
    @lok(value="Ownership of your house has been successfully transferred to the player")
    @lpl(value="Displayed to a player when they try to transfer ownership of their house to another player, and the transfer operation completes successfully")
    public static final lox urJ = urF.BC("TransferSucceeded");
    @lok(value="Ownership of a house has been successfully transferred to you")
    @lpl(value="Displayed to a player when they receive ownership of a house through a successful transfer from another player")
    public static final lox urK = urF.BC("NewHouseFromTransfer");
    @lok(value="You do not own a house.")
    @lpl(value="Displayed to a player when they try to trade a house although they do not own one. For very rare timing occasions")
    public static final lox urL = urF.BC("HostDoesNotOwnAHouse");
    @lok(value="You already own another house.")
    @lpl(value="Host tries to transfer a house to the participant although the participant already owns another house. This message goes to the participant")
    public static final lox urM = urF.BC("ParticipantAlreadyOwnsAHouse");

    protected mcc(String string) {
        super("TransferOperationResults." + string);
    }

    private mcc() {
        super("TransferOperationResults");
    }
}


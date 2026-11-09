/*
 * Decompiled with CFR.
 */
public class mby
extends mbx {
    private static final mby uoR = new mby();
    @lok(value="An error occurred while trying to process your house claim request... please wait a moment and try again")
    @lpl(value="Displayed to a player when they attempt to claim a house, but a non-specific error occurs")
    public static final lox rXy = uoR.BC("GenericError");
    @lok(value="You do not have the correct house deed for this type of house in your backpack")
    @lpl(value="Displayed to a player when they attempt to claim a house, but they do not have the correct house deed in their backpack")
    public static final lox uoS = uoR.BC("NoDeedInBackpack");
    @lok(value="This house is already being claimed by another player")
    @lpl(value="Displayed to a player when they attempt to claim a house, but a claim request from another player is being processed")
    public static final lox uoT = uoR.BC("HouseAlreadyBeingClaimed");
    @lok(value="This house has already been claimed by another player")
    @lpl(value="Displayed to a player when they attempt to claim a house, but the house has already been claimed by another player")
    public static final lox uoU = uoR.BC("HouseAlreadyClaimed");
    @lok(value="Congratulations! You are now the owner of this house!")
    @lpl(value="Displayed to a player when they attempt to claim a house, and the house is successfully claimed for the player")
    public static final lox scW = uoR.BC("Success");

    protected mby(String string) {
        super("ClaimResults." + string);
    }

    private mby() {
        super("ClaimResults");
    }
}


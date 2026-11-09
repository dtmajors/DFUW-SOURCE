/*
 * Decompiled with CFR.
 */
public class maz
extends may {
    private static final maz uhm = new maz();
    @lok(value="Unknown Result")
    @lpl(value="Displayed when an admin/GM set bank access policy command results in 'UnknownResult'")
    public static final lox uhn = uhm.BC("UnknownResult");
    @lok(value="Error In Processing")
    @lpl(value="Displayed when an admin/GM set bank access policy command results in 'ErrorInProcessing'")
    public static final lox uho = uhm.BC("ErrorInProcessing");
    @lok(value="Requesting Player Permission Denied")
    @lpl(value="Displayed when an admin/GM set bank access policy command results in 'RequestingPlayerPermissionDenied'")
    public static final lox udD = uhm.BC("RequestingPlayerPermissionDenied");
    @lok(value="Requesting Player Not Clan Member")
    @lpl(value="Displayed when an admin/GM set bank access policy command results in 'RequestingPlayerNotClanMember'")
    public static final lox ubl = uhm.BC("RequestingPlayerNotClanMember");
    @lok(value="Value Already Set")
    @lpl(value="Displayed when an admin/GM set bank access policy command results in 'ValueAlreadySet'")
    public static final lox uhp = uhm.BC("ValueAlreadySet");
    @lok(value="Operation Successful")
    @lpl(value="Displayed when an admin/GM set bank access policy command results in 'OperationSuccessful'")
    public static final lox uex = uhm.BC("OperationSuccessful");
    @lok(value="Invalid Parameters")
    @lpl(value="Displayed when an admin/GM set bank access policy command results in 'InvalidParameters'")
    public static final lox tYT = uhm.BC("InvalidParameters");
    @lok(value="Clan Does Not Own City")
    @lpl(value="Displayed when an admin/GM set bank access policy command results in 'ClanDoesNotOwnCity'")
    public static final lox uhq = uhm.BC("ClanDoesNotOwnCity");
    @lok(value="Clan Does Not Own Any Cities")
    @lpl(value="Displayed when an admin/GM set bank access policy command results in 'ClanDoesNotOwnAnyCities'")
    public static final lox uhr = uhm.BC("ClanDoesNotOwnAnyCities");

    protected maz(String string) {
        super("BankAccessOperationResults." + string);
    }

    private maz() {
        super("BankAccessOperationResults");
    }
}


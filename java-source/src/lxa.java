/*
 * Decompiled with CFR.
 */
public class lxa
extends lwz {
    private static final lxa tlT = new lxa();
    @lok(value="House Rent")
    @lpl(value="Used in the housing window. The tooltip header for the rent button.")
    public static final lox tlU = tlT.BC("RentHeader");
    @lok(value="Rent is Due")
    @lpl(value="Used in the housing window. The tooltip contents for the rent button (when rent is due).")
    public static final lox tlV = tlT.BC("RentDue");
    @lok(value="Amount: $(Amount) $(RentResource.Name$(Amount.Plurality))")
    @lpl(value="Displayed in the housing window's rent icon, when rent is due to be paid, to indicate the amount that is due")
    public static final lox tlW = tlT.a("RentAmountDue", lxa.Bh("Amount"), lxa.Bl("RentResource"));
    @lok(value="Time Left to Pay: $(CountDown)")
    @lpl(value="Displayed in the housing window's rent icon tool-tip, when the rent is due to be paid, to indicate the amount of time left to pay before the house is lost")
    public static final lox tlX = tlT.a("RentTimeRemaining", lxa.Bi("CountDown"));
    @lok(value="Click Here to Pay Rent")
    @lpl(value="Displayed in the housing window's rent icon tool-tip, when the rent is due to be paid, to indicate that clicking the icon will pay the rent")
    public static final lox tlY = tlT.BC("RentClickToPay");
    @lok(value="No Rent is Due to Be Paid")
    @lpl(value="Used in the housing window. The tooltip contents for the rent button (when rent is paid).")
    public static final lox tlZ = tlT.BC("RentPaid");
    @lok(value="Make Owner")
    @lpl(value="Used in the housing window. The tooltip for the make owner button.")
    public static final lox tma = tlT.BC("MakeOwner");
    @lok(value="Safe Access")
    @lpl(value="Used in the housing window. The tooltip header for the safe access button.")
    public static final lox tmb = tlT.BC("SafeAccessHeader");
    @lok(value="Player has safe access. Click to disallow access.")
    @lpl(value="Used in the housing window. The tooltip contents for the safe access button (when access is allowed).")
    public static final lox tmc = tlT.BC("SafeAccessAllowed");
    @lok(value="Player doesn't have safe access. Click to allow access.")
    @lpl(value="Used in the housing window. The tooltip contents for the safe access button (when access is disallowed).")
    public static final lox tmd = tlT.BC("SafeAccessDisallowed");
    @lok(value="Remove Tenant")
    @lpl(value="Used in the housing window. The tooltip for the remove tenant button.")
    public static final lox tme = tlT.BC("RemoveTenant");

    protected lxa(String string) {
        super("Tooltips." + string);
    }

    private lxa() {
        super("Tooltips");
    }
}


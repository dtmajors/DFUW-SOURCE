/*
 * Decompiled with CFR.
 */
public class mas
extends mar {
    private static final mas udy = new mas();
    @lok(value="An error occurred while trying to process your request!")
    @lpl(value="Displayed when an unhandled, non-specific, error occurred when attempting to perform an operation on a clan mecenary contract")
    public static final lox rXy = udy.BC("GenericError");
    @lok(value="Indicated contract not found!... Refresh your list and try again!")
    @lpl(value="Displayed when the contract that an operation was requested for cannot be located by the server-side manager (the contract may have already been managed by a different player)")
    public static final lox udz = udy.BC("ContractNotFound");
    @lok(value="Invalid operation requested!... Refresh your list and try again!")
    @lpl(value="Displayed when an invalid operation is requested to be performed on a clan mercenary contract (Should only be possible if a mistake in the GUI code allows invalid operations to be issued)")
    public static final lox udA = udy.BC("InvalidOperation");
    @lok(value="Could not determine your clan's party to the contract!")
    @lpl(value="Displayed when the clan-party (employer or employee) cannot be determined for the clan that is attempting to perform an operation on a mecenary contract")
    public static final lox udB = udy.BC("InvalidClanParty");
    @lok(value="Operation completed successfully!")
    @lpl(value="Displayed when the requested clan mercenary contract operation was completed successfully")
    public static final lox udC = udy.BC("OperationSucessful");
    @lok(value="You cannot perform mecenary contract operations on behalf of the clan, as you are not a member of the clan!")
    @lpl(value="Displayed when the player requesting the clan contract operation is not a member of the clan (can happen if the player leaves the clan during processing)")
    public static final lox ubl = udy.BC("RequestingPlayerNotClanMember");
    @lok(value="You do not have sufficient permissions to perform this operation on behalf of your clan!")
    @lpl(value="Displayed when the player requesting the clan contract operation does not have the appropriate permission to perform the operation (could happen because another player changed the requesting player's permissions during processing)")
    public static final lox udD = udy.BC("RequestingPlayerPermissionDenied");
    @lok(value="The indicated holding is not owned by the indicated clan!")
    @lpl(value="Displayed when the holding that the contract identifies is not, or is no longer, owned by the clan that the contract identifies as the employer")
    public static final lox udE = udy.BC("HoldingNotOwnedByEmployer");
    @lok(value="The indicated holding is not currently being challenged!")
    @lpl(value="Displayed when the holding that the contract identifies is not currently involved in an active conquest challenge")
    public static final lox udF = udy.BC("HoldingNotInChallenge");
    @lok(value="Your clan does not have enough clan-points to issue a mercenary contract!")
    @lpl(value="Displayed when the clan attempting to issue a new mercenary contract does not have enough clan-points to afford the cost of issuing a mercenary contract")
    public static final lox udG = udy.BC("NotEnoughClanPointsToIssue");
    @lok(value="Mercenary contract reward is invalid!")
    @lpl(value="Displayed when the entered reward for the contract is invalid (e.g. negative numbers, or greater-than 100%... should be blocked by the GUI)")
    public static final lox udH = udy.BC("InvalidContractReward");
    @lok(value="Employer has already assigned percentages of the wager to other contracts, accepting these terms would exceed 100%, which is not allowed!")
    @lpl(value="Displayed when the employer clan has already accepted mercenary contracts that have a wager-percentage reward and the sum of the accepted contract percentages does not leave enough percentage remaining to accept this contract's terms")
    public static final lox udI = udy.BC("NotEnoughWagerPercentageRemaining");
    @lok(value="Employer clan cannot afford the stated gold reward!")
    @lpl(value="Displayed when the contract reward exceeds the gold that the employer clan has available")
    public static final lox udJ = udy.BC("NotEnoughGoldForReward");
    @lok(value="One of the clans in the contract cannot afford the required bond!")
    @lpl(value="Displayed when the required bond for issuing or accepting the contract exceeds the gold that the clan has available")
    public static final lox udK = udy.BC("NotEnoughGoldForBond");
    @lok(value="A contract for this challenge has already been issued, you cannot issue another!")
    @lpl(value="Displayed when a clan member attempts to issue a contract for a challenge that a contract has already been issued for")
    public static final lox udL = udy.BC("IssuedContractAlreadyExists");
    @lok(value="A contract for this challenge has already been received, you must accept or reject it before issuing another!")
    @lpl(value="Displayed when a clan member attempts to issue a contract for a challenge that a contract has already been received for")
    public static final lox udM = udy.BC("ReceivedContractAlreadyExists");
    @lok(value="A contract for this challenge has already been accepted, you cannot issue another!")
    @lpl(value="Displayed when a clan member attempts to issue a contract for a challenge that a contract has already been accepted for")
    public static final lox udN = udy.BC("ActiveContractAlreadyExists");
    @lok(value="Bond confirmation declined!")
    @lpl(value="Displayed when the clan member attempting to issue the contract declines the confirmation request for the gold cost of issuing the contract")
    public static final lox udO = udy.BC("PlayerDeclinedConfirmation");
    @lok(value="Bond confirmation timed-out!")
    @lpl(value="Displayed when the clan member attempting to issue the contract does not respond to the confirmation request for the gold cost of issuing the contract in time")
    public static final lox udP = udy.BC("ConfirmationTimedOut");
    @lok(value="Your clan has already issued the maximum number of contracts!... You must either wait for them to be accepted or rejected, or withdraw them, before issuing more!")
    @lpl(value="Displayed when the clan of the member attempting to issue the contract already has the maximum number of contracts pending accept/reject")
    public static final lox udQ = udy.BC("TooManyPendingContractsIssued");
    @lok(value="Your clan already has the maximum number of active mercenary challenges!... You cannot issue more contracts until the existing challenges end!")
    @lpl(value="Displayed when the clan of the member attempting to issue the contract already has the maximum number of accepted contracts active")
    public static final lox udR = udy.BC("TooManyActiveMercenaryChallenges");
    @lok(value="The identified clan already has the maximum allowed number of mercenaries working for them in the identified challenge!")
    @lpl(value="Displayed whent the challenge that the clan member is attempting to issue a contract for already has the maximum number of active mercenaries")
    public static final lox udS = udy.BC("TooManyMercenariesInChallenge");
    @lok(value="The identified challenge is too far progressed to allow the inclusion of mercenaries!")
    @lpl(value="Displayed when the challenge that the clan member is attempting to issue a contract for has progressed to the point that new mercenaries are no longer allowed")
    public static final lox udT = udy.BC("TooLateToJoinChallenge");
    @lok(value="The indicated contract is a received contract, you can only withdraw issued contracts!")
    @lpl(value="Displayed when a clan member attempts to withdraw a received contract (withdraw operations are restricted to issued contracts only... should not be allowed by GUI)")
    public static final lox udU = udy.BC("CannotWithdrawReceievedContract");
    @lok(value="The indicated contract is an active contract, you can only withdraw issued contracts!")
    @lpl(value="Displayed when a clan member attempts to withdraw an accepted and active contract (withdraw operations are restricted to issued contracts only... should not be allowed by GUI)")
    public static final lox udV = udy.BC("CannotWithdrawAcitveContract");
    @lok(value="The indicated contract is an issued contract, you can only reject received contracts!")
    @lpl(value="Displayed when a clan member attempts to reject an issued contract (reject operations are restricted to received contracts only... should not be allowed by GUI)")
    public static final lox udW = udy.BC("CannotRejectIssuedContract");
    @lok(value="The indicated contract is an active contract, you can only reject received contracts!")
    @lpl(value="Displayed when a clan member attempts to reject an accepted and active contract (reject operations are restricted to received contracts only... should not be allowed by GUI)")
    public static final lox udX = udy.BC("CannotRejectActiveContract");
    @lok(value="The indicated contract is an issued contract, you can only accept received contracts!")
    @lpl(value="Displayed when a clan member attempts to accept an issued contract (accept operations are restricted to received contracts only... should not be allowed by GUI)")
    public static final lox udY = udy.BC("CannotAcceptIssuedContract");
    @lok(value="The indicated contract is an active contract, you can only accept received contracts!")
    @lpl(value="Displayed when a clan member attempts to accept an accepted and active contract (accept operations are restricted to received contracts only... should not be allowed by GUI)")
    public static final lox udZ = udy.BC("CannotAcceptActiveContract");
    @lok(value="The indicated contract is an issued contract, you can only counter-offer received contracts!")
    @lpl(value="Displayed when a clan member attempts to counter-offer an issued contract (counter-offer operations are restricted to received contracts only... should not be allowed by GUI)")
    public static final lox uea = udy.BC("CannotCounterOfferIssuedContract");

    protected mas(String string) {
        super("OperationResults." + string);
    }

    private mas() {
        super("OperationResults");
    }
}


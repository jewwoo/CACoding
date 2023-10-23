package use_case.clear_users;

import use_case.clear_users.ClearUserDataAccessInterface;


public class ClearInteractor implements ClearInputBoundary {
    private final ClearUserDataAccessInterface dataAccess;
    private final ClearOutputBoundary outputBoundary;

    public ClearInteractor(ClearUserDataAccessInterface dataAccess, ClearOutputBoundary outputBoundary) {
        this.dataAccess = dataAccess;
        this.outputBoundary = outputBoundary;
    }

    @Override
    public void clearAllUsers(ClearInputData inputData) {
        // inputData is passed but not used, it's a marker
        try {
            dataAccess.deleteAllUsers();
            outputBoundary.presentClearUsersResult(new ClearOutputData(true, "All users cleared successfully"));
        } catch (Exception e) {
            outputBoundary.presentClearUsersResult(new ClearOutputData(false, "Failed to clear users: " + e.getMessage()));
        }
    }
}

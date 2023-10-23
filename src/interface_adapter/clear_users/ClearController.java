package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInputData;

public class ClearController {
    private final ClearInputBoundary clearInputBoundary;

    public ClearController(ClearInputBoundary clearInputBoundary) {
        this.clearInputBoundary = clearInputBoundary;
    }

    public void clearAllUsers() {
        ClearInputData inputData = new ClearInputData();
        clearInputBoundary.clearAllUsers(inputData);
    }
}

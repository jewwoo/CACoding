package use_case.clear_users;

public class ClearOutputData {
    private final boolean success;
    private final String message;

    public ClearOutputData(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}

package interface_adapter.clear_users;

public class ClearState {
    private final boolean success;
    private final String message;

    public ClearState(boolean success, String message) {
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

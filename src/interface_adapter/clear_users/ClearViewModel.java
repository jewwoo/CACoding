package interface_adapter.clear_users;

import view.SignupView;  // assuming SignupView is the UI class where the updates should be reflected

public class ClearViewModel {
    private final SignupView view;

    public ClearViewModel(SignupView view) {
        this.view = view;
    }

    public void updateClearState(ClearState state) {
        // Assuming SignupView has a method to display messages
        view.showMessage(state.getMessage());
    }
}

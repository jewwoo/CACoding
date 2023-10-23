package interface_adapter.clear_users;

import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel viewModel;

    public ClearPresenter(ClearViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public void presentClearUsersResult(ClearOutputData outputData) {
        ClearState state = new ClearState(outputData.isSuccess(), outputData.getMessage());
        viewModel.updateClearState(state);
    }
}

package Views;

public class UIView implements IUIDisplay{
    public enum ViewStatus {
        OK,
        ERROR,
        EXIT,
        GO_BACK,
        SUCCESS_AND_GO_BACK,
        FAIL_AND_GO_BACK,
        JUMP_TO,
    };

    protected UIView[] subViews;
    protected String myViewName;

    public UIView() {
        this.myViewName = this.getClass().getCanonicalName();
    }

    public void show() {
        return;
    }

    public void query() {
        return;
    }

    public ViewStatus handleQuery() {
        return ViewStatus.EXIT;
    }

    /**
     * @implNote This method need not be overloaded
     * @return status of `handleQuery`
     */
    public ViewStatus showAndQuery() {
        this.show();
        this.query();
        return this.handleQuery();
    }
}

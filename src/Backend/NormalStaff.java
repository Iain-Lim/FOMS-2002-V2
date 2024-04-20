package Backend;

import Views.UIView;

public class NormalStaff extends Staff implements INormalStaff {
    @Override
    public String[] getViewOptions() {
        return new String[] {
                "View Orders",
                "Process Order"
        };
    }

    @Override
    public UIView[] getSubViews() {
        return new UIView[] {
                null,
                null
        };
    }
}

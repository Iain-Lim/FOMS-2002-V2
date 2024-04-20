package Backend;

import Views.UIView;

import java.util.Arrays;

import static java.lang.System.arraycopy;

public class BranchManagerStaff extends NormalStaff implements IBranchManager {
    @Override
    public String[] getViewOptions() {
        String[] myViewOptions = new String[] {
                "Display Staff List",
                "Modify Menu"
        };

        int totalLength = myViewOptions.length + super.getViewOptions().length;
        String[] ourViewOptions = new String[totalLength];
        System.arraycopy(super.getViewOptions(), 0, ourViewOptions, 0, super.getViewOptions().length);
        System.arraycopy(myViewOptions, 0, ourViewOptions, super.getViewOptions().length, myViewOptions.length);

        return ourViewOptions;
    }

    @Override
    public UIView[] getSubViews() {
        UIView[] mySubViews = new UIView[] {
                null,
                null
        };

        int totalLength = mySubViews.length + super.getSubViews().length;
        UIView[] ourSubViews = new UIView[totalLength];
        System.arraycopy(super.getSubViews(), 0, ourSubViews, 0, super.getSubViews().length);
        System.arraycopy(mySubViews, 0, ourSubViews, super.getSubViews().length, mySubViews.length);

        return ourSubViews;
    }
}

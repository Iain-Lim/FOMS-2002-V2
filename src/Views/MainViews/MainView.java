package Views.MainViews;

import Views.CustomerViews.CustomerBaseView;
import Views.StaffViews.StaffBaseView;
import Views.UIMenuView;
import Views.UIView;

public class MainView extends UIMenuView {
    public MainView() {
        myViewName = "Views.Main.MainView";
        this.myViewOptions = new String[] {
                "I am a Customer",
                "I am a Staff",
        };
        this.subViews = new UIView[] {
                new CustomerBaseView(),
                new StaffBaseView()
        };
        this.isBaseView = true;
    }
}

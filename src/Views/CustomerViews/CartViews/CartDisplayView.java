package Views.CustomerViews.CartViews;

import Views.UIView;


public class CartDisplayView extends UIView {

    public CartDisplayView() {
        this.myViewName = this.getClass().getCanonicalName();
    }

    @Override
    public ViewStatus showAndQuery() {
        System.out.println("View Cart...");
//        MenuDisplayMenuView menuView = new MenuDisplayMenuView();
        return ViewStatus.OK;
    }
}

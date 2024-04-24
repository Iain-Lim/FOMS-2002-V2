package Views.StaffViews.AdminViews.AdminPaymentMethodView;

import Views.UIMenuView;
import Views.UIView;
import Views.PaymentViews.PaymentMethodDisplayAllView;

public class AdminManagePaymentMethodsView extends UIMenuView {
    public AdminManagePaymentMethodsView() {
        this.myViewName = this.getClass().getCanonicalName();
        this.myViewOptions = new String[] {
            "Add",
            "Remove",
            "See All",
    };
    this.subViews = new UIView[] {
            new AdminAddPaymentMethodView(),
            new AdminRemovePaymentMethodView(),
            new PaymentMethodDisplayAllView()
    };
//    todo list branch and query
    }
}

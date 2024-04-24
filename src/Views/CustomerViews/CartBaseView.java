package Views.CustomerViews;

import Views.MenuViews.MenuDisplayMenuView;
import Views.UIMenuView;
import Views.UIView;
import Views.CustomerViews.PaymentViews.OrderPayBaseView;

public class CartBaseView extends UIMenuView {
    public CartBaseView() {
       this.myViewName = this.getClass().getCanonicalName();
        this.myViewOptions = new String[] {
                "View Menu",
                "View Cart",
                "Add to Cart",
                "Remove from Cart",
                "Amend from Cart",
                "Pay",
        };
        this.subViews = new UIView[] {
                new MenuDisplayMenuView(),
                null,
                null,
                null,
                null,
                new OrderPayBaseView()
        };
    }
}

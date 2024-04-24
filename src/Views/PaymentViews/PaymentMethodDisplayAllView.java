package Views.PaymentViews;

import Main.SharedResources;
import Views.UIView;

public class PaymentMethodDisplayAllView extends UIView{
    public PaymentMethodDisplayAllView() {
        this.myViewName = this.getClass().getCanonicalName();
    }
    
    @Override
    public ViewStatus showAndQuery() {
        SharedResources.getPaymentMethodDBHelper().printAllInDatabase(true);

        return ViewStatus.OK;
    }
}

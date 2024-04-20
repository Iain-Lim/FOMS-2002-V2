package Views;

public class UIMenuWithExtraView extends UIMenuView {

    protected String[] myExtraViewOptions;
    protected UIView[] myExtraSubViews;

    public UIMenuWithExtraView() {
        super();
    }

    @Override
    public void show() {
        int i = 0;
        System.out.println();
        System.out.println(this.myViewName);
        System.out.print((i) + ": ");
        System.out.println("< Back");
        for (; i < this.myViewOptions.length; i++) {
            System.out.print((i+1) + ": ");
            System.out.println(this.myViewOptions[i]);
        }

        if (this.myExtraViewOptions == null || this.myExtraViewOptions.length == 0) return;

        int j = 0;
        for (; j < this.myExtraViewOptions.length; i++, j++) {
            System.out.print((i+1) + ": ");
            System.out.println(this.myExtraViewOptions[j]);
        }
    }

    @Override
    protected UIView getNextView() {
        UIView subView;
        int requestedViewIdx = this.user_request-1;

        if (this.subViews.length-1 < requestedViewIdx) {
            requestedViewIdx -= this.subViews.length-1;
            subView = this.myExtraSubViews[requestedViewIdx];
        } else {
            subView= this.subViews[requestedViewIdx];
        }

        return subView;
    }
}

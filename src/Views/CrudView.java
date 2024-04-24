package Views;

import Backend.CrudContext;

public class CrudView extends UIMenuView implements ICrudView {
    private CrudContext ctx;
    private CrudContext[] ctxOptions;

    public CrudView() {
        this.myViewName = this.getClass().getCanonicalName();
        this.myViewOptions = new String[] {
                "Add",
                "Remove",
                "Update",
        };
        this.ctxOptions = new CrudContext[] {
                CrudContext.CREATE,
                CrudContext.DELETE,
                CrudContext.UPDATE,
        };
    }

    final public ViewStatus handleSpecialQuery() {
        if (this.user_request < 0) {
            return ViewStatus.ERROR;
        } else if (this.user_request == 0) {
            return ViewStatus.GO_BACK;
        }

        if (this.user_request > ctxOptions.length) return ViewStatus.ERROR;

        this.ctx = ctxOptions[this.user_request - 1];

        return ViewStatus.OK;
    }
    @Override
    public ViewStatus showAndQuery() {
        this.show();
        this.query();
        return this.handleSpecialQuery();
    }

    public CrudContext getCtx() {
        return this.ctx;
    }
}


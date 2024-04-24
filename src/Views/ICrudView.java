package Views;

import Backend.CrudContext;

public interface ICrudView {
    CrudContext ctx = CrudContext.NA;
    CrudContext getCtx();
}


``` mermaid
flowchart TD

%% ==== Views ====

%% AccountViews
AccountChangePasswordView(["AccountChangePasswordView \n{UIQueryView}"])
AccountDisplayAllView(["AccountDisplayAllView \n{UIView}"])
AccountDisplayFilteredView(["AccountDisplayFilteredView \n{UIQueryView}"])
AccountDisplayMyInfoView(["AccountDisplayMyInfoView \n{UIView}"])
AccountLoginAsStaffView(["AccountLoginAsStaffView \n{UIQueryView}"])
AccountLogoutNoView(["AccountLogoutNoView \n{UIView}"])
AccountSettingsView(["AccountSettingsView \n{UIMenuView}"])

%% Branch
BranchDisplayAllView(["BranchDisplayAllView \n{UIView}"])

%% CustomerView > CartViews
CartAddItemView(["CartAddItemView \n{UIQueryView}"])
CartBaseView(["UIMenuView \n{CartBaseView}"])
CartCheckoutView(["CartCheckoutView \n{UIQueryView}"])
CartDisplayView(["CartDisplayView \n{UIView}"])
CartQueryTakeawayView(["CartQueryTakeawayView \n{UIQueryView}"])
CartRemoveItemView(["CartRemoveItemView \n{UIQueryView}"])
CartUpdateItemView(["CartUpdateItemView \n{UIQueryView}"])

%% CustomerView
CustomerBaseView(["CustomerBaseView \n{UIMenuView}"])
CustomerChooseBranchView(["CustomerChooseBranchView \n{UIQueryView}"])
CustomerViewPreviousOrderView(["UIQueryView \n{}"])

%% MainViews
MainView(["MainView \n{UIMenuView}"])

%% MenuViews
MenuDisplayView(["MenuDisplayView \n{UIView}"])

%% PaymentMethodViews
PaymentMethodDisplayAllView(["PaymentMethodDisplayAllView \n{PaymentMethodDisplayAllView}"])

%% StaffViews > AdminViews
AdminAddAccountView(["AdminAddAccountView \n{UIQueryView}"])
AdminAddPaymentMethodView(["AdminAddPaymentMethodView \n{UIQueryView}"])
AdminChangeAccountUsernameView(["AdminChangeAccountUsernameView \n{UIQueryView}"])
AdminChangeStaffTypeView(["AdminChangeStaffTypeView \n{UIQueryView}"])
AdminCloseBranchView(["AdminCloseBranchView \n{UIQueryView}"])
AdminManageAccountsView(["AdminManageAccountsView \n{UIMenuView}"])
AdminManageBranchView(["AdminManageBranchView \n{UIMenuView}"])
AdminManagePaymentMethodsView(["AdminManagePaymentMethodsView \n{UIMenuView}"])
AdminManageStaffView(["AdminManageStaffView \n{UIMenuView}"])
AdminMoveStaffView(["AdminMoveStaffView \n{UIQueryView}"])
AdminOpenBranchView(["AdminOpenBranchView \n{UIQueryView}"])
AdminRemoveAccountView(["AdminRemoveAccountView \n{UIQueryView}"])
AdminRemovePaymentMethodView(["AdminRemovePaymentMethodView \n{UIQueryView}"])
AdminResetAccountPasswordView(["AdminResetAccountPasswordView \n{UIQueryView}"])

%% StaffViews > BranchManagerViews
BranchManagerAddMenuItemView(["BranchManagerAddMenuItemView \n{UIQueryView}"])
BranchManagerAmendMenuView(["BranchManagerAmendMenuView \n{UIMenuView}"])
BranchManagerDisplayStaffView(["BranchManagerDisplayStaffView \n{UIView}"])
BranchManagerEditMenuItemView(["BranchManagerEditMenuItemView \n{UIQueryView}"])
BranchManagerRemoveMenuItemView(["BranchManagerRemoveMenuItemView \n{UIQueryView}"])

%% StaffViews > NormalStaffViews
StaffDisplayOrdersView(["StaffDisplayOrdersView \n{UIView}"])
StaffProcessOrdersView(["StaffProcessOrdersView \n{UIQueryView}"])


%% ==== Flow Connection ====

%% Flow MainView
MainView ---> | User: 1 | CustomerBaseView ---> s1(Abstracted...)
MainView ---> | User: 2 | StaffBaseView ---> s2(Abstracted...)
%%MainView ---> | User: 1 | CustomerBaseView ---> s1(Abstracted...)
%%MainView ---> | User: 2 | StaffBaseView ---> s2(Abstracted...)

%% CustomerBaseView
CustomerBaseView ---> | User: 1 | CustomerChooseBranchView
CustomerBaseView ---> | User: 2 | CartBaseView
CustomerBaseView ---> | User: 3 | CustomerViewPreviousOrderView
CustomerBaseView ---> | User: 4 | CustomerViewPreviousOrderView

```

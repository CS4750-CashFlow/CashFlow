package com.cs4750.team15.expensetracker.expenselist;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B6\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/cs4750/team15/expensetracker/expenselist/ExpenseListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/cs4750/team15/expensetracker/expenselist/ExpenseHolder;", "expenses", "", "Lcom/cs4750/team15/expensetracker/expenselist/Expense;", "onExpenseClicked", "Lkotlin/Function1;", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "expenseID", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class ExpenseListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.cs4750.team15.expensetracker.expenselist.ExpenseHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.cs4750.team15.expensetracker.expenselist.Expense> expenses = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<java.util.UUID, kotlin.Unit> onExpenseClicked = null;
    
    public ExpenseListAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.cs4750.team15.expensetracker.expenselist.Expense> expenses, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.util.UUID, kotlin.Unit> onExpenseClicked) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.cs4750.team15.expensetracker.expenselist.ExpenseHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.cs4750.team15.expensetracker.expenselist.ExpenseHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
}
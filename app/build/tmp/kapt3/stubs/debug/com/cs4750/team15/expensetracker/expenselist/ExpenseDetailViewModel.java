package com.cs4750.team15.expensetracker.expenselist;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u000fH\u0014J\u001a\u0010\u0012\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0014R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/cs4750/team15/expensetracker/expenselist/ExpenseDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "expenseId", "Ljava/util/UUID;", "(Ljava/util/UUID;)V", "_expense", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/cs4750/team15/expensetracker/expenselist/Expense;", "expense", "Lkotlinx/coroutines/flow/StateFlow;", "getExpense", "()Lkotlinx/coroutines/flow/StateFlow;", "expenseRepository", "Lcom/cs4750/team15/expensetracker/expenselist/ExpenseRepository;", "deleteExpense", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "updateExpense", "onUpdate", "Lkotlin/Function1;", "app_debug"})
public final class ExpenseDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.cs4750.team15.expensetracker.expenselist.ExpenseRepository expenseRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cs4750.team15.expensetracker.expenselist.Expense> _expense = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cs4750.team15.expensetracker.expenselist.Expense> expense = null;
    
    public ExpenseDetailViewModel(@org.jetbrains.annotations.NotNull
    java.util.UUID expenseId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cs4750.team15.expensetracker.expenselist.Expense> getExpense() {
        return null;
    }
    
    public final void updateExpense(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.cs4750.team15.expensetracker.expenselist.Expense, com.cs4750.team15.expensetracker.expenselist.Expense> onUpdate) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteExpense(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}
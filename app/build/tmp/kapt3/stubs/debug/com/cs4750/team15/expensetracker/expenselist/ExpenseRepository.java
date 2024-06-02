package com.cs4750.team15.expensetracker.expenselist;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0012J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00150\u0014J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0015J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/cs4750/team15/expensetracker/expenselist/ExpenseRepository;", "", "context", "Landroid/content/Context;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "database", "Lcom/cs4750/team15/expensetracker/expenselist/database/ExpenseDatabase;", "addExpense", "", "expense", "Lcom/cs4750/team15/expensetracker/expenselist/Expense;", "(Lcom/cs4750/team15/expensetracker/expenselist/Expense;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteExpense", "getExpense", "id", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExpenses", "Lkotlinx/coroutines/flow/Flow;", "", "getSimpleExpenses", "updateExpense", "Companion", "app_debug"})
public final class ExpenseRepository {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.NotNull
    private final com.cs4750.team15.expensetracker.expenselist.database.ExpenseDatabase database = null;
    @org.jetbrains.annotations.Nullable
    private static com.cs4750.team15.expensetracker.expenselist.ExpenseRepository INSTANCE;
    @org.jetbrains.annotations.NotNull
    public static final com.cs4750.team15.expensetracker.expenselist.ExpenseRepository.Companion Companion = null;
    
    private ExpenseRepository(android.content.Context context, kotlinx.coroutines.CoroutineScope coroutineScope) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.cs4750.team15.expensetracker.expenselist.Expense>> getExpenses() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.cs4750.team15.expensetracker.expenselist.Expense> getSimpleExpenses() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getExpense(@org.jetbrains.annotations.NotNull
    java.util.UUID id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cs4750.team15.expensetracker.expenselist.Expense> $completion) {
        return null;
    }
    
    public final void updateExpense(@org.jetbrains.annotations.NotNull
    com.cs4750.team15.expensetracker.expenselist.Expense expense) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addExpense(@org.jetbrains.annotations.NotNull
    com.cs4750.team15.expensetracker.expenselist.Expense expense, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteExpense(@org.jetbrains.annotations.NotNull
    com.cs4750.team15.expensetracker.expenselist.Expense expense, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/cs4750/team15/expensetracker/expenselist/ExpenseRepository$Companion;", "", "()V", "INSTANCE", "Lcom/cs4750/team15/expensetracker/expenselist/ExpenseRepository;", "get", "initialize", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void initialize(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.cs4750.team15.expensetracker.expenselist.ExpenseRepository get() {
            return null;
        }
    }
}
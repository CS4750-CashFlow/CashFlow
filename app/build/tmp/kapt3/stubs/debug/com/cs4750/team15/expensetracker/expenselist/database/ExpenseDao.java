package com.cs4750.team15.expensetracker.expenselist.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e0\rH\'J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\'J\u0016\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/cs4750/team15/expensetracker/expenselist/database/ExpenseDao;", "", "addExpense", "", "expense", "Lcom/cs4750/team15/expensetracker/expenselist/Expense;", "(Lcom/cs4750/team15/expensetracker/expenselist/Expense;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteExpense", "getExpense", "id", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExpenses", "Lkotlinx/coroutines/flow/Flow;", "", "getSimpleExpenses", "updateExpense", "app_debug"})
@androidx.room.Dao
public abstract interface ExpenseDao {
    
    @androidx.room.Query(value = "SELECT * FROM expense")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.cs4750.team15.expensetracker.expenselist.Expense>> getExpenses();
    
    @androidx.room.Query(value = "SELECT * FROM expense")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.cs4750.team15.expensetracker.expenselist.Expense> getSimpleExpenses();
    
    @androidx.room.Query(value = "SELECT * FROM expense WHERE id=(:id)")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getExpense(@org.jetbrains.annotations.NotNull
    java.util.UUID id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cs4750.team15.expensetracker.expenselist.Expense> $completion);
    
    @androidx.room.Update
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateExpense(@org.jetbrains.annotations.NotNull
    com.cs4750.team15.expensetracker.expenselist.Expense expense, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addExpense(@org.jetbrains.annotations.NotNull
    com.cs4750.team15.expensetracker.expenselist.Expense expense, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteExpense(@org.jetbrains.annotations.NotNull
    com.cs4750.team15.expensetracker.expenselist.Expense expense, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}
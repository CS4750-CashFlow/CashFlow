package com.cs4750.team15.expensetracker.expenselist;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\'H\u0002J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\u0002J\u0012\u0010+\u001a\u00020\'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0018\u0010.\u001a\u00020\'2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J&\u00103\u001a\u0004\u0018\u0001042\u0006\u00101\u001a\u0002052\b\u00106\u001a\u0004\u0018\u0001072\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00108\u001a\u00020\'H\u0016J\u0010\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020;H\u0016J\u001a\u0010<\u001a\u00020\'2\u0006\u0010=\u001a\u0002042\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0012\u0010>\u001a\u00020\'2\b\u0010?\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010@\u001a\u00020\'2\u0006\u0010A\u001a\u00020BH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lcom/cs4750/team15/expensetracker/expenselist/ExpenseDetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "SPINNER_PREF_KEY", "", "_binding", "Lcom/cs4750/team15/expensetracker/databinding/FragmentExpenseDetailBinding;", "args", "Lcom/cs4750/team15/expensetracker/expenselist/ExpenseDetailFragmentArgs;", "getArgs", "()Lcom/cs4750/team15/expensetracker/expenselist/ExpenseDetailFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "getBinding", "()Lcom/cs4750/team15/expensetracker/databinding/FragmentExpenseDetailBinding;", "currTitle", "expenseDetailViewModel", "Lcom/cs4750/team15/expensetracker/expenselist/ExpenseDetailViewModel;", "getExpenseDetailViewModel", "()Lcom/cs4750/team15/expensetracker/expenselist/ExpenseDetailViewModel;", "expenseDetailViewModel$delegate", "Lkotlin/Lazy;", "handler", "Landroid/os/Handler;", "photoName", "sharedPreferences", "Landroid/content/SharedPreferences;", "takePhoto", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "updateDelayMillis", "", "canResolveIntent", "", "intent", "Landroid/content/Intent;", "deleteExpense", "", "formatAmount", "amount", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "updatePhoto", "photoFileName", "updateUi", "expense", "Lcom/cs4750/team15/expensetracker/expenselist/Expense;", "app_debug"})
public final class ExpenseDetailFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private com.cs4750.team15.expensetracker.databinding.FragmentExpenseDetailBinding _binding;
    @org.jetbrains.annotations.NotNull
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy expenseDetailViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<android.net.Uri> takePhoto = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.String photoName;
    private android.content.SharedPreferences sharedPreferences;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String SPINNER_PREF_KEY = "spinner_selected_item";
    @org.jetbrains.annotations.NotNull
    private final android.os.Handler handler = null;
    private final int updateDelayMillis = 5000;
    private java.lang.String currTitle;
    
    public ExpenseDetailFragment() {
        super();
    }
    
    private final com.cs4750.team15.expensetracker.databinding.FragmentExpenseDetailBinding getBinding() {
        return null;
    }
    
    private final com.cs4750.team15.expensetracker.expenselist.ExpenseDetailFragmentArgs getArgs() {
        return null;
    }
    
    private final com.cs4750.team15.expensetracker.expenselist.ExpenseDetailViewModel getExpenseDetailViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    private final void updateUi(com.cs4750.team15.expensetracker.expenselist.Expense expense) {
    }
    
    private final boolean canResolveIntent(android.content.Intent intent) {
        return false;
    }
    
    private final void updatePhoto(java.lang.String photoFileName) {
    }
    
    @java.lang.Override
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu, @org.jetbrains.annotations.NotNull
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    private final void deleteExpense() {
    }
    
    private final java.lang.String formatAmount(double amount) {
        return null;
    }
}
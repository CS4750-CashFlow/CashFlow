package com.cs4750.team15.expensetracker.spendinganalysis;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006+"}, d2 = {"Lcom/cs4750/team15/expensetracker/spendinganalysis/SpendingAnalysisFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/cs4750/team15/expensetracker/databinding/FragmentSpendingAnalysisBinding;", "args", "Lcom/cs4750/team15/expensetracker/spendinganalysis/SpendingAnalysisFragmentArgs;", "getArgs", "()Lcom/cs4750/team15/expensetracker/spendinganalysis/SpendingAnalysisFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "getBinding", "()Lcom/cs4750/team15/expensetracker/databinding/FragmentSpendingAnalysisBinding;", "pieChart", "Lcom/github/mikephil/charting/charts/PieChart;", "getPieChart", "()Lcom/github/mikephil/charting/charts/PieChart;", "setPieChart", "(Lcom/github/mikephil/charting/charts/PieChart;)V", "spendingAnalysisViewModel", "Lcom/cs4750/team15/expensetracker/spendinganalysis/SpendingAnalysisViewModel;", "getSpendingAnalysisViewModel", "()Lcom/cs4750/team15/expensetracker/spendinganalysis/SpendingAnalysisViewModel;", "spendingAnalysisViewModel$delegate", "Lkotlin/Lazy;", "calculatePercentage", "", "amount", "total", "formatFloat", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "app_debug"})
public final class SpendingAnalysisFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private com.cs4750.team15.expensetracker.databinding.FragmentSpendingAnalysisBinding _binding;
    @org.jetbrains.annotations.NotNull
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy spendingAnalysisViewModel$delegate = null;
    public com.github.mikephil.charting.charts.PieChart pieChart;
    
    public SpendingAnalysisFragment() {
        super();
    }
    
    private final com.cs4750.team15.expensetracker.databinding.FragmentSpendingAnalysisBinding getBinding() {
        return null;
    }
    
    private final com.cs4750.team15.expensetracker.spendinganalysis.SpendingAnalysisFragmentArgs getArgs() {
        return null;
    }
    
    private final com.cs4750.team15.expensetracker.spendinganalysis.SpendingAnalysisViewModel getSpendingAnalysisViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.github.mikephil.charting.charts.PieChart getPieChart() {
        return null;
    }
    
    public final void setPieChart(@org.jetbrains.annotations.NotNull
    com.github.mikephil.charting.charts.PieChart p0) {
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
    
    private final java.lang.String formatFloat(float amount) {
        return null;
    }
    
    private final float calculatePercentage(float amount, float total) {
        return 0.0F;
    }
}
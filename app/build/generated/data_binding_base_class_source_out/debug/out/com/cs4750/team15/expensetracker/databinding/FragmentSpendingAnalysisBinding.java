// Generated by view binder compiler. Do not edit!
package com.cs4750.team15.expensetracker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cs4750.team15.expensetracker.R;
import com.github.mikephil.charting.charts.PieChart;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSpendingAnalysisBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView amountSpentEntertainment;

  @NonNull
  public final TextView amountSpentGroceries;

  @NonNull
  public final TextView amountSpentMisc;

  @NonNull
  public final TextView amountSpentShopping;

  @NonNull
  public final TextView amountSpentTransportation;

  @NonNull
  public final TextView amountSpentTravel;

  @NonNull
  public final TextView catId1;

  @NonNull
  public final TextView catId2;

  @NonNull
  public final TextView catId3;

  @NonNull
  public final TextView catId4;

  @NonNull
  public final TextView catId5;

  @NonNull
  public final TextView catId6;

  @NonNull
  public final TextView idTVHead;

  @NonNull
  public final PieChart pieChart;

  @NonNull
  public final LinearLayout pieChartContainer;

  @NonNull
  public final TextView remainingBudget;

  @NonNull
  public final TextView spendingPercentageEntertainment;

  @NonNull
  public final TextView spendingPercentageGroceries;

  @NonNull
  public final TextView spendingPercentageMisc;

  @NonNull
  public final TextView spendingPercentageShopping;

  @NonNull
  public final TextView spendingPercentageTransportation;

  @NonNull
  public final TextView spendingPercentageTravel;

  @NonNull
  public final TextView textView;

  private FragmentSpendingAnalysisBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView amountSpentEntertainment, @NonNull TextView amountSpentGroceries,
      @NonNull TextView amountSpentMisc, @NonNull TextView amountSpentShopping,
      @NonNull TextView amountSpentTransportation, @NonNull TextView amountSpentTravel,
      @NonNull TextView catId1, @NonNull TextView catId2, @NonNull TextView catId3,
      @NonNull TextView catId4, @NonNull TextView catId5, @NonNull TextView catId6,
      @NonNull TextView idTVHead, @NonNull PieChart pieChart,
      @NonNull LinearLayout pieChartContainer, @NonNull TextView remainingBudget,
      @NonNull TextView spendingPercentageEntertainment,
      @NonNull TextView spendingPercentageGroceries, @NonNull TextView spendingPercentageMisc,
      @NonNull TextView spendingPercentageShopping,
      @NonNull TextView spendingPercentageTransportation,
      @NonNull TextView spendingPercentageTravel, @NonNull TextView textView) {
    this.rootView = rootView;
    this.amountSpentEntertainment = amountSpentEntertainment;
    this.amountSpentGroceries = amountSpentGroceries;
    this.amountSpentMisc = amountSpentMisc;
    this.amountSpentShopping = amountSpentShopping;
    this.amountSpentTransportation = amountSpentTransportation;
    this.amountSpentTravel = amountSpentTravel;
    this.catId1 = catId1;
    this.catId2 = catId2;
    this.catId3 = catId3;
    this.catId4 = catId4;
    this.catId5 = catId5;
    this.catId6 = catId6;
    this.idTVHead = idTVHead;
    this.pieChart = pieChart;
    this.pieChartContainer = pieChartContainer;
    this.remainingBudget = remainingBudget;
    this.spendingPercentageEntertainment = spendingPercentageEntertainment;
    this.spendingPercentageGroceries = spendingPercentageGroceries;
    this.spendingPercentageMisc = spendingPercentageMisc;
    this.spendingPercentageShopping = spendingPercentageShopping;
    this.spendingPercentageTransportation = spendingPercentageTransportation;
    this.spendingPercentageTravel = spendingPercentageTravel;
    this.textView = textView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSpendingAnalysisBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSpendingAnalysisBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_spending_analysis, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSpendingAnalysisBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.amount_spent_entertainment;
      TextView amountSpentEntertainment = ViewBindings.findChildViewById(rootView, id);
      if (amountSpentEntertainment == null) {
        break missingId;
      }

      id = R.id.amount_spent_groceries;
      TextView amountSpentGroceries = ViewBindings.findChildViewById(rootView, id);
      if (amountSpentGroceries == null) {
        break missingId;
      }

      id = R.id.amount_spent_misc;
      TextView amountSpentMisc = ViewBindings.findChildViewById(rootView, id);
      if (amountSpentMisc == null) {
        break missingId;
      }

      id = R.id.amount_spent_shopping;
      TextView amountSpentShopping = ViewBindings.findChildViewById(rootView, id);
      if (amountSpentShopping == null) {
        break missingId;
      }

      id = R.id.amount_spent_transportation;
      TextView amountSpentTransportation = ViewBindings.findChildViewById(rootView, id);
      if (amountSpentTransportation == null) {
        break missingId;
      }

      id = R.id.amount_spent_travel;
      TextView amountSpentTravel = ViewBindings.findChildViewById(rootView, id);
      if (amountSpentTravel == null) {
        break missingId;
      }

      id = R.id.cat_id_1;
      TextView catId1 = ViewBindings.findChildViewById(rootView, id);
      if (catId1 == null) {
        break missingId;
      }

      id = R.id.cat_id_2;
      TextView catId2 = ViewBindings.findChildViewById(rootView, id);
      if (catId2 == null) {
        break missingId;
      }

      id = R.id.cat_id_3;
      TextView catId3 = ViewBindings.findChildViewById(rootView, id);
      if (catId3 == null) {
        break missingId;
      }

      id = R.id.cat_id_4;
      TextView catId4 = ViewBindings.findChildViewById(rootView, id);
      if (catId4 == null) {
        break missingId;
      }

      id = R.id.cat_id_5;
      TextView catId5 = ViewBindings.findChildViewById(rootView, id);
      if (catId5 == null) {
        break missingId;
      }

      id = R.id.cat_id_6;
      TextView catId6 = ViewBindings.findChildViewById(rootView, id);
      if (catId6 == null) {
        break missingId;
      }

      id = R.id.idTVHead;
      TextView idTVHead = ViewBindings.findChildViewById(rootView, id);
      if (idTVHead == null) {
        break missingId;
      }

      id = R.id.pieChart;
      PieChart pieChart = ViewBindings.findChildViewById(rootView, id);
      if (pieChart == null) {
        break missingId;
      }

      id = R.id.pieChartContainer;
      LinearLayout pieChartContainer = ViewBindings.findChildViewById(rootView, id);
      if (pieChartContainer == null) {
        break missingId;
      }

      id = R.id.remaining_budget;
      TextView remainingBudget = ViewBindings.findChildViewById(rootView, id);
      if (remainingBudget == null) {
        break missingId;
      }

      id = R.id.spending_percentage_entertainment;
      TextView spendingPercentageEntertainment = ViewBindings.findChildViewById(rootView, id);
      if (spendingPercentageEntertainment == null) {
        break missingId;
      }

      id = R.id.spending_percentage_groceries;
      TextView spendingPercentageGroceries = ViewBindings.findChildViewById(rootView, id);
      if (spendingPercentageGroceries == null) {
        break missingId;
      }

      id = R.id.spending_percentage_misc;
      TextView spendingPercentageMisc = ViewBindings.findChildViewById(rootView, id);
      if (spendingPercentageMisc == null) {
        break missingId;
      }

      id = R.id.spending_percentage_shopping;
      TextView spendingPercentageShopping = ViewBindings.findChildViewById(rootView, id);
      if (spendingPercentageShopping == null) {
        break missingId;
      }

      id = R.id.spending_percentage_transportation;
      TextView spendingPercentageTransportation = ViewBindings.findChildViewById(rootView, id);
      if (spendingPercentageTransportation == null) {
        break missingId;
      }

      id = R.id.spending_percentage_travel;
      TextView spendingPercentageTravel = ViewBindings.findChildViewById(rootView, id);
      if (spendingPercentageTravel == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new FragmentSpendingAnalysisBinding((RelativeLayout) rootView,
          amountSpentEntertainment, amountSpentGroceries, amountSpentMisc, amountSpentShopping,
          amountSpentTransportation, amountSpentTravel, catId1, catId2, catId3, catId4, catId5,
          catId6, idTVHead, pieChart, pieChartContainer, remainingBudget,
          spendingPercentageEntertainment, spendingPercentageGroceries, spendingPercentageMisc,
          spendingPercentageShopping, spendingPercentageTransportation, spendingPercentageTravel,
          textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

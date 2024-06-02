// Generated by view binder compiler. Do not edit!
package com.cs4750.team15.expensetracker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cs4750.team15.expensetracker.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentChatBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonGchatSend;

  @NonNull
  public final EditText editGchatMessage;

  @NonNull
  public final RelativeLayout layoutGchatChatbox;

  @NonNull
  public final AppBarLayout layoutGroupChat;

  @NonNull
  public final RecyclerView recyclerGchat;

  @NonNull
  public final TextView textGchatIndicator;

  @NonNull
  public final View view;

  private FragmentChatBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonGchatSend,
      @NonNull EditText editGchatMessage, @NonNull RelativeLayout layoutGchatChatbox,
      @NonNull AppBarLayout layoutGroupChat, @NonNull RecyclerView recyclerGchat,
      @NonNull TextView textGchatIndicator, @NonNull View view) {
    this.rootView = rootView;
    this.buttonGchatSend = buttonGchatSend;
    this.editGchatMessage = editGchatMessage;
    this.layoutGchatChatbox = layoutGchatChatbox;
    this.layoutGroupChat = layoutGroupChat;
    this.recyclerGchat = recyclerGchat;
    this.textGchatIndicator = textGchatIndicator;
    this.view = view;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_chat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentChatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_gchat_send;
      Button buttonGchatSend = ViewBindings.findChildViewById(rootView, id);
      if (buttonGchatSend == null) {
        break missingId;
      }

      id = R.id.edit_gchat_message;
      EditText editGchatMessage = ViewBindings.findChildViewById(rootView, id);
      if (editGchatMessage == null) {
        break missingId;
      }

      id = R.id.layout_gchat_chatbox;
      RelativeLayout layoutGchatChatbox = ViewBindings.findChildViewById(rootView, id);
      if (layoutGchatChatbox == null) {
        break missingId;
      }

      id = R.id.layout_group_chat;
      AppBarLayout layoutGroupChat = ViewBindings.findChildViewById(rootView, id);
      if (layoutGroupChat == null) {
        break missingId;
      }

      id = R.id.recycler_gchat;
      RecyclerView recyclerGchat = ViewBindings.findChildViewById(rootView, id);
      if (recyclerGchat == null) {
        break missingId;
      }

      id = R.id.text_gchat_indicator;
      TextView textGchatIndicator = ViewBindings.findChildViewById(rootView, id);
      if (textGchatIndicator == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      return new FragmentChatBinding((ConstraintLayout) rootView, buttonGchatSend, editGchatMessage,
          layoutGchatChatbox, layoutGroupChat, recyclerGchat, textGchatIndicator, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
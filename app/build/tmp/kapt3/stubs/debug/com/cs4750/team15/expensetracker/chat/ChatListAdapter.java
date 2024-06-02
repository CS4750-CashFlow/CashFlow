package com.cs4750.team15.expensetracker.chat;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/cs4750/team15/expensetracker/chat/ChatListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/cs4750/team15/expensetracker/chat/ChatHolder;", "messages", "", "Lcom/cs4750/team15/expensetracker/chat/ChatMessage;", "(Ljava/util/List;)V", "addMessage", "", "message", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class ChatListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.cs4750.team15.expensetracker.chat.ChatHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.cs4750.team15.expensetracker.chat.ChatMessage> messages;
    
    public ChatListAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.cs4750.team15.expensetracker.chat.ChatMessage> messages) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.cs4750.team15.expensetracker.chat.ChatHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.cs4750.team15.expensetracker.chat.ChatHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void addMessage(@org.jetbrains.annotations.NotNull
    com.cs4750.team15.expensetracker.chat.ChatMessage message) {
    }
}
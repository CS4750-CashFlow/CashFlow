package com.cs4750.team15.expensetracker.chat;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\fH\u00c6\u0003JK\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020\bH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006%"}, d2 = {"Lcom/cs4750/team15/expensetracker/chat/ChatCompletionResponse;", "", "choices", "", "Lcom/cs4750/team15/expensetracker/chat/ChatChoice;", "created", "", "id", "", "model", "object", "usage", "Lcom/cs4750/team15/expensetracker/chat/Usage;", "(Ljava/util/List;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cs4750/team15/expensetracker/chat/Usage;)V", "getChoices", "()Ljava/util/List;", "getCreated", "()J", "getId", "()Ljava/lang/String;", "getModel", "getObject", "getUsage", "()Lcom/cs4750/team15/expensetracker/chat/Usage;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class ChatCompletionResponse {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.cs4750.team15.expensetracker.chat.ChatChoice> choices = null;
    private final long created = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String model = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String object = null;
    @org.jetbrains.annotations.NotNull
    private final com.cs4750.team15.expensetracker.chat.Usage usage = null;
    
    public ChatCompletionResponse(@org.jetbrains.annotations.NotNull
    java.util.List<com.cs4750.team15.expensetracker.chat.ChatChoice> choices, long created, @org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    java.lang.String model, @org.jetbrains.annotations.NotNull
    java.lang.String object, @org.jetbrains.annotations.NotNull
    com.cs4750.team15.expensetracker.chat.Usage usage) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.cs4750.team15.expensetracker.chat.ChatChoice> getChoices() {
        return null;
    }
    
    public final long getCreated() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getObject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.cs4750.team15.expensetracker.chat.Usage getUsage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.cs4750.team15.expensetracker.chat.ChatChoice> component1() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.cs4750.team15.expensetracker.chat.Usage component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.cs4750.team15.expensetracker.chat.ChatCompletionResponse copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.cs4750.team15.expensetracker.chat.ChatChoice> choices, long created, @org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    java.lang.String model, @org.jetbrains.annotations.NotNull
    java.lang.String object, @org.jetbrains.annotations.NotNull
    com.cs4750.team15.expensetracker.chat.Usage usage) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}
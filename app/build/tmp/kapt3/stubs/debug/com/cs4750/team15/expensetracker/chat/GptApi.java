package com.cs4750.team15.expensetracker.chat;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/cs4750/team15/expensetracker/chat/GptApi;", "", "getChatResponse", "Lcom/cs4750/team15/expensetracker/chat/ChatCompletionResponse;", "apiKey", "", "request", "Lcom/cs4750/team15/expensetracker/chat/ChatRequest;", "(Ljava/lang/String;Lcom/cs4750/team15/expensetracker/chat/ChatRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface GptApi {
    
    @retrofit2.http.POST(value = "v1/chat/completions")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getChatResponse(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.cs4750.team15.expensetracker.chat.ChatRequest request, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.cs4750.team15.expensetracker.chat.ChatCompletionResponse> $completion);
}
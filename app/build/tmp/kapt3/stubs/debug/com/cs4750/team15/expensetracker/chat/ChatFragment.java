package com.cs4750.team15.expensetracker.chat;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@\u00a2\u0006\u0002\u0010\u0018J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\"\u001a\u00020\u0015H\u0016J\u001a\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010%\u001a\u00020\u0015H\u0002J\n\u0010&\u001a\u00020\u0015*\u00020\'J\u0014\u0010&\u001a\u00020\u0015*\u00020(2\u0006\u0010$\u001a\u00020\u001dH\u0002J\n\u0010&\u001a\u00020\u0015*\u00020\u0001R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/cs4750/team15/expensetracker/chat/ChatFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/cs4750/team15/expensetracker/databinding/FragmentChatBinding;", "binding", "getBinding", "()Lcom/cs4750/team15/expensetracker/databinding/FragmentChatBinding;", "chatViewModel", "Lcom/cs4750/team15/expensetracker/chat/ChatViewModel;", "getChatViewModel", "()Lcom/cs4750/team15/expensetracker/chat/ChatViewModel;", "chatViewModel$delegate", "Lkotlin/Lazy;", "gptApi", "Lcom/cs4750/team15/expensetracker/chat/GptApi;", "okHttpClient", "Lokhttp3/OkHttpClient;", "retrofit", "Lretrofit2/Retrofit;", "getResponse", "", "msg", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "showNewMessage", "hideKeyboard", "Landroid/app/Activity;", "Landroid/content/Context;", "AuthInterceptor", "app_debug"})
public final class ChatFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private final okhttp3.OkHttpClient okHttpClient = null;
    @org.jetbrains.annotations.NotNull
    private final retrofit2.Retrofit retrofit = null;
    @org.jetbrains.annotations.NotNull
    private final com.cs4750.team15.expensetracker.chat.GptApi gptApi = null;
    @org.jetbrains.annotations.Nullable
    private com.cs4750.team15.expensetracker.databinding.FragmentChatBinding _binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy chatViewModel$delegate = null;
    
    public ChatFragment() {
        super();
    }
    
    private final com.cs4750.team15.expensetracker.databinding.FragmentChatBinding getBinding() {
        return null;
    }
    
    private final com.cs4750.team15.expensetracker.chat.ChatViewModel getChatViewModel() {
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
    
    private final void showNewMessage() {
    }
    
    private final java.lang.Object getResponse(java.lang.String msg, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$hideKeyboard) {
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$hideKeyboard) {
    }
    
    private final void hideKeyboard(android.content.Context $this$hideKeyboard, android.view.View view) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/cs4750/team15/expensetracker/chat/ChatFragment$AuthInterceptor;", "Lokhttp3/Interceptor;", "apiKey", "", "(Ljava/lang/String;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_debug"})
    static final class AuthInterceptor implements okhttp3.Interceptor {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String apiKey = null;
        
        public AuthInterceptor(@org.jetbrains.annotations.NotNull
        java.lang.String apiKey) {
            super();
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull
        okhttp3.Interceptor.Chain chain) {
            return null;
        }
    }
}
package pe.edu.upc.wheelmanager.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001c\u0010\u0010\u001a\u00020\r2\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lpe/edu/upc/wheelmanager/adapters/ProductAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lpe/edu/upc/wheelmanager/adapters/ProductAdapter$ProductPrototype;", "products", "Ljava/util/ArrayList;", "Lpe/edu/upc/wheelmanager/models/Product;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "(Ljava/util/ArrayList;Landroid/content/Context;)V", "getItemCount", "", "onActivityResult", "", "name", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ProductPrototype", "app_debug"})
public final class ProductAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<pe.edu.upc.wheelmanager.adapters.ProductAdapter.ProductPrototype> {
    private final java.util.ArrayList<pe.edu.upc.wheelmanager.models.Product> products = null;
    private final android.content.Context context = null;
    
    public final void onActivityResult(@org.jetbrains.annotations.Nullable()
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public pe.edu.upc.wheelmanager.adapters.ProductAdapter.ProductPrototype onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    pe.edu.upc.wheelmanager.adapters.ProductAdapter.ProductPrototype holder, int position) {
    }
    
    public ProductAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<pe.edu.upc.wheelmanager.models.Product> products, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lpe/edu/upc/wheelmanager/adapters/ProductAdapter$ProductPrototype;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lpe/edu/upc/wheelmanager/adapters/ProductAdapter;Landroid/view/View;)V", "btDelete", "Landroid/widget/ImageButton;", "cvProduct", "Landroidx/cardview/widget/CardView;", "tvName", "Landroid/widget/TextView;", "bindTo", "", "product", "Lpe/edu/upc/wheelmanager/models/Product;", "app_debug"})
    public final class ProductPrototype extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private androidx.cardview.widget.CardView cvProduct;
        private android.widget.TextView tvName;
        private android.widget.ImageButton btDelete;
        
        public final void bindTo(@org.jetbrains.annotations.NotNull()
        pe.edu.upc.wheelmanager.models.Product product) {
        }
        
        public ProductPrototype(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}
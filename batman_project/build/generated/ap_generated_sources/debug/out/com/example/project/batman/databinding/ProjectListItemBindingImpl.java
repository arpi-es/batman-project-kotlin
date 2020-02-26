package com.example.project.batman.databinding;
import com.example.project.batman.R;
import com.example.project.batman.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ProjectListItemBindingImpl extends ProjectListItemBinding implements com.example.project.batman.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ProjectListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ProjectListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.imgPoster.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.title.setTag(null);
        this.type.setTag(null);
        this.year.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.project.batman.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.search == variableId) {
            setSearch((com.example.project.batman.service.model.Search) variable);
        }
        else if (BR.adapter == variableId) {
            setAdapter((com.example.project.batman.view.adapter.MovieAdapter) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.example.project.batman.view.callback.MovieClickCallback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSearch(@Nullable com.example.project.batman.service.model.Search Search) {
        this.mSearch = Search;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.search);
        super.requestRebind();
    }
    public void setAdapter(@Nullable com.example.project.batman.view.adapter.MovieAdapter Adapter) {
        this.mAdapter = Adapter;
    }
    public void setCallback(@Nullable com.example.project.batman.view.callback.MovieClickCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String searchTitle = null;
        com.example.project.batman.service.model.Search search = mSearch;
        java.lang.String searchYear = null;
        java.lang.String searchPoster = null;
        com.example.project.batman.view.callback.MovieClickCallback callback = mCallback;
        java.lang.String searchType = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (search != null) {
                    // read search.title
                    searchTitle = search.getTitle();
                    // read search.year
                    searchYear = search.getYear();
                    // read search.poster
                    searchPoster = search.getPoster();
                    // read search.type
                    searchType = search.getType();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.example.project.batman.view.adapter.CustomBindingAdapter.loadImage(this.imgPoster, searchPoster);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, searchTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.type, searchType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.year, searchYear);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // search
        com.example.project.batman.service.model.Search search = mSearch;
        // callback
        com.example.project.batman.view.callback.MovieClickCallback callback = mCallback;
        // callback != null
        boolean callbackJavaLangObjectNull = false;



        callbackJavaLangObjectNull = (callback) != (null);
        if (callbackJavaLangObjectNull) {



            callback.onClick(search);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): search
        flag 1 (0x2L): adapter
        flag 2 (0x3L): callback
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}
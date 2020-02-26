package com.example.project.batman.databinding;
import com.example.project.batman.R;
import com.example.project.batman.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProjectDetailsBindingImpl extends FragmentProjectDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imgPoster, 7);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProjectDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentProjectDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            );
        this.loadingProject.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.title.setTag(null);
        this.type.setTag(null);
        this.year.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.isLoading == variableId) {
            setIsLoading((boolean) variable);
        }
        else if (BR.projectViewModel == variableId) {
            setProjectViewModel((com.example.project.batman.viewmodel.ProjectViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsLoading(boolean IsLoading) {
        this.mIsLoading = IsLoading;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.isLoading);
        super.requestRebind();
    }
    public void setProjectViewModel(@Nullable com.example.project.batman.viewmodel.ProjectViewModel ProjectViewModel) {
        this.mProjectViewModel = ProjectViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.projectViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProjectViewModelMovie((androidx.databinding.ObservableField<com.example.project.batman.service.model.Movie>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProjectViewModelMovie(androidx.databinding.ObservableField<com.example.project.batman.service.model.Movie> ProjectViewModelMovie, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.lang.String projectViewModelMovieYear = null;
        boolean isLoading = false;
        androidx.databinding.ObservableField<com.example.project.batman.service.model.Movie> projectViewModelMovie = null;
        com.example.project.batman.service.model.Movie projectViewModelMovieGet = null;
        java.lang.String projectViewModelMovieType = null;
        boolean IsLoading1 = mIsLoading;
        com.example.project.batman.viewmodel.ProjectViewModel projectViewModel = mProjectViewModel;
        java.lang.String projectViewModelMovieTitle = null;

        if ((dirtyFlags & 0xaL) != 0) {



                // read !isLoading
                isLoading = !IsLoading1;
        }
        if ((dirtyFlags & 0xdL) != 0) {



                if (projectViewModel != null) {
                    // read projectViewModel.movie
                    projectViewModelMovie = projectViewModel.getMovie();
                }
                updateRegistration(0, projectViewModelMovie);


                if (projectViewModelMovie != null) {
                    // read projectViewModel.movie.get()
                    projectViewModelMovieGet = projectViewModelMovie.get();
                }


                if (projectViewModelMovieGet != null) {
                    // read projectViewModel.movie.get().year
                    projectViewModelMovieYear = projectViewModelMovieGet.getYear();
                    // read projectViewModel.movie.get().type
                    projectViewModelMovieType = projectViewModelMovieGet.getType();
                    // read projectViewModel.movie.get().title
                    projectViewModelMovieTitle = projectViewModelMovieGet.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            com.example.project.batman.view.adapter.CustomBindingAdapter.showHide(this.loadingProject, IsLoading1);
            com.example.project.batman.view.adapter.CustomBindingAdapter.showHide(this.mboundView1, isLoading);
            com.example.project.batman.view.adapter.CustomBindingAdapter.showHide(this.mboundView2, isLoading);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, projectViewModelMovieTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.type, projectViewModelMovieType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.year, projectViewModelMovieYear);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): projectViewModel.movie
        flag 1 (0x2L): isLoading
        flag 2 (0x3L): projectViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}
// Generated by data binding compiler. Do not edit!
package com.example.project.batman.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.project.batman.R;
import com.example.project.batman.viewmodel.ProjectViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentProjectDetailsBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imgPoster;

  @NonNull
  public final TextView loadingProject;

  @NonNull
  public final TextView title;

  @NonNull
  public final TextView type;

  @NonNull
  public final TextView year;

  @Bindable
  protected boolean mIsLoading;

  @Bindable
  protected ProjectViewModel mProjectViewModel;

  protected FragmentProjectDetailsBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView imgPoster, TextView loadingProject, TextView title,
      TextView type, TextView year) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgPoster = imgPoster;
    this.loadingProject = loadingProject;
    this.title = title;
    this.type = type;
    this.year = year;
  }

  public abstract void setIsLoading(boolean isLoading);

  public boolean getIsLoading() {
    return mIsLoading;
  }

  public abstract void setProjectViewModel(@Nullable ProjectViewModel projectViewModel);

  @Nullable
  public ProjectViewModel getProjectViewModel() {
    return mProjectViewModel;
  }

  @NonNull
  public static FragmentProjectDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_movie_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProjectDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentProjectDetailsBinding>inflateInternal(inflater, R.layout.fragment_project_details, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentProjectDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_movie_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProjectDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentProjectDetailsBinding>inflateInternal(inflater, R.layout.fragment_project_details, null, false, component);
  }

  public static FragmentProjectDetailsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentProjectDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentProjectDetailsBinding)bind(component, view, R.layout.fragment_project_details);
  }
}

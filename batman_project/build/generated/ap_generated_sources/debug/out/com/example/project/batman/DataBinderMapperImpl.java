package com.example.project.batman;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.project.batman.databinding.FragmentProjectDetailsBindingImpl;
import com.example.project.batman.databinding.FragmentProjectListBindingImpl;
import com.example.project.batman.databinding.ProjectListItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTPROJECTDETAILS = 1;

  private static final int LAYOUT_FRAGMENTPROJECTLIST = 2;

  private static final int LAYOUT_PROJECTLISTITEM = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.project.batman.R.layout.fragment_project_details, LAYOUT_FRAGMENTPROJECTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.project.batman.R.layout.fragment_project_list, LAYOUT_FRAGMENTPROJECTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.project.batman.R.layout.project_list_item, LAYOUT_PROJECTLISTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTPROJECTDETAILS: {
          if ("layout/fragment_project_details_0".equals(tag)) {
            return new FragmentProjectDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_project_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROJECTLIST: {
          if ("layout/fragment_project_list_0".equals(tag)) {
            return new FragmentProjectListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_project_list is invalid. Received: " + tag);
        }
        case  LAYOUT_PROJECTLISTITEM: {
          if ("layout/project_list_item_0".equals(tag)) {
            return new ProjectListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for project_list_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "isLoading");
      sKeys.put(2, "search");
      sKeys.put(3, "adapter");
      sKeys.put(4, "projectViewModel");
      sKeys.put(5, "callback");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_project_details_0", com.example.project.batman.R.layout.fragment_project_details);
      sKeys.put("layout/fragment_project_list_0", com.example.project.batman.R.layout.fragment_project_list);
      sKeys.put("layout/project_list_item_0", com.example.project.batman.R.layout.project_list_item);
    }
  }
}

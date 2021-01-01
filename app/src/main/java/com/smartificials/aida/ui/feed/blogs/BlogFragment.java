package com.smartificials.aida.ui.feed.blogs;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;


import com.smartificials.aida.BR;
import com.smartificials.aida.R;
import com.smartificials.aida.data.model.api.BlogResponse;
import com.smartificials.aida.databinding.FragmentBlogBinding;
import com.smartificials.aida.di.component.FragmentComponent;
import com.smartificials.aida.ui.base.BaseFragment;

import java.util.List;

import javax.inject.Inject;


public class BlogFragment extends BaseFragment<FragmentBlogBinding, BlogViewModel>
        implements BlogNavigator, BlogAdapter.BlogAdapterListener {

    @Inject
    BlogAdapter mBlogAdapter;

    FragmentBlogBinding mFragmentBlogBinding;

    @Inject
    LinearLayoutManager mLayoutManager;

    public static BlogFragment newInstance() {
        Bundle args = new Bundle();
        BlogFragment fragment = new BlogFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_blog;
    }


    @Override
    public void handleError(Throwable throwable) {
        // handle error
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel.setNavigator(this);
        mBlogAdapter.setListener(this);
    }

    @Override
    public void onRetryClick() {
        mViewModel.fetchBlogs();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mFragmentBlogBinding = getViewDataBinding();
        setUp();
    }

    @Override
    public void performDependencyInjection(FragmentComponent buildComponent) {
        buildComponent.inject(this);
    }

    @Override
    public void updateBlog(List<BlogResponse.Blog> blogList) {
        mBlogAdapter.addItems(blogList);
    }

    private void setUp() {
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mFragmentBlogBinding.blogRecyclerView.setLayoutManager(mLayoutManager);
        mFragmentBlogBinding.blogRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mFragmentBlogBinding.blogRecyclerView.setAdapter(mBlogAdapter);
    }
}


package com.smartificials.aida.ui.feed.blogs;


import com.smartificials.aida.data.model.api.BlogResponse;

import java.util.List;



public interface BlogNavigator {

    void handleError(Throwable throwable);

    void updateBlog(List<BlogResponse.Blog> blogList);
}

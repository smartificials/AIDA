package com.smartificials.aida.data.remote;


import com.smartificials.aida.data.model.api.BlogResponse;
import com.smartificials.aida.data.model.api.LoginRequest;
import com.smartificials.aida.data.model.api.LoginResponse;
import com.smartificials.aida.data.model.api.LogoutResponse;
import com.smartificials.aida.data.model.api.OpenSourceResponse;

import io.reactivex.Single;


public interface ApiHelper {

    Single<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest request);

    Single<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request);

    Single<LogoutResponse> doLogoutApiCall();

    Single<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request);

    ApiHeader getApiHeader();

    Single<BlogResponse> getBlogApiCall();

    Single<OpenSourceResponse> getOpenSourceApiCall();
}

package com.example.yaroslav.socialapp.model;

import com.example.yaroslav.socialapp.model.data.User;
import com.example.yaroslav.socialapp.presenter.FbResponser;
import com.facebook.GraphRequest;
import com.facebook.login.LoginResult;

/**
 * Created by Yaroslav on 27-May-16.
 */
public interface FacebookRequester {
    public void facebookRequest(LoginResult loginResult, GraphRequest.GraphJSONObjectCallback callback);
}

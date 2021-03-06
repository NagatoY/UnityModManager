package io.github.xausky.unitymodmanager.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.xausky.unitymodmanager.R;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * Created by xausky on 18-3-3.
 */

public class InfoFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return new AboutPage(inflater.getContext())
                .setDescription(getString(R.string.info_context_text))
                .addEmail("xausky@163.com", "我的邮箱")
                .addWebsite("https://space.bilibili.com/8419077/", "我的B站")
                .addGitHub("xausky", "我的Github")
                .create();
    }
}

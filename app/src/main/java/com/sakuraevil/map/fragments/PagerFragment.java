package com.sakuraevil.map.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sakuraevil.map.R;

/**
 * Created by DuyNguyen on 5/3/2016.
 */
public class PagerFragment extends Fragment {
    public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";

    public static final PagerFragment newInstance(String message)

    {
        PagerFragment pagerFragment = new PagerFragment();

        Bundle bundle = new Bundle(1);
        bundle.putString(EXTRA_MESSAGE, message);
        pagerFragment.setArguments(bundle);

        return pagerFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pager_fragment, container, false);
        TextView messageTextView = (TextView)view.findViewById(R.id.textView);
        String message = getArguments().getString(EXTRA_MESSAGE);
        messageTextView.setText(message);

        return view;
    }

}

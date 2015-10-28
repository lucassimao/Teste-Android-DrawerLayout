package com.example.lucassimao.testdrawer;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lucas.simao on 15/10/2015.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class PositionFragment extends Fragment {

    public final static String ARG_POSITION= "position";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.position_fargment, container, false);
        TextView txtView = (TextView) inflate.findViewById(android.R.id.text1);

        Bundle bundle = getArguments();
        txtView.setText("Testando " + bundle.getInt(ARG_POSITION));
        return inflate;
    }
}

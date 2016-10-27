package com.gjj.gd.mvpdemo2.getphoneinfo;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.gjj.gd.mvpdemo2.R;

/**
 * setPresenter方法继承与父类，通过该方法，view获得presenter实例；
 * 从而可以调用presenter代码来处理业务逻辑，在onResume中还调用了presenter的start方法，处理数据的加载与展示
 */
public class GetPhoneInfoFragment extends Fragment implements View.OnClickListener,GetPhoneInfoContract.View{

    public static final String TAG = GetPhoneInfoFragment.class.getSimpleName();

    private GetPhoneInfoContract.Presenter mPresenter;
    private ProgressDialog mProgressDialog;
    private TextView mTvTime;

    public GetPhoneInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_get_phone_info, container, false);
        mTvTime = (TextView)view.findViewById(R.id.tv_time);
        Button btnGetTime = (Button) view.findViewById(R.id.btn_get_time);
        btnGetTime.setOnClickListener(this);

        mProgressDialog = new ProgressDialog(getActivity());
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }


    @Override
    public void onClick(View v) {
        mPresenter.getTime();
    }

    @Override
    public void setTime(String name) {
        Log.d(TAG, "setTime: "+name);
    }

    @Override
    public void showLoading() {
        mProgressDialog.setTitle("请稍侯");
        mProgressDialog.setMessage("loading!");
        mProgressDialog.show();
    }

    @Override
    public void hideLoading() {
        mProgressDialog.dismiss();
    }

    @Override
    public void setPresenter(GetPhoneInfoContract.Presenter presenter) {
        if (presenter != null) {
            mPresenter = presenter;
        }
    }
}

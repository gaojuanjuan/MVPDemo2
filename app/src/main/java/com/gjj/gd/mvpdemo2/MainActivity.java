package com.gjj.gd.mvpdemo2;

import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gjj.gd.mvpdemo2.getphoneinfo.GetPhoneInfoFragment;
import com.gjj.gd.mvpdemo2.getphoneinfo.GetPhoneInfoPresenter;

/**
 * activity作为全局的控制者，负责创建view及presenter实例，并将而这联系起来，具体的view交由fragment来实现
 *本例中Activity中通过setDefaultFragment设置了fragment，之后实例化GetPhoneInfoPresenter
 * 并将fragment传递进去，实现preseter中通过framgment的接口duiView进行操作展示
 */
public class MainActivity extends AppCompatActivity {

    private GetPhoneInfoFragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setDefaultFragment();
        new GetPhoneInfoPresenter(mFragment);
    }

    private void setDefaultFragment() {
        mFragment = new GetPhoneInfoFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.add(R.id.fragcontent,mFragment);
        transaction.commit();
    }
}

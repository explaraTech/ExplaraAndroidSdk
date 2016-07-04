package com.explara_core.login.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

import com.explara_core.R;
import com.explara_core.common.BaseWithOutNavActivity;
import com.explara_core.utils.FragmentHelper;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by debasishpanda on 22/09/15.
 */
public class ForgotPasswordWithOutNavActivity extends BaseWithOutNavActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        removeContainerPadding();
    }

    @Override
    protected void addContentFragment() {
        displayBackButton();
        FragmentHelper.replaceContentFragment(this, R.id.fragment_container,new ForgotPasswordFragment());
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void setToolBarTitle() {
        mToolbarTitle.setText("Forgot Password ?");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
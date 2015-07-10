package jp.mixi.assignment.controller.adv;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by andoutakayuki on 15/07/10.
 */
public class ButtomFragment extends Fragment {
    public ButtomFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.buttomfragment,container,false);
    }
}

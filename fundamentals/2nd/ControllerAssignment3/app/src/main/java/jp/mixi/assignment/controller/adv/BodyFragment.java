package jp.mixi.assignment.controller.adv;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

/**
 * Created by andoutakayuki on 15/07/10.
 */
public class BodyFragment extends Fragment {
    public BodyFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bodyfragment,container,false);
    }
}

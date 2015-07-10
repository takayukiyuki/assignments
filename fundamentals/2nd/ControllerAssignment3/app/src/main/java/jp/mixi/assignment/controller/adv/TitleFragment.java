package jp.mixi.assignment.controller.adv;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by andoutakayuki on 15/07/10.
 */
public class TitleFragment extends Fragment {
    public TitleFragment(){
    }

    public static TitleFragment title(){
        TitleFragment sub = new TitleFragment();
        Bundle bundle = new Bundle();
        sub.setArguments(bundle);

        return sub;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    return inflater.inflate(R.layout.titlefragment,container,false);
    }
}

package xerath.paydayandroid.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xerath.paydayandroid.R;

/**
 * Created by Rances on 5/07/2017.
 */

public class ProjectFragment extends Fragment {

    public ProjectFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_projects, container, false);
    }

}

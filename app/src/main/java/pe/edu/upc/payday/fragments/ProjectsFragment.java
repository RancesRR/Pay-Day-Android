package pe.edu.upc.payday.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import pe.edu.upc.payday.PayDayApp;
import pe.edu.upc.payday.R;
import pe.edu.upc.payday.adapters.ProjectEntitiesAdapter;
import pe.edu.upc.payday.models.ProjectEntity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProjectsFragment extends Fragment {
    RecyclerView projectEntriesRecyclerView;
    List<ProjectEntity> projectEntities;
    private TextView mTextMessage;

    public ProjectsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_projects, container, false);
        getData();
        projectEntriesRecyclerView = (RecyclerView) rootView.findViewById(R.id.projectEntriesRecyclerView);
        projectEntriesRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ProjectEntitiesAdapter projectEntitiesAdapter = new ProjectEntitiesAdapter();
        projectEntitiesAdapter.setProjectEntities(projectEntities);
        projectEntriesRecyclerView.setAdapter(projectEntitiesAdapter);

        return inflater.inflate(R.layout.fragment_projects, container, false);
    }

    public void getData(){
        projectEntities = PayDayApp.getInstance().getProjectEntries();
    }
}

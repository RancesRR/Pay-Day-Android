package pe.edu.upc.payday.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import pe.edu.upc.payday.PayDayApp;
import pe.edu.upc.payday.R;
import pe.edu.upc.payday.adapters.ProjectEntitiesAdapter;
import pe.edu.upc.payday.models.ProjectEntity;

public class ProjectEntitiesActivity extends AppCompatActivity {
    RecyclerView projectEntriesRecyclerView;
    List<ProjectEntity> projectEntities;

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    startActivity(new Intent(findViewById(android.R.id.content).getContext(), MainActivity.class));
                    return true;
                case R.id.navigation_projects:
                    startActivity(new Intent(findViewById(android.R.id.content).getContext(), AddProjectEntityActivity.class));
                    return true;
                case R.id.navigation_banks:
                    startActivity(new Intent(findViewById(android.R.id.content).getContext(), LoginActivity.class));
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_entities);

        getData();
        projectEntriesRecyclerView = (RecyclerView) findViewById(R.id.projectEntriesRecyclerView);
        projectEntriesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        ProjectEntitiesAdapter projectEntitiesAdapter = new ProjectEntitiesAdapter();
        projectEntitiesAdapter.setProjectEntities(projectEntities);
        projectEntriesRecyclerView.setAdapter(projectEntitiesAdapter);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().getItem(1).setChecked(true);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        ((ProjectEntitiesAdapter) projectEntriesRecyclerView.getAdapter()).setProjectEntities(
                PayDayApp.getInstance().getProjectEntries()
        );
        projectEntriesRecyclerView.getAdapter().notifyDataSetChanged();
    }

    public void getData(){
        projectEntities = PayDayApp.getInstance().getProjectEntries();
    }
}

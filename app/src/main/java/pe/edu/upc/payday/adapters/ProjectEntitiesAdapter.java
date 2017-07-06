package pe.edu.upc.payday.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import pe.edu.upc.payday.R;
import pe.edu.upc.payday.models.ProjectEntity;

/**
 * Created by Jorge GD on 18/05/2017.
 */

public class ProjectEntitiesAdapter extends RecyclerView.Adapter<ProjectEntitiesAdapter.ViewHolder> {
    private List<ProjectEntity> projectEntities;

    public List<ProjectEntity> getProjectEntities() {
        return projectEntities;
    }

    public void setProjectEntities(List<ProjectEntity> projectEntities) {
        this.projectEntities = projectEntities;
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{
        TextView projectTextView;
        TextView bankTextView;
        TextView loanAmountTextView;
        TextView loanRateTextView;
        TextView dateTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            projectTextView = (TextView) itemView.findViewById(R.id.projectTextView);
            bankTextView = (TextView) itemView.findViewById(R.id.bankTextView);
            loanAmountTextView = (TextView) itemView.findViewById(R.id.loanAmountTextView);
            loanRateTextView = (TextView) itemView.findViewById(R.id.loanRateTextView);
            dateTextView = (TextView) itemView.findViewById(R.id.dateTextView);
        }
    }

    @Override
    public void onBindViewHolder(ProjectEntitiesAdapter.ViewHolder holder, int position) {
        holder.projectTextView.setText("Proyecto " + position);
        holder.bankTextView.setText(projectEntities.get(position).getLenderEntity().getName());
        holder.loanAmountTextView.setText(projectEntities.get(position).getLoanAmountAsString());
        holder.loanRateTextView.setText(projectEntities.get(position).getLoanRateAsString());
        holder.dateTextView.setText(projectEntities.get(position).getEntryDateAsString());
    }

    @Override
    public ProjectEntitiesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_project, parent, false));
    }

    @Override
    public int getItemCount() {
        return projectEntities.size();
    }
}

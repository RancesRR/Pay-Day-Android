package pe.edu.upc.payday;

import android.app.Application;

import java.util.List;

import pe.edu.upc.payday.models.DataService;
import pe.edu.upc.payday.models.LenderEntity;
import pe.edu.upc.payday.models.ProjectEntity;

/**
 * Created by Jorge GD on 18/05/2017.
 */

public class PayDayApp extends Application {
    private DataService service = new DataService();
    private static PayDayApp instance;

    public PayDayApp() {
        super();
        instance = this;
    }

    public static PayDayApp getInstance() {
        return instance;
    }

    public DataService getService() {
        return service;
    }

    public List<LenderEntity> getLenderEntries(){
        return getService().getLenderEntities();
    }

    public List<ProjectEntity> getProjectEntries(){
        return getService().getProjectEntities();
    }

    public boolean addProjectEntry(ProjectEntity entry){
        return service.addProjectEntry(entry);
    }
}

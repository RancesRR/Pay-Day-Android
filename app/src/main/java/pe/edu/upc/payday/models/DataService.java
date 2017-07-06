package pe.edu.upc.payday.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Jorge GD on 18/05/2017.
 */

public class DataService {
    private List<ProjectEntity> entries;
    private UserEntity user;

    public DataService() {
        entries = new ArrayList<>();
        user = new UserEntity();
        entries.add(new ProjectEntity(user, getLenderEntities().get(0), new LoanType(getLenderEntities().get(0),8.7, "Desc 1"), 10500.80, 8, 1000.20, new Date()));
        entries.add(new ProjectEntity(user, getLenderEntities().get(1), new LoanType(getLenderEntities().get(1),6.7, "Desc 2"), 11000.80, 9, 1100.20, new Date()));
        entries.add(new ProjectEntity(user, getLenderEntities().get(2), new LoanType(getLenderEntities().get(2),5.7, "Desc 3"), 11500.80, 10, 1200.20, new Date()));
        entries.add(new ProjectEntity(user, getLenderEntities().get(1), new LoanType(getLenderEntities().get(2),6.7, "Descripcion breve"), 12520.80, 5, 2400.20, new Date()));
    }

    public List<LenderEntity> getLenderEntities(){
        List<LenderEntity> lenderEntities = new ArrayList<>();
        lenderEntities.add(new LenderEntity(new LenderType("Lender Type 1"), "BCP", "La Molina", "111-4444","prueba@bcp.com.pe", new Date()));
        lenderEntities.add(new LenderEntity(new LenderType("Lender Type 2"), "InterBank", "La Molina", "111-5555","prueba@interbank.com.pe", new Date()));
        lenderEntities.add(new LenderEntity(new LenderType("Lender Type 3"), "Scotiabank", "La Molina", "111-6666","prueba@scotiabank.com.pe", new Date()));
        return lenderEntities;
    }

    public List<ProjectEntity> getProjectEntities (){
        return entries;
    }

    public boolean addProjectEntry(ProjectEntity entry){
        entries.add(entry);
        return true;
    }

    public int getProjectEntitiesCount (){
        return entries.size();
    }


}

package pe.edu.upc.payday.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import pe.edu.upc.payday.PayDayApp;
import pe.edu.upc.payday.R;
import pe.edu.upc.payday.models.ProjectEntity;

public class AddProjectEntityActivity extends AppCompatActivity {
    TextInputEditText loanAmountInputEditText;
    TextInputEditText loanRateInputEditText;
    TextInputEditText numberFeesInputEditText;
    TextInputEditText feeAmountInputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_project_entity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        loanAmountInputEditText = (TextInputEditText) findViewById(R.id.loanAmountInputEditText);
        loanRateInputEditText = (TextInputEditText) findViewById(R.id.loanRateInputEditText);
        numberFeesInputEditText = (TextInputEditText) findViewById(R.id.numberFeesInputEditText);
        feeAmountInputEditText = (TextInputEditText) findViewById(R.id.feeAmountInputEditText);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProjectEntity projectEntity = new ProjectEntity();
                projectEntity.setLoanAmount(Double.parseDouble(loanAmountInputEditText.getText().toString()));
                projectEntity.setLoanRate(Double.parseDouble(loanRateInputEditText.getText().toString()));
                projectEntity.setNumberFees(Integer.parseInt(numberFeesInputEditText.getText().toString()));
                projectEntity.setFeeAmount(Double.parseDouble(feeAmountInputEditText.getText().toString()));

                PayDayApp.getInstance().addProjectEntry(projectEntity);
                finish();
                
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}

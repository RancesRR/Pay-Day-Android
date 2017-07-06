package pe.edu.upc.payday.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import pe.edu.upc.payday.R;

public class LoginActivity extends AppCompatActivity {
    private EditText txtUser;
    private EditText txtPassword;
    private Button btnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUser = (EditText) findViewById(R.id.txtUser);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnEnter = (Button)findViewById(R.id.btnEnter);

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtUser.getText().toString().equals("admin") && txtPassword.getText().toString().equals("1234")){
                    //AQUÍ LO LLEVARÍA AL MENÚ DE OPCIONES
                    startActivity(new Intent(v.getContext(), MainActivity.class));
                }else{
                    Toast toast = Toast.makeText(v.getContext(), "User or Password incorrects.", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        txtUser.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                for(int i = s.length(); i > 0; i--) {

                    if(s.subSequence(i-1, i).toString().equals("\n"))
                        s.replace(i-1, i, "");
                }
                String myTextString = s.toString();
            }
        });
    }
}

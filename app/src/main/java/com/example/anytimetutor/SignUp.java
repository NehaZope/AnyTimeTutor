package com.example.anytimetutor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    EditText e_first_name,e_last_name, e_password, e_repassword, e_phone, e_email , e_sapid;
    Spinner s_year, s_college_name, s_course, s_stream;
    Button b_scanid, b_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        e_first_name = (EditText) findViewById(R.id.e_first_name);
        e_last_name = (EditText) findViewById(R.id.e_last_name);
        e_password = (EditText) findViewById(R.id.e_password);
        e_repassword = (EditText) findViewById(R.id.e_repassword);
        e_phone = (EditText) findViewById(R.id.e_phone);
        e_email = (EditText) findViewById(R.id.e_email);
        s_year = (Spinner) findViewById(R.id.s_year);
        e_sapid = (EditText) findViewById(R.id.e_sapid);
        s_college_name = (Spinner) findViewById(R.id.s_college_name);
        s_course = (Spinner) findViewById(R.id.s_course);
        s_stream = (Spinner) findViewById(R.id.s_stream);
        b_scanid = (Button) findViewById(R.id.b_scanid);
        b_register = (Button) findViewById(R.id.b_register);

        b_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!e_first_name.getText().equals(""))
                {
                    if(!e_last_name.getText().equals(""))
                    {
                        if(!e_password.getText().equals(""))
                        {
                            if(!e_repassword.getText().equals("") && e_password.getText().equals(e_repassword.getText()))
                            {
                                if(!e_phone.getText().equals(""))
                                {
                                    if(!e_email.getText().equals(""))
                                    {
                                        String year = s_year.getSelectedItem().toString();
                                        if(!s_year.equals("Select year"))
                                        {
                                            if(!e_sapid.getText().equals(""))
                                            {
                                                String college = s_college_name.getSelectedItem().toString();
                                                if(!s_college_name.equals("Select college"))
                                                {
                                                    String course = s_course.getSelectedItem().toString();
                                                    if(!s_course.equals("Select course"))
                                                    {
                                                        String stream = s_stream.getSelectedItem().toString();
                                                        if(!s_stream.equals("Select stream"))
                                                        {
                                                        }
                                                        else
                                                        {
                                                            Toast.makeText(getApplicationContext(),"Stream cannot be empty",Toast.LENGTH_SHORT).show();
                                                        }
                                                    }else
                                                    {
                                                        Toast.makeText(getApplicationContext(),"Course cannot be empty",Toast.LENGTH_SHORT).show();
                                                    }
                                                }else
                                                {
                                                    Toast.makeText(getApplicationContext(),"College Name cannot be empty",Toast.LENGTH_SHORT).show();
                                                }
                                            }else
                                            {
                                                Toast.makeText(getApplicationContext(),"Sap ID cannot be empty",Toast.LENGTH_SHORT).show();
                                            }
                                        }else
                                        {
                                            Toast.makeText(getApplicationContext(),"Year cannot be empty",Toast.LENGTH_SHORT).show();
                                        }
                                    }else
                                    {
                                        Toast.makeText(getApplicationContext(),"Email cannot be empty",Toast.LENGTH_SHORT).show();
                                    }
                                }else
                                {
                                    Toast.makeText(getApplicationContext(),"Phone cannot be empty",Toast.LENGTH_SHORT).show();
                                }
                            }else
                            {
                                Toast.makeText(getApplicationContext(),"Your password does not match the reentered password",Toast.LENGTH_SHORT).show();
                            }
                        }else
                        {
                            Toast.makeText(getApplicationContext(),"Password cannot be empty",Toast.LENGTH_SHORT).show();
                        }
                    }else
                    {
                        Toast.makeText(getApplicationContext(),"Last Name cannot be empty",Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"First Name cannot be empty",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}

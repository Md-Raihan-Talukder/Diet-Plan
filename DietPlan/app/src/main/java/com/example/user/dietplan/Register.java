package com.example.user.dietplan;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {

    EditText signUpUsername,signUpName,signUpPassword,signUpGender,signUpAge;
    TextView signupButton;
    //CheckBox checkBoxTerms;
    private ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        pd = new ProgressDialog(Register.this);
        signupButton =(TextView) findViewById(R.id.register);
        signUpUsername = (EditText)findViewById(R.id.et_username);
        signUpName =(EditText)findViewById(R.id.et_name);
        signUpPassword = (EditText)findViewById(R.id.et_password);
        signUpGender = (EditText)findViewById(R.id.et_gender);
        signUpAge = (EditText)findViewById(R.id.et_age);
        //checkBoxTerms = (CheckBox)findViewById(R.id.checkBoxTerms);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(checkBoxTerms.isChecked() == true){
                    signupRequest();
                //}
                //else{
                //   Toast.makeText(getApplicationContext(),"Please Accept Terms & Services",Toast.LENGTH_SHORT).show();
                //}
            }
        });
    }

    private void signupRequest(){
        pd.setMessage("Signing Up . . .");
        pd.show();
        RequestQueue queue = Volley.newRequestQueue(Register.this);
        String response = null;
        final String finalResponse = response;

        StringRequest postRequest = new StringRequest(Request.Method.POST, URL.signup,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        pd.hide();
                        //Response
                        String aa = "Successfully Signed In";

                        if(response.equals(aa)) {
                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // error
                        Log.d("ErrorResponse", finalResponse);
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String>  params = new HashMap<String, String>();

                params.put("username", signUpUsername.getText().toString());
                params.put("password", signUpPassword.getText().toString());
                params.put("name", signUpName.getText().toString());
                params.put("gender", signUpGender.getText().toString());
                params.put("age", signUpAge.getText().toString());

                return params;
            }
        };
        postRequest.setRetryPolicy(new DefaultRetryPolicy(0, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        queue.add(postRequest);
    }

}
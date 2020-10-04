package com.example.studentregistrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    EditText firstname;
    EditText lastName;
    EditText rollnumber;
    EditText branch;
    EditText gender;
    EditText email;
    EditText password;
    EditText phonenumber;
    Button register;
    TextView textView;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstname = findViewById(R.id.fn);
        lastName = findViewById(R.id.ln);
        rollnumber = findViewById(R.id.rn);
        branch = findViewById(R.id.br);
        gender = findViewById(R.id.g);
        email = findViewById(R.id.e);
        password = findViewById(R.id.pwd);
        phonenumber = findViewById(R.id.ph);
        register = findViewById(R.id.r);
        register.setOnClickListener(new View.OnClickListener();
        textView=findViewById(R.id.tv);
    }
    public void savedata(View view) {
        String e=email.getText().toString();
        String p=password.getText().toString();
        SharedPreferences.Editor editor=preferences.edit();
        editor.putString("email",e);editor.putString("pwd",p);
        editor.apply();
        Toast.makeText(this, "saved sucessfully", Toast.LENGTH_SHORT).show();
        email.setText("");
        password.setText("");
    }

    public void retrivedata(View view) {
        String e1=preferences.getString("email",null);
        String p1=preferences.getString("pwd",null);
        textView.setText("The Reult"+e1+"\n"+p1);
    }
}

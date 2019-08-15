package com.example.frwtest1;

public class Login {
    EditText username = (EditText) findViewById(R.id.editText1);
    EditText password = (EditText) findViewById(R.id.editText2);

    public void login(View view) {
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {

            //correcct password
        } else {
            //wrong password
        }
        int counter = 3;
        counter--;

        if(counter==0){
            //disble the button, close the application e.t.c
        }
    }
}
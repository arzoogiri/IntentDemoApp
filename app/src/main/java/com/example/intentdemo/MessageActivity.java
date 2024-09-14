package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MessageActivity extends AppCompatActivity {

    EditText etPassword;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        etPassword = findViewById(R.id.etPassword);
        btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = etPassword.getText().toString();

                if (password.equals("12345")) {
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("secretMessage", "This is the secret message!");
                    setResult(RESULT_OK, resultIntent); // Send the result back
                    finish(); // Close the activity
                } else {
                    Toast.makeText(MessageActivity.this, "Incorrect password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
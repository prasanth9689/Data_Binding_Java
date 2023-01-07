package com.skyblue.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.skyblue.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Initialize variable
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Assign variable
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get text from edit text
                String nameText = binding.etName.getText().toString().trim();

                // Check condition
                if (!nameText.equals("")){
                    // when text is not empty
                    // set text on text view
                    binding.tvOutput.setText(nameText);
                }else {
                    // When text is empty
                    // Display Toast
                    Toast.makeText(getApplicationContext()
                            ,"Please enter name",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
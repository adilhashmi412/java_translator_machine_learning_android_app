package com.example.imageclassification;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.nl.translate.TranslateLanguage;
import com.google.mlkit.nl.translate.Translation;
import com.google.mlkit.nl.translate.Translator;
import com.google.mlkit.nl.translate.TranslatorOptions;


public class MainActivity extends AppCompatActivity {

    EditText inputEd;
    TextView resultTv;
    Button translateBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputEd = findViewById(R.id.editTextTextPersonName);
        resultTv = findViewById(R.id.textView3);
        translateBtn = findViewById(R.id.button);
        translateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doTextTranslation(inputEd.getText().toString());
            }
        });

        // Create an English-urdu translator:

    }


    //TODO perform translation
    public void doTextTranslation(String text){

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

}

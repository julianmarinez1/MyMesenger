package co.edu.unipiloto.mymessenger02;

import
        androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE="message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);


        //recuperar el mensaje del intent

        Intent intent=getIntent();
        String messageText  =intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView=findViewById(R.id.mensaje);
        messageView.setText(messageText);




    }

    }


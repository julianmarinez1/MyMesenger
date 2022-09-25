package co.edu.unipiloto.mymessenger02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.ContentInfo;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.BreakIterator;

public class CreateMessageActivity extends AppCompatActivity {

    private BreakIterator messageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        //codigo que se ejecuta la iniciar la actividad
        //instacir un boton para relacionarlo con el elemento grafico
        EditText MessageView=(EditText) findViewById(R.id.message);
        String messageText=messageView.getText().toString();

        /*Button mi_boton= (Button) findViewById(R.id.Enviar);
        mi_boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CreateMessageActivity.this,ReceiveMessageActivity.class);
                intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText);
                startActivity(intent);
            }
        });*/
    }


    public void onSendMessage(View view) {
        EditText mensaje=(EditText)findViewById(R.id.message);
        String messageText=mensaje.getText().toString();
        Intent intent=new Intent(this,ReceiveMessageActivity.class);
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText);
        startActivity(intent);

    }
}
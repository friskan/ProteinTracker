package ukdw.com.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.test_untuk_update_view);
        Button mylay = findViewById(R.id.btn_layout);
        mylay.setOnClickListener(btnLayout);

        Button myBtn = (Button) findViewById(R.id.button1);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText myEditText = (EditText) findViewById(R.id.editText1);
                Log.d("Proteintracker", myEditText.getText().toString());
            }
        });

        Button myBtn1 = (Button) findViewById(R.id.button1);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText myEditText = (EditText) findViewById(R.id.editText1);
                Log.d("Proteintracker", myEditText.getText().toString());
            }
        });

        Button helpBtn = (Button)findViewById(R.id.helpButton);
        helpBtn.setOnClickListener(helpButtonListener);

        Button btnFragment = (Button)findViewById(R.id.btnFragment);


        if(savedInstanceState != null){
            Log.d("ProteinTracker",savedInstanceState.getString("abc")); }
    }
    private View.OnClickListener helpButtonListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,HelpActivity.class);
            Bundle b = new Bundle();

            EditText myEditText = (EditText)findViewById(R.id.editText1);

            b.putString("helpString",myEditText.getText().toString());
            intent.putExtras(b);

            startActivity(intent);
        }
    };


    private  View.OnClickListener btnLayout = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("abc","test");
        super.onSaveInstanceState(outState);
    }
}

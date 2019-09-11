package ukdw.com.proteintracker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class Main3FragmentActivity  extends AppCompatActivity
        implements ProteinFragment.SendMessage
    {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3fragment);

    Button btnPress = findViewById(R.id.buttonTesFragment);
    btnPress.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ProteinFragment proteinFragment = ProteinFragment.newInstance("Hai", "Para Progmobers");
            ft.replace(R.id.frameMain, proteinFragment);
            ft.commit();
        }
    });

}}

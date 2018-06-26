package rabbit.com.toolbarsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolBar = findViewById(R.id.toolbar);
        View view = getLayoutInflater().inflate(R.layout.item_toolbar_view,null);
        toolBar.addView(view);
        ImageView iv_home = view.findViewById(R.id.home);
        iv_home.setOnClickListener(this);
        setSupportActionBar(toolBar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            //logo click event
            case R.id.home:
                //when clicked do something here!
                Toast.makeText(this,"Home pressed!",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

package tartifouette.tb.chifoumi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity{

    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);

        GameStats.updateView(this);

        Button b = (Button) findViewById(R.id.buttonCut);
        b.setOnTouchListener(new CutListener(this));
        b.setOnClickListener(new CutListener(this));

        b = (Button) findViewById(R.id.buttonStone);
        b.setOnTouchListener(new StoneListener(this));
        b.setOnClickListener(new StoneListener(this));

        b = (Button) findViewById(R.id.buttonPaper);
        b.setOnTouchListener(new PaperListener(this));
        b.setOnClickListener(new PaperListener(this));

        b = (Button) findViewById(R.id.reset);
        b.setOnTouchListener(new ResetListener(this));
        b.setOnClickListener(new ResetListener(this));

    }

}

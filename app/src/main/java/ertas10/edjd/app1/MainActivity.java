package ertas10.edjd.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*final TextView textView = new TextView(this);
        textView.setText("Fuck off");
        textView.setVisibility(View.INVISIBLE);

        Button button = new Button(this);
        button.setText("Press to fuck off");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getVisibility() == View.INVISIBLE){
                    textView.setVisibility(View.VISIBLE);
                }
                else{
                    textView.setVisibility(View.INVISIBLE);
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.addView(textView);
        linearLayout.addView(button);

        setContentView(linearLayout);*/
        TextView textView = findViewById(R.id.text1);
        setContentView(R.layout.activity_main);
    }




}
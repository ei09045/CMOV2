package fe.up.stocks;



import java.util.ArrayList;
import java.util.Calendar;

import com.jjoe64.graphview.GraphView;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	public static ArrayList<stockGraph> sgraph = new ArrayList<stockGraph>();
	public static ArrayList<realtimeGraph> rgraph = new ArrayList<realtimeGraph>();
	public static ArrayList<GraphView> graphs = new ArrayList<GraphView>();
	public static User usr = new User();
	public static Calendar beginDate=Calendar.getInstance();
	public static Calendar endDate=Calendar.getInstance();
	public static boolean inPortfolio=false, inProfile=false, monthPeriodGraph=true, betterCharts=false, otherPeriod=false;
	public static int portIndex=0, stockIndex=0;
	private Button login;
	private Button register;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
		
		Typeface blockFonts = Typeface.createFromAsset(getAssets(),"fonts/Ubuntu.ttf");
		Typeface blockFonts2 = Typeface.createFromAsset(getAssets(),"fonts/Ubuntu-M.ttf");
		TextView txtSampleTxt = (TextView) findViewById(R.id.textView1);
		Button txtSampleTxt1 = (Button) findViewById(R.id.button1);
		Button txtSampleTxt2 = (Button) findViewById(R.id.button2);
		txtSampleTxt.setTypeface(blockFonts);
		txtSampleTxt1.setTypeface(blockFonts2);
		txtSampleTxt2.setTypeface(blockFonts2);
		
        addListenerOnButton1();
		addListenerOnButton2();
	}
	
	
	
	@Override
	public void onAttachedToWindow() {
	    super.onAttachedToWindow();
	    Window window = getWindow();
	    window.setFormat(PixelFormat.RGBA_8888);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void addListenerOnButton1() {
		 
		final Context context = this;
 
		login = (Button) findViewById(R.id.button1);
 
		login.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, Login.class);
                startActivity(intent);   
                overridePendingTransition  (R.anim.right_slide_in, R.anim.right_slide_out);
 
			}
 
		});
 
	}
	
	public void addListenerOnButton2() {
		 
		final Context context = this;
 
		register = (Button) findViewById(R.id.button2);
 
		register.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, Register.class);
                startActivity(intent);
                overridePendingTransition  (R.anim.left_slide_in, R.anim.left_slide_out);
 
			}
 
		});
 
	}
	
	/*@Override
	public void onBackPressed() 
	{

	    this.finish();
	    overridePendingTransition  (R.anim.right_slide_in, R.anim.right_slide_out);
	    return;
	}*/

}

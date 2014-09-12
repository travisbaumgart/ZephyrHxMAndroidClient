package travisbaumgart.zephyrhxmandroidclient;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.caverock.androidsvg.SVGImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		View view = findViewById(R.id.center);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}

		super.onCreate(savedInstanceState);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onWindowFocusChanged(boolean focus) {
		super.onWindowFocusChanged(focus);
		// get the imageviews width and height here

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
		
			
			
			RelativeLayout leftLayout = (RelativeLayout) rootView
					.findViewById(R.id.left);
			
	        SVGImageView leftSvgImageView = new SVGImageView(rootView.getContext());
	        leftSvgImageView.setImageAsset("red1.svg");
	        leftLayout.addView(leftSvgImageView,
	                       new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
	        
	        RelativeLayout centerLayout = (RelativeLayout) rootView
					.findViewById(R.id.center);
			
	        SVGImageView centerSvgImageView = new SVGImageView(rootView.getContext());
	        centerSvgImageView.setImageAsset("red4.svg");
	        centerLayout.addView(centerSvgImageView,
	                       new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
	        
	        RelativeLayout rightLayout = (RelativeLayout) rootView
					.findViewById(R.id.right);
	        
	        SVGImageView rightSvgImageView = new SVGImageView(rootView.getContext());
	        rightSvgImageView.setImageAsset("red5.svg");
	        rightLayout.addView(rightSvgImageView,
	                       new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
	       

			return rootView;
		}
	}

}

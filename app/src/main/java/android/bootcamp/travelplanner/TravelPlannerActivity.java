package android.bootcamp.travelplanner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class TravelPlannerActivity extends Activity {
    static final int Travel_Request = 1;  // The request code
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_travel_planner);
  }

  public void calculate(View view) {
    int distance = Integer.parseInt(((EditText) findViewById(R.id.distance)).getText().toString());
    int time = Integer.parseInt(((EditText) findViewById(R.id.time)).getText().toString());
    Intent intent = new Intent(this,TimeActivity.class);
    intent.putExtra("result",distance/time +"");
    //startActivityForResult(pickContactIntent, Travel_Request)
    startActivity(intent);

  }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == PICK_CONTACT_REQUEST) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                // The user picked a contact.
                // The Intent's data Uri identifies which contact was selected.

                // Do something with the contact here (bigger example below)
            }
        }
    }
}

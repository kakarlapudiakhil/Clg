package e.p.clg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.support.v7.widget.CardView;

public class Home extends AppCompatActivity implements View.OnClickListener {

    // Defining all variable here which are going  to be used..
     private CardView student,faculty,buses,elibrary,notifications;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /* Getting all the actvities mentioned in that home activity by using there ID's...
           And storing them in the variables which are defined above...
           Note: TYPE CASTING dhould be done compulsory                               */

        student = (CardView)findViewById(R.id.student);
        faculty = (CardView)findViewById(R.id.faculty);
        buses = (CardView)findViewById(R.id.buses);
        elibrary = (CardView)findViewById(R.id.elibrary);
        notifications = (CardView)findViewById(R.id.notifications);

        //adding event listeners..
        student.setOnClickListener(this);
        faculty.setOnClickListener(this);
        buses.setOnClickListener(this);
        elibrary.setOnClickListener(this);
        notifications.setOnClickListener(this);

    }

    // These method is implemented by the View.OnEventListiner CLASS...
    @Override
    public void onClick(View v) {
        Intent intent;                                                  // Intent is class which is used to go to the next activity
        switch (v.getId()) {
            case R.id.student:
                intent = new Intent(this, student.class);  // In the parameter it  says from where to where the activity should go
                startActivity(intent);                                    // startActivity() simply starts the another activity by passing the Intent class created variable..
                break;
            case R.id.faculty:
                intent = new Intent(this, faculty.class);
                startActivity(intent);
                break;
            case R.id.buses:
                intent = new Intent(this, buses.class);
                startActivity(intent);
                break;
            case R.id.elibrary:
                intent = new Intent(this, elibrary.class);
                startActivity(intent);
                break;
            case R.id.notifications:
                intent = new Intent(this, notifications.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}

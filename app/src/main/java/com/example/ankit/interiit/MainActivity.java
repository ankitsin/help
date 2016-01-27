package com.example.ankit.interiit;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.telephony.SmsManager;
import android.widget.TextView;
import android.widget.Toast;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    //    String phoneNumber;
//    ListView lv;
//    ArrayList<String> aa= new ArrayList<String>();
    Button help;
    Button contacts;
    String url;
    String lattitude;
    String longitude;
    String user;
    String[] nearby;
    String first;
//    String lastlattitude;
//    String lastlongitude;
    TextView text;
//    public static final String PREFS_NAME = "MyPrefsFile1";

    //    private LocationControl locationControlTask;
//    private boolean hasLocation = false;
//    LocationHelper locHelper;
    Double currentLocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences settings = getSharedPreferences(Login.PREFS_NAME, 0);
//Get "hasLoggedIn" value. If the value doesn't exist yet false is returned
//        boolean hasLoggedIn = settings.getBoolean("hasLoggedIn", false);
//        SharedPreferences settings = getSharedPreferences(Login.PREFS_NAME, 0);
//Get "hasLoggedIn" value. If the value doesn't exist yet false is returned
//        first= settings.getString("first", null);
//        if(first=="Yes")
//        {
//            final ProgressDialog dialog = new ProgressDialog(MainActivity.this);
//        dialog.setTitle("Loading...");
//        dialog.setMessage("Please wait.");
//        dialog.setIndeterminate(true);
//        dialog.setCancelable(false);
//        dialog.show();
//
//        long delayInMillis = 20000;
//        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                dialog.dismiss();
//            }
//            }, delayInMillis);
//        }
//        SharedPreferences.Editor editor = settings.edit();
//        editor.remove("first");
//        editor.putString("first", "No");
//        editor.commit();
        MyLocation.LocationResult locationResult = new MyLocation.LocationResult(){
            @Override
            public void gotLocation(Location location){
                lattitude=Double.toString(location.getLatitude());
                longitude=Double.toString(location.getLongitude());

                //Got the location!
            }
        };
        MyLocation myLocation = new MyLocation();
        myLocation.getLocation(this, locationResult);
//        myLocation.
        System.out.println("yeah________________________________________________");
        System.out.println(lattitude);
//        System.out.println();
//        new LocationControl().execute(this);
//        GPSTracker gps = new GPSTracker(this);
//        double latitude = gps.getLatitude();
//        double longitude = gps.getLongitude();
//        Location currentLocation;
//        System.out.println(currentLocation.getLatitude());
//        LocationListener locListener = new MyLocationListener();
//        LocationManager locManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
//        locManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locListener);
//        final ProgressDialog mDialog = new ProgressDialog(MainActivity.this);
//        final ProgressDialog dialog = new ProgressDialog(MainActivity.this);
//        dialog.setTitle("Loading...");
//        dialog.setMessage("Please wait.");
//        dialog.setIndeterminate(true);
//        dialog.setCancelable(false);
//        dialog.show();
//
//        long delayInMillis = 20000;
//        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                dialog.dismiss();
//            }
//        }, delayInMillis);
////        sleep(2000)
//        text=(TextView)findViewById(R.id.texttest);
//        text.setText(Double.toString(latitude));
//        Double ye=location.getLatitude();
        System.out.println("yesh");
//        System.out.println(latitude);
    }




//    public class MyLocationListener implements LocationListener {
//        @Override
//        public void onLocationChanged(Location location) {
//// Retrieving Latitude
//            location.getLatitude();
//// Retrieving getLongitude
//            location.getLongitude();
////            EditText textInfo;
////            textInfo.setText("");
//            String text = "My Current Location is:\nLatitude = "
//                    + location.getLatitude() + "\nLongitude = "
//                    + location.getLongitude();
////            textInfo.setText(text);
////            Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
//// set Google Map on webview
//            url = "http://maps.google.com?q="
//                    + location.getLatitude() + "," + location.getLongitude();
////            position.loadUrl(url);
//            System.out.println(url);
//        }
//
//        @Override
//        public void onProviderDisabled(String provider) {
//            Toast.makeText(getApplicationContext(), "GPS Disabled",
//                    Toast.LENGTH_SHORT).show();
//        }
//
//        @Override
//        public void onProviderEnabled(String provider) {
//            Toast.makeText(getApplicationContext(), "GPS Enabled",
//                    Toast.LENGTH_SHORT).show();
//        }
//
//        @Override
//        public void onStatusChanged(String provider, int status, Bundle extras) {
//        }
//    }
//
//



    public void buttonOnClick(View v) {
        contacts = (Button) findViewById(R.id.button_contacts);
        startActivity(new Intent(getApplicationContext(), Activity2.class));
        finish();
    }



    public void buttonOnClickhelp(View v) {
//        contacts = (Button) findViewById(R.id.button_help);
//        startActivity(new Intent(getApplicationContext(), Activity2.class));
//        final ProgressDialog dialog = new ProgressDialog(MainActivity.this);
//        dialog.setTitle("Loading...");
//        dialog.setMessage("Please wait.");
//        dialog.setIndeterminate(true);
//        dialog.setCancelable(false);
//        dialog.show();
//
//        long delayInMillis = 20000;
//        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                dialog.dismiss();
//            }
//        }, delayInMillis);
                        Toast.makeText(getApplicationContext(), "Help is on the Way", Toast.LENGTH_LONG).show();

        Handler myHandler = new Handler();
        myHandler.postDelayed(mMyRunnable, 15000);
//        sendSMSMessage();
//        sendBtn.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//
//            }
//        });

    }

    public void buttonOnClickLogout(View v) {
        SharedPreferences preferences = getSharedPreferences("MyPrefsFile", 0);
        preferences.edit().clear().commit();
        File dir = getFilesDir();
        File file = new File(dir, "mydata");
        boolean deleted = file.delete();
        startActivity(new Intent(getApplicationContext(), Login.class));

//        contacts = (Button) findViewById(R.id.button_help);
//        startActivity(new Intent(getApplicationContext(), Activity2.class));
//        sendSMSMessage();
//        sendBtn.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//
//            }
//        });

    }

    private Runnable mMyRunnable = new Runnable()
    {
        @Override
        public void run()
        {
            sendSMSMessage();        }
    };


    protected void sendSMSMessage() {
//        Log.i("Send SMS", "");

        String file = "mydata";
        String temp = "";
        try {
            FileInputStream fin = openFileInput(file);
            int c;


            while ((c = fin.read()) != -1) {

                temp = temp + Character.toString((char) c);
            }
            System.out.println(temp);
//            Toast.makeText(getBaseContext(),"file read", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
        }
        if(temp!="") {

            String[] con_num = temp.split("#");
//        temp;
            ArrayList<String> finalcontact = new ArrayList<String>();
            ArrayList<String> finalnumber = new ArrayList<String>();


        for (int i = 0; i < con_num.length; i++) {
            String[] temp1 = con_num[i].split("_");
            finalcontact.add(temp1[0].toString());
            finalnumber.add(temp1[1].toString());
            String phoneNo = temp1[1].toString();

            String message = "Msg Testing ("+user+").    http://maps.google.com/?q="+ lattitude + "," + longitude;
            System.out.println(message);
            try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNo, null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
        }
        catch (Exception e) {
            Toast.makeText(getApplicationContext(), "SMS faild, please try again.", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
        }

        }
        SharedPreferences settings = getSharedPreferences(Login.PREFS_NAME, 0);
//Get "hasLoggedIn" value. If the value doesn't exist yet false is returned
        user= settings.getString("user", null);

        System.out.println(lattitude);
        System.out.println(longitude);
        System.out.println(user);
        new LongOperation1().execute(user + "_" + lattitude + "_" + longitude + "_0");
//        String[] near=nearby.toString().split("_");
//        System.out.println(nearby);
//        if(near.length>1) {
//        for (int i = 0; i < near.length-1; i++) {
////            String[] temp1 = con_num[i].split("_");
////            finalcontact.add(temp1[0].toString());
////            finalnumber.add(temp1[1].toString());
//            String phoneNo = near[i].toString();
//
//            String message = "Yo Bitchesss!!    http://maps.google.com/?q="
//                    + lattitude + "," + longitude;
//            System.out.println(message);
//            try {
//                SmsManager smsManager = SmsManager.getDefault();
//                smsManager.sendTextMessage(phoneNo, null, message, null, null);
//                Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
//            }
//            catch (Exception e) {
//                Toast.makeText(getApplicationContext(), "SMS faild, please try again.", Toast.LENGTH_LONG).show();
//                e.printStackTrace();
//            }
//
//        }
//        }
//        Location location = new Location();
//        location.setLatitude(latitude);
//        location.setLongitude(longitude);
//
//        Location locationFromDB = new Location();
//        locationFromDB.setLatitude(latitudeFromDB);
//        locationFromDB.setLongitude(longitudeFromDB);
//
//        float dist = location.distanceTo(locationFromDB);
//        if(dist<100f){
//            //do here your magic
//        }


//        System.out.println(finalcontact);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Really Exit?")
                .setMessage("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {

//                        System.out.println(lattitude);
//                        System.out.println(longitude);
                        SharedPreferences settings = getSharedPreferences(Login.PREFS_NAME, 0);
//Get "hasLoggedIn" value. If the value doesn't exist yet false is returned
                        user= settings.getString("user", null);
                        System.out.println();
                        new LongOperation1().execute(user + "_" + lattitude + "_" + longitude + "_1");

                    }
                }).create().show();
    }
    private class LongOperation1 extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            try{
                System.out.println(params[0]);
//
                String name    = URLEncoder.encode(params[0], "UTF-8");

                HttpClient Client = new DefaultHttpClient();

                String URL = "http://192.168.0.106/location.php?location="+name;
                System.out.println(URL);
                HttpGet httpget = new HttpGet(URL);

                String SetServerString = "";
                try
                {

                    ResponseHandler<String> responseHandler = new BasicResponseHandler();
                    SetServerString = Client.execute(httpget, responseHandler);
                    return  SetServerString;

                }
                catch(Exception ex)
                {
                    System.out.println(ex.toString());
                    return "Fail!";
                }

            }
            catch(UnsupportedEncodingException ex)
            {
                return "Fail2";
            }
        }

        @Override
        protected void onPostExecute(String result) {
            if(result.equals("Inserted"))
            {

                System.out.println("Inserted");

                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
            else if (result.equals("Altered"))
            {
                System.out.println("Altered");

                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
//                Toast.makeText(getApplicationContext(), "Account Exist", Toast.LENGTH_LONG).show();


            }
            else if (result.equals("Notinserted"))
            {
//                Toast.makeText(getApplicationContext(), "Account Exist", Toast.LENGTH_LONG).show();
                System.out.println("Notinserted");
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
            else if (result.equals("Notaltered"))
            {
//                Toast.makeText(getApplicationContext(), "Account Exist", Toast.LENGTH_LONG).show();
                System.out.println("Notaltered");
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
            else
            {
                nearby=result.toString().split("_");

                System.out.println("Yooooo");
                if(nearby.length>1)
                {

                    System.out.println(nearby[1]);
                for (int i = 1; i < nearby.length; i++) {
//            String[] temp1 = con_num[i].split("_");
//            finalcontact.add(temp1[0].toString());
//            finalnumber.add(temp1[1].toString());
            String phoneNo = nearby[i].toString();

            String message = "Msg Testing ("+user+").       http://maps.google.com/?q="+ lattitude + "," + longitude;
            System.out.println(message);
            try {
                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(phoneNo, null, message, null, null);
                Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
            }
            catch (Exception e) {
                Toast.makeText(getApplicationContext(), "SMS faild, please try again.", Toast.LENGTH_LONG).show();
                e.printStackTrace();
            }
                }
        }

            }
        }
//            textView1.setText(result);


    }
}

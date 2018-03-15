package com.example.thong.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import android.widget.EditText;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private Button b;
    private TextView t;
    private RequestQueue requestQueue;
    private EditText txt1, txt2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button) findViewById(R.id.button);
        t= (TextView) findViewById(R.id.textView);
        txt1=(EditText) findViewById(R.id.lat);
        txt2=(EditText) findViewById(R.id.lon);



        requestQueue = Volley.newRequestQueue(this);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String vd=txt1.getText().toString();
                String kd=txt2.getText().toString();
                JsonObjectRequest request = new JsonObjectRequest("https://maps.googleapis.com/maps/api/geocode/json?latlng="+vd+","+kd+"&key=AIzaSyB_gNQq9EpceE_Z0KNT323n59cyjRzYtms",null,
                        new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            String address = response.getJSONArray("results").getJSONObject(0).getString("formatted_address");
                            t.setText(address);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener(){
                    @Override
                    public  void onErrorResponse (VolleyError error){

                    }
                });
                requestQueue.add(request);
            }
        });

    }
}

package com.juniorboom.maps;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, aaaa {


    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */



    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

       /* LatLng oN00 = new LatLng(googleMap.getLatitude(), googleMap.getMapType());
        mMap.addMarker(new MarkerOptions().position(oN00).title("ตึก15"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(oN00));*/


        // Add a marker in Sydney and move the camera
        LatLng oN15 = new LatLng(16.450345, 103.528438);
        mMap.addMarker(new MarkerOptions().position(oN15).title("ตึก15"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(oN15));













        LatLng oN12 = new LatLng(16.449770, 103.529213);
        mMap.addMarker(new MarkerOptions().position(oN12).title("ตึก12"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(oN12, 18.0f));
        mMap.getUiSettings().setZoomControlsEnabled(true);

        PolygonOptions mm = new PolygonOptions()
                .add(new LatLng(16.453579, 103.533584))
                .add(new LatLng(16.452415, 103.534744))
                .add(new LatLng(16.452490, 103.535545))
                .add(new LatLng(16.450664, 103.536142))
                .add(new LatLng(16.446755, 103.536334))
                .add(new LatLng(16.445915, 103.536755))
                .add(new LatLng(16.444616, 103.532653))
                .add(new LatLng(16.446234, 103.531699))
                .add(new LatLng(16.446625, 103.529124))
                .add(new LatLng(16.447494, 103.527820))
                .add(new LatLng(16.449125, 103.528973))
                .add(new LatLng(16.450252, 103.527530))
                .add(new LatLng(16.452114, 103.529263))

                .strokeWidth(12)
                .strokeColor(Color.BLUE)
                .clickable(true);
        mMap.addPolygon(mm);


        PolygonOptions fifteen = new PolygonOptions()
                .add(new LatLng(16.450207, 103.528845))
                .add(new LatLng(16.449993, 103.528647))
                .add(new LatLng(16.450282, 103.528266))
                .add(new LatLng(16.450318, 103.528290))
                .add(new LatLng( 16.450351, 103.528245))
                .add(new LatLng( 16.450406, 103.528264))
                .add(new LatLng( 16.450439, 103.528228))
                .add(new LatLng( 16.450522, 103.528261))
                .add(new LatLng( 16.450583, 103.528344))
                .add(new LatLng( 16.450541, 103.528392))
                .add(new LatLng( 16.450560, 103.528431))
                .fillColor(Color.YELLOW)
                .strokeWidth(11)
                .strokeColor(Color.RED)
                .clickable(true);
        mMap.addPolygon(fifteen);

        PolygonOptions eight = new PolygonOptions()
                .add(new LatLng(16.449820, 103.528867))
                .add(new LatLng(16.449530, 103.529245))
                .add(new LatLng(16.449777, 103.529466))
                .add(new LatLng(16.450073, 103.529101))
                .add(new LatLng(16.449980, 103.529015))
                .add(new LatLng(16.449875, 103.529146))
                .add(new LatLng(16.449826, 103.529098))
                .add(new LatLng(16.449919, 103.528956))
                .fillColor(Color.YELLOW)
                .strokeWidth(8)
                .strokeColor(Color.RED)
                .clickable(true);
        mMap.addPolygon(eight);

        PolygonOptions oo = new PolygonOptions()
                .add(new LatLng(16.450111, 103.527945))
                .add(new LatLng(16.450272, 103.528085))
                .add(new LatLng(16.449950, 103.528440))
                .add(new LatLng(16.449795, 103.528287))
                .fillColor(Color.YELLOW)
                .strokeWidth(4)
                .strokeColor(Color.RED)
                .clickable(true);
        mMap.addPolygon(oo);


        PolygonOptions oon = new PolygonOptions()
                .add(new LatLng(16.449887, 103.528505))
                .add(new LatLng(16.449571, 103.528856))
                .add(new LatLng(16.449418, 103.528703))
                .add(new LatLng(16.449742, 103.528354))
                .fillColor(Color.YELLOW)
                .strokeWidth(4)
                .strokeColor(Color.RED)
                .clickable(true);
        mMap.addPolygon(oon);


        PolygonOptions meetingroom = new PolygonOptions()
                .add(new LatLng(16.449387, 103.529837))
                .add(new LatLng(16.449195, 103.530074))
                .add(new LatLng(16.449150, 103.530043))
                .add(new LatLng(16.449122, 103.530086))
                .add(new LatLng(16.448975, 103.529942))
                .add(new LatLng(16.449210, 103.529632))
                .add(new LatLng(16.449383, 103.529768))
                .add(new LatLng(16.449343, 103.529805))
                .fillColor(Color.YELLOW)
                .strokeWidth(8)
                .strokeColor(Color.RED)
                .clickable(true);
        mMap.addPolygon(meetingroom);

        PolygonOptions StudentDevelopment = new PolygonOptions()
                .add(new LatLng(16.449965, 103.530247))
                .add(new LatLng(16.450066, 103.530344))
                .add(new LatLng(16.449765, 103.530699))
                .add(new LatLng(16.449667, 103.530608))

                .fillColor(Color.YELLOW)
                .strokeWidth(4)
                .strokeColor(Color.RED)
                .clickable(true);
        mMap.addPolygon(StudentDevelopment);


        PolygonOptions finance = new PolygonOptions()
                .add(new LatLng(16.449222, 103.530389))
                .add(new LatLng(16.449909, 103.531004))
                .add(new LatLng(16.449825, 103.531129))
                .add(new LatLng(16.449130, 103.530507))

                .fillColor(Color.YELLOW)
                .strokeWidth(4)
                .strokeColor(Color.RED)
                .clickable(true);
        mMap.addPolygon(finance);



    }


}

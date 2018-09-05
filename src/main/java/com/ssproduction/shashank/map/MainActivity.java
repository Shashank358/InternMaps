package com.ssproduction.shashank.map;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.annotations.Icon;
import com.mapbox.mapboxsdk.annotations.IconFactory;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import com.mapbox.mapboxsdk.constants.Style;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.style.layers.CircleLayer;
import com.mapbox.mapboxsdk.style.layers.SymbolLayer;
import com.mapbox.mapboxsdk.style.sources.GeoJsonOptions;
import com.mapbox.mapboxsdk.style.sources.GeoJsonSource;

import java.net.MalformedURLException;
import java.net.URL;

import static com.mapbox.mapboxsdk.style.layers.PropertyFactory.circleColor;
import static com.mapbox.mapboxsdk.style.layers.PropertyFactory.circleRadius;
import static com.mapbox.mapboxsdk.style.layers.PropertyFactory.iconImage;
import static com.mapbox.mapboxsdk.style.layers.PropertyFactory.textColor;
import static com.mapbox.mapboxsdk.style.layers.PropertyFactory.textField;
import static com.mapbox.mapboxsdk.style.layers.PropertyFactory.textSize;
import static java.nio.file.Paths.get;

public class MainActivity extends AppCompatActivity {

    private MapView mapView;

    @Override
    protected void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Mapbox.getInstance(this, "pk.eyJ1Ijoic2hhc2hhbmszNTgiLCJhIjoiY2psb3N3MXZyMXJrMjNxcjAzOWVnNjlkcyJ9.231bXZsNC6c2a0F3L4-sZw");
        setContentView(R.layout.activity_main);
        mapView = (MapView) findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.setStyleUrl(Style.MAPBOX_STREETS);
        mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {
                MarkerOptions options1 = new MarkerOptions();
                options1.title("location 1");
                IconFactory iconFactory1 = IconFactory.getInstance(MainActivity.this);
                Icon icon1 = iconFactory1.fromResource(R.drawable.m1);
                options1.icon(icon1);
                options1.position(new LatLng(21.1000, 78.5000));
                mapboxMap.addMarker(options1);

                MarkerOptions options2 = new MarkerOptions();
                options2.title("location 2");
                IconFactory iconFactory2 = IconFactory.getInstance(MainActivity.this);
                Icon icon2 = iconFactory2.fromResource(R.drawable.m2);
                options2.icon(icon2);
                options2.position(new LatLng(21.2000, 78.5400));
                mapboxMap.addMarker(options2);

                MarkerOptions options3 = new MarkerOptions();
                options3.title("location 3");
                IconFactory iconFactory3 = IconFactory.getInstance(MainActivity.this);
                Icon icon3 = iconFactory3.fromResource(R.drawable.m3);
                options3.icon(icon3);
                options3.position(new LatLng(21.2500, 78.5800));
                mapboxMap.addMarker(options3);

                MarkerOptions options4 = new MarkerOptions();
                options4.title("location 4");
                IconFactory iconFactory4 = IconFactory.getInstance(MainActivity.this);
                Icon icon4 = iconFactory4.fromResource(R.drawable.m4);
                options4.icon(icon4);
                options4.position(new LatLng(21.1400, 78.5400));
                mapboxMap.addMarker(options4);

                MarkerOptions options5 = new MarkerOptions();
                options5.title("location 5");
                IconFactory iconFactory5 = IconFactory.getInstance(MainActivity.this);
                Icon icon5 = iconFactory5.fromResource(R.drawable.m1);
                options5.icon(icon5);
                options5.position(new LatLng(21.1400, 78.5800));
                mapboxMap.addMarker(options5);

                MarkerOptions options6 = new MarkerOptions();
                options6.title("location 6");
                IconFactory iconFactory6 = IconFactory.getInstance(MainActivity.this);
                Icon icon6 = iconFactory6.fromResource(R.drawable.m2);
                options6.icon(icon6);
                options6.position(new LatLng(21.1400, 78.5000));
                mapboxMap.addMarker(options6);

                MarkerOptions options7 = new MarkerOptions();
                options7.title("location 7");
                IconFactory iconFactory7 = IconFactory.getInstance(MainActivity.this);
                Icon icon7 = iconFactory7.fromResource(R.drawable.m3);
                options7.icon(icon7);
                options7.position(new LatLng(21.1400, 78.5120));
                mapboxMap.addMarker(options7);

                MarkerOptions options8 = new MarkerOptions();
                options8.title("location 8");
                IconFactory iconFactory8 = IconFactory.getInstance(MainActivity.this);
                Icon icon8 = iconFactory8.fromResource(R.drawable.m4);
                options8.icon(icon8);
                options8.position(new LatLng(21.1500, 78.6000));
                mapboxMap.addMarker(options8);

                MarkerOptions options9 = new MarkerOptions();
                options9.title("location 9");
                IconFactory iconFactory9 = IconFactory.getInstance(MainActivity.this);
                Icon icon9 = iconFactory9.fromResource(R.drawable.m1);
                options9.icon(icon9);
                options9.position(new LatLng(21.2000, 78.7000));
                mapboxMap.addMarker(options9);

                MarkerOptions options10 = new MarkerOptions();
                options10.title("location 10");
                IconFactory iconFactory10 = IconFactory.getInstance(MainActivity.this);
                Icon icon10 = iconFactory10.fromResource(R.drawable.m2);
                options10.icon(icon10);
                options10.position(new LatLng(21.2500, 78.6050));
                mapboxMap.addMarker(options10);





            }
        });
    }


}

package github.com.anurag145.birthdayapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
       final VideoView vview=(VideoView)findViewById(R.id.videoView);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.a;
        vview.setVideoURI(Uri.parse(path));
        vview.start();
        Toast.makeText(getApplicationContext(),String.valueOf(vview.isActivated()),Toast.LENGTH_LONG).show();
        vview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(vview.isPlaying())
                {
                    Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();
                    vview.pause();
                }else
                    vview.start();
            }
        });
    }
}

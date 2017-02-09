package me.stark.tony.loadview;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //定义旋转动画Dialog
    private ProgressAlertDialog progress;
    //定义帧动画dialot
    private ProgressDialog mDialog;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler = new Handler();

        progress = new ProgressAlertDialog(this);
        //开始选择的过场动画
        findViewById(R.id.start_rotate_progress).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //让进度条显示出来
                progress.show();
                //10秒钟后停止动画
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progress.dismiss();
                    }
                }, 10000);
            }
        });


        mDialog = new ProgressDialog(MainActivity.this);
        //开始选择的过场动画
        findViewById(R.id.start_drawable_anim_progress).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //让进度条显示出来
                mDialog.show();

                //10秒钟后停止动画
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mDialog.dismiss();
                    }
                }, 10000);
            }
        });
    }
}

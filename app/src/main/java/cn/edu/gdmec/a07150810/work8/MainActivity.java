package cn.edu.gdmec.a07150810.work8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void b1(View v){
        Toast.makeText(this,"知道了",Toast.LENGTH_LONG).show();
    }
    public void b2(View v){
        LayoutInflater lf=getLayoutInflater();
        View vroot=lf.inflate(R.layout.toastinfo,null);
        LinearLayout ll=(LinearLayout)vroot.findViewById(R.id.clayout);
        lf.inflate(R.layout.toastroot,ll);
        Toast toast=new Toast(this);
        toast.setView(vroot);
        toast.show();
    }
    public void b3(View v){
        Toast toast=Toast.makeText(this,"白",Toast.LENGTH_LONG);
        LinearLayout ll=new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ImageView mImage=new ImageView(this);
        mImage.setImageResource(R.drawable.qq);
        View toastView=toast.getView();
        ll.addView(mImage);
        ll.addView(toastView);
        toast.setView(ll);
        toast.show();
    }
}

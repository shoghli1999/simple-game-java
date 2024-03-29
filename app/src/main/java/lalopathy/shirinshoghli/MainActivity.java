package lalopathy.shirinshoghli;

import android.content.DialogInterface;
import android.os.SystemClock;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

import java.util.ArrayList;
import java.util.Random;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ArrayList array1= new ArrayList();
    ArrayList array2= new ArrayList();
    Random rand=new Random();
    int j=25,u=25,m=1,b=1,id,index,color=255;
    String str;
    Chronometer crn;
    Button btn_1,
    btn_2,
    btn_3,
    btn_4,
    btn_5,
    btn_6,
    btn_7,
    btn_8,
    btn_9,
    btn_10,
    btn_11,
    btn_12,
    btn_13,
    btn_14,
    btn_15,
    btn_16,
    btn_17,
    btn_18,
    btn_19,
    btn_20,
    btn_21,
    btn_22,
    btn_23,
    btn_24,
    btn_25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findviews();
        setArray();
        setname();

        //chetori bazi konam?
        AlertDialog.Builder message = new AlertDialog.Builder(this);
        message.setTitle("چطوری بازی کنم؟")
                .setMessage("این بازی به شما میگه چقدر باهوشی! فقط کافیه روی اعداد 1 تا 50 برنی اونم تو کمترین زمان ممکن!")
                .setPositiveButton("بزن بریم!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
        message.show();


    }

    public void naming(Button btn){
        index=rand.nextInt(j);
        btn.setText(""+array1.get(index));
        array1.remove(index);
        j--;
    }

    public void setname(){
        naming(btn_1);
        naming(btn_2);
        naming(btn_3);
        naming(btn_4);
        naming(btn_5);
        naming(btn_6);
        naming(btn_7);
        naming(btn_8);
        naming(btn_9);
        naming(btn_10);
        naming(btn_11);
        naming(btn_12);
        naming(btn_13);
        naming(btn_14);
        naming(btn_15);
        naming(btn_16);
        naming(btn_17);
        naming(btn_18);
        naming(btn_19);
        naming(btn_20);
        naming(btn_21);
        naming(btn_22);
        naming(btn_23);
        naming(btn_24);
        naming(btn_25);
    }

    public void run(View v){
            str = "" + m;
            if (b == 1) {
                id = v.getId();
                if (id == R.id.button1 && str.equals(btn_1.getText()))
                    secondClick(btn_1);
                else if (id == R.id.button2 && str.equals(btn_2.getText()))
                    secondClick(btn_2);
                else if (id == R.id.button3 && str.equals(btn_3.getText()))
                    secondClick(btn_3);
                else if (id == R.id.button4 && str.equals(btn_4.getText()))
                    secondClick(btn_4);
                else if (id == R.id.button5 && str.equals(btn_5.getText()))
                    secondClick(btn_5);
                else if (id == R.id.button6 && str.equals(btn_6.getText()))
                    secondClick(btn_6);
                else if (id == R.id.button7 && str.equals(btn_7.getText()))
                    secondClick(btn_7);
                else if (id == R.id.button8 && str.equals(btn_8.getText()))
                    secondClick(btn_8);
                else if (id == R.id.button9 && str.equals(btn_9.getText()))
                    secondClick(btn_9);
                else if (id == R.id.button10 && str.equals(btn_10.getText()))
                    secondClick(btn_10);
                else if (id == R.id.button11 && str.equals(btn_11.getText()))
                    secondClick(btn_11);
                else if (id == R.id.button12 && str.equals(btn_12.getText()))
                    secondClick(btn_12);
                else if (id == R.id.button13 && str.equals(btn_13.getText()))
                    secondClick(btn_13);
                else if (id == R.id.button14 && str.equals(btn_14.getText()))
                    secondClick(btn_14);
                else if (id == R.id.button15 && str.equals(btn_15.getText()))
                    secondClick(btn_15);
                else if (id == R.id.button16 && str.equals(btn_16.getText()))
                    secondClick(btn_16);
                else if (id == R.id.button17 && str.equals(btn_17.getText()))
                    secondClick(btn_17);
                else if (id == R.id.button18 && str.equals(btn_18.getText()))
                    secondClick(btn_18);
                else if (id == R.id.button19 && str.equals(btn_19.getText()))
                    secondClick(btn_19);
                else if (id == R.id.button20 && str.equals(btn_20.getText()))
                    secondClick(btn_20);
                else if (id == R.id.button21 && str.equals(btn_21.getText()))
                    secondClick(btn_21);
                else if (id == R.id.button22 && str.equals(btn_22.getText()))
                    secondClick(btn_22);
                else if (id == R.id.button23 && str.equals(btn_23.getText()))
                    secondClick(btn_23);
                else if (id == R.id.button24 && str.equals(btn_24.getText()))
                    secondClick(btn_24);
                else if (id == R.id.button25 && str.equals(btn_25.getText()))
                    secondClick(btn_25);
            } else if (b == 2) {
                id = v.getId();
                if (id == R.id.button1 && str.equals(btn_1.getText())) {
                    btn_1.setText("");
                    btn_1.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button2 && str.equals(btn_2.getText())) {
                    btn_2.setText("");
                    btn_2.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button3 && str.equals(btn_3.getText())) {
                    btn_3.setText("");
                    btn_3.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button4 && str.equals(btn_4.getText())) {
                    btn_4.setText("");
                    btn_4.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button5 && str.equals(btn_5.getText())) {
                    btn_5.setText("");
                    btn_5.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button6 && str.equals(btn_6.getText())) {
                    btn_6.setText("");
                    btn_6.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button7 && str.equals(btn_7.getText())) {
                    btn_7.setText("");
                    btn_7.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button8 && str.equals(btn_8.getText())) {
                    btn_8.setText("");
                    btn_8.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button9 && str.equals(btn_9.getText())) {
                    btn_9.setText("");
                    btn_9.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button10 && str.equals(btn_10.getText())) {
                    btn_10.setText("");
                    btn_10.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button11 && str.equals(btn_11.getText())) {
                    btn_11.setText("");
                    btn_11.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button12 && str.equals(btn_12.getText())) {
                    btn_12.setText("");
                    btn_12.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button13 && str.equals(btn_13.getText())) {
                    btn_13.setText("");
                    btn_13.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button14 && str.equals(btn_14.getText())) {
                    btn_14.setText("");
                    btn_14.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button15 && str.equals(btn_15.getText())) {
                    btn_15.setText("");
                    btn_15.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button16 && str.equals(btn_16.getText())) {
                    btn_16.setText("");
                    btn_16.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button17 && str.equals(btn_17.getText())) {
                    btn_17.setText("");
                    btn_17.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button18 && str.equals(btn_18.getText())) {
                    btn_18.setText("");
                    btn_18.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button19 && str.equals(btn_19.getText())) {
                    btn_19.setText("");
                    btn_19.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button20 && str.equals(btn_20.getText())) {
                    btn_20.setText("");
                    btn_20.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button21 && str.equals(btn_21.getText())) {
                    btn_21.setText("");
                    btn_21.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button22 && str.equals(btn_22.getText())) {
                    btn_22.setText("");
                    btn_22.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button23 && str.equals(btn_23.getText())) {
                    btn_23.setText("");
                    btn_23.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button24 && str.equals(btn_24.getText())) {
                    btn_24.setText("");
                    btn_24.setBackgroundColor(color);
                    m++;

                } else if (id == R.id.button25 && str.equals(btn_25.getText())) {
                    btn_25.setText("");
                    btn_25.setBackgroundColor(color);
                    m++;

                }
            }

           if (str.equals("1")) {
                crn.setBase(SystemClock.elapsedRealtime());
                crn.start();
            }
           else if (str.equals("25"))
                b++;
           else if (str.equals("50")) {
                int elapsedMillis = (int) (SystemClock.elapsedRealtime() - crn.getBase());
                elapsedMillis=elapsedMillis/1000;
                crn.stop();
                //showElapsedTime();
                if (elapsedMillis>0 && elapsedMillis<=30) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                    alertDialogBuilder.setTitle("نتیجه")
                            .setMessage("خیلی باهوشی")
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            });
                    alertDialogBuilder.show();
                }
                else if (elapsedMillis>30 && elapsedMillis<=60) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                    alertDialogBuilder.setTitle("نتیجه")
                            .setMessage("باهوشی")
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            });
                    alertDialogBuilder.show();
                }
                else if (elapsedMillis>60 && elapsedMillis<=90) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                    alertDialogBuilder.setTitle("نتیجه")
                            .setMessage("معمولی")
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            });
                    alertDialogBuilder.show();
                }
                else if (elapsedMillis>90) {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                    alertDialogBuilder.setTitle("نتیجه")
                            .setMessage("خسته ای :)))")
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            });
                    alertDialogBuilder.show();
                }
            }

    }

    public String getCrn(){
        long l= SystemClock.elapsedRealtime()-crn.getBase();
        return ""+l;
    }

    public void secondClick(Button btn){
        index=rand.nextInt(u);
        btn.setText(""+array2.get(index));
        btn.setBackgroundColor(getResources().getColor(R.color.darkBlue));
        array2.remove(index);
        u--;
        m++;
    }

    public void setArray(){
        for(int i=1;i<=25;i++)
            array1.add(i);
        for(int i=26;i<=50;i++)
            array2.add(i);
    }

    public void findviews(){
        btn_1    =(Button)findViewById(R.id.button1);
        btn_2    =(Button)findViewById(R.id.button2);
        btn_3    =(Button)findViewById(R.id.button3);
        btn_4    =(Button)findViewById(R.id.button4);
        btn_5    =(Button)findViewById(R.id.button5);
        btn_6    =(Button)findViewById(R.id.button6);
        btn_7    =(Button)findViewById(R.id.button7);
        btn_8    =(Button)findViewById(R.id.button8);
        btn_9    =(Button)findViewById(R.id.button9);
        btn_10   =(Button)findViewById(R.id.button10);
        btn_11   =(Button)findViewById(R.id.button11);
        btn_12   =(Button)findViewById(R.id.button12);
        btn_13   =(Button)findViewById(R.id.button13);
        btn_14   =(Button)findViewById(R.id.button14);
        btn_15   =(Button)findViewById(R.id.button15);
        btn_16   =(Button)findViewById(R.id.button16);
        btn_17   =(Button)findViewById(R.id.button17);
        btn_18   =(Button)findViewById(R.id.button18);
        btn_19   =(Button)findViewById(R.id.button19);
        btn_20   =(Button)findViewById(R.id.button20);
        btn_21   =(Button)findViewById(R.id.button21);
        btn_22   =(Button)findViewById(R.id.button22);
        btn_23   =(Button)findViewById(R.id.button23);
        btn_24   =(Button)findViewById(R.id.button24);
        btn_25   =(Button)findViewById(R.id.button25);
        crn      =(Chronometer)findViewById(R.id.chronometer1);
    }

    private void showElapsedTime() {
        long elapsedMillis = SystemClock.elapsedRealtime()
                - crn.getBase();
        Toast.makeText(MainActivity.this,
                "Elapsed milliseconds: " + elapsedMillis, Toast.LENGTH_SHORT).show();
    }
    public void resetgame(View v){
        recreate();
    }
}


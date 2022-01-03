package com.example.user.tic_tac_toe;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int i,j,count=0,p=0,q=0,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count10=0,count11=0,count12=0,count13=0,count14=0,check=0;
    int[][] array = new int[3][3];
    private Button [][] b = new Button[3][3];
    private Button submit,reset,credit;
    private EditText player1,player2;

    public void init()
    {

        b[0][0]=(Button)findViewById(R.id.b00);
        b[0][1]=(Button)findViewById(R.id.b01);
        b[0][2]=(Button)findViewById(R.id.b02);
        b[1][0]=(Button)findViewById(R.id.b10);
        b[1][1]=(Button)findViewById(R.id.b11);
        b[1][2]=(Button)findViewById(R.id.b12);
        b[2][0]=(Button)findViewById(R.id.b20);
        b[2][1]=(Button)findViewById(R.id.b21);
        b[2][2]=(Button)findViewById(R.id.b22);
        submit = (Button)findViewById(R.id.submit);
        reset = (Button)findViewById(R.id.reset);
        credit = (Button)findViewById(R.id.credit);
        player1 = (EditText) findViewById(R.id.player1);
        player2 = (EditText) findViewById(R.id.player2);



        b[0][0].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(count%2==0){

                    b[0][0].setText("X");
                    array[0][0] = 1;
                    count++;
                }
                else{


                    b[0][0].setText("0");
                    array[0][0] = 0;
                    count++;
                }
                check++;


            }
        });
        b[0][1].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(count%2==0){

                    b[0][1].setText("X");
                    array[0][1] = 1;
                    count++;
                }
                else{


                    b[0][1].setText("0");
                    array[0][1] = 0;
                    count++;

                }
                check++;

            }
        });
        b[0][2].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(count%2==0){

                    b[0][2].setText("X");
                    array[0][2] = 1;
                    count++;
                }
                else{


                    b[0][2].setText("0");
                    array[0][2] = 0;
                    count++;

                }
                check++;


            }
        });
        b[1][0].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                if(count%2==0){

                    b[1][0].setText("X");
                    array[1][0] = 1;
                    count++;
                }
                else{


                    b[1][0].setText("0");
                    array[1][0] = 0;
                    count++;

                }
                check++;

            }
        });
        b[1][1].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(count%2==0){

                    b[1][1].setText("X");
                    array[1][1] = 1;
                    count++;
                }
                else{


                    b[1][1].setText("0");
                    array[1][1] = 0;
                    count++;

                }
                check++;

            }
        });
        b[1][2].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(count%2==0){

                    b[1][2].setText("X");
                    array[1][2] = 1;
                    count++;
                }
                else{


                    b[1][2].setText("0");
                    array[1][2] = 0;
                    count++;

                }
                check++;

            }
        });
        b[2][0].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(count%2==0){

                    b[2][0].setText("X");
                    array[2][0] = 1;
                    count++;
                }
                else{


                    b[2][0].setText("0");
                    array[2][0] = 0;
                    count++;

                }
                check++;

            }
        });
        b[2][1].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(count%2==0){

                    b[2][1].setText("X");
                    array[2][1] = 1;
                    count++;
                }
                else{


                    b[2][1].setText("0");
                    array[2][1] = 0;
                    count++;

                }
                check++;


            }
        });
        b[2][2].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(count%2==0){

                    b[2][2].setText("X");
                    array[2][2] = 1;
                    count++;
                }
                else{


                    b[2][2].setText("0");
                    array[2][2] = 0;
                    count++;

                }
                check++;

            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*for(i=0;i<=2;i++){

                    for(j=0;j<=2;j++){


                            if (b[i][j].getText().toString().equals("X") && b[i+1][j].getText().toString().equals("X") && b[i+2][j].getText().toString().equals("X")) {


                                p++;
                                break;

                            } else if (b[i][j].getText().toString().equals("X") && b[i][j+1].getText().toString().equals("X") && b[i][j+2].getText().toString().equals("X")) {


                                p++;
                                break;

                            }
                            if (b[i][j].getText().toString().equals("0") && b[i+1][j].getText().toString().equals("0") && b[i+2][j].getText().toString().equals("0")) {


                                q++;
                                break;

                            } else if (b[i][j].getText().toString().equals("0") && b[i][j+1].getText().toString().equals("0") && b[i][j+2].getText().toString().equals("X")) {


                                q++;
                                break;

                            }






                    }




                }
                if(p==1){

                    b[0][0].setText("p1 win");


                }
                else if(q==1){

                    b[0][0].setText("p2 is win");

                }
                */
                for(i=0;i<=2;i++){

                    if(b[0][i].getText().toString().equals("X")){

                        count1++;
                    }
                    if(b[1][i].getText().toString().equals("X")){

                        count2++;
                    }
                    if(b[2][i].getText().toString().equals("X")){

                        count3++;
                    }


                }
                for(j=0;j<=2;j++){

                    if(b[j][0].getText().toString().equals("X")){

                        count4++;

                    }
                    if(b[j][1].getText().toString().equals("X")){

                        count5++;

                    }
                    if(b[j][2].getText().toString().equals("X")){

                        count6++;

                    }



                }
                for(i=0;i<=2;i++){

                    if(b[0][i].getText().toString().equals("0")){

                        count7++;
                    }
                    if(b[1][i].getText().toString().equals("0")){

                        count8++;
                    }
                    if(b[2][i].getText().toString().equals("0")){

                        count9++;
                    }


                }
                for(j=0;j<=2;j++){

                    if(b[j][0].getText().toString().equals("0")){

                        count10++;

                    }
                    if(b[j][1].getText().toString().equals("0")){

                        count11++;

                    }
                    if(b[j][2].getText().toString().equals("0")){

                        count12++;

                    }



                }
                for(i=0;i<=2;i++){

                    for(j=0;j<=2;j++){

                        if(i==j && b[i][j].getText().toString().equals("X")){

                            count13++;


                        }
                        if(i==j && b[i][j].getText().toString().equals("0")){

                            count14++;


                        }


                    }






                }
                if(count1==3 || count2==3 || count3==3 || count4==3 || count5==3 || count6==3 || count13==3){

                    Toast toast = Toast.makeText(MainActivity.this,player1.getText()+" is win!",Toast.LENGTH_SHORT);
                    toast.show();

                }
                else if(count7==3 || count8==3 || count9==3 || count10==3 || count11==3 || count12==3 || count14==3){

                    Toast toast = Toast.makeText(MainActivity.this,player2.getText()+" is win!",Toast.LENGTH_SHORT);
                    toast.show();

                }
                else if(check>=9){

                    Toast toast = Toast.makeText(MainActivity.this,"Draw!",Toast.LENGTH_SHORT);
                    toast.show();


                }
                else{

                    Toast toast = Toast.makeText(MainActivity.this,"Play the Full match!",Toast.LENGTH_SHORT);
                    toast.show();

                }

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for(i=0;i<=2;i++){

                    for(j=0;j<=2;j++){


                        b[i][j].setText("");
                        check=0;
                        count=0;
                        player1.setText("");
                        player2.setText("");



                    }


                }

                count1=0;
                count2=0;
                count3=0;
                count4=0;
                count5=0;
                count6=0;
                count7=0;
                count8=0;
                count9=0;
                count10=0;
                count11=0;
                count12=0;
                count13=0;
                count14=0;


            }
        });
        credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent credit = new Intent(MainActivity.this,CreditActivity.class);

               startActivity(credit);

            }
        });









    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}

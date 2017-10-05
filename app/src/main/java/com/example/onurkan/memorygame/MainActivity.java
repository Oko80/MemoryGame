package com.example.onurkan.memorygame;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Handler;

import java.util.Arrays;
import java.util.Collections;

import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2;

    ImageView iv_11, iv_12, iv_13, iv_14, iv_15, iv_21, iv_22, iv_23, iv_24, iv_25, iv_31, iv_32, iv_33, iv_34, iv_35, iv_41, iv_42, iv_43, iv_44, iv_45;

    Integer[] cardArray ={101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210};

    int image101, image102, image103, image104, image105, image106, image107, image108, image109, image110, image201, image202,
            image203, image204, image205, image206, image207, image208, image209, image210;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;

    int turn = 1;
    int playerPoints = 0, cpuPoints = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);

        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_14 = (ImageView) findViewById(R.id.iv_14);
        iv_15 = (ImageView) findViewById(R.id.iv_15);
        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);
        iv_23 = (ImageView) findViewById(R.id.iv_23);
        iv_24 = (ImageView) findViewById(R.id.iv_24);
        iv_25 = (ImageView) findViewById(R.id.iv_25);
        iv_31 = (ImageView) findViewById(R.id.iv_31);
        iv_32 = (ImageView) findViewById(R.id.iv_32);
        iv_33 = (ImageView) findViewById(R.id.iv_33);
        iv_34 = (ImageView) findViewById(R.id.iv_34);
        iv_35 = (ImageView) findViewById(R.id.iv_35);
        iv_41 = (ImageView) findViewById(R.id.iv_41);
        iv_42 = (ImageView) findViewById(R.id.iv_42);
        iv_43 = (ImageView) findViewById(R.id.iv_43);
        iv_44 = (ImageView) findViewById(R.id.iv_44);
        iv_45 = (ImageView) findViewById(R.id.iv_45);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_15.setTag("4");
        iv_21.setTag("5");
        iv_22.setTag("6");
        iv_23.setTag("7");
        iv_24.setTag("8");
        iv_25.setTag("9");
        iv_31.setTag("10");
        iv_32.setTag("11");
        iv_33.setTag("12");
        iv_34.setTag("13");
        iv_35.setTag("14");
        iv_41.setTag("15");
        iv_42.setTag("16");
        iv_43.setTag("17");
        iv_44.setTag("18");
        iv_45.setTag("19");

            frontOfCardsResources();

            Collections.shuffle(Arrays.asList(cardArray));

        textView2.setTextColor(Color.GRAY);



        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_11, theCard);
            }
        });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_12, theCard);
            }
        });
        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_13, theCard);
            }
        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_14, theCard);
            }
        });
        iv_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_15, theCard);
            }
        });
        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_21, theCard);
            }
        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_22, theCard);
            }
        });
        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_23, theCard);
            }
        });
        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_24, theCard);
            }
        });
        iv_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_25, theCard);
            }
        });
        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_31, theCard);
            }
        });
        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_32, theCard);
            }
        });
        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_33, theCard);
            }
        });
        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_34, theCard);
            }
        });
        iv_35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_35, theCard);
            }
        });
        iv_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_41, theCard);
            }
        });
        iv_42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_42, theCard);
            }
        });
        iv_43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_43, theCard);
            }
        });
        iv_44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_44, theCard);
            }
        });
        iv_45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_45, theCard);
            }
        });


            }

            private void doStuff(ImageView iv, int card){
                if (cardArray[card] == 101){
                    iv.setImageResource(image101);
                } else if(cardArray[card] == 102){
                    iv.setImageResource(image102);
                }else if(cardArray[card] == 103){
                    iv.setImageResource(image103);
                }else if(cardArray[card] == 104){
                    iv.setImageResource(image104);
                }else if(cardArray[card] == 105){
                    iv.setImageResource(image105);
                }else if(cardArray[card] == 106){
                    iv.setImageResource(image106);
                }else if(cardArray[card] == 107){
                    iv.setImageResource(image107);
                }else if(cardArray[card] == 108){
                    iv.setImageResource(image108);
                }else if(cardArray[card] == 109){
                    iv.setImageResource(image109);
                }else if(cardArray[card] == 110){
                    iv.setImageResource(image110);
                }else if(cardArray[card] == 201){
                    iv.setImageResource(image201);
                }else if(cardArray[card] == 202){
                    iv.setImageResource(image202);
                }else if(cardArray[card] == 203){
                    iv.setImageResource(image203);
                }else if(cardArray[card] == 204){
                    iv.setImageResource(image204);
                }else if(cardArray[card] == 205){
                    iv.setImageResource(image205);
                }else if(cardArray[card] == 206){
                    iv.setImageResource(image206);
                }else if(cardArray[card] == 207){
                    iv.setImageResource(image207);
                }else if(cardArray[card] == 208){
                    iv.setImageResource(image208);
                }else if(cardArray[card] == 209){
                    iv.setImageResource(image209);
                }else if(cardArray[card] == 210){
                    iv.setImageResource(image210);
                }

                if(cardNumber == 1) {
                    firstCard = cardArray[card];
                    if (firstCard > 200) {
                        firstCard = firstCard - 100;
                    }
                    cardNumber = 2;
                    clickedFirst = card;

                    iv.setEnabled(false);
                } else if(cardNumber == 2){
                    secondCard = cardArray[card];
                    if(secondCard > 200){
                        secondCard = secondCard - 100;
                    }
                    cardNumber = 1;
                    clickedSecond = card;

                    iv_11.setEnabled(false);
                    iv_12.setEnabled(false);
                    iv_13.setEnabled(false);
                    iv_14.setEnabled(false);
                    iv_15.setEnabled(false);
                    iv_21.setEnabled(false);
                    iv_22.setEnabled(false);
                    iv_23.setEnabled(false);
                    iv_24.setEnabled(false);
                    iv_25.setEnabled(false);
                    iv_31.setEnabled(false);
                    iv_32.setEnabled(false);
                    iv_33.setEnabled(false);
                    iv_34.setEnabled(false);
                    iv_35.setEnabled(false);
                    iv_41.setEnabled(false);
                    iv_42.setEnabled(false);
                    iv_43.setEnabled(false);
                    iv_44.setEnabled(false);
                    iv_45.setEnabled(false);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            calculate();
                        }
                    },1000);
                }








            }
            private void calculate(){
                if(firstCard == secondCard) {
                    if (clickedFirst == 0) {
                        iv_11.setVisibility(View.INVISIBLE);
                    } else if (clickedFirst == 1) {
                        iv_12.setVisibility(View.INVISIBLE);
                    } else if (clickedFirst == 2) {
                        iv_13.setVisibility(View.INVISIBLE);
                    } else if (clickedFirst == 3) {
                        iv_14.setVisibility(View.INVISIBLE);
                    } else if (clickedFirst == 4) {
                        iv_15.setVisibility(View.INVISIBLE);
                    } else if (clickedFirst == 5) {
                        iv_21.setVisibility(View.INVISIBLE);
                    } else if (clickedFirst == 6) {
                        iv_22.setVisibility(View.INVISIBLE);
                    } else if (clickedFirst == 7) {
                        iv_23.setVisibility(View.INVISIBLE);
                    } else if (clickedFirst == 8) {
                        iv_24.setVisibility(View.INVISIBLE);
                    } else if (clickedFirst == 9) {
                        iv_25.setVisibility(View.INVISIBLE);
                    } else if (clickedFirst == 10) {
                        iv_31.setVisibility(View.INVISIBLE);
                    } else if (clickedFirst == 11) {
                        iv_32.setVisibility(View.INVISIBLE);
                    } else if (clickedFirst == 12) {
                        iv_33.setVisibility(View.INVISIBLE);
                    } else if (clickedFirst == 13) {
                        iv_34.setVisibility(View.INVISIBLE);
                    } else if (clickedFirst == 14) {
                        iv_35.setVisibility(View.INVISIBLE);
                    } else if (clickedFirst == 15) {
                        iv_41.setVisibility(View.INVISIBLE);
                    } else if (clickedFirst == 16) {
                        iv_42.setVisibility(View.INVISIBLE);
                    } else if (clickedFirst == 17) {
                        iv_43.setVisibility(View.INVISIBLE);
                    } else if (clickedFirst == 18) {
                        iv_44.setVisibility(View.INVISIBLE);
                    } else if (clickedFirst == 19) {
                        iv_45.setVisibility(View.INVISIBLE);
                    }

                    if (clickedSecond == 0) {
                        iv_11.setVisibility(View.INVISIBLE);
                    } else if (clickedSecond == 1) {
                        iv_12.setVisibility(View.INVISIBLE);
                    } else if (clickedSecond == 2) {
                        iv_13.setVisibility(View.INVISIBLE);
                    } else if (clickedSecond == 3) {
                        iv_14.setVisibility(View.INVISIBLE);
                    } else if (clickedSecond == 4) {
                        iv_15.setVisibility(View.INVISIBLE);
                    } else if (clickedSecond == 5) {
                        iv_21.setVisibility(View.INVISIBLE);
                    } else if (clickedSecond == 6) {
                        iv_22.setVisibility(View.INVISIBLE);
                    } else if (clickedSecond == 7) {
                        iv_23.setVisibility(View.INVISIBLE);
                    } else if (clickedSecond == 8) {
                        iv_24.setVisibility(View.INVISIBLE);
                    } else if (clickedSecond == 9) {
                        iv_25.setVisibility(View.INVISIBLE);
                    } else if (clickedSecond == 10) {
                        iv_31.setVisibility(View.INVISIBLE);
                    } else if (clickedSecond == 11) {
                        iv_32.setVisibility(View.INVISIBLE);
                    } else if (clickedSecond == 12) {
                        iv_33.setVisibility(View.INVISIBLE);
                    } else if (clickedSecond == 13) {
                        iv_34.setVisibility(View.INVISIBLE);
                    } else if (clickedSecond == 14) {
                        iv_35.setVisibility(View.INVISIBLE);
                    } else if (clickedSecond == 15) {
                        iv_41.setVisibility(View.INVISIBLE);
                    } else if (clickedSecond == 16) {
                        iv_42.setVisibility(View.INVISIBLE);
                    } else if (clickedSecond == 17) {
                        iv_43.setVisibility(View.INVISIBLE);
                    } else if (clickedSecond == 18) {
                        iv_44.setVisibility(View.INVISIBLE);
                    } else if (clickedSecond == 19) {
                        iv_45.setVisibility(View.INVISIBLE);
                    }
                    if (turn == 1) {
                        playerPoints++;
                        textView1.setText("P1: " + playerPoints);
                    } else if (turn == 2) {
                        cpuPoints++;
                        textView2.setText("P2: " + clickedFirst);
                    }
                } else {
                    iv_11.setImageResource(R.drawable.a10a);
                    iv_12.setImageResource(R.drawable.a10a);
                    iv_13.setImageResource(R.drawable.a10a);
                    iv_14.setImageResource(R.drawable.a10a);
                    iv_15.setImageResource(R.drawable.a10a);
                    iv_21.setImageResource(R.drawable.a10a);
                    iv_22.setImageResource(R.drawable.a10a);
                    iv_23.setImageResource(R.drawable.a10a);
                    iv_24.setImageResource(R.drawable.a10a);
                    iv_25.setImageResource(R.drawable.a10a);
                    iv_31.setImageResource(R.drawable.a10a);
                    iv_32.setImageResource(R.drawable.a10a);
                    iv_33.setImageResource(R.drawable.a10a);
                    iv_34.setImageResource(R.drawable.a10a);
                    iv_35.setImageResource(R.drawable.a10a);
                    iv_41.setImageResource(R.drawable.a10a);
                    iv_42.setImageResource(R.drawable.a10a);
                    iv_43.setImageResource(R.drawable.a10a);
                    iv_44.setImageResource(R.drawable.a10a);
                    iv_45.setImageResource(R.drawable.a10a);

                    if (turn == 1) {
                        turn = 2;
                        textView1.setTextColor(Color.GRAY);
                        textView2.setTextColor(Color.BLACK);
                    } else if (turn == 2) {
                        turn = 1;
                        textView1.setTextColor(Color.GRAY);
                        textView2.setTextColor(Color.BLACK);
                    }
                }
                iv_11.setEnabled(true);
                iv_12.setEnabled(true);
                iv_13.setEnabled(true);
                iv_14.setEnabled(true);
                iv_15.setEnabled(true);
                iv_21.setEnabled(true);
                iv_22.setEnabled(true);
                iv_23.setEnabled(true);
                iv_24.setEnabled(true);
                iv_25.setEnabled(true);
                iv_31.setEnabled(true);
                iv_32.setEnabled(true);
                iv_33.setEnabled(true);
                iv_34.setEnabled(true);
                iv_35.setEnabled(true);
                iv_41.setEnabled(true);
                iv_42.setEnabled(true);
                iv_43.setEnabled(true);
                iv_44.setEnabled(true);
                iv_45.setEnabled(true);

                checkEnd();


            }
            private void checkEnd(){
                if(iv_11.getVisibility() == View.INVISIBLE &&
                        iv_12.getVisibility() == View.INVISIBLE &&
                        iv_13.getVisibility() == View.INVISIBLE &&
                        iv_14.getVisibility() == View.INVISIBLE &&
                        iv_15.getVisibility() == View.INVISIBLE &&
                        iv_21.getVisibility() == View.INVISIBLE &&
                        iv_22.getVisibility() == View.INVISIBLE &&
                        iv_23.getVisibility() == View.INVISIBLE &&
                        iv_24.getVisibility() == View.INVISIBLE &&
                        iv_25.getVisibility() == View.INVISIBLE &&
                        iv_31.getVisibility() == View.INVISIBLE &&
                        iv_32.getVisibility() == View.INVISIBLE &&
                        iv_33.getVisibility() == View.INVISIBLE &&
                        iv_34.getVisibility() == View.INVISIBLE &&
                        iv_35.getVisibility() == View.INVISIBLE &&
                        iv_41.getVisibility() == View.INVISIBLE &&
                        iv_42.getVisibility() == View.INVISIBLE &&
                        iv_43.getVisibility() == View.INVISIBLE &&
                        iv_44.getVisibility() == View.INVISIBLE &&
                        iv_45.getVisibility() == View.INVISIBLE){
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                    alertDialogBuilder.setMessage("Game Over!!\nP1: " + playerPoints + " \nP2: " + cpuPoints)
                            .setCancelable(false)
                            .setPositiveButton("New", new DialogInterface.OnClickListener(){
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i){
                                   Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                    startActivity(intent);
                                    finish();
                                }
                                    }).setNegativeButton("Exit", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i){
                            finish();
                        }
                    });
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();

                }
            }
            private void frontOfCardsResources(){
               image101 = R.drawable.c11c;
                image201 = R.drawable.c11c;
               image102 = R.drawable.c12c;
                image202 = R.drawable.c12c;
               image103 = R.drawable.c13c;
                image103 = R.drawable.c13c;
               image104 = R.drawable.d11d;
                image204 = R.drawable.d11d;
               image105 = R.drawable.d12d;
                image205 = R.drawable.d12d;
               image106 = R.drawable.d13d;
                image206 = R.drawable.d13d;
               image107 = R.drawable.h11h;
                image207 = R.drawable.h11h;
               image108 = R.drawable.h12h;
                image208 = R.drawable.h12h;
               image109 = R.drawable.s11s;
                image209 = R.drawable.s11s;
               image110 = R.drawable.s12s;
                image210 = R.drawable.s12s;
            }
        }


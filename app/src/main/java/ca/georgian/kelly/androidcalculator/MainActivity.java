/*
NAME:       Kelly McAlpine - 200269425
COURSE:     COMP3025
PROJECT:    Basic calculator for Android devices 2.3.3 and up
DUE DATE:   March 11, 2016
VERSION:    1.0
 */

package ca.georgian.kelly.androidcalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    //PRIVATE INSTANCE VARIABLES
    private TextView _answerDisplay;
    private Button _buttonClear;
    //number keys
    private Button _buttonOne;
    private Button _buttonTwo;
    private Button _buttonThree;
    private Button _buttonFour;
    private Button _buttonFive;
    private Button _buttonSix;
    private Button _buttonSeven;
    private Button _buttonEight;
    private Button _buttonNine;
    private Button _buttonZero;
    //operators
    private Button _buttonDivide;
    private Button _buttonMultiply;
    private Button _buttonAdd;
    private Button _buttonSubtract;
    private Button _buttonEquals;
    private Button _buttonDec;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Create a reference to each control
        this._answerDisplay = (TextView) findViewById(R.id.answerDisplay);
        this._buttonClear = (Button) findViewById(R.id.buttonClear);
        this._buttonSeven = (Button) findViewById(R.id.buttonSeven);
        this._buttonEight = (Button) findViewById(R.id.buttonEight);
        this._buttonNine = (Button) findViewById(R.id.buttonNine);
        this._buttonFour = (Button) findViewById(R.id.button4);
        this._buttonFive = (Button) findViewById(R.id.button);
        this._buttonNine = (Button) findViewById(R.id.buttonNine);
        this._buttonNine = (Button) findViewById(R.id.buttonNine);






        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

} //end of MainActivity

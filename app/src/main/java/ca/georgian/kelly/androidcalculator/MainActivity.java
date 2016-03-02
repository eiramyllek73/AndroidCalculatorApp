/*
NAME:       Kelly McAlpine - 200269425
COURSE:     COMP3025
PROJECT:    Basic calculator for Android devices 2.3.3 and up
DUE DATE:   March 11, 2016
VERSION:    1.1:  Added all buttons and set onClick listeners for number buttons
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
        this._buttonDivide = (Button) findViewById(R.id.buttonDivide);

        this._buttonFour = (Button) findViewById(R.id.buttonFour);
        this._buttonFive = (Button) findViewById(R.id.buttonFive);
        this._buttonSix = (Button) findViewById(R.id.buttonSix);
        this._buttonMultiply = (Button) findViewById(R.id.buttonMultiply);

        this._buttonOne = (Button) findViewById(R.id.buttonOne);
        this._buttonTwo = (Button) findViewById(R.id.buttonTwo);
        this._buttonThree = (Button) findViewById(R.id.buttonThree);
        this._buttonAdd = (Button) findViewById(R.id.buttonAdd);

        this._buttonDec = (Button) findViewById(R.id.buttonDec);
        this._buttonZero = (Button) findViewById(R.id.buttonZero);
        this._buttonEquals = (Button) findViewById(R.id.buttonEquals);
        this._buttonSubtract = (Button) findViewById(R.id.buttonSubtract);

        //set click listeners for all number buttons
        this._buttonOne.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //set the text from the face of the button
                _answerDisplay.setText("1");
            }
        });

        this._buttonTwo.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //set the text from the face of the button
                _answerDisplay.setText("2");
            }
        });

        this._buttonThree.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //set the text from the face of the button
                _answerDisplay.setText("3");
            }
        });

        this._buttonFour.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //set the text from the face of the button
                _answerDisplay.setText("4");
            }
        });

        this._buttonFive.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //set the text from the face of the button
                _answerDisplay.setText("5");
            }
        });

        this._buttonSix.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                ///set the text from the face of the button
                _answerDisplay.setText("6");
            }
        });

        this._buttonSeven.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //set the text from the face of the button
                _answerDisplay.setText("7");
            }
        });

        this._buttonEight.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //set the text from the face of the button
                _answerDisplay.setText("8");
            }
        });

        this._buttonNine.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //set the text from the face of the button
                _answerDisplay.setText("9");
            }
        });

        this._buttonZero.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //set the text from the face of the button
                _answerDisplay.setText("0");
            }
        });


    }

} //end of MainActivity

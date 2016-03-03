/*
NAME:       Kelly McAlpine - 200269425
COURSE:     COMP3025
PROJECT:    Basic calculator for Android devices 2.3.3 and up
DUE DATE:   March 11, 2016
VERSION:    2.0:  Beginning of layout adjustments
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
    //Number Keys
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
    //Operators
    private Button _buttonDivide;
    private Button _buttonMultiply;
    private Button _buttonAdd;
    private Button _buttonSubtract;
    private Button _buttonEquals;
    private Button _buttonDec;
    //Calculation Variables
    private boolean _mAddition, _mSubtraction, _mDivision, _mMultiplication;
    private float _mFirstInputNumber, _mNextInputNumber;

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

        //set click listeners for all number buttons, clear button and decimal button
        this._buttonOne.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //set the text from the face of the button
                _answerDisplay.setText(_answerDisplay.getText() + "1");
            }
        });

        this._buttonTwo.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //set the text from the face of the button
                _answerDisplay.setText(_answerDisplay.getText() + "2");
            }
        });

        this._buttonThree.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //set the text from the face of the button
                _answerDisplay.setText(_answerDisplay.getText() + "3");
            }
        });

        this._buttonFour.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //set the text from the face of the button
                _answerDisplay.setText(_answerDisplay.getText() + "4");
            }
        });

        this._buttonFive.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //set the text from the face of the button
                _answerDisplay.setText(_answerDisplay.getText() + "5");
            }
        });

        this._buttonSix.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                ///set the text from the face of the button
                _answerDisplay.setText(_answerDisplay.getText() + "6");
            }
        });

        this._buttonSeven.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //set the text from the face of the button
                _answerDisplay.setText(_answerDisplay.getText() + "7");
            }
        });

        this._buttonEight.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //set the text from the face of the button
                _answerDisplay.setText(_answerDisplay.getText() + "8");
            }
        });

        this._buttonNine.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //set the text from the face of the button
                _answerDisplay.setText(_answerDisplay.getText() + "9");
            }
        });

        this._buttonZero.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //set the text from the face of the button
                _answerDisplay.setText(_answerDisplay.getText() + "0");
            }
        });

        this._buttonClear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                _answerDisplay.setText("0");
            }
        });

        this._buttonDec.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                _answerDisplay.setText(_answerDisplay.getText() + ".");
            }
        });

        //Set onClick Listeners for Operator buttons
        _buttonDivide.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (_answerDisplay == null)
                {
                    _answerDisplay.setText("");
                }
                else
                {
                    _mFirstInputNumber = Float.parseFloat(_answerDisplay.getText() + "");
                    _mDivision = true;
                    _answerDisplay.setText(null);
                }
            }
        });

        _buttonMultiply.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (_answerDisplay == null)
                {
                    _answerDisplay.setText("");
                }
                else
                {
                    _mFirstInputNumber = Float.parseFloat(_answerDisplay.getText() + "");
                    _mMultiplication = true;
                    _answerDisplay.setText(null);
                }
            }
        });

        _buttonAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (_answerDisplay == null)
                {
                    _answerDisplay.setText("");
                }
                else
                {
                    _mFirstInputNumber = Float.parseFloat(_answerDisplay.getText() + "");
                    _mAddition = true;
                    _answerDisplay.setText(null);
                }
            }
        });

        _buttonSubtract.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (_answerDisplay == null)
                {
                    _answerDisplay.setText("");
                }
                else
                {
                    _mFirstInputNumber = Float.parseFloat(_answerDisplay.getText() + "");
                    _mSubtraction = true;
                    _answerDisplay.setText(null);
                }
            }
        });

        //Set up onClick for totalling calculations
        _buttonEquals.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                _mNextInputNumber = Float.parseFloat(_answerDisplay.getText() + "");

                if (_mDivision == true)
                {
                    _answerDisplay.setText(_mFirstInputNumber / _mNextInputNumber + "");
                    _mDivision=false;
                }

                if (_mMultiplication == true)
                {
                    _answerDisplay.setText(_mFirstInputNumber * _mNextInputNumber + "");
                    _mMultiplication=false;
                }

                if (_mAddition == true)
                {
                    _answerDisplay.setText(_mFirstInputNumber + _mNextInputNumber + "");
                    _mAddition=false;
                }

                if (_mSubtraction == true)
                {
                    _answerDisplay.setText(_mFirstInputNumber - _mNextInputNumber + "");
                    _mSubtraction=false;
                }
            }
        });

    }

} //end of MainActivity

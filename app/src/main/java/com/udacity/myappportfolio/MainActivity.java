/**
 * @author Tejas Iyer
 * Created on : 06/09/2015
 * Last edited on : 06/10/2015
 *
 * My Apps Porfolio App - This app will launch all my applications that will be created
 * in the Android Nanodegree course program.
 * Goal of the application is to easily launch all the portfolio apps from
 * one central place.
 *
 * References used: Android Developer Guide: Toasts -- Apache appended licence below
 * @link: http://developer.android.com/guide/topics/ui/notifiers/toasts.html
 *
 * copyright 2015 Tejas Iyer

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
 *
 */

package com.udacity.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    public static final String TOAST_TEXT = "This Button will launch ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /**
     * On click Method for Spotify Streamer Button
     * @param view - The view(button) component that launched the method
     */
    public void spotifyStreamer(View view){

        String text = TOAST_TEXT+(((Button) view).getText());
        Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG);
        toast.show();

    }

    /**
     * On click Method for Scores App Button
     * @param view - The view(button) component that launched the method
     */
    public void scoresApp(View view){

        String text = TOAST_TEXT+(((Button) view).getText());
        Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG);
        toast.show();

    }

    /**
     * On click Method for Library App Button
     * @param view - The view(button) component that launched the method
     */
    public void libraryApp(View view){

        String text = TOAST_TEXT+(((Button) view).getText());
        Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG);
        toast.show();

    }

    /**
     * On click Method for Build It Bigger Button
     * @param view - The view(button) component that launched the method
     */
    public void buildItBigger(View view){

        String text = TOAST_TEXT+(((Button) view).getText());
        Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG);
        toast.show();

    }

    /**
     * On click Method for XYZ reader Button
     * @param view - The view(button) component that launched the method
     */
    public void xyzReader(View view){

        String text = TOAST_TEXT+(((Button) view).getText());
        Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG);
        toast.show();

    }

    /**
     * On click Method for Capstone App Button
     * @param view - The view(button) component that launched the method
     */
    public void capstoneApp(View view){

        String text = TOAST_TEXT+(((Button) view).getText());
        Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG);
        toast.show();

    }

}

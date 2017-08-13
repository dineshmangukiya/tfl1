package com.stepdefs;

import com.utils.opendriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks {
opendriver openDrive = new opendriver();

    @Before
    public void openBrowser() throws IOException {
        //open browser
        openDrive.browser();
    }

    @After
    public void closeBrowser(){
        //quit browser
        //openDrive.closeBrowser();
    }

}

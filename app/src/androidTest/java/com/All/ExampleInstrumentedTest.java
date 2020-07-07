package com.All;
import android.content.Context;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.platform.app.InstrumentationRegistry;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4ClassRunner.class)
public class ExampleInstrumentedTest
{
    @Test public void useAppContext()
    {
        Context appContext=InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.project", appContext.getPackageName());
    }
}
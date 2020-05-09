package org.mym.plog.formatter;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mym.plog.Formatter;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class DefaultFormatterTest {
    @Test
    public void testFormatThrowableParams() throws Exception {
        Formatter formatter = new DefaultFormatter();
        Throwable throwable = new Throwable("Test");
        String formatted = formatter.format("Throwable is %s", throwable);
        assertEquals("Throwable is " + Log.getStackTraceString(throwable), formatted);
    }
}

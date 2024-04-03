import org.junit.Test;
import org.mycorp.models.v2g_messages.V2GSessionIdCounter;

import javax.xml.bind.DatatypeConverter;

public class SessionIdCounterTest {

    @Test
    public void sessionIdCounterIncrementTest(){
        V2GSessionIdCounter v2GSessionIdCounter = V2GSessionIdCounter.getInstance();
        v2GSessionIdCounter.incrementCounter();
        System.out.println(DatatypeConverter.printHexBinary(v2GSessionIdCounter.getSessionId()));
    }
}

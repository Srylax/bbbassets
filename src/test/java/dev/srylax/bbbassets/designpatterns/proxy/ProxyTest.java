package dev.srylax.bbbassets.designpatterns.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProxyTest {

    @Test
    void testProxy() {
        Proxy<String> proxy = new Proxy<>("Hello");
        String result = proxy.execute(String::toUpperCase);
        assertEquals("HELLO", result);
    }

}
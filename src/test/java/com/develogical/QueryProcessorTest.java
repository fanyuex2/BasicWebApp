package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsGreeting() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("fxqc"));
    }

    @Test
    public void knowsLargest() throws Exception {
        assertThat(queryProcessor.process("which of the following number is the largest: 1, 2"), containsString("2"));
    }

    /*@Test
    public void knowsqurecube() throws Exception {
        assertThat(queryProcessor.process("both a square and a cube: 720, 2025"), containsString("2025"));
    }*/
}

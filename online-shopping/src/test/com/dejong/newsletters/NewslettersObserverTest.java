package com.dejong.newsletters;

import com.dejong.member.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class NewslettersObserverTest {

    @Mock Newsletters mock = mock(Newsletters.class);

    private Newsletters newsletters;
    private Member member;

    @BeforeEach
    void setUp() {
        newsletters = new Newsletters();
        member = new Member("John", "john@gmail.com", "Dublin");

        newsletters.registerObserver(member);
    }

    @Test
    void testRegisterObserver() {
        assertTrue(newsletters.getObservers().contains(member));
    }

    @Test
    void testRemoveObserver() {
        newsletters.removeObserver(member);
        assertFalse(newsletters.getObservers().contains(member));
    }

    @Test
    /* Method setNews will invoke newsletters private method which then invoke notifyObserver */
    void testSetNews() {
        mock.setNews("Hello World");
        verify(mock, times(1)).setNews("Hello World");
    }


}

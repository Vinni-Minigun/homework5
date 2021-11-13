package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldSquareInRange() {
        SQRService sqrService = new SQRService();
        int expected = 3;
        int actual = sqrService.squareInRange(200, 300);
        assertEquals(expected, actual);
    }
    @Test
    void shouldSquareInRangeIsOnlyOne() {
        SQRService sqrService = new SQRService();
        int expected = 1;
        int actual = sqrService.squareInRange(30, 100);
        assertEquals(expected, actual);
    }
    @Test
    void shouldSquareInRangeNotExist() {
        SQRService sqrService = new SQRService();
        int expected = 0;
        int actual = sqrService.squareInRange(10, 99);
        assertEquals(expected, actual);
    }
}

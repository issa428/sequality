package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3, 0));

    expected = 55;
    assertEquals(expected, calculate.sum(1, 10, 1));
    float flExpected = 5.5f;
    assertEquals(flExpected, calculate.average(calculate.sum(1, 10, 1), 10), 0.0001);

    expected = 25;
    assertEquals(expected, calculate.sum(1, 10, 2));
    expected = 30;
    assertEquals(expected, calculate.sum(1, 10, 3));
  }
}

package com.baeldung.algorithms.stringsort;



import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class SortStringUnitTest {

    @Test
    public void givenString_whenSort_thenSorted() {
        String abcd = "bdca";
        char[] chars = abcd.toCharArray();

        Arrays.sort(chars);
        String sorted = new String(chars);

        assertThat(sorted).isEqualTo("abcd");
    }

    @Test
    public void givenString_whenSortJava8_thenSorted() {
        String sorted = "bdca".chars()
            .sorted()
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();

        assertThat(sorted).isEqualTo("abcd");
    }
}

package com.example.stringreversal

import org.junit.Test
import org.junit.Assert.*

class ReverseStringTest {

    private val reverse = ReverseString()

    @Test
    fun checkOutput() {
        val input = "Foxminded cool 24/7"; val exclusion = "1,2,3,4,5,6,7,8,9"; val expected = "dednimxoF looc 24/7 "

        val output: String = reverse.reverse(input, exclusion)
        assertEquals(expected, output)
    }

    @Test
    fun checkShortString() {
        val input = "a"; val exclusion = "1,2,3,4,5,s,a,o,e,f"; val expected = "a "

        val output: String = reverse.reverse(input, exclusion)
        assertEquals(expected, output)
    }

    @Test
    fun checkLongString() {
        val input = "Foxminded\ncool\n24/7"; val exclusion = "1,2,3,4,5,6,7,8,9"; val expected = "/\nlooc\ndednimxo24F7 "

        val output: String = reverse.reverse(input, exclusion)
        assertEquals(expected, output)
    }

    @Test
    fun checkNonUTF8() {
        val input = "\\xf8\\xa1\\xa1\\xa1\\xa1"; val exclusion = "a,c,j,h,t,5,7,3"; val expected = "1x\\1x\\a1x\\a1x\\a8fxa\\ "

        val output: String = reverse.reverse(input, exclusion)
        assertEquals(expected, output)
    }

    @Test
    fun checkEmptyStrings() {
        val input = ""; val exclusion = ""; val expected = " "

        val output: String = reverse.reverse(input, exclusion)
        assertEquals(expected, output)
    }

    //@Test
    //fun checkNullStrings() {
        //val input = null; val exclusion = null; val expected = ""

        //val output: String = reverse.reverse(input, exclusion)
        //assertNull(output)
}

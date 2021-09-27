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
        val input = "Lorem ipsum dolor sit amet,\n" +
                    " consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n" +
                    " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"

        val exclusion = "1,2,3,4,5,6,7,8,9"

        val expected = "meroL muspi rolod tis \n" +
                       "tem,a rutetcesnoc gnicsipida tile, des od domsuie ropmet tnudidicni tu erobal te erolod angam \n" +
                       ".auqila tU mine da minim mainev, siuq durtson noitaticrexe ocmallu sirobal isin tu piuqila xe ae odommoc tauqesnoc "

        val output: String = reverse.reverse(input, exclusion)
        assertEquals(expected, output)
    }

    @Test
    fun checkNonUTF8() {
        val input = "0x11111000"; val exclusion = "a,c,j,h,t,5,7,3"; val expected = "00011111x0 "

        val output: String = reverse.reverse(input, exclusion)
        assertEquals(expected, output)
    }

    @Test
    fun checkEmptyStrings() {
        val input = ""; val exclusion = ""; val expected = " "

        val output: String = reverse.reverse(input, exclusion)
        assertEquals(expected, output)
    }

    @Test
    fun checkNullStrings() {
        val input = null; val exclusion = null; val expected = ""

        val output: String = reverse.reverse(input, exclusion)
        assertEquals(output, expected)
    }
}


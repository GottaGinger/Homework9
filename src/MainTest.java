import org.junit.Test;
import org.junit.Assert;

public class MainTest {

    @Test
    public void translateNounTest() {
        String expected = "appleway"; // change output
        // what we expect to get back when typing in pineapple - return value
        String actual = Main.translate("apple"); //change input ""
        // what the method actual gave us back
        Assert.assertEquals(expected, actual);
        //see if they match
    }

    @Test
    public void translateNounTest2() {
        String expected = "elseway"; // change output
        // what we expect to get back when typing in pineapple - return value
        String actual = Main.translate("else"); //change input ""
        // what the method actual gave us back
        Assert.assertEquals(expected, actual);
        //see if they match
    }

    @Test
    public void translateNounTest3() {
        String expected = "iglooway"; // change output
        // what we expect to get back when typing in pineapple - return value
        String actual = Main.translate("igloo"); //change input ""
        // what the method actual gave us back
        Assert.assertEquals(expected, actual);
        //see if they match
    }

    @Test
    public void translateNounTest4() {
        String expected = "emuway"; // change output
        // what we expect to get back when typing in pineapple - return value
        String actual = Main.translate("emu"); //change input ""
        // what the method actual gave us back
        Assert.assertEquals(expected, actual);
        //see if they match
    }

    @Test
    public void translateNounTest5() {
        String expected = "unicornway"; // change output
        // what we expect to get back when typing in pineapple - return value
        String actual = Main.translate("unicorn"); //change input ""
        // what the method actual gave us back
        Assert.assertEquals(expected, actual);
        //see if they match
    }

    @Test
    public void translateConsonantTest1() {
        String expected = "elgiumbay"; // change output
        // what we expect to get back when typing in pineapple - return value
        String actual = Main.translate("belgium"); //change input ""
        // what the method actual gave us back
        Assert.assertEquals(expected, actual);
        //see if they match
    }

    @Test
    public void translateConsonantTest2() {
        String expected = "ingobay"; // change output
        // what we expect to get back when typing in pineapple - return value
        String actual = Main.translate("bingo"); //change input ""
        // what the method actual gave us back
        Assert.assertEquals(expected, actual);
        //see if they match
    }

    @Test
    public void translateConsonantTest3() {
        String expected = "eygray"; // change output
        // what we expect to get back when typing in pineapple - return value
        String actual = Main.translate("grey"); //change input ""
        // what the method actual gave us back
        Assert.assertEquals(expected, actual);
        //see if they match
    }

    @Test
    public void translateConsonantTest4() {
        String expected = "acktttay"; // change output
        // what we expect to get back when typing in pineapple - return value
        String actual = Main.translate("tttack"); //change input ""
        // what the method actual gave us back
        Assert.assertEquals(expected, actual);
        //see if they match
    }

    @Test
    public void lowerCaseTest() {
        String expected = "eyeway"; // change output
        // what we expect to get back when typing in pineapple - return value
        String actual = Main.translate("EYE"); //change input ""
        // what the method actual gave us back
        Assert.assertEquals(expected, actual);
        //see if they match
    }
}

// At least five (5) tests for words starting with different vowels.XX
//   These tests are correct and pass.  XX
//   At least two (2) tests for words starting with one consonant.
//   These tests are correct and pass.
//   At least one (1) test for words starting with two consonants.
//   These tests are correct and pass.
//   At least one (1) test for words starting with three consonants.
//   These tests are correct and pass.
//   At least one (1) test checking for lower case conversion.
//   These tests are correct and pass.

public class MultiBracketValidationTest {
    @Test
    public void multibracketvalidationTest1(){
        MultiBracketValidation test = new MultiBracketValidation();
        assertTrue("the output is ",test.multiBracketValidation("{}{Code}[Fellows](())"));
    }

    @Test
    public void multibracketvalidationTest2(){
        MultiBracketValidation test = new MultiBracketValidation();
        assertFalse("the output is ",test.multiBracketValidation("[({}]"));
    }

    @Test
    public void multibracketvalidationTest3(){
        MultiBracketValidation test = new MultiBracketValidation();
        assertTrue("the output is ",test.multiBracketValidation(""));
    }
 
}

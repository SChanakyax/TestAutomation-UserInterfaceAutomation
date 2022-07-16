package javascript;

import base.BaseTest_for_the_Framework;
import org.testng.annotations.Test;

public class JavaScriptTest extends BaseTest_for_the_Framework {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDOM().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickinfiniteScroll().scrollToParagraph(5);
    }

}

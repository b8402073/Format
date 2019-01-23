/*
  TestJSP933是直接從課本光碟COPY出來的字串
  所以用舊的作法不能認為CH9的9-33.jsp是完全合法的(JSP/HTML)
  所以在這裡用腦子創造很多很極端的狀況
  然後配合(IE/Chrome)的執行結果來校正我們的HTML類別實作
 */
package HTM;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author easterday
 */
public class SpecialAboutBranketSymbol {
    public String jsp1="<html><body> < </body></html>";
    
    public SpecialAboutBranketSymbol() {
    }
    
}

import org.junit.*;
import static org.junit.Assert.*;

public class SkillDemoTest{
    @Test
    public void multiplication(){
        assertEquals("Should be 6", 6, SkillDemonstration.multi(2,3));
    }
}
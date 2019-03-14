import org.junit.Assert.*
import org.junit.Test

class GameKtTest{

    @Test

    fun `player has a name`(){
        val name = "ANY"
        assertEquals("Any", main().name)
    }
}

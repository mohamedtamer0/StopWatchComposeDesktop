import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

class Display {
    var formattedTime by mutableStateOf("00:00:00")

    private var coroutineScope = CoroutineScope(Dispatchers.Main)
    

}
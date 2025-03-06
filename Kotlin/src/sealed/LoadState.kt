package sealed

sealed class LoadState {

    data class Success(val data: String): LoadState()
    data class Failure(val t: Throwable): LoadState()
    object Loading: LoadState()
}

fun getLoad(loadState: LoadState): Any{

    return when(loadState){

        is LoadState.Success->{loadState.data}
        is LoadState.Failure ->{}
        LoadState.Loading ->{}

    }

}

fun main(){
    println(getLoad(LoadState.Success("Successful")))
}

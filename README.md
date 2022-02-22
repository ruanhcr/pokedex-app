# Pokedex 

App que exibe a Pokedex atravé da [Poke API](https://pokeapi.co).
<br>O app é desenvolvido através do [Jetpack Compose](https://developer.android.com/jetpack/compose?gclid=Cj0KCQiAjc2QBhDgARIsAMc3SqTYARdVHuvelbQNF7urntfb8whp3pIteUTtx-hDggTKElvKysOKixwaAqmGEALw_wcB&gclsrc=aw.ds&authuser=1), para componentes de UI, navegação e passagem de dados.
<br>Utiliza-se a lib [Retrofit](https://square.github.io/retrofit/) para fazer requisições do tipo [GET POKEMON](https://pokeapi.co/api/v2/pokemon) do tipo PokemonList para exibir a lista da Pokedex e também
GET NAME para exibir os detalhes de cada pokemon assim que clicado.
<br>O projeto é feito na arquitetura MVVM, com injeção de dependência através do [Hilt](https://developer.android.com/training/dependency-injection/hilt-android?hl=pt-br), Escôpos de [Coroutines](https://developer.android.com/topic/libraries/architecture/coroutines?hl=pt-br) do Kotlin, 
conceitos de paginação, onde são carregados 20 pokemons por vez.
<br>A exibição das imagens é feita através do [Coil](https://coil-kt.github.io/coil/compose/).

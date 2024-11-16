### Implementation of the DIO UML challenge

## Reference Project
[Digital Innovation One (Desafios POO)](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo)

## UML Class Diagram
```mermaid
classDiagram
    class iPhone {
        -modelo: String
        -versao: String
        +ligar()
        +desligar()
    }

    class ReprodutorMusicalImpl {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonicoImpl {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternetImpl {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class ReprodutorMusical {
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone --> ReprodutorMusicalImpl : contains
    iPhone --> AparelhoTelefonicoImpl : contains
    iPhone --> NavegadorInternetImpl : contains

    ReprodutorMusicalImpl ..|> ReprodutorMusical
    AparelhoTelefonicoImpl ..|> AparelhoTelefonico
    NavegadorInternetImpl ..|> NavegadorInternet
``` 

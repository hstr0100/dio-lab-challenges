// Classe Principal iPhone

public class iPhone {

    private String modelo;
    private String versao;

    public iPhone(String modelo, String versao) {
        this.modelo = modelo;
        this.versao = versao;
    }

    public void ligar() {
        System.out.println("Ligando o iPhone " + modelo + " versão " + versao + "...");
    }

    public void desligar() {
        System.out.println("Desligando o iPhone " + modelo + " versão " + versao + "...");
    }

    // Implementação ReprodutorMusical
    public class ReprodutorMusicalImpl implements ReprodutorMusical {

        @Override
        public void tocar() {
            System.out.println("Reproduzindo música...");
        }

        @Override
        public void pausar() {
            System.out.println("Música pausada.");
        }

        @Override
        public void selecionarMusica(String musica) {
            System.out.println("Selecionando a música: " + musica);
        }
    }

    // Implementação AparelhoTelefonico
    public class AparelhoTelefonicoImpl implements AparelhoTelefonico {

        @Override
        public void ligar(String numero) {
            System.out.println("Ligando para o número: " + numero);
        }

        @Override
        public void atender() {
            System.out.println("Atendendo chamada...");
        }

        @Override
        public void iniciarCorreioVoz() {
            System.out.println("Iniciando correio de voz...");
        }
    }

    // Implementação NavegadorInternet
    public class NavegadorInternetImpl implements NavegadorInternet {

        @Override
        public void exibirPagina(String url) {
            System.out.println("Exibindo a página: " + url);
        }

        @Override
        public void adicionarNovaAba() {
            System.out.println("Adicionando nova aba ao navegador...");
        }

        @Override
        public void atualizarPagina() {
            System.out.println("Atualizando a página...");
        }
    }

    // Método principal para testes
    public static void main(String[] args) {
        // Criando instância principal do iPhone
        iPhone meuIphone = new iPhone("iPhone", "iOS 1.0");

        ReprodutorMusical player = meuIphone.new ReprodutorMusicalImpl();
        player.tocar();
        player.selecionarMusica("Loreena McKennitt - The Bonny Swans.mp3");
        player.pausar();

        AparelhoTelefonico telefone = meuIphone.new AparelhoTelefonicoImpl();
        telefone.ligar("123456789");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        NavegadorInternet navegador = meuIphone.new NavegadorInternetImpl();
        navegador.exibirPagina("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}

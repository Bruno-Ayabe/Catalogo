import java.util.List;
import java.util.ArrayList;

class Disco {
    private String titulo;
    private int anoLancamento;
    private Artista artista;
    private List<String> faixas;

    public Disco(String titulo, int anoLancamento, Artista artista) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.artista = artista;
        this.faixas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public void adicionarFaixa(String faixa) {
        faixas.add(faixa);
    }

    public void exibirDetalhes() {
        System.out.println("Disco: " + titulo);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Artista: " + artista.getNome());
        System.out.println("Gênero: " + artista.getGenero());
        System.out.println("Faixas: " + String.join(", ", faixas));
        System.out.println("----------------------------");
    }
}

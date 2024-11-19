public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Artista artista1 = new Artista("Zezé Di Camargo & Luciano", "Sertanejo");
        Artista artista2 = new Artista("Jorge & Mateus", "Sertanejo");
        Artista artista3 = new Artista("Henrique & Juliano", "Sertanejo");

        catalogo.adicionarArtista(artista1);
        catalogo.adicionarArtista(artista2);
        catalogo.adicionarArtista(artista3);

        Disco disco1 = new Disco("Romântico Sertanejo", 2023, artista1);
        Disco disco2 = new Disco("Época de Ouro", 2024, artista2);
        Disco disco3 = new Disco("Sertanejo Hits", 2025, artista3);

        catalogo.adicionarDisco(disco1);
        catalogo.adicionarDisco(disco2);
        catalogo.adicionarDisco(disco3);

        catalogo.listarDiscos();
        catalogo.listarArtistas();

        catalogo.editarArtista("Zezé Di Camargo & Luciano", "Zezé Di Camargo", "Sertanejo Universitário");

        catalogo.editarDisco("Romântico Sertanejo", "Novo Sertanejo Hits", 2026, artista1);

        catalogo.editarGenero(artista2, "Sertanejo Raiz");

        catalogo.removerDisco("Época de Ouro");
        catalogo.removerArtista("Henrique & Juliano");

        catalogo.listarDiscos();
        catalogo.listarArtistas();
    }
}

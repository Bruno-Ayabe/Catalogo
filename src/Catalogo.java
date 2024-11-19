import java.util.List;
import java.util.ArrayList;

class Catalogo {
    private List<Disco> discos;
    private List<Artista> artistas;

    public Catalogo() {
        discos = new ArrayList<>();
        artistas = new ArrayList<>();
    }

    public void adicionarDisco(Disco disco) {
        discos.add(disco);
        System.out.println("Disco '" + disco.getTitulo() + "' adicionado ao catálogo.");
    }

    public void removerDisco(String titulo) {
        boolean discoRemovido = false;
        for (Disco disco : discos) {
            if (disco.getTitulo().equalsIgnoreCase(titulo)) {
                discos.remove(disco);
                System.out.println("Disco '" + titulo + "' removido do catálogo.");
                discoRemovido = true;
                break;
            }
        }

        if (!discoRemovido) {
            System.out.println("Disco não encontrado.");
        }
    }

    public void editarDisco(String tituloAntigo, String novoTitulo, int novoAno, Artista novoArtista) {
        boolean discoEditado = false;
        for (Disco disco : discos) {
            if (disco.getTitulo().equalsIgnoreCase(tituloAntigo)) {
                disco.setTitulo(novoTitulo);
                disco.setAnoLancamento(novoAno);
                disco.setArtista(novoArtista);
                System.out.println("Disco '" + tituloAntigo + "' atualizado com sucesso.");
                discoEditado = true;
                break;
            }
        }

        if (!discoEditado) {
            System.out.println("Disco não encontrado.");
        }
    }

    public void adicionarArtista(Artista artista) {
        artistas.add(artista);
        System.out.println("Artista '" + artista.getNome() + "' adicionado ao catálogo.");
    }

    public void removerArtista(String nomeArtista) {
        boolean artistaRemovido = false;
        for (Artista artista : artistas) {
            if (artista.getNome().equalsIgnoreCase(nomeArtista)) {
                artistas.remove(artista);
                System.out.println("Artista '" + nomeArtista + "' removido do catálogo.");
                artistaRemovido = true;
                break;
            }
        }

        if (!artistaRemovido) {
            System.out.println("Artista não encontrado.");
        }
    }

    public void editarArtista(String nomeAntigo, String novoNome, String novoGenero) {
        boolean artistaEditado = false;
        for (Artista artista : artistas) {
            if (artista.getNome().equalsIgnoreCase(nomeAntigo)) {
                artista.setNome(novoNome);
                artista.setGenero(novoGenero);
                System.out.println("Artista '" + nomeAntigo + "' atualizado com sucesso.");
                artistaEditado = true;
                break;
            }
        }

        if (!artistaEditado) {
            System.out.println("Artista não encontrado.");
        }
    }

    public void editarGenero(Artista artista, String novoGenero) {
        artista.setGenero(novoGenero);
        System.out.println("Gênero do artista '" + artista.getNome() + "' atualizado para '" + novoGenero + "'.");
    }

    public void listarDiscos() {
        if (discos.isEmpty()) {
            System.out.println("O catálogo de discos está vazio.");
        } else {
            System.out.println("Lista de Discos no Catálogo:");
            for (Disco disco : discos) {
                disco.exibirDetalhes();
            }
        }
    }

    public void listarArtistas() {
        if (artistas.isEmpty()) {
            System.out.println("O catálogo de artistas está vazio.");
        } else {
            System.out.println("Lista de Artistas no Catálogo:");
            for (Artista artista : artistas) {
                artista.exibirDetalhes();
            }
        }
    }
}
